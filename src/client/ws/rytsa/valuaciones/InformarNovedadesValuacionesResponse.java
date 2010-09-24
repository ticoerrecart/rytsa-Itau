
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
 *         &lt;element name="InformarNovedadesValuacionesResult" type="{http://api.patron.mae.com.ar/sistemasexternos/itau}NovedadesValuacionesResponseData" minOccurs="0"/>
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
    "informarNovedadesValuacionesResult"
})
@XmlRootElement(name = "InformarNovedadesValuacionesResponse")
public class InformarNovedadesValuacionesResponse {

    @XmlElement(name = "InformarNovedadesValuacionesResult")
    protected NovedadesValuacionesResponseData informarNovedadesValuacionesResult;

    /**
     * Gets the value of the informarNovedadesValuacionesResult property.
     * 
     * @return
     *     possible object is
     *     {@link NovedadesValuacionesResponseData }
     *     
     */
    public NovedadesValuacionesResponseData getInformarNovedadesValuacionesResult() {
        return informarNovedadesValuacionesResult;
    }

    /**
     * Sets the value of the informarNovedadesValuacionesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NovedadesValuacionesResponseData }
     *     
     */
    public void setInformarNovedadesValuacionesResult(NovedadesValuacionesResponseData value) {
        this.informarNovedadesValuacionesResult = value;
    }

}
