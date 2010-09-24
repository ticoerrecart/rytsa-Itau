
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
 *         &lt;element name="RecuperarOperacionesNDFAValuarResult" type="{http://api.patron.mae.com.ar/sistemasexternos/itau}ArrayOfOperacionNDFAValuarData" minOccurs="0"/>
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
    "recuperarOperacionesNDFAValuarResult"
})
@XmlRootElement(name = "RecuperarOperacionesNDFAValuarResponse")
public class RecuperarOperacionesNDFAValuarResponse {

    @XmlElement(name = "RecuperarOperacionesNDFAValuarResult")
    protected ArrayOfOperacionNDFAValuarData recuperarOperacionesNDFAValuarResult;

    /**
     * Gets the value of the recuperarOperacionesNDFAValuarResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOperacionNDFAValuarData }
     *     
     */
    public ArrayOfOperacionNDFAValuarData getRecuperarOperacionesNDFAValuarResult() {
        return recuperarOperacionesNDFAValuarResult;
    }

    /**
     * Sets the value of the recuperarOperacionesNDFAValuarResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOperacionNDFAValuarData }
     *     
     */
    public void setRecuperarOperacionesNDFAValuarResult(ArrayOfOperacionNDFAValuarData value) {
        this.recuperarOperacionesNDFAValuarResult = value;
    }

}
