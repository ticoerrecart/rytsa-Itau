
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
 *         &lt;element name="GetConfiguraciones_usuarioResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beArray" type="{http://tempuri.org/}ArrayOfBEConfiguraciones_usuario" minOccurs="0"/>
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
    "getConfiguracionesUsuarioResult",
    "beArray"
})
@XmlRootElement(name = "GetConfiguraciones_usuarioResponse")
public class GetConfiguracionesUsuarioResponse {

    @XmlElement(name = "GetConfiguraciones_usuarioResult")
    protected BEEstado getConfiguracionesUsuarioResult;
    protected ArrayOfBEConfiguracionesUsuario beArray;

    /**
     * Gets the value of the getConfiguracionesUsuarioResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetConfiguracionesUsuarioResult() {
        return getConfiguracionesUsuarioResult;
    }

    /**
     * Sets the value of the getConfiguracionesUsuarioResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetConfiguracionesUsuarioResult(BEEstado value) {
        this.getConfiguracionesUsuarioResult = value;
    }

    /**
     * Gets the value of the beArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBEConfiguracionesUsuario }
     *     
     */
    public ArrayOfBEConfiguracionesUsuario getBeArray() {
        return beArray;
    }

    /**
     * Sets the value of the beArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBEConfiguracionesUsuario }
     *     
     */
    public void setBeArray(ArrayOfBEConfiguracionesUsuario value) {
        this.beArray = value;
    }

}
