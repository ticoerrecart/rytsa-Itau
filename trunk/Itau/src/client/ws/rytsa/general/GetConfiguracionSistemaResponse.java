
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
 *         &lt;element name="GetConfiguracion_SistemaResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="configSistema" type="{http://tempuri.org/}ItemConfigSistema" minOccurs="0"/>
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
    "getConfiguracionSistemaResult",
    "configSistema"
})
@XmlRootElement(name = "GetConfiguracion_SistemaResponse")
public class GetConfiguracionSistemaResponse {

    @XmlElement(name = "GetConfiguracion_SistemaResult")
    protected BEEstado getConfiguracionSistemaResult;
    protected ItemConfigSistema configSistema;

    /**
     * Gets the value of the getConfiguracionSistemaResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetConfiguracionSistemaResult() {
        return getConfiguracionSistemaResult;
    }

    /**
     * Sets the value of the getConfiguracionSistemaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetConfiguracionSistemaResult(BEEstado value) {
        this.getConfiguracionSistemaResult = value;
    }

    /**
     * Gets the value of the configSistema property.
     * 
     * @return
     *     possible object is
     *     {@link ItemConfigSistema }
     *     
     */
    public ItemConfigSistema getConfigSistema() {
        return configSistema;
    }

    /**
     * Sets the value of the configSistema property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemConfigSistema }
     *     
     */
    public void setConfigSistema(ItemConfigSistema value) {
        this.configSistema = value;
    }

}
