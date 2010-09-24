
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
 *         &lt;element name="UpdateParametrosResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beNueva" type="{http://tempuri.org/}BEParametros" minOccurs="0"/>
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
    "updateParametrosResult",
    "beNueva"
})
@XmlRootElement(name = "UpdateParametrosResponse")
public class UpdateParametrosResponse {

    @XmlElement(name = "UpdateParametrosResult")
    protected BEEstado updateParametrosResult;
    protected BEParametros beNueva;

    /**
     * Gets the value of the updateParametrosResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getUpdateParametrosResult() {
        return updateParametrosResult;
    }

    /**
     * Sets the value of the updateParametrosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setUpdateParametrosResult(BEEstado value) {
        this.updateParametrosResult = value;
    }

    /**
     * Gets the value of the beNueva property.
     * 
     * @return
     *     possible object is
     *     {@link BEParametros }
     *     
     */
    public BEParametros getBeNueva() {
        return beNueva;
    }

    /**
     * Sets the value of the beNueva property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEParametros }
     *     
     */
    public void setBeNueva(BEParametros value) {
        this.beNueva = value;
    }

}
