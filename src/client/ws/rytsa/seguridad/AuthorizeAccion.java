
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
 *         &lt;element name="idSesion" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="idAccion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="permisoRequerido" type="{http://tempuri.org/}TipoPermiso"/>
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
    "idAccion",
    "permisoRequerido"
})
@XmlRootElement(name = "AuthorizeAccion")
public class AuthorizeAccion {

    @XmlElement(required = true)
    protected String idSesion;
    protected long idAccion;
    @XmlElement(required = true)
    protected TipoPermiso permisoRequerido;

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
     * Gets the value of the idAccion property.
     * 
     */
    public long getIdAccion() {
        return idAccion;
    }

    /**
     * Sets the value of the idAccion property.
     * 
     */
    public void setIdAccion(long value) {
        this.idAccion = value;
    }

    /**
     * Gets the value of the permisoRequerido property.
     * 
     * @return
     *     possible object is
     *     {@link TipoPermiso }
     *     
     */
    public TipoPermiso getPermisoRequerido() {
        return permisoRequerido;
    }

    /**
     * Sets the value of the permisoRequerido property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPermiso }
     *     
     */
    public void setPermisoRequerido(TipoPermiso value) {
        this.permisoRequerido = value;
    }

}
