/*-
 *******************************************************************************
 * Copyright (c) 2011, 2016 Diamond Light Source Ltd.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    See git history
 *******************************************************************************/
package uk.ac.diamond.ispyb.test;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;
import java.util.Properties;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import uk.ac.diamond.ispyb.api.IspybFactoryService;

public class IntegrationTestHelper<S extends Closeable>{
	private static final String host = System.getProperty("ispyb.host");
	private static final String url = System.getProperty("ispyb.url");
	private static final Optional<String> user = Optional.ofNullable(System.getProperty("ispyb.user"));
	private static final Optional<String> password = Optional.ofNullable(System.getProperty("ispyb.pw"));
	private static final Optional<String> port = Optional.ofNullable(System.getProperty("ispyb.port"));
	private static final String systemUser = System.getProperty("user.name");
	private static final String schema = "maven_" + systemUser;
	

	private final IspybFactoryService<S> factory;
	
	public IntegrationTestHelper(IspybFactoryService<S> factory) {
		this.factory = factory;
	}

	public void run(CheckedSupplier<S> f) throws SQLException, IOException {
		execute(api -> {
			f.apply(api);
			return null;
		});
	}
	
	public <T> T execute(CheckedFunction<T, S> f) throws SQLException, IOException {
		S api = factory.buildIspybApi(url, user,  password, Optional.of(schema));
		T result = f.apply(api);
		api.close();
		return result;
	}
	
	public void setUp() throws IOException, SQLException, InterruptedException{
		Connection connection = connectToDatabase(url, user, password, Optional.empty());
		JdbcTemplate jdbcTemplate = new JdbcTemplate(new SingleConnectionDataSource(connection, true));
		jdbcTemplate.execute(String.format("drop database if exists %s;", schema));
		jdbcTemplate.execute(String.format("create database %s;", schema));
		try{
			jdbcTemplate.execute("SET GLOBAL log_bin_trust_function_creators = 1;");
		} catch (Exception e){
			// internally we use row logging, but this should work on travis
		}
		connection.close();
		
		executeScript("schema.sql", schema);
	}

	public void tearDown() throws IOException, SQLException, InterruptedException{
		Connection connection = connectToDatabase(url, user, password, Optional.empty());
		JdbcTemplate jdbcTemplate = new JdbcTemplate(new SingleConnectionDataSource(connection, true));
		jdbcTemplate.execute(String.format("drop database if exists %s;", schema));
		connection.close();
	}

	private void executeScript(String filename, String database) throws IOException, SQLException, InterruptedException {
		Resource resource = new DefaultResourceLoader().getResource(filename);
		String absolutePath = resource.getFile().getAbsolutePath();

		String command = String.format(" %s %s %s %s %s %s", host, user.orElse("UNKNOWN"), password.orElse(""), port.orElse("3306"), database, absolutePath);
		CommandLine commandLine;
		if (isWindows()) {
			commandLine = new CommandLine("cmd");
			commandLine.addArgument("/c");
			commandLine.addArgument("rundbscript.bat"+command);
		} else {
			commandLine = CommandLine.parse("./rundbscript.sh"+command);
		}
		DefaultExecutor executor = new DefaultExecutor();
		executor.execute(commandLine);
	}
	static private final boolean isWindows() {
		return (System.getProperty("os.name").indexOf("Windows") == 0);
	}

	private Connection connectToDatabase(String url, Optional<String> username, Optional<String> password, Optional<Properties> properties) throws SQLException {
		SingleConnectionDataSource ds = new SingleConnectionDataSource(url, false);
		properties.ifPresent(ds::setConnectionProperties);
		username.ifPresent(ds::setUsername);
		password.ifPresent(ds::setPassword);
		return ds.getConnection();
	}

	@FunctionalInterface
	interface CheckedFunction<S,T>{
		public S apply(T t) throws SQLException;
	}
	@FunctionalInterface
	interface CheckedSupplier<T>{
		public void apply(T t) throws SQLException;
	}
}