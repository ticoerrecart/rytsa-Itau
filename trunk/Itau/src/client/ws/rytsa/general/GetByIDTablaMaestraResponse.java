
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
 *         &lt;element name="GetByIDTablaMaestraResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="be" type="{http://tempuri.org/}BETablaMaestra" minOccurs="0"/>
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
    "getByIDTablaMaestraResult",
    "be"
})
@XmlRootElement(name = "GetByIDTablaMaestraResponse")
public class GetByIDTablaMaestraResponse {

    @XmlElement(name = "GetByIDTablaMaestraResult")
    protected BEEstado getByIDTablaMaestraResult;
    protected BETablaMaestra be;

    /**
     * Gets the value of the getByIDTablaMaestraResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetByIDTablaMaestraResult() {
        return getByIDTablaMaestraResult;
    }

    /**
     * Sets the value of the getByIDTablaMaestraResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetByIDTablaMaestraResult(BEEstado value) {
        this.getByIDTablaMaestraResult = value;
    }

    /**
     * Gets the value of the be property.
     * 
     * @return
     *     possible object is
     *     {@link BETablaMaestra }
     *     
     */
    public BETablaMaestra getBe() {
        return be;
    }

    /**
     * Sets the value of the be property.
     * 
     * @param value
     *     allowed object is
     *     {@link BETablaMaestra }
     *     
     */
    public void setBe(BETablaMaestra value) {
        this.be = value;
    }

}
