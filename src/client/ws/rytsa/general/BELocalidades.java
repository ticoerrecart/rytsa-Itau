
package client.ws.rytsa.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BELocalidades complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BELocalidades">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BEWithID">
 *       &lt;sequence>
 *         &lt;element name="UltimaActualizacion" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Idprovincia" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="CodigoProvincia" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DescripcionProvincia" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Idpais" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="CodigoPais" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DescripcionPais" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BELocalidades", propOrder = {
    "ultimaActualizacion"
})
public class BELocalidades
    extends BEWithID
{

    @XmlElement(name = "UltimaActualizacion")
    protected byte[] ultimaActualizacion;
    @XmlAttribute(name = "Idprovincia", required = true)
    protected long idprovincia;
    @XmlAttribute(name = "CodigoProvincia")
    protected String codigoProvincia;
    @XmlAttribute(name = "DescripcionProvincia")
    protected String descripcionProvincia;
    @XmlAttribute(name = "Idpais", required = true)
    protected long idpais;
    @XmlAttribute(name = "CodigoPais")
    protected String codigoPais;
    @XmlAttribute(name = "DescripcionPais")
    protected String descripcionPais;
    @XmlAttribute(name = "Codigo")
    protected String codigo;
    @XmlAttribute(name = "Descripcion")
    protected String descripcion;

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
     * Gets the value of the idprovincia property.
     * 
     */
    public long getIdprovincia() {
        return idprovincia;
    }

    /**
     * Sets the value of the idprovincia property.
     * 
     */
    public void setIdprovincia(long value) {
        this.idprovincia = value;
    }

    /**
     * Gets the value of the codigoProvincia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoProvincia() {
        return codigoProvincia;
    }

    /**
     * Sets the value of the codigoProvincia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoProvincia(String value) {
        this.codigoProvincia = value;
    }

    /**
     * Gets the value of the descripcionProvincia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionProvincia() {
        return descripcionProvincia;
    }

    /**
     * Sets the value of the descripcionProvincia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionProvincia(String value) {
        this.descripcionProvincia = value;
    }

    /**
     * Gets the value of the idpais property.
     * 
     */
    public long getIdpais() {
        return idpais;
    }

    /**
     * Sets the value of the idpais property.
     * 
     */
    public void setIdpais(long value) {
        this.idpais = value;
    }

    /**
     * Gets the value of the codigoPais property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPais() {
        return codigoPais;
    }

    /**
     * Sets the value of the codigoPais property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPais(String value) {
        this.codigoPais = value;
    }

    /**
     * Gets the value of the descripcionPais property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionPais() {
        return descripcionPais;
    }

    /**
     * Sets the value of the descripcionPais property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionPais(String value) {
        this.descripcionPais = value;
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

}
