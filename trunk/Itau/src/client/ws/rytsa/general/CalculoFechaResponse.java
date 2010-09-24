
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
 *         &lt;element name="CalculoFechaResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="FechaHabil" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "calculoFechaResult",
    "fechaHabil"
})
@XmlRootElement(name = "CalculoFechaResponse")
public class CalculoFechaResponse {

    @XmlElement(name = "CalculoFechaResult")
    protected BEEstado calculoFechaResult;
    @XmlElement(name = "FechaHabil", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHabil;

    /**
     * Gets the value of the calculoFechaResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getCalculoFechaResult() {
        return calculoFechaResult;
    }

    /**
     * Sets the value of the calculoFechaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setCalculoFechaResult(BEEstado value) {
        this.calculoFechaResult = value;
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
