
package client.ws.rytsa.general;

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
 *         &lt;element name="fechaDesde" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="fechaHasta" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="metodo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="idCalendario" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="metodoComercial" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="metodoOperatoriaContado" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="metodoOperatoriaFuturo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Dias" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "fechaDesde",
    "fechaHasta",
    "metodo",
    "idCalendario",
    "metodoComercial",
    "metodoOperatoriaContado",
    "metodoOperatoriaFuturo",
    "dias"
})
@XmlRootElement(name = "DiasEntreFechas")
public class DiasEntreFechas {

    @XmlElement(required = true)
    protected String idSesion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaDesde;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHasta;
    protected short metodo;
    protected long idCalendario;
    protected short metodoComercial;
    protected short metodoOperatoriaContado;
    protected short metodoOperatoriaFuturo;
    @XmlElement(name = "Dias")
    protected int dias;

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
     * Gets the value of the fechaDesde property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDesde() {
        return fechaDesde;
    }

    /**
     * Sets the value of the fechaDesde property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDesde(XMLGregorianCalendar value) {
        this.fechaDesde = value;
    }

    /**
     * Gets the value of the fechaHasta property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHasta() {
        return fechaHasta;
    }

    /**
     * Sets the value of the fechaHasta property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHasta(XMLGregorianCalendar value) {
        this.fechaHasta = value;
    }

    /**
     * Gets the value of the metodo property.
     * 
     */
    public short getMetodo() {
        return metodo;
    }

    /**
     * Sets the value of the metodo property.
     * 
     */
    public void setMetodo(short value) {
        this.metodo = value;
    }

    /**
     * Gets the value of the idCalendario property.
     * 
     */
    public long getIdCalendario() {
        return idCalendario;
    }

    /**
     * Sets the value of the idCalendario property.
     * 
     */
    public void setIdCalendario(long value) {
        this.idCalendario = value;
    }

    /**
     * Gets the value of the metodoComercial property.
     * 
     */
    public short getMetodoComercial() {
        return metodoComercial;
    }

    /**
     * Sets the value of the metodoComercial property.
     * 
     */
    public void setMetodoComercial(short value) {
        this.metodoComercial = value;
    }

    /**
     * Gets the value of the metodoOperatoriaContado property.
     * 
     */
    public short getMetodoOperatoriaContado() {
        return metodoOperatoriaContado;
    }

    /**
     * Sets the value of the metodoOperatoriaContado property.
     * 
     */
    public void setMetodoOperatoriaContado(short value) {
        this.metodoOperatoriaContado = value;
    }

    /**
     * Gets the value of the metodoOperatoriaFuturo property.
     * 
     */
    public short getMetodoOperatoriaFuturo() {
        return metodoOperatoriaFuturo;
    }

    /**
     * Sets the value of the metodoOperatoriaFuturo property.
     * 
     */
    public void setMetodoOperatoriaFuturo(short value) {
        this.metodoOperatoriaFuturo = value;
    }

    /**
     * Gets the value of the dias property.
     * 
     */
    public int getDias() {
        return dias;
    }

    /**
     * Sets the value of the dias property.
     * 
     */
    public void setDias(int value) {
        this.dias = value;
    }

}
