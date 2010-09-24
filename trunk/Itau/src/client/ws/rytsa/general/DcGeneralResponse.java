
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
 *         &lt;element name="_dcGeneralResult" type="{http://tempuri.org/}DCEstado" minOccurs="0"/>
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
    "dcGeneralResult"
})
@XmlRootElement(name = "_dcGeneralResponse")
public class DcGeneralResponse {

    @XmlElement(name = "_dcGeneralResult")
    protected DCEstado dcGeneralResult;

    /**
     * Gets the value of the dcGeneralResult property.
     * 
     * @return
     *     possible object is
     *     {@link DCEstado }
     *     
     */
    public DCEstado getDcGeneralResult() {
        return dcGeneralResult;
    }

    /**
     * Sets the value of the dcGeneralResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DCEstado }
     *     
     */
    public void setDcGeneralResult(DCEstado value) {
        this.dcGeneralResult = value;
    }

}
