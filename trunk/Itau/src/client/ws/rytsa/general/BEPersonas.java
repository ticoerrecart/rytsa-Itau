
package client.ws.rytsa.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BEPersonas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BEPersonas">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BEWithID">
 *       &lt;sequence>
 *         &lt;element name="UltimaActualizacion" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="Domicilios" type="{http://tempuri.org/}ArrayOfBEDomicilios"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TipoPersona" use="required" type="{http://tempuri.org/}Tipopersona" />
 *       &lt;attribute name="Idtipodocumento" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="DescripcionTipodoc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CodigoTipodoc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Nrodocumento" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Apellidos" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NombrePersona" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Razonsocial" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NroCuentaBc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Idestadopersona" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="IdentificacionTributaria" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IdusuarioCreacion" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="IdusuarioUltimaModificacion" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="IdusuarioBaja" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="FechaCreacion" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="FechaUltimaModificacion" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="FechaBaja" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="NumeroInscripcionRpc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FolioInscripcionRpc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LibroInscripcionRpc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TomoInscripcionRpc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LugarInscripcionRpc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Idpaisnacionalidad" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="Idtipodatoregistral" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="NumeroDatoRegistral" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Idtiposociedad" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="CodigoTiposociedad" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DescripcionTiposociedad" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FechaInscripcionRpc" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Idcategoriafirmante" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="DescripcionCategoriaFirmante" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DescripcionPaisnacionalidad" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Idgrupoeconomico" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="DescripcionGrupoEconomico" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TipoDatosCv" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BEPersonas", propOrder = {
    "ultimaActualizacion",
    "domicilios"
})
public class BEPersonas
    extends BEWithID
{

    @XmlElement(name = "UltimaActualizacion")
    protected byte[] ultimaActualizacion;
    @XmlElement(name = "Domicilios", required = true, nillable = true)
    protected ArrayOfBEDomicilios domicilios;
    @XmlAttribute(name = "TipoPersona", required = true)
    protected Tipopersona tipoPersona;
    @XmlAttribute(name = "Idtipodocumento", required = true)
    protected long idtipodocumento;
    @XmlAttribute(name = "DescripcionTipodoc")
    protected String descripcionTipodoc;
    @XmlAttribute(name = "CodigoTipodoc")
    protected String codigoTipodoc;
    @XmlAttribute(name = "Nrodocumento")
    protected String nrodocumento;
    @XmlAttribute(name = "Apellidos")
    protected String apellidos;
    @XmlAttribute(name = "Nombres")
    protected String nombres;
    @XmlAttribute(name = "NombrePersona")
    protected String nombrePersona;
    @XmlAttribute(name = "Razonsocial")
    protected String razonsocial;
    @XmlAttribute(name = "NroCuentaBc")
    protected String nroCuentaBc;
    @XmlAttribute(name = "Idestadopersona", required = true)
    protected short idestadopersona;
    @XmlAttribute(name = "IdentificacionTributaria")
    protected String identificacionTributaria;
    @XmlAttribute(name = "Telefono")
    protected String telefono;
    @XmlAttribute(name = "IdusuarioCreacion", required = true)
    protected long idusuarioCreacion;
    @XmlAttribute(name = "IdusuarioUltimaModificacion", required = true)
    protected long idusuarioUltimaModificacion;
    @XmlAttribute(name = "IdusuarioBaja", required = true)
    protected long idusuarioBaja;
    @XmlAttribute(name = "FechaCreacion", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCreacion;
    @XmlAttribute(name = "FechaUltimaModificacion", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaUltimaModificacion;
    @XmlAttribute(name = "FechaBaja", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaBaja;
    @XmlAttribute(name = "NumeroInscripcionRpc")
    protected String numeroInscripcionRpc;
    @XmlAttribute(name = "FolioInscripcionRpc")
    protected String folioInscripcionRpc;
    @XmlAttribute(name = "LibroInscripcionRpc")
    protected String libroInscripcionRpc;
    @XmlAttribute(name = "TomoInscripcionRpc")
    protected String tomoInscripcionRpc;
    @XmlAttribute(name = "LugarInscripcionRpc")
    protected String lugarInscripcionRpc;
    @XmlAttribute(name = "Idpaisnacionalidad", required = true)
    protected long idpaisnacionalidad;
    @XmlAttribute(name = "Idtipodatoregistral", required = true)
    protected long idtipodatoregistral;
    @XmlAttribute(name = "NumeroDatoRegistral")
    protected String numeroDatoRegistral;
    @XmlAttribute(name = "Idtiposociedad", required = true)
    protected long idtiposociedad;
    @XmlAttribute(name = "CodigoTiposociedad")
    protected String codigoTiposociedad;
    @XmlAttribute(name = "DescripcionTiposociedad")
    protected String descripcionTiposociedad;
    @XmlAttribute(name = "FechaInscripcionRpc", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaInscripcionRpc;
    @XmlAttribute(name = "Idcategoriafirmante", required = true)
    protected long idcategoriafirmante;
    @XmlAttribute(name = "DescripcionCategoriaFirmante")
    protected String descripcionCategoriaFirmante;
    @XmlAttribute(name = "DescripcionPaisnacionalidad")
    protected String descripcionPaisnacionalidad;
    @XmlAttribute(name = "Idgrupoeconomico", required = true)
    protected long idgrupoeconomico;
    @XmlAttribute(name = "DescripcionGrupoEconomico")
    protected String descripcionGrupoEconomico;
    @XmlAttribute(name = "TipoDatosCv", required = true)
    protected short tipoDatosCv;

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
     * Gets the value of the domicilios property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBEDomicilios }
     *     
     */
    public ArrayOfBEDomicilios getDomicilios() {
        return domicilios;
    }

    /**
     * Sets the value of the domicilios property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBEDomicilios }
     *     
     */
    public void setDomicilios(ArrayOfBEDomicilios value) {
        this.domicilios = value;
    }

    /**
     * Gets the value of the tipoPersona property.
     * 
     * @return
     *     possible object is
     *     {@link Tipopersona }
     *     
     */
    public Tipopersona getTipoPersona() {
        return tipoPersona;
    }

    /**
     * Sets the value of the tipoPersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tipopersona }
     *     
     */
    public void setTipoPersona(Tipopersona value) {
        this.tipoPersona = value;
    }

    /**
     * Gets the value of the idtipodocumento property.
     * 
     */
    public long getIdtipodocumento() {
        return idtipodocumento;
    }

    /**
     * Sets the value of the idtipodocumento property.
     * 
     */
    public void setIdtipodocumento(long value) {
        this.idtipodocumento = value;
    }

    /**
     * Gets the value of the descripcionTipodoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionTipodoc() {
        return descripcionTipodoc;
    }

    /**
     * Sets the value of the descripcionTipodoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionTipodoc(String value) {
        this.descripcionTipodoc = value;
    }

    /**
     * Gets the value of the codigoTipodoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTipodoc() {
        return codigoTipodoc;
    }

    /**
     * Sets the value of the codigoTipodoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTipodoc(String value) {
        this.codigoTipodoc = value;
    }

    /**
     * Gets the value of the nrodocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrodocumento() {
        return nrodocumento;
    }

    /**
     * Sets the value of the nrodocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrodocumento(String value) {
        this.nrodocumento = value;
    }

    /**
     * Gets the value of the apellidos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Sets the value of the apellidos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidos(String value) {
        this.apellidos = value;
    }

    /**
     * Gets the value of the nombres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Sets the value of the nombres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombres(String value) {
        this.nombres = value;
    }

    /**
     * Gets the value of the nombrePersona property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePersona() {
        return nombrePersona;
    }

    /**
     * Sets the value of the nombrePersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePersona(String value) {
        this.nombrePersona = value;
    }

    /**
     * Gets the value of the razonsocial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonsocial() {
        return razonsocial;
    }

    /**
     * Sets the value of the razonsocial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonsocial(String value) {
        this.razonsocial = value;
    }

    /**
     * Gets the value of the nroCuentaBc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroCuentaBc() {
        return nroCuentaBc;
    }

    /**
     * Sets the value of the nroCuentaBc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroCuentaBc(String value) {
        this.nroCuentaBc = value;
    }

    /**
     * Gets the value of the idestadopersona property.
     * 
     */
    public short getIdestadopersona() {
        return idestadopersona;
    }

    /**
     * Sets the value of the idestadopersona property.
     * 
     */
    public void setIdestadopersona(short value) {
        this.idestadopersona = value;
    }

    /**
     * Gets the value of the identificacionTributaria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacionTributaria() {
        return identificacionTributaria;
    }

    /**
     * Sets the value of the identificacionTributaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacionTributaria(String value) {
        this.identificacionTributaria = value;
    }

    /**
     * Gets the value of the telefono property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Sets the value of the telefono property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Gets the value of the idusuarioCreacion property.
     * 
     */
    public long getIdusuarioCreacion() {
        return idusuarioCreacion;
    }

    /**
     * Sets the value of the idusuarioCreacion property.
     * 
     */
    public void setIdusuarioCreacion(long value) {
        this.idusuarioCreacion = value;
    }

    /**
     * Gets the value of the idusuarioUltimaModificacion property.
     * 
     */
    public long getIdusuarioUltimaModificacion() {
        return idusuarioUltimaModificacion;
    }

    /**
     * Sets the value of the idusuarioUltimaModificacion property.
     * 
     */
    public void setIdusuarioUltimaModificacion(long value) {
        this.idusuarioUltimaModificacion = value;
    }

    /**
     * Gets the value of the idusuarioBaja property.
     * 
     */
    public long getIdusuarioBaja() {
        return idusuarioBaja;
    }

    /**
     * Sets the value of the idusuarioBaja property.
     * 
     */
    public void setIdusuarioBaja(long value) {
        this.idusuarioBaja = value;
    }

    /**
     * Gets the value of the fechaCreacion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Sets the value of the fechaCreacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCreacion(XMLGregorianCalendar value) {
        this.fechaCreacion = value;
    }

    /**
     * Gets the value of the fechaUltimaModificacion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaUltimaModificacion() {
        return fechaUltimaModificacion;
    }

    /**
     * Sets the value of the fechaUltimaModificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaUltimaModificacion(XMLGregorianCalendar value) {
        this.fechaUltimaModificacion = value;
    }

    /**
     * Gets the value of the fechaBaja property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaBaja() {
        return fechaBaja;
    }

    /**
     * Sets the value of the fechaBaja property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaBaja(XMLGregorianCalendar value) {
        this.fechaBaja = value;
    }

    /**
     * Gets the value of the numeroInscripcionRpc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroInscripcionRpc() {
        return numeroInscripcionRpc;
    }

    /**
     * Sets the value of the numeroInscripcionRpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroInscripcionRpc(String value) {
        this.numeroInscripcionRpc = value;
    }

    /**
     * Gets the value of the folioInscripcionRpc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioInscripcionRpc() {
        return folioInscripcionRpc;
    }

    /**
     * Sets the value of the folioInscripcionRpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioInscripcionRpc(String value) {
        this.folioInscripcionRpc = value;
    }

    /**
     * Gets the value of the libroInscripcionRpc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibroInscripcionRpc() {
        return libroInscripcionRpc;
    }

    /**
     * Sets the value of the libroInscripcionRpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibroInscripcionRpc(String value) {
        this.libroInscripcionRpc = value;
    }

    /**
     * Gets the value of the tomoInscripcionRpc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTomoInscripcionRpc() {
        return tomoInscripcionRpc;
    }

    /**
     * Sets the value of the tomoInscripcionRpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTomoInscripcionRpc(String value) {
        this.tomoInscripcionRpc = value;
    }

    /**
     * Gets the value of the lugarInscripcionRpc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarInscripcionRpc() {
        return lugarInscripcionRpc;
    }

    /**
     * Sets the value of the lugarInscripcionRpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarInscripcionRpc(String value) {
        this.lugarInscripcionRpc = value;
    }

    /**
     * Gets the value of the idpaisnacionalidad property.
     * 
     */
    public long getIdpaisnacionalidad() {
        return idpaisnacionalidad;
    }

    /**
     * Sets the value of the idpaisnacionalidad property.
     * 
     */
    public void setIdpaisnacionalidad(long value) {
        this.idpaisnacionalidad = value;
    }

    /**
     * Gets the value of the idtipodatoregistral property.
     * 
     */
    public long getIdtipodatoregistral() {
        return idtipodatoregistral;
    }

    /**
     * Sets the value of the idtipodatoregistral property.
     * 
     */
    public void setIdtipodatoregistral(long value) {
        this.idtipodatoregistral = value;
    }

    /**
     * Gets the value of the numeroDatoRegistral property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDatoRegistral() {
        return numeroDatoRegistral;
    }

    /**
     * Sets the value of the numeroDatoRegistral property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDatoRegistral(String value) {
        this.numeroDatoRegistral = value;
    }

    /**
     * Gets the value of the idtiposociedad property.
     * 
     */
    public long getIdtiposociedad() {
        return idtiposociedad;
    }

    /**
     * Sets the value of the idtiposociedad property.
     * 
     */
    public void setIdtiposociedad(long value) {
        this.idtiposociedad = value;
    }

    /**
     * Gets the value of the codigoTiposociedad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTiposociedad() {
        return codigoTiposociedad;
    }

    /**
     * Sets the value of the codigoTiposociedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTiposociedad(String value) {
        this.codigoTiposociedad = value;
    }

    /**
     * Gets the value of the descripcionTiposociedad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionTiposociedad() {
        return descripcionTiposociedad;
    }

    /**
     * Sets the value of the descripcionTiposociedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionTiposociedad(String value) {
        this.descripcionTiposociedad = value;
    }

    /**
     * Gets the value of the fechaInscripcionRpc property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInscripcionRpc() {
        return fechaInscripcionRpc;
    }

    /**
     * Sets the value of the fechaInscripcionRpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInscripcionRpc(XMLGregorianCalendar value) {
        this.fechaInscripcionRpc = value;
    }

    /**
     * Gets the value of the idcategoriafirmante property.
     * 
     */
    public long getIdcategoriafirmante() {
        return idcategoriafirmante;
    }

    /**
     * Sets the value of the idcategoriafirmante property.
     * 
     */
    public void setIdcategoriafirmante(long value) {
        this.idcategoriafirmante = value;
    }

    /**
     * Gets the value of the descripcionCategoriaFirmante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionCategoriaFirmante() {
        return descripcionCategoriaFirmante;
    }

    /**
     * Sets the value of the descripcionCategoriaFirmante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionCategoriaFirmante(String value) {
        this.descripcionCategoriaFirmante = value;
    }

    /**
     * Gets the value of the descripcionPaisnacionalidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionPaisnacionalidad() {
        return descripcionPaisnacionalidad;
    }

    /**
     * Sets the value of the descripcionPaisnacionalidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionPaisnacionalidad(String value) {
        this.descripcionPaisnacionalidad = value;
    }

    /**
     * Gets the value of the idgrupoeconomico property.
     * 
     */
    public long getIdgrupoeconomico() {
        return idgrupoeconomico;
    }

    /**
     * Sets the value of the idgrupoeconomico property.
     * 
     */
    public void setIdgrupoeconomico(long value) {
        this.idgrupoeconomico = value;
    }

    /**
     * Gets the value of the descripcionGrupoEconomico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionGrupoEconomico() {
        return descripcionGrupoEconomico;
    }

    /**
     * Sets the value of the descripcionGrupoEconomico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionGrupoEconomico(String value) {
        this.descripcionGrupoEconomico = value;
    }

    /**
     * Gets the value of the tipoDatosCv property.
     * 
     */
    public short getTipoDatosCv() {
        return tipoDatosCv;
    }

    /**
     * Sets the value of the tipoDatosCv property.
     * 
     */
    public void setTipoDatosCv(short value) {
        this.tipoDatosCv = value;
    }

}
