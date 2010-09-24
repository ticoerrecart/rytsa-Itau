
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
 *         &lt;element name="UpdateProvinciasResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beNueva" type="{http://tempuri.org/}BEProvincias" minOccurs="0"/>
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
    "updateProvinciasResult",
    "beNueva"
})
@XmlRootElement(name = "UpdateProvinciasResponse")
public class UpdateProvinciasResponse {

    @XmlElement(name = "UpdateProvinciasResult")
    protected BEEstado updateProvinciasResult;
    protected BEProvincias beNueva;

    /**
     * Gets the value of the updateProvinciasResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getUpdateProvinciasResult() {
        return updateProvinciasResult;
    }

    /**
     * Sets the value of the updateProvinciasResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setUpdateProvinciasResult(BEEstado value) {
        this.updateProvinciasResult = value;
    }

    /**
     * Gets the value of the beNueva property.
     * 
     * @return
     *     possible object is
     *     {@link BEProvincias }
     *     
     */
    public BEProvincias getBeNueva() {
        return beNueva;
    }

    /**
     * Sets the value of the beNueva property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEProvincias }
     *     
     */
    public void setBeNueva(BEProvincias value) {
        this.beNueva = value;
    }

}
