
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setBestWilsonPlotPath complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setBestWilsonPlotPath"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="bestWilsonPlotPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setBestWilsonPlotPath", propOrder = {
    "arg0",
    "bestWilsonPlotPath"
})
public class SetBestWilsonPlotPath {

    protected Integer arg0;
    protected String bestWilsonPlotPath;

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArg0(Integer value) {
        this.arg0 = value;
    }

    /**
     * Gets the value of the bestWilsonPlotPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBestWilsonPlotPath() {
        return bestWilsonPlotPath;
    }

    /**
     * Sets the value of the bestWilsonPlotPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBestWilsonPlotPath(String value) {
        this.bestWilsonPlotPath = value;
    }

}
