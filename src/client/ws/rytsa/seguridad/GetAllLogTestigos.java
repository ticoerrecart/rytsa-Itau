
package client.ws.rytsa.seguridad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="lastRecord" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="maxRecord" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="IdAplicacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdUsuario" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fecha_Ini" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Fecha_Fin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Ip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsiderarHoras" type="{http://www.w3.org/2001/XMLSchema}short"/>
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
    "lastRecord",
    "maxRecord",
    "idAplicacion",
    "idUsuario",
    "tipo",
    "categoria",
    "fechaIni",
    "fechaFin",
    "ip",
    "codigo",
    "considerarHoras"
})
@XmlRootElement(name = "GetAllLogTestigos")
public class GetAllLogTestigos {

    @XmlElement(required = true)
    protected String idSesion;
    protected long lastRecord;
    protected long maxRecord;
    @XmlElement(name = "IdAplicacion")
    protected int idAplicacion;
    @XmlElement(name = "IdUsuario")
    protected long idUsuario;
    @XmlElement(name = "Tipo")
    protected int tipo;
    @XmlElement(name = "Categoria")
    protected String categoria;
    @XmlElement(name = "Fecha_Ini", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaIni;
    @XmlElement(name = "Fecha_Fin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaFin;
    @XmlElement(name = "Ip")
    protected String ip;
    @XmlElement(name = "Codigo")
    protected String codigo;
    @XmlElement(name = "ConsiderarHoras")
    protected short considerarHoras;

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
     * Gets the value of the lastRecord property.
     * 
     */
    public long getLastRecord() {
        return lastRecord;
    }

    /**
     * Sets the value of the lastRecord property.
     * 
     */
    public void setLastRecord(long value) {
        this.lastRecord = value;
    }

    /**
     * Gets the value of the maxRecord property.
     * 
     */
    public long getMaxRecord() {
        return maxRecord;
    }

    /**
     * Sets the value of the maxRecord property.
     * 
     */
    public void setMaxRecord(long value) {
        this.maxRecord = value;
    }

    /**
     * Gets the value of the idAplicacion property.
     * 
     */
    public int getIdAplicacion() {
        return idAplicacion;
    }

    /**
     * Sets the value of the idAplicacion property.
     * 
     */
    public void setIdAplicacion(int value) {
        this.idAplicacion = value;
    }

    /**
     * Gets the value of the idUsuario property.
     * 
     */
    public long getIdUsuario() {
        return idUsuario;
    }

    /**
     * Sets the value of the idUsuario property.
     * 
     */
    public void setIdUsuario(long value) {
        this.idUsuario = value;
    }

    /**
     * Gets the value of the tipo property.
     * 
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     */
    public void setTipo(int value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the categoria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Sets the value of the categoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoria(String value) {
        this.categoria = value;
    }

    /**
     * Gets the value of the fechaIni property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaIni() {
        return fechaIni;
    }

    /**
     * Sets the value of the fechaIni property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaIni(XMLGregorianCalendar value) {
        this.fechaIni = value;
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
     * Gets the value of the ip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIp() {
        return ip;
    }

    /**
     * Sets the value of the ip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIp(String value) {
        this.ip = value;
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
     * Gets the value of the considerarHoras property.
     * 
     */
    public short getConsiderarHoras() {
        return considerarHoras;
    }

    /**
     * Sets the value of the considerarHoras property.
     * 
     */
    public void setConsiderarHoras(short value) {
        this.considerarHoras = value;
    }

}
