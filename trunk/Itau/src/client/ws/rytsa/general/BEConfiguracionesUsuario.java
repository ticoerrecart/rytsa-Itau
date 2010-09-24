
package client.ws.rytsa.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BEConfiguraciones_usuario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BEConfiguraciones_usuario">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BEWithID">
 *       &lt;sequence>
 *         &lt;element name="UltimaActualizacion" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Idusuario" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="Idaplicacion" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Valor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IdEscritorio" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BEConfiguraciones_usuario", propOrder = {
    "ultimaActualizacion"
})
public class BEConfiguracionesUsuario
    extends BEWithID
{

    @XmlElement(name = "UltimaActualizacion")
    protected byte[] ultimaActualizacion;
    @XmlAttribute(name = "Idusuario", required = true)
    protected long idusuario;
    @XmlAttribute(name = "Idaplicacion", required = true)
    protected long idaplicacion;
    @XmlAttribute(name = "Codigo")
    protected String codigo;
    @XmlAttribute(name = "Valor")
    protected String valor;
    @XmlAttribute(name = "IdEscritorio", required = true)
    protected long idEscritorio;

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
    public long getIdaplicacion() {
        return idaplicacion;
    }

    /**
     * Sets the value of the idaplicacion property.
     * 
     */
    public void setIdaplicacion(long value) {
        this.idaplicacion = value;
    }

    /**
     * Gets the value of the codigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the valor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValor() {
        return valor;
    }

    /**
     * Sets the value of the valor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValor(String value) {
        this.valor = value;
    }

    /**
     * Gets the value of the idEscritorio property.
     * 
     */
    public long getIdEscritorio() {
        return idEscritorio;
    }

    /**
     * Sets the value of the idEscritorio property.
     * 
     */
    public void setIdEscritorio(long value) {
        this.idEscritorio = value;
    }

}
