
package client.ws.rytsa.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BEProgresoProceso complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BEProgresoProceso">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BEWithID">
 *       &lt;sequence>
 *         &lt;element name="UltimaActualizacion" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Idtipoproceso" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="ValorMaximo" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="FechaInicio" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="FechaFin" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="IdLog" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="Estado" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="IdusuarioInicio" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="IdusuarioFin" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="Avance" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="FechaUltimoAvance" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="NombreUsuarioInicio" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NomreUsuarioFin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Ciclos" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BEProgresoProceso", propOrder = {
    "ultimaActualizacion"
})
public class BEProgresoProceso
    extends BEWithID
{

    @XmlElement(name = "UltimaActualizacion")
    protected byte[] ultimaActualizacion;
    @XmlAttribute(name = "Idtipoproceso", required = true)
    protected long idtipoproceso;
    @XmlAttribute(name = "ValorMaximo", required = true)
    protected int valorMaximo;
    @XmlAttribute(name = "FechaInicio", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaInicio;
    @XmlAttribute(name = "FechaFin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaFin;
    @XmlAttribute(name = "IdLog", required = true)
    protected long idLog;
    @XmlAttribute(name = "Estado", required = true)
    protected short estado;
    @XmlAttribute(name = "IdusuarioInicio", required = true)
    protected long idusuarioInicio;
    @XmlAttribute(name = "IdusuarioFin", required = true)
    protected long idusuarioFin;
    @XmlAttribute(name = "Avance", required = true)
    protected long avance;
    @XmlAttribute(name = "FechaUltimoAvance", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaUltimoAvance;
    @XmlAttribute(name = "NombreUsuarioInicio")
    protected String nombreUsuarioInicio;
    @XmlAttribute(name = "NomreUsuarioFin")
    protected String nomreUsuarioFin;
    @XmlAttribute(name = "Ciclos", required = true)
    protected long ciclos;
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
     * Gets the value of the idtipoproceso property.
     * 
     */
    public long getIdtipoproceso() {
        return idtipoproceso;
    }

    /**
     * Sets the value of the idtipoproceso property.
     * 
     */
    public void setIdtipoproceso(long value) {
        this.idtipoproceso = value;
    }

    /**
     * Gets the value of the valorMaximo property.
     * 
     */
    public int getValorMaximo() {
        return valorMaximo;
    }

    /**
     * Sets the value of the valorMaximo property.
     * 
     */
    public void setValorMaximo(int value) {
        this.valorMaximo = value;
    }

    /**
     * Gets the value of the fechaInicio property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Sets the value of the fechaInicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInicio(XMLGregorianCalendar value) {
        this.fechaInicio = value;
    }

    /**
     * Gets the value of the fechaFin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaFin() {
        return fechaFin;
    }

    /**
     * Sets the value of the fechaFin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaFin(XMLGregorianCalendar value) {
        this.fechaFin = value;
    }

    /**
     * Gets the value of the idLog property.
     * 
     */
    public long getIdLog() {
        return idLog;
    }

    /**
     * Sets the value of the idLog property.
     * 
     */
    public void setIdLog(long value) {
        this.idLog = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     */
    public short getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     */
    public void setEstado(short value) {
        this.estado = value;
    }

    /**
     * Gets the value of the idusuarioInicio property.
     * 
     */
    public long getIdusuarioInicio() {
        return idusuarioInicio;
    }

    /**
     * Sets the value of the idusuarioInicio property.
     * 
     */
    public void setIdusuarioInicio(long value) {
        this.idusuarioInicio = value;
    }

    /**
     * Gets the value of the idusuarioFin property.
     * 
     */
    public long getIdusuarioFin() {
        return idusuarioFin;
    }

    /**
     * Sets the value of the idusuarioFin property.
     * 
     */
    public void setIdusuarioFin(long value) {
        this.idusuarioFin = value;
    }

    /**
     * Gets the value of the avance property.
     * 
     */
    public long getAvance() {
        return avance;
    }

    /**
     * Sets the value of the avance property.
     * 
     */
    public void setAvance(long value) {
        this.avance = value;
    }

    /**
     * Gets the value of the fechaUltimoAvance property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaUltimoAvance() {
        return fechaUltimoAvance;
    }

    /**
     * Sets the value of the fechaUltimoAvance property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaUltimoAvance(XMLGregorianCalendar value) {
        this.fechaUltimoAvance = value;
    }

    /**
     * Gets the value of the nombreUsuarioInicio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreUsuarioInicio() {
        return nombreUsuarioInicio;
    }

    /**
     * Sets the value of the nombreUsuarioInicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreUsuarioInicio(String value) {
        this.nombreUsuarioInicio = value;
    }

    /**
     * Gets the value of the nomreUsuarioFin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomreUsuarioFin() {
        return nomreUsuarioFin;
    }

    /**
     * Sets the value of the nomreUsuarioFin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomreUsuarioFin(String value) {
        this.nomreUsuarioFin = value;
    }

    /**
     * Gets the value of the ciclos property.
     * 
     */
    public long getCiclos() {
        return ciclos;
    }

    /**
     * Sets the value of the ciclos property.
     * 
     */
    public void setCiclos(long value) {
        this.ciclos = value;
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
