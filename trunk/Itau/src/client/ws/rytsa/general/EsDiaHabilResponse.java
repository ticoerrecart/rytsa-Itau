
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
 *         &lt;element name="EsDiaHabilResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="esHabil" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fechaHabil" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "esDiaHabilResult",
    "esHabil",
    "fechaHabil"
})
@XmlRootElement(name = "EsDiaHabilResponse")
public class EsDiaHabilResponse {

    @XmlElement(name = "EsDiaHabilResult")
    protected BEEstado esDiaHabilResult;
    protected boolean esHabil;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHabil;

    /**
     * Gets the value of the esDiaHabilResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getEsDiaHabilResult() {
        return esDiaHabilResult;
    }

    /**
     * Sets the value of the esDiaHabilResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setEsDiaHabilResult(BEEstado value) {
        this.esDiaHabilResult = value;
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

}
