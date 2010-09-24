
package client.ws.rytsa.valuaciones;

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
 *         &lt;element name="GenerarOperacionesNDFAValuarResult" type="{http://api.patron.mae.com.ar/sistemasexternos/itau}BEEstado" minOccurs="0"/>
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
    "generarOperacionesNDFAValuarResult"
})
@XmlRootElement(name = "GenerarOperacionesNDFAValuarResponse")
public class GenerarOperacionesNDFAValuarResponse {

    @XmlElement(name = "GenerarOperacionesNDFAValuarResult")
    protected BEEstado generarOperacionesNDFAValuarResult;

    /**
     * Gets the value of the generarOperacionesNDFAValuarResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGenerarOperacionesNDFAValuarResult() {
        return generarOperacionesNDFAValuarResult;
    }

    /**
     * Sets the value of the generarOperacionesNDFAValuarResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGenerarOperacionesNDFAValuarResult(BEEstado value) {
        this.generarOperacionesNDFAValuarResult = value;
    }

}
