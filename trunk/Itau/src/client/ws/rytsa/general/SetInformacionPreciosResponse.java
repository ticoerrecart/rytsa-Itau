
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
 *         &lt;element name="SetInformacionPreciosResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
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
    "setInformacionPreciosResult"
})
@XmlRootElement(name = "SetInformacionPreciosResponse")
public class SetInformacionPreciosResponse {

    @XmlElement(name = "SetInformacionPreciosResult")
    protected BEEstado setInformacionPreciosResult;

    /**
     * Gets the value of the setInformacionPreciosResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getSetInformacionPreciosResult() {
        return setInformacionPreciosResult;
    }

    /**
     * Sets the value of the setInformacionPreciosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setSetInformacionPreciosResult(BEEstado value) {
        this.setInformacionPreciosResult = value;
    }

}
