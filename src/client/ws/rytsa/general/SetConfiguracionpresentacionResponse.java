
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
 *         &lt;element name="SetConfiguracionpresentacionResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="be" type="{http://tempuri.org/}BEConfiguracionpresentacion" minOccurs="0"/>
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
    "setConfiguracionpresentacionResult",
    "be"
})
@XmlRootElement(name = "SetConfiguracionpresentacionResponse")
public class SetConfiguracionpresentacionResponse {

    @XmlElement(name = "SetConfiguracionpresentacionResult")
    protected BEEstado setConfiguracionpresentacionResult;
    protected BEConfiguracionpresentacion be;

    /**
     * Gets the value of the setConfiguracionpresentacionResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getSetConfiguracionpresentacionResult() {
        return setConfiguracionpresentacionResult;
    }

    /**
     * Sets the value of the setConfiguracionpresentacionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setSetConfiguracionpresentacionResult(BEEstado value) {
        this.setConfiguracionpresentacionResult = value;
    }

    /**
     * Gets the value of the be property.
     * 
     * @return
     *     possible object is
     *     {@link BEConfiguracionpresentacion }
     *     
     */
    public BEConfiguracionpresentacion getBe() {
        return be;
    }

    /**
     * Sets the value of the be property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEConfiguracionpresentacion }
     *     
     */
    public void setBe(BEConfiguracionpresentacion value) {
        this.be = value;
    }

}