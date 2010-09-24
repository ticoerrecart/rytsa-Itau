
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
 *         &lt;element name="_dcGeneralCollResult" type="{http://tempuri.org/}DCEstado" minOccurs="0"/>
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
    "dcGeneralCollResult"
})
@XmlRootElement(name = "_dcGeneralCollResponse")
public class DcGeneralCollResponse {

    @XmlElement(name = "_dcGeneralCollResult")
    protected DCEstado dcGeneralCollResult;

    /**
     * Gets the value of the dcGeneralCollResult property.
     * 
     * @return
     *     possible object is
     *     {@link DCEstado }
     *     
     */
    public DCEstado getDcGeneralCollResult() {
        return dcGeneralCollResult;
    }

    /**
     * Sets the value of the dcGeneralCollResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DCEstado }
     *     
     */
    public void setDcGeneralCollResult(DCEstado value) {
        this.dcGeneralCollResult = value;
    }

}
