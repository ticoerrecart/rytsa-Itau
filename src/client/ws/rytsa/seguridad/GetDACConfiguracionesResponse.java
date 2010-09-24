
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
 *         &lt;element name="GetDACConfiguracionesResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getDACConfiguracionesResult"
})
@XmlRootElement(name = "GetDACConfiguracionesResponse")
public class GetDACConfiguracionesResponse {

    @XmlElement(name = "GetDACConfiguracionesResult")
    protected String getDACConfiguracionesResult;

    /**
     * Gets the value of the getDACConfiguracionesResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDACConfiguracionesResult() {
        return getDACConfiguracionesResult;
    }

    /**
     * Sets the value of the getDACConfiguracionesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDACConfiguracionesResult(String value) {
        this.getDACConfiguracionesResult = value;
    }

}
