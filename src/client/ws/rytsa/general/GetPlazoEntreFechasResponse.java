
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
 *         &lt;element name="GetPlazoEntreFechasResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="dias" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "getPlazoEntreFechasResult",
    "dias"
})
@XmlRootElement(name = "GetPlazoEntreFechasResponse")
public class GetPlazoEntreFechasResponse {

    @XmlElement(name = "GetPlazoEntreFechasResult")
    protected BEEstado getPlazoEntreFechasResult;
    protected long dias;

    /**
     * Gets the value of the getPlazoEntreFechasResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetPlazoEntreFechasResult() {
        return getPlazoEntreFechasResult;
    }

    /**
     * Sets the value of the getPlazoEntreFechasResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetPlazoEntreFechasResult(BEEstado value) {
        this.getPlazoEntreFechasResult = value;
    }

    /**
     * Gets the value of the dias property.
     * 
     */
    public long getDias() {
        return dias;
    }

    /**
     * Sets the value of the dias property.
     * 
     */
    public void setDias(long value) {
        this.dias = value;
    }

}
