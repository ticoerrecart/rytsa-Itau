
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
 *         &lt;element name="GetUltimosAccesosAlSistemaResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beArray" type="{http://tempuri.org/}ArrayOfBELog" minOccurs="0"/>
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
    "getUltimosAccesosAlSistemaResult",
    "beArray"
})
@XmlRootElement(name = "GetUltimosAccesosAlSistemaResponse")
public class GetUltimosAccesosAlSistemaResponse {

    @XmlElement(name = "GetUltimosAccesosAlSistemaResult")
    protected BEEstado getUltimosAccesosAlSistemaResult;
    protected ArrayOfBELog beArray;

    /**
     * Gets the value of the getUltimosAccesosAlSistemaResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetUltimosAccesosAlSistemaResult() {
        return getUltimosAccesosAlSistemaResult;
    }

    /**
     * Sets the value of the getUltimosAccesosAlSistemaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetUltimosAccesosAlSistemaResult(BEEstado value) {
        this.getUltimosAccesosAlSistemaResult = value;
    }

    /**
     * Gets the value of the beArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBELog }
     *     
     */
    public ArrayOfBELog getBeArray() {
        return beArray;
    }

    /**
     * Sets the value of the beArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBELog }
     *     
     */
    public void setBeArray(ArrayOfBELog value) {
        this.beArray = value;
    }

}
