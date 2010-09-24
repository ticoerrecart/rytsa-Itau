
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
 *         &lt;element name="IdSesion" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="anterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nueva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nuevaVerificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "anterior",
    "nueva",
    "nuevaVerificacion"
})
@XmlRootElement(name = "ChangeClave")
public class ChangeClave {

    @XmlElement(name = "IdSesion", required = true)
    protected String idSesion;
    protected String anterior;
    protected String nueva;
    protected String nuevaVerificacion;

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
     * Gets the value of the anterior property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnterior() {
        return anterior;
    }

    /**
     * Sets the value of the anterior property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnterior(String value) {
        this.anterior = value;
    }

    /**
     * Gets the value of the nueva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNueva() {
        return nueva;
    }

    /**
     * Sets the value of the nueva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNueva(String value) {
        this.nueva = value;
    }

    /**
     * Gets the value of the nuevaVerificacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevaVerificacion() {
        return nuevaVerificacion;
    }

    /**
     * Sets the value of the nuevaVerificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevaVerificacion(String value) {
        this.nuevaVerificacion = value;
    }

}
