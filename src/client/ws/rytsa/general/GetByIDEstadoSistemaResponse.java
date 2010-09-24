
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
 *         &lt;element name="GetByIDEstado_sistemaResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
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
    "getByIDEstadoSistemaResult"
})
@XmlRootElement(name = "GetByIDEstado_sistemaResponse")
public class GetByIDEstadoSistemaResponse {

    @XmlElement(name = "GetByIDEstado_sistemaResult")
    protected BEEstado getByIDEstadoSistemaResult;

    /**
     * Gets the value of the getByIDEstadoSistemaResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetByIDEstadoSistemaResult() {
        return getByIDEstadoSistemaResult;
    }

    /**
     * Sets the value of the getByIDEstadoSistemaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetByIDEstadoSistemaResult(BEEstado value) {
        this.getByIDEstadoSistemaResult = value;
    }

}
