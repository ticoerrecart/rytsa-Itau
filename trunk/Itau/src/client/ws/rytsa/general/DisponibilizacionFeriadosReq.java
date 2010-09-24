
package client.ws.rytsa.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DisponibilizacionFeriadosReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisponibilizacionFeriadosReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}DCWithID">
 *       &lt;sequence>
 *         &lt;element name="IdSesion" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="IdCalendario" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="FechaIni" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FechaFin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisponibilizacionFeriadosReq", propOrder = {
    "idSesion",
    "idCalendario",
    "fechaIni",
    "fechaFin"
})
public class DisponibilizacionFeriadosReq
    extends DCWithID
{

    @XmlElement(name = "IdSesion", required = true)
    protected String idSesion;
    @XmlElement(name = "IdCalendario", required = true, type = Long.class, nillable = true)
    protected Long idCalendario;
    @XmlElement(name = "FechaIni", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaIni;
    @XmlElement(name = "FechaFin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaFin;

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
     * Gets the value of the idCalendario property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdCalendario() {
        return idCalendario;
    }

    /**
     * Sets the value of the idCalendario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdCalendario(Long value) {
        this.idCalendario = value;
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

}
