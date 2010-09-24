
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
 *         &lt;element name="ConsultaEstado_sistemaResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beArray" type="{http://tempuri.org/}ArrayOfBEEstado_sistema" minOccurs="0"/>
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
    "consultaEstadoSistemaResult",
    "beArray"
})
@XmlRootElement(name = "ConsultaEstado_sistemaResponse")
public class ConsultaEstadoSistemaResponse {

    @XmlElement(name = "ConsultaEstado_sistemaResult")
    protected BEEstado consultaEstadoSistemaResult;
    protected ArrayOfBEEstadoSistema beArray;

    /**
     * Gets the value of the consultaEstadoSistemaResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getConsultaEstadoSistemaResult() {
        return consultaEstadoSistemaResult;
    }

    /**
     * Sets the value of the consultaEstadoSistemaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setConsultaEstadoSistemaResult(BEEstado value) {
        this.consultaEstadoSistemaResult = value;
    }

    /**
     * Gets the value of the beArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBEEstadoSistema }
     *     
     */
    public ArrayOfBEEstadoSistema getBeArray() {
        return beArray;
    }

    /**
     * Sets the value of the beArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBEEstadoSistema }
     *     
     */
    public void setBeArray(ArrayOfBEEstadoSistema value) {
        this.beArray = value;
    }

}
