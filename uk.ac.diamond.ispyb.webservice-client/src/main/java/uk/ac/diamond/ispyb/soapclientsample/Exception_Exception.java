
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-03-10T14:38:29.453Z
 * Generated source version: 3.1.10
 */

@WebFault(name = "Exception", targetNamespace = "http://ispyb.ejb3.webservices.collection")
public class Exception_Exception extends java.lang.Exception {
    
    private uk.ac.diamond.ispyb.soapclientsample.Exception exception;

    public Exception_Exception() {
        super();
    }
    
    public Exception_Exception(String message) {
        super(message);
    }
    
    public Exception_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public Exception_Exception(String message, uk.ac.diamond.ispyb.soapclientsample.Exception exception) {
        super(message);
        this.exception = exception;
    }

    public Exception_Exception(String message, uk.ac.diamond.ispyb.soapclientsample.Exception exception, Throwable cause) {
        super(message, cause);
        this.exception = exception;
    }

    public uk.ac.diamond.ispyb.soapclientsample.Exception getFaultInfo() {
        return this.exception;
    }
}
