
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
 *         &lt;element name="GenerarOperacionesSWAPSAValuarResult" type="{http://api.patron.mae.com.ar/sistemasexternos/itau}BEEstado" minOccurs="0"/>
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
    "generarOperacionesSWAPSAValuarResult"
})
@XmlRootElement(name = "GenerarOperacionesSWAPSAValuarResponse")
public class GenerarOperacionesSWAPSAValuarResponse {

    @XmlElement(name = "GenerarOperacionesSWAPSAValuarResult")
    protected BEEstado generarOperacionesSWAPSAValuarResult;

    /**
     * Gets the value of the generarOperacionesSWAPSAValuarResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGenerarOperacionesSWAPSAValuarResult() {
        return generarOperacionesSWAPSAValuarResult;
    }

    /**
     * Sets the value of the generarOperacionesSWAPSAValuarResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGenerarOperacionesSWAPSAValuarResult(BEEstado value) {
        this.generarOperacionesSWAPSAValuarResult = value;
    }

}
