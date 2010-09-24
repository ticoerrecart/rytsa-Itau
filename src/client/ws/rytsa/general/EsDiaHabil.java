
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
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="esHabil" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fechaHabil" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "fecha",
    "esHabil",
    "fechaHabil",
    "tipo"
})
@XmlRootElement(name = "EsDiaHabil")
public class EsDiaHabil {

    @XmlElement(required = true)
    protected String idSesion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    protected boolean esHabil;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHabil;
    protected int tipo;

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
     * Gets the value of the fecha property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the esHabil property.
     * 
     */
    public boolean isEsHabil() {
        return esHabil;
    }

    /**
     * Sets the value of the esHabil property.
     * 
     */
    public void setEsHabil(boolean value) {
        this.esHabil = value;
    }

    /**
     * Gets the value of the fechaHabil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHabil() {
        return fechaHabil;
    }

    /**
     * Sets the value of the fechaHabil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHabil(XMLGregorianCalendar value) {
        this.fechaHabil = value;
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

}
