
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
 *         &lt;element name="nuevaClave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nuevaClaveVerificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="be" type="{http://tempuri.org/}BEUsuarios" minOccurs="0"/>
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
    "nuevaClave",
    "nuevaClaveVerificacion",
    "be"
})
@XmlRootElement(name = "ResetClave")
public class ResetClave {

    @XmlElement(required = true)
    protected String idSesion;
    protected String nuevaClave;
    protected String nuevaClaveVerificacion;
    protected BEUsuarios be;

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
     * Gets the value of the nuevaClave property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevaClave() {
        return nuevaClave;
    }

    /**
     * Sets the value of the nuevaClave property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevaClave(String value) {
        this.nuevaClave = value;
    }

    /**
     * Gets the value of the nuevaClaveVerificacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevaClaveVerificacion() {
        return nuevaClaveVerificacion;
    }

    /**
     * Sets the value of the nuevaClaveVerificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevaClaveVerificacion(String value) {
        this.nuevaClaveVerificacion = value;
    }

    /**
     * Gets the value of the be property.
     * 
     * @return
     *     possible object is
     *     {@link BEUsuarios }
     *     
     */
    public BEUsuarios getBe() {
        return be;
    }

    /**
     * Sets the value of the be property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEUsuarios }
     *     
     */
    public void setBe(BEUsuarios value) {
        this.be = value;
    }

}
