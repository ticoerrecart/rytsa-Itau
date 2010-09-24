
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
 *         &lt;element name="GuardarEscritoriosResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
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
    "guardarEscritoriosResult"
})
@XmlRootElement(name = "GuardarEscritoriosResponse")
public class GuardarEscritoriosResponse {

    @XmlElement(name = "GuardarEscritoriosResult")
    protected BEEstado guardarEscritoriosResult;

    /**
     * Gets the value of the guardarEscritoriosResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGuardarEscritoriosResult() {
        return guardarEscritoriosResult;
    }

    /**
     * Sets the value of the guardarEscritoriosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGuardarEscritoriosResult(BEEstado value) {
        this.guardarEscritoriosResult = value;
    }

}
