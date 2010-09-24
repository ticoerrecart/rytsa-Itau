
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
 *         &lt;element name="GetConfiguracionpresentacionResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
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
    "getConfiguracionpresentacionResult",
    "be"
})
@XmlRootElement(name = "GetConfiguracionpresentacionResponse")
public class GetConfiguracionpresentacionResponse {

    @XmlElement(name = "GetConfiguracionpresentacionResult")
    protected BEEstado getConfiguracionpresentacionResult;
    protected BEConfiguracionpresentacion be;

    /**
     * Gets the value of the getConfiguracionpresentacionResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetConfiguracionpresentacionResult() {
        return getConfiguracionpresentacionResult;
    }

    /**
     * Sets the value of the getConfiguracionpresentacionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetConfiguracionpresentacionResult(BEEstado value) {
        this.getConfiguracionpresentacionResult = value;
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
