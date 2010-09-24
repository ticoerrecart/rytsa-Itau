
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
 *         &lt;element name="GetDiaHabilResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
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
    "getDiaHabilResult",
    "fechaHabil"
})
@XmlRootElement(name = "GetDiaHabilResponse")
public class GetDiaHabilResponse {

    @XmlElement(name = "GetDiaHabilResult")
    protected BEEstado getDiaHabilResult;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHabil;

    /**
     * Gets the value of the getDiaHabilResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetDiaHabilResult() {
        return getDiaHabilResult;
    }

    /**
     * Sets the value of the getDiaHabilResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetDiaHabilResult(BEEstado value) {
        this.getDiaHabilResult = value;
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
