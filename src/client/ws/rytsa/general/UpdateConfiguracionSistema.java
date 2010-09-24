
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
 *         &lt;element name="idSesion" type="{http://microsoft.com/wsdl/types/}guid"/>
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
    "idSesion",
    "configSistema"
})
@XmlRootElement(name = "UpdateConfiguracion_Sistema")
public class UpdateConfiguracionSistema {

    @XmlElement(required = true)
    protected String idSesion;
    protected ItemConfigSistema configSistema;

    /**
     * Gets the value of the idSesion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSesion() {
        return idSesion;
    }

    /**
     * Sets the value of the idSesion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSesion(String value) {
        this.idSesion = value;
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
