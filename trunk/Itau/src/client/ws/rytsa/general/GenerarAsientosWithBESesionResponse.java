
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
 *         &lt;element name="GenerarAsientosWithBESesionResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
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
    "generarAsientosWithBESesionResult"
})
@XmlRootElement(name = "GenerarAsientosWithBESesionResponse")
public class GenerarAsientosWithBESesionResponse {

    @XmlElement(name = "GenerarAsientosWithBESesionResult")
    protected BEEstado generarAsientosWithBESesionResult;

    /**
     * Gets the value of the generarAsientosWithBESesionResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGenerarAsientosWithBESesionResult() {
        return generarAsientosWithBESesionResult;
    }

    /**
     * Sets the value of the generarAsientosWithBESesionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGenerarAsientosWithBESesionResult(BEEstado value) {
        this.generarAsientosWithBESesionResult = value;
    }

}
