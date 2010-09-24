
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
 *         &lt;element name="IdSuperClaseOp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdSubClaseOp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdTipo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdClaseOp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GeneraAsientos" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Activo" type="{http://www.w3.org/2001/XMLSchema}short"/>
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
    "idSuperClaseOp",
    "idSubClaseOp",
    "idTipo",
    "idClaseOp",
    "generaAsientos",
    "activo"
})
@XmlRootElement(name = "GetAllTiposComprobante")
public class GetAllTiposComprobante {

    @XmlElement(required = true)
    protected String idSesion;
    @XmlElement(name = "IdSuperClaseOp")
    protected int idSuperClaseOp;
    @XmlElement(name = "IdSubClaseOp")
    protected int idSubClaseOp;
    @XmlElement(name = "IdTipo")
    protected int idTipo;
    @XmlElement(name = "IdClaseOp")
    protected int idClaseOp;
    @XmlElement(name = "GeneraAsientos")
    protected short generaAsientos;
    @XmlElement(name = "Activo")
    protected short activo;

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
     * Gets the value of the idSuperClaseOp property.
     * 
     */
    public int getIdSuperClaseOp() {
        return idSuperClaseOp;
    }

    /**
     * Sets the value of the idSuperClaseOp property.
     * 
     */
    public void setIdSuperClaseOp(int value) {
        this.idSuperClaseOp = value;
    }

    /**
     * Gets the value of the idSubClaseOp property.
     * 
     */
    public int getIdSubClaseOp() {
        return idSubClaseOp;
    }

    /**
     * Sets the value of the idSubClaseOp property.
     * 
     */
    public void setIdSubClaseOp(int value) {
        this.idSubClaseOp = value;
    }

    /**
     * Gets the value of the idTipo property.
     * 
     */
    public int getIdTipo() {
        return idTipo;
    }

    /**
     * Sets the value of the idTipo property.
     * 
     */
    public void setIdTipo(int value) {
        this.idTipo = value;
    }

    /**
     * Gets the value of the idClaseOp property.
     * 
     */
    public int getIdClaseOp() {
        return idClaseOp;
    }

    /**
     * Sets the value of the idClaseOp property.
     * 
     */
    public void setIdClaseOp(int value) {
        this.idClaseOp = value;
    }

    /**
     * Gets the value of the generaAsientos property.
     * 
     */
    public short getGeneraAsientos() {
        return generaAsientos;
    }

    /**
     * Sets the value of the generaAsientos property.
     * 
     */
    public void setGeneraAsientos(short value) {
        this.generaAsientos = value;
    }

    /**
     * Gets the value of the activo property.
     * 
     */
    public short getActivo() {
        return activo;
    }

    /**
     * Sets the value of the activo property.
     * 
     */
    public void setActivo(short value) {
        this.activo = value;
    }

}
