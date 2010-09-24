
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
 *         &lt;element name="SetInformacionAsientosResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
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
    "setInformacionAsientosResult"
})
@XmlRootElement(name = "SetInformacionAsientosResponse")
public class SetInformacionAsientosResponse {

    @XmlElement(name = "SetInformacionAsientosResult")
    protected BEEstado setInformacionAsientosResult;

    /**
     * Gets the value of the setInformacionAsientosResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getSetInformacionAsientosResult() {
        return setInformacionAsientosResult;
    }

    /**
     * Sets the value of the setInformacionAsientosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setSetInformacionAsientosResult(BEEstado value) {
        this.setInformacionAsientosResult = value;
    }

}
