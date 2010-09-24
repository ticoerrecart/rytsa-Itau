
package client.ws.rytsa.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="GetAllLookUpCalendariosResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beArray" type="{http://tempuri.org/}ArrayOfBECalendarios" minOccurs="0"/>
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
    "getAllLookUpCalendariosResult",
    "beArray"
})
@XmlRootElement(name = "GetAllLookUpCalendariosResponse")
public class GetAllLookUpCalendariosResponse {

    @XmlElement(name = "GetAllLookUpCalendariosResult")
    protected BEEstado getAllLookUpCalendariosResult;
    protected ArrayOfBECalendarios beArray;

    /**
     * Gets the value of the getAllLookUpCalendariosResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetAllLookUpCalendariosResult() {
        return getAllLookUpCalendariosResult;
    }

    /**
     * Sets the value of the getAllLookUpCalendariosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetAllLookUpCalendariosResult(BEEstado value) {
        this.getAllLookUpCalendariosResult = value;
    }

    /**
     * Gets the value of the beArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBECalendarios }
     *     
     */
    public ArrayOfBECalendarios getBeArray() {
        return beArray;
    }

    /**
     * Sets the value of the beArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBECalendarios }
     *     
     */
    public void setBeArray(ArrayOfBECalendarios value) {
        this.beArray = value;
    }

}
