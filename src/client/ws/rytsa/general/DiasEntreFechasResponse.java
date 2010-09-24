
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
 *         &lt;element name="DiasEntreFechasResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
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
    "diasEntreFechasResult",
    "dias"
})
@XmlRootElement(name = "DiasEntreFechasResponse")
public class DiasEntreFechasResponse {

    @XmlElement(name = "DiasEntreFechasResult")
    protected BEEstado diasEntreFechasResult;
    @XmlElement(name = "Dias")
    protected int dias;

    /**
     * Gets the value of the diasEntreFechasResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getDiasEntreFechasResult() {
        return diasEntreFechasResult;
    }

    /**
     * Sets the value of the diasEntreFechasResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setDiasEntreFechasResult(BEEstado value) {
        this.diasEntreFechasResult = value;
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
