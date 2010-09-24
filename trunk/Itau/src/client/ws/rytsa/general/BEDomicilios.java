
package client.ws.rytsa.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BEDomicilios complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BEDomicilios">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BEWithID">
 *       &lt;sequence>
 *         &lt;element name="UltimaActualizacion" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TipoEntidad" use="required" type="{http://tempuri.org/}TipoEntidadDomicilios" />
 *       &lt;attribute name="Identidad" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="TipoDomicilio" use="required" type="{http://tempuri.org/}TipoDomicilio" />
 *       &lt;attribute name="Idlocalidad" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="DescripcionLocalidad" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Idprovincia" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="DescripcionProvincia" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Idpais" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="DescripcionPais" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Calle" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Numero" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Piso" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Depto" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Codpostal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BEDomicilios", propOrder = {
    "ultimaActualizacion"
})
public class BEDomicilios
    extends BEWithID
{

    @XmlElement(name = "UltimaActualizacion")
    protected byte[] ultimaActualizacion;
    @XmlAttribute(name = "TipoEntidad", required = true)
    protected TipoEntidadDomicilios tipoEntidad;
    @XmlAttribute(name = "Identidad", required = true)
    protected long identidad;
    @XmlAttribute(name = "TipoDomicilio", required = true)
    protected TipoDomicilio tipoDomicilio;
    @XmlAttribute(name = "Idlocalidad", required = true)
    protected long idlocalidad;
    @XmlAttribute(name = "DescripcionLocalidad")
    protected String descripcionLocalidad;
    @XmlAttribute(name = "Idprovincia", required = true)
    protected long idprovincia;
    @XmlAttribute(name = "DescripcionProvincia")
    protected String descripcionProvincia;
    @XmlAttribute(name = "Idpais", required = true)
    protected long idpais;
    @XmlAttribute(name = "DescripcionPais")
    protected String descripcionPais;
    @XmlAttribute(name = "Calle")
    protected String calle;
    @XmlAttribute(name = "Numero")
    protected String numero;
    @XmlAttribute(name = "Piso")
    protected String piso;
    @XmlAttribute(name = "Depto")
    protected String depto;
    @XmlAttribute(name = "Codpostal")
    protected String codpostal;

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
     * Gets the value of the tipoEntidad property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEntidadDomicilios }
     *     
     */
    public TipoEntidadDomicilios getTipoEntidad() {
        return tipoEntidad;
    }

    /**
     * Sets the value of the tipoEntidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEntidadDomicilios }
     *     
     */
    public void setTipoEntidad(TipoEntidadDomicilios value) {
        this.tipoEntidad = value;
    }

    /**
     * Gets the value of the identidad property.
     * 
     */
    public long getIdentidad() {
        return identidad;
    }

    /**
     * Sets the value of the identidad property.
     * 
     */
    public void setIdentidad(long value) {
        this.identidad = value;
    }

    /**
     * Gets the value of the tipoDomicilio property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDomicilio }
     *     
     */
    public TipoDomicilio getTipoDomicilio() {
        return tipoDomicilio;
    }

    /**
     * Sets the value of the tipoDomicilio property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDomicilio }
     *     
     */
    public void setTipoDomicilio(TipoDomicilio value) {
        this.tipoDomicilio = value;
    }

    /**
     * Gets the value of the idlocalidad property.
     * 
     */
    public long getIdlocalidad() {
        return idlocalidad;
    }

    /**
     * Sets the value of the idlocalidad property.
     * 
     */
    public void setIdlocalidad(long value) {
        this.idlocalidad = value;
    }

    /**
     * Gets the value of the descripcionLocalidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionLocalidad() {
        return descripcionLocalidad;
    }

    /**
     * Sets the value of the descripcionLocalidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionLocalidad(String value) {
        this.descripcionLocalidad = value;
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
     * Gets the value of the calle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Sets the value of the calle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalle(String value) {
        this.calle = value;
    }

    /**
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Gets the value of the piso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiso() {
        return piso;
    }

    /**
     * Sets the value of the piso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiso(String value) {
        this.piso = value;
    }

    /**
     * Gets the value of the depto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepto() {
        return depto;
    }

    /**
     * Sets the value of the depto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepto(String value) {
        this.depto = value;
    }

    /**
     * Gets the value of the codpostal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodpostal() {
        return codpostal;
    }

    /**
     * Sets the value of the codpostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodpostal(String value) {
        this.codpostal = value;
    }

}
