
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
 *         &lt;element name="DeleteConfiguraciones_usuarioResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
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
    "deleteConfiguracionesUsuarioResult"
})
@XmlRootElement(name = "DeleteConfiguraciones_usuarioResponse")
public class DeleteConfiguracionesUsuarioResponse {

    @XmlElement(name = "DeleteConfiguraciones_usuarioResult")
    protected BEEstado deleteConfiguracionesUsuarioResult;

    /**
     * Gets the value of the deleteConfiguracionesUsuarioResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getDeleteConfiguracionesUsuarioResult() {
        return deleteConfiguracionesUsuarioResult;
    }

    /**
     * Sets the value of the deleteConfiguracionesUsuarioResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setDeleteConfiguracionesUsuarioResult(BEEstado value) {
        this.deleteConfiguracionesUsuarioResult = value;
    }

}
