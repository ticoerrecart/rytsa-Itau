
package client.ws.rytsa.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idSesion" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="Lastrecord" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Maxrecord" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idSesion",
    "lastrecord",
    "maxrecord"
})
@XmlRootElement(name = "GetAllLookUpTablaMaestra")
public class GetAllLookUpTablaMaestra {

    @XmlElement(required = true)
    protected String idSesion;
    @XmlElement(name = "Lastrecord")
    protected long lastrecord;
    @XmlElement(name = "Maxrecord")
    protected long maxrecord;

    /**
     * Gets the value of the idSesion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSesion() {
        return idSesion;
    }

    /**
     * Sets the value of the idSesion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSesion(String value) {
        this.idSesion = value;
    }

    /**
     * Gets the value of the lastrecord property.
     * 
     */
    public long getLastrecord() {
        return lastrecord;
    }

    /**
     * Sets the value of the lastrecord property.
     * 
     */
    public void setLastrecord(long value) {
        this.lastrecord = value;
    }

    /**
     * Gets the value of the maxrecord property.
     * 
     */
    public long getMaxrecord() {
        return maxrecord;
    }

    /**
     * Sets the value of the maxrecord property.
     * 
     */
    public void setMaxrecord(long value) {
        this.maxrecord = value;
    }

}
