
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
 *         &lt;element name="RecuperarAgendaCuponesOperacionesSWAPAValuarResult" type="{http://api.patron.mae.com.ar/sistemasexternos/itau}ArrayOfAgendaCuponOperacioneSWAPAValuarData" minOccurs="0"/>
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
    "recuperarAgendaCuponesOperacionesSWAPAValuarResult"
})
@XmlRootElement(name = "RecuperarAgendaCuponesOperacionesSWAPAValuarResponse")
public class RecuperarAgendaCuponesOperacionesSWAPAValuarResponse {

    @XmlElement(name = "RecuperarAgendaCuponesOperacionesSWAPAValuarResult")
    protected ArrayOfAgendaCuponOperacioneSWAPAValuarData recuperarAgendaCuponesOperacionesSWAPAValuarResult;

    /**
     * Gets the value of the recuperarAgendaCuponesOperacionesSWAPAValuarResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAgendaCuponOperacioneSWAPAValuarData }
     *     
     */
    public ArrayOfAgendaCuponOperacioneSWAPAValuarData getRecuperarAgendaCuponesOperacionesSWAPAValuarResult() {
        return recuperarAgendaCuponesOperacionesSWAPAValuarResult;
    }

    /**
     * Sets the value of the recuperarAgendaCuponesOperacionesSWAPAValuarResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAgendaCuponOperacioneSWAPAValuarData }
     *     
     */
    public void setRecuperarAgendaCuponesOperacionesSWAPAValuarResult(ArrayOfAgendaCuponOperacioneSWAPAValuarData value) {
        this.recuperarAgendaCuponesOperacionesSWAPAValuarResult = value;
    }

}
