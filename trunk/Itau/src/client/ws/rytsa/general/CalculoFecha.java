
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
 *         &lt;element name="FechaConcert" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Idcalendario" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CantidadDias" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TipoPlazo" type="{http://tempuri.org/}TipoPlazo"/>
 *         &lt;element name="TipoDiasCalculoVencimiento" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="TipoAjusteVencimiento" type="{http://www.w3.org/2001/XMLSchema}short"/>
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
    "fechaConcert",
    "fechaVencimiento",
    "idcalendario",
    "cantidadDias",
    "tipoPlazo",
    "tipoDiasCalculoVencimiento",
    "tipoAjusteVencimiento"
})
@XmlRootElement(name = "CalculoFecha")
public class CalculoFecha {

    @XmlElement(required = true)
    protected String idSesion;
    @XmlElement(name = "FechaConcert", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaConcert;
    @XmlElement(name = "FechaVencimiento", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaVencimiento;
    @XmlElement(name = "Idcalendario")
    protected long idcalendario;
    @XmlElement(name = "CantidadDias")
    protected int cantidadDias;
    @XmlElement(name = "TipoPlazo", required = true)
    protected TipoPlazo tipoPlazo;
    @XmlElement(name = "TipoDiasCalculoVencimiento")
    protected short tipoDiasCalculoVencimiento;
    @XmlElement(name = "TipoAjusteVencimiento")
    protected short tipoAjusteVencimiento;

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
     * Gets the value of the fechaConcert property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaConcert() {
        return fechaConcert;
    }

    /**
     * Sets the value of the fechaConcert property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaConcert(XMLGregorianCalendar value) {
        this.fechaConcert = value;
    }

    /**
     * Gets the value of the fechaVencimiento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * Sets the value of the fechaVencimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVencimiento(XMLGregorianCalendar value) {
        this.fechaVencimiento = value;
    }

    /**
     * Gets the value of the idcalendario property.
     * 
     */
    public long getIdcalendario() {
        return idcalendario;
    }

    /**
     * Sets the value of the idcalendario property.
     * 
     */
    public void setIdcalendario(long value) {
        this.idcalendario = value;
    }

    /**
     * Gets the value of the cantidadDias property.
     * 
     */
    public int getCantidadDias() {
        return cantidadDias;
    }

    /**
     * Sets the value of the cantidadDias property.
     * 
     */
    public void setCantidadDias(int value) {
        this.cantidadDias = value;
    }

    /**
     * Gets the value of the tipoPlazo property.
     * 
     * @return
     *     possible object is
     *     {@link TipoPlazo }
     *     
     */
    public TipoPlazo getTipoPlazo() {
        return tipoPlazo;
    }

    /**
     * Sets the value of the tipoPlazo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPlazo }
     *     
     */
    public void setTipoPlazo(TipoPlazo value) {
        this.tipoPlazo = value;
    }

    /**
     * Gets the value of the tipoDiasCalculoVencimiento property.
     * 
     */
    public short getTipoDiasCalculoVencimiento() {
        return tipoDiasCalculoVencimiento;
    }

    /**
     * Sets the value of the tipoDiasCalculoVencimiento property.
     * 
     */
    public void setTipoDiasCalculoVencimiento(short value) {
        this.tipoDiasCalculoVencimiento = value;
    }

    /**
     * Gets the value of the tipoAjusteVencimiento property.
     * 
     */
    public short getTipoAjusteVencimiento() {
        return tipoAjusteVencimiento;
    }

    /**
     * Sets the value of the tipoAjusteVencimiento property.
     * 
     */
    public void setTipoAjusteVencimiento(short value) {
        this.tipoAjusteVencimiento = value;
    }

}
