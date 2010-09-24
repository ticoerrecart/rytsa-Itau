
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
 *         &lt;element name="ConsultaSesionesResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beArray" type="{http://tempuri.org/}ArrayOfBESesiones" minOccurs="0"/>
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
    "consultaSesionesResult",
    "beArray"
})
@XmlRootElement(name = "ConsultaSesionesResponse")
public class ConsultaSesionesResponse {

    @XmlElement(name = "ConsultaSesionesResult")
    protected BEEstado consultaSesionesResult;
    protected ArrayOfBESesiones beArray;

    /**
     * Gets the value of the consultaSesionesResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getConsultaSesionesResult() {
        return consultaSesionesResult;
    }

    /**
     * Sets the value of the consultaSesionesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setConsultaSesionesResult(BEEstado value) {
        this.consultaSesionesResult = value;
    }

    /**
     * Gets the value of the beArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBESesiones }
     *     
     */
    public ArrayOfBESesiones getBeArray() {
        return beArray;
    }

    /**
     * Sets the value of the beArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBESesiones }
     *     
     */
    public void setBeArray(ArrayOfBESesiones value) {
        this.beArray = value;
    }

}
