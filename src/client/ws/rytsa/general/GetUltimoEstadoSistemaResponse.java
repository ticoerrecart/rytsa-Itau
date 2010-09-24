
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
 *         &lt;element name="GetUltimoEstado_SistemaResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="be" type="{http://tempuri.org/}BEEstado_sistema" minOccurs="0"/>
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
    "getUltimoEstadoSistemaResult",
    "be"
})
@XmlRootElement(name = "GetUltimoEstado_SistemaResponse")
public class GetUltimoEstadoSistemaResponse {

    @XmlElement(name = "GetUltimoEstado_SistemaResult")
    protected BEEstado getUltimoEstadoSistemaResult;
    protected BEEstadoSistema be;

    /**
     * Gets the value of the getUltimoEstadoSistemaResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetUltimoEstadoSistemaResult() {
        return getUltimoEstadoSistemaResult;
    }

    /**
     * Sets the value of the getUltimoEstadoSistemaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetUltimoEstadoSistemaResult(BEEstado value) {
        this.getUltimoEstadoSistemaResult = value;
    }

    /**
     * Gets the value of the be property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstadoSistema }
     *     
     */
    public BEEstadoSistema getBe() {
        return be;
    }

    /**
     * Sets the value of the be property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstadoSistema }
     *     
     */
    public void setBe(BEEstadoSistema value) {
        this.be = value;
    }

}
