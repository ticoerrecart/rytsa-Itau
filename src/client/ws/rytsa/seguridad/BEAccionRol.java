
package client.ws.rytsa.seguridad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BEAccionRol complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BEAccionRol">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BEWithID">
 *       &lt;sequence>
 *         &lt;element name="UltimaActualizacion" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="IdRol" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="IdAccion" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="Permiso" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BEAccionRol", propOrder = {
    "ultimaActualizacion"
})
public class BEAccionRol
    extends BEWithID
{

    @XmlElement(name = "UltimaActualizacion")
    protected byte[] ultimaActualizacion;
    @XmlAttribute(name = "IdRol", required = true)
    protected long idRol;
    @XmlAttribute(name = "IdAccion", required = true)
    protected long idAccion;
    @XmlAttribute(name = "Permiso", required = true)
    protected int permiso;

    /**
     * Gets the value of the ultimaActualizacion property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getUltimaActualizacion() {
        return ultimaActualizacion;
    }

    /**
     * Sets the value of the ultimaActualizacion property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setUltimaActualizacion(byte[] value) {
        this.ultimaActualizacion = ((byte[]) value);
    }

    /**
     * Gets the value of the idRol property.
     * 
     */
    public long getIdRol() {
        return idRol;
    }

    /**
     * Sets the value of the idRol property.
     * 
     */
    public void setIdRol(long value) {
        this.idRol = value;
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
     * Gets the value of the permiso property.
     * 
     */
    public int getPermiso() {
        return permiso;
    }

    /**
     * Sets the value of the permiso property.
     * 
     */
    public void setPermiso(int value) {
        this.permiso = value;
    }

}
