
package client.ws.rytsa.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BETiposComprobante complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BETiposComprobante">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BEWithID">
 *       &lt;sequence>
 *         &lt;element name="UltimaActualizacion" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="IdSuperClaseOp" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="IdSubClaseOp" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="IdTipo" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Observacion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IdClaseOp" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="NumItemChk" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="Primaria" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Interno" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="GeneraAsientos" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Activo" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IdUsr" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="FechaAlta" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="FechaUltAct" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BETiposComprobante", propOrder = {
    "ultimaActualizacion"
})
public class BETiposComprobante
    extends BEWithID
{

    @XmlElement(name = "UltimaActualizacion")
    protected byte[] ultimaActualizacion;
    @XmlAttribute(name = "IdSuperClaseOp", required = true)
    protected int idSuperClaseOp;
    @XmlAttribute(name = "IdSubClaseOp", required = true)
    protected int idSubClaseOp;
    @XmlAttribute(name = "IdTipo", required = true)
    protected short idTipo;
    @XmlAttribute(name = "Nombre")
    protected String nombre;
    @XmlAttribute(name = "Observacion")
    protected String observacion;
    @XmlAttribute(name = "IdClaseOp", required = true)
    protected int idClaseOp;
    @XmlAttribute(name = "NumItemChk", required = true)
    protected short numItemChk;
    @XmlAttribute(name = "Primaria", required = true)
    protected boolean primaria;
    @XmlAttribute(name = "Interno", required = true)
    protected boolean interno;
    @XmlAttribute(name = "GeneraAsientos", required = true)
    protected boolean generaAsientos;
    @XmlAttribute(name = "Activo", required = true)
    protected boolean activo;
    @XmlAttribute(name = "IdUsr", required = true)
    protected long idUsr;
    @XmlAttribute(name = "FechaAlta", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaAlta;
    @XmlAttribute(name = "FechaUltAct", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaUltAct;
    @XmlAttribute(name = "Version", required = true)
    protected int version;

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
    public short getIdTipo() {
        return idTipo;
    }

    /**
     * Sets the value of the idTipo property.
     * 
     */
    public void setIdTipo(short value) {
        this.idTipo = value;
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
     * Gets the value of the observacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacion() {
        return observacion;
    }

    /**
     * Sets the value of the observacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacion(String value) {
        this.observacion = value;
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
     * Gets the value of the numItemChk property.
     * 
     */
    public short getNumItemChk() {
        return numItemChk;
    }

    /**
     * Sets the value of the numItemChk property.
     * 
     */
    public void setNumItemChk(short value) {
        this.numItemChk = value;
    }

    /**
     * Gets the value of the primaria property.
     * 
     */
    public boolean isPrimaria() {
        return primaria;
    }

    /**
     * Sets the value of the primaria property.
     * 
     */
    public void setPrimaria(boolean value) {
        this.primaria = value;
    }

    /**
     * Gets the value of the interno property.
     * 
     */
    public boolean isInterno() {
        return interno;
    }

    /**
     * Sets the value of the interno property.
     * 
     */
    public void setInterno(boolean value) {
        this.interno = value;
    }

    /**
     * Gets the value of the generaAsientos property.
     * 
     */
    public boolean isGeneraAsientos() {
        return generaAsientos;
    }

    /**
     * Sets the value of the generaAsientos property.
     * 
     */
    public void setGeneraAsientos(boolean value) {
        this.generaAsientos = value;
    }

    /**
     * Gets the value of the activo property.
     * 
     */
    public boolean isActivo() {
        return activo;
    }

    /**
     * Sets the value of the activo property.
     * 
     */
    public void setActivo(boolean value) {
        this.activo = value;
    }

    /**
     * Gets the value of the idUsr property.
     * 
     */
    public long getIdUsr() {
        return idUsr;
    }

    /**
     * Sets the value of the idUsr property.
     * 
     */
    public void setIdUsr(long value) {
        this.idUsr = value;
    }

    /**
     * Gets the value of the fechaAlta property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaAlta() {
        return fechaAlta;
    }

    /**
     * Sets the value of the fechaAlta property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaAlta(XMLGregorianCalendar value) {
        this.fechaAlta = value;
    }

    /**
     * Gets the value of the fechaUltAct property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaUltAct() {
        return fechaUltAct;
    }

    /**
     * Sets the value of the fechaUltAct property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaUltAct(XMLGregorianCalendar value) {
        this.fechaUltAct = value;
    }

    /**
     * Gets the value of the version property.
     * 
     */
    public int getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     */
    public void setVersion(int value) {
        this.version = value;
    }

}
