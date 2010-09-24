
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
 *         &lt;element name="GetAllDomiciliosResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beArray" type="{http://tempuri.org/}ArrayOfBEDomicilios" minOccurs="0"/>
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
    "getAllDomiciliosResult",
    "beArray"
})
@XmlRootElement(name = "GetAllDomiciliosResponse")
public class GetAllDomiciliosResponse {

    @XmlElement(name = "GetAllDomiciliosResult")
    protected BEEstado getAllDomiciliosResult;
    protected ArrayOfBEDomicilios beArray;

    /**
     * Gets the value of the getAllDomiciliosResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetAllDomiciliosResult() {
        return getAllDomiciliosResult;
    }

    /**
     * Sets the value of the getAllDomiciliosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetAllDomiciliosResult(BEEstado value) {
        this.getAllDomiciliosResult = value;
    }

    /**
     * Gets the value of the beArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBEDomicilios }
     *     
     */
    public ArrayOfBEDomicilios getBeArray() {
        return beArray;
    }

    /**
     * Sets the value of the beArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBEDomicilios }
     *     
     */
    public void setBeArray(ArrayOfBEDomicilios value) {
        this.beArray = value;
    }

}
