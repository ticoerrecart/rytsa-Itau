
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
 *         &lt;element name="UpdateDomiciliosResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beNueva" type="{http://tempuri.org/}BEDomicilios" minOccurs="0"/>
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
    "updateDomiciliosResult",
    "beNueva"
})
@XmlRootElement(name = "UpdateDomiciliosResponse")
public class UpdateDomiciliosResponse {

    @XmlElement(name = "UpdateDomiciliosResult")
    protected BEEstado updateDomiciliosResult;
    protected BEDomicilios beNueva;

    /**
     * Gets the value of the updateDomiciliosResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getUpdateDomiciliosResult() {
        return updateDomiciliosResult;
    }

    /**
     * Sets the value of the updateDomiciliosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setUpdateDomiciliosResult(BEEstado value) {
        this.updateDomiciliosResult = value;
    }

    /**
     * Gets the value of the beNueva property.
     * 
     * @return
     *     possible object is
     *     {@link BEDomicilios }
     *     
     */
    public BEDomicilios getBeNueva() {
        return beNueva;
    }

    /**
     * Sets the value of the beNueva property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEDomicilios }
     *     
     */
    public void setBeNueva(BEDomicilios value) {
        this.beNueva = value;
    }

}
