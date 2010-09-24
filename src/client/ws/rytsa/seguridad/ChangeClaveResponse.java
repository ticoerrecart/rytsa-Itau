
package client.ws.rytsa.seguridad;

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
 *         &lt;element name="ChangeClaveResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
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
    "changeClaveResult"
})
@XmlRootElement(name = "ChangeClaveResponse")
public class ChangeClaveResponse {

    @XmlElement(name = "ChangeClaveResult")
    protected BEEstado changeClaveResult;

    /**
     * Gets the value of the changeClaveResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getChangeClaveResult() {
        return changeClaveResult;
    }

    /**
     * Sets the value of the changeClaveResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setChangeClaveResult(BEEstado value) {
        this.changeClaveResult = value;
    }

}
