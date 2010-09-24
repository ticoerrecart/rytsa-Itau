
package client.ws.rytsa.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BEEscritorios complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BEEscritorios">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BEWithID">
 *       &lt;sequence>
 *         &lt;element name="UltimaActualizacion" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Idusuario" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="Idaplicacion" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Levantar_Inicio" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BEEscritorios", propOrder = {
    "ultimaActualizacion"
})
public class BEEscritorios
    extends BEWithID
{

    @XmlElement(name = "UltimaActualizacion")
    protected byte[] ultimaActualizacion;
    @XmlAttribute(name = "Idusuario", required = true)
    protected long idusuario;
    @XmlAttribute(name = "Idaplicacion", required = true)
    protected int idaplicacion;
    @XmlAttribute(name = "Descripcion")
    protected String descripcion;
    @XmlAttribute(name = "Levantar_Inicio", required = true)
    protected boolean levantarInicio;

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
     * Gets the value of the idusuario property.
     * 
     */
    public long getIdusuario() {
        return idusuario;
    }

    /**
     * Sets the value of the idusuario property.
     * 
     */
    public void setIdusuario(long value) {
        this.idusuario = value;
    }

    /**
     * Gets the value of the idaplicacion property.
     * 
     */
    public int getIdaplicacion() {
        return idaplicacion;
    }

    /**
     * Sets the value of the idaplicacion property.
     * 
     */
    public void setIdaplicacion(int value) {
        this.idaplicacion = value;
    }

    /**
     * Gets the value of the descripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the levantarInicio property.
     * 
     */
    public boolean isLevantarInicio() {
        return levantarInicio;
    }

    /**
     * Sets the value of the levantarInicio property.
     * 
     */
    public void setLevantarInicio(boolean value) {
        this.levantarInicio = value;
    }

}
