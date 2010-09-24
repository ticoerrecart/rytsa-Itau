
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
 *         &lt;element name="GetConfiguraciongeneralResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="be" type="{http://tempuri.org/}BEConfiguraciongeneral" minOccurs="0"/>
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
    "getConfiguraciongeneralResult",
    "be"
})
@XmlRootElement(name = "GetConfiguraciongeneralResponse")
public class GetConfiguraciongeneralResponse {

    @XmlElement(name = "GetConfiguraciongeneralResult")
    protected BEEstado getConfiguraciongeneralResult;
    protected BEConfiguraciongeneral be;

    /**
     * Gets the value of the getConfiguraciongeneralResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetConfiguraciongeneralResult() {
        return getConfiguraciongeneralResult;
    }

    /**
     * Sets the value of the getConfiguraciongeneralResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetConfiguraciongeneralResult(BEEstado value) {
        this.getConfiguraciongeneralResult = value;
    }

    /**
     * Gets the value of the be property.
     * 
     * @return
     *     possible object is
     *     {@link BEConfiguraciongeneral }
     *     
     */
    public BEConfiguraciongeneral getBe() {
        return be;
    }

    /**
     * Sets the value of the be property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEConfiguraciongeneral }
     *     
     */
    public void setBe(BEConfiguraciongeneral value) {
        this.be = value;
    }

}
