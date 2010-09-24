
package client.ws.rytsa.seguridad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BEUsuarios complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BEUsuarios">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BEWithID">
 *       &lt;sequence>
 *         &lt;element name="SegmentosSecundarios" type="{http://tempuri.org/}ArrayOfBEWithFK"/>
 *         &lt;element name="UltimaActualizacion" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="RolesUsuario" type="{http://tempuri.org/}ArrayOfBEWithFK"/>
 *       &lt;/sequence>
 *       &lt;attribute name="NoControlarInactividad" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Idsucursal" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="DescripcionSucursal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Pass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Expiracion" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="FechaBaja" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="CantidadIntentosMaximo" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ModificarPass" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Bloqueado" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Proceso" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="UltimaModificacionPassword" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Ultimologinexitoso" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Idsegmento" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="DescripcionSegmento" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IdParticipante" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="IdTipoParticipante" use="required" type="{http://tempuri.org/}TipoParticipante" />
 *       &lt;attribute name="NombreParticipante" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NroClienteParticipante" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BEUsuarios", propOrder = {
    "segmentosSecundarios",
    "ultimaActualizacion",
    "rolesUsuario"
})
public class BEUsuarios
    extends BEWithID
{

    @XmlElement(name = "SegmentosSecundarios", required = true, nillable = true)
    protected ArrayOfBEWithFK segmentosSecundarios;
    @XmlElement(name = "UltimaActualizacion")
    protected byte[] ultimaActualizacion;
    @XmlElement(name = "RolesUsuario", required = true, nillable = true)
    protected ArrayOfBEWithFK rolesUsuario;
    @XmlAttribute(name = "NoControlarInactividad", required = true)
    protected boolean noControlarInactividad;
    @XmlAttribute(name = "Idsucursal", required = true)
    protected long idsucursal;
    @XmlAttribute(name = "DescripcionSucursal")
    protected String descripcionSucursal;
    @XmlAttribute(name = "UserName")
    protected String userName;
    @XmlAttribute(name = "Nombre")
    protected String nombre;
    @XmlAttribute(name = "Pass")
    protected String pass;
    @XmlAttribute(name = "Expiracion", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiracion;
    @XmlAttribute(name = "FechaBaja", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaBaja;
    @XmlAttribute(name = "CantidadIntentosMaximo", required = true)
    protected int cantidadIntentosMaximo;
    @XmlAttribute(name = "ModificarPass", required = true)
    protected boolean modificarPass;
    @XmlAttribute(name = "Bloqueado", required = true)
    protected boolean bloqueado;
    @XmlAttribute(name = "Proceso", required = true)
    protected boolean proceso;
    @XmlAttribute(name = "UltimaModificacionPassword", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ultimaModificacionPassword;
    @XmlAttribute(name = "Ultimologinexitoso", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ultimologinexitoso;
    @XmlAttribute(name = "Idsegmento", required = true)
    protected long idsegmento;
    @XmlAttribute(name = "DescripcionSegmento")
    protected String descripcionSegmento;
    @XmlAttribute(name = "IdParticipante", required = true)
    protected long idParticipante;
    @XmlAttribute(name = "IdTipoParticipante", required = true)
    protected TipoParticipante idTipoParticipante;
    @XmlAttribute(name = "NombreParticipante")
    protected String nombreParticipante;
    @XmlAttribute(name = "NroClienteParticipante")
    protected String nroClienteParticipante;

    /**
     * Gets the value of the segmentosSecundarios property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBEWithFK }
     *     
     */
    public ArrayOfBEWithFK getSegmentosSecundarios() {
        return segmentosSecundarios;
    }

    /**
     * Sets the value of the segmentosSecundarios property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBEWithFK }
     *     
     */
    public void setSegmentosSecundarios(ArrayOfBEWithFK value) {
        this.segmentosSecundarios = value;
    }

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
     * Gets the value of the rolesUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBEWithFK }
     *     
     */
    public ArrayOfBEWithFK getRolesUsuario() {
        return rolesUsuario;
    }

    /**
     * Sets the value of the rolesUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBEWithFK }
     *     
     */
    public void setRolesUsuario(ArrayOfBEWithFK value) {
        this.rolesUsuario = value;
    }

    /**
     * Gets the value of the noControlarInactividad property.
     * 
     */
    public boolean isNoControlarInactividad() {
        return noControlarInactividad;
    }

    /**
     * Sets the value of the noControlarInactividad property.
     * 
     */
    public void setNoControlarInactividad(boolean value) {
        this.noControlarInactividad = value;
    }

    /**
     * Gets the value of the idsucursal property.
     * 
     */
    public long getIdsucursal() {
        return idsucursal;
    }

    /**
     * Sets the value of the idsucursal property.
     * 
     */
    public void setIdsucursal(long value) {
        this.idsucursal = value;
    }

    /**
     * Gets the value of the descripcionSucursal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionSucursal() {
        return descripcionSucursal;
    }

    /**
     * Sets the value of the descripcionSucursal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionSucursal(String value) {
        this.descripcionSucursal = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the pass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPass() {
        return pass;
    }

    /**
     * Sets the value of the pass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPass(String value) {
        this.pass = value;
    }

    /**
     * Gets the value of the expiracion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiracion() {
        return expiracion;
    }

    /**
     * Sets the value of the expiracion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiracion(XMLGregorianCalendar value) {
        this.expiracion = value;
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
     * Gets the value of the cantidadIntentosMaximo property.
     * 
     */
    public int getCantidadIntentosMaximo() {
        return cantidadIntentosMaximo;
    }

    /**
     * Sets the value of the cantidadIntentosMaximo property.
     * 
     */
    public void setCantidadIntentosMaximo(int value) {
        this.cantidadIntentosMaximo = value;
    }

    /**
     * Gets the value of the modificarPass property.
     * 
     */
    public boolean isModificarPass() {
        return modificarPass;
    }

    /**
     * Sets the value of the modificarPass property.
     * 
     */
    public void setModificarPass(boolean value) {
        this.modificarPass = value;
    }

    /**
     * Gets the value of the bloqueado property.
     * 
     */
    public boolean isBloqueado() {
        return bloqueado;
    }

    /**
     * Sets the value of the bloqueado property.
     * 
     */
    public void setBloqueado(boolean value) {
        this.bloqueado = value;
    }

    /**
     * Gets the value of the proceso property.
     * 
     */
    public boolean isProceso() {
        return proceso;
    }

    /**
     * Sets the value of the proceso property.
     * 
     */
    public void setProceso(boolean value) {
        this.proceso = value;
    }

    /**
     * Gets the value of the ultimaModificacionPassword property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUltimaModificacionPassword() {
        return ultimaModificacionPassword;
    }

    /**
     * Sets the value of the ultimaModificacionPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUltimaModificacionPassword(XMLGregorianCalendar value) {
        this.ultimaModificacionPassword = value;
    }

    /**
     * Gets the value of the ultimologinexitoso property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUltimologinexitoso() {
        return ultimologinexitoso;
    }

    /**
     * Sets the value of the ultimologinexitoso property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUltimologinexitoso(XMLGregorianCalendar value) {
        this.ultimologinexitoso = value;
    }

    /**
     * Gets the value of the idsegmento property.
     * 
     */
    public long getIdsegmento() {
        return idsegmento;
    }

    /**
     * Sets the value of the idsegmento property.
     * 
     */
    public void setIdsegmento(long value) {
        this.idsegmento = value;
    }

    /**
     * Gets the value of the descripcionSegmento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionSegmento() {
        return descripcionSegmento;
    }

    /**
     * Sets the value of the descripcionSegmento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionSegmento(String value) {
        this.descripcionSegmento = value;
    }

    /**
     * Gets the value of the idParticipante property.
     * 
     */
    public long getIdParticipante() {
        return idParticipante;
    }

    /**
     * Sets the value of the idParticipante property.
     * 
     */
    public void setIdParticipante(long value) {
        this.idParticipante = value;
    }

    /**
     * Gets the value of the idTipoParticipante property.
     * 
     * @return
     *     possible object is
     *     {@link TipoParticipante }
     *     
     */
    public TipoParticipante getIdTipoParticipante() {
        return idTipoParticipante;
    }

    /**
     * Sets the value of the idTipoParticipante property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoParticipante }
     *     
     */
    public void setIdTipoParticipante(TipoParticipante value) {
        this.idTipoParticipante = value;
    }

    /**
     * Gets the value of the nombreParticipante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreParticipante() {
        return nombreParticipante;
    }

    /**
     * Sets the value of the nombreParticipante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreParticipante(String value) {
        this.nombreParticipante = value;
    }

    /**
     * Gets the value of the nroClienteParticipante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroClienteParticipante() {
        return nroClienteParticipante;
    }

    /**
     * Sets the value of the nroClienteParticipante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroClienteParticipante(String value) {
        this.nroClienteParticipante = value;
    }

}
