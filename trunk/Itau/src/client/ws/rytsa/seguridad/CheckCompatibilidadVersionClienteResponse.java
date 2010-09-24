
package client.ws.rytsa.seguridad;

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
 *         &lt;element name="CheckCompatibilidadVersionClienteResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
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
    "checkCompatibilidadVersionClienteResult"
})
@XmlRootElement(name = "CheckCompatibilidadVersionClienteResponse")
public class CheckCompatibilidadVersionClienteResponse {

    @XmlElement(name = "CheckCompatibilidadVersionClienteResult")
    protected BEEstado checkCompatibilidadVersionClienteResult;

    /**
     * Gets the value of the checkCompatibilidadVersionClienteResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getCheckCompatibilidadVersionClienteResult() {
        return checkCompatibilidadVersionClienteResult;
    }

    /**
     * Sets the value of the checkCompatibilidadVersionClienteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setCheckCompatibilidadVersionClienteResult(BEEstado value) {
        this.checkCompatibilidadVersionClienteResult = value;
    }

}
