
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
 *         &lt;element name="CreateUsuariosResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beUsuarios" type="{http://tempuri.org/}BEUsuarios" minOccurs="0"/>
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
    "createUsuariosResult",
    "beUsuarios"
})
@XmlRootElement(name = "CreateUsuariosResponse")
public class CreateUsuariosResponse {

    @XmlElement(name = "CreateUsuariosResult")
    protected BEEstado createUsuariosResult;
    protected BEUsuarios beUsuarios;

    /**
     * Gets the value of the createUsuariosResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getCreateUsuariosResult() {
        return createUsuariosResult;
    }

    /**
     * Sets the value of the createUsuariosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setCreateUsuariosResult(BEEstado value) {
        this.createUsuariosResult = value;
    }

    /**
     * Gets the value of the beUsuarios property.
     * 
     * @return
     *     possible object is
     *     {@link BEUsuarios }
     *     
     */
    public BEUsuarios getBeUsuarios() {
        return beUsuarios;
    }

    /**
     * Sets the value of the beUsuarios property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEUsuarios }
     *     
     */
    public void setBeUsuarios(BEUsuarios value) {
        this.beUsuarios = value;
    }

}
