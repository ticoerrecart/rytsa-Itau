
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
 *         &lt;element name="CerrarEstado_sistemaResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
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
    "cerrarEstadoSistemaResult",
    "be"
})
@XmlRootElement(name = "CerrarEstado_sistemaResponse")
public class CerrarEstadoSistemaResponse {

    @XmlElement(name = "CerrarEstado_sistemaResult")
    protected BEEstado cerrarEstadoSistemaResult;
    protected BEEstadoSistema be;

    /**
     * Gets the value of the cerrarEstadoSistemaResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getCerrarEstadoSistemaResult() {
        return cerrarEstadoSistemaResult;
    }

    /**
     * Sets the value of the cerrarEstadoSistemaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setCerrarEstadoSistemaResult(BEEstado value) {
        this.cerrarEstadoSistemaResult = value;
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
