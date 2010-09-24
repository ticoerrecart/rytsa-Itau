
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
 *         &lt;element name="UpdateLocalidadesResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beNueva" type="{http://tempuri.org/}BELocalidades" minOccurs="0"/>
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
    "updateLocalidadesResult",
    "beNueva"
})
@XmlRootElement(name = "UpdateLocalidadesResponse")
public class UpdateLocalidadesResponse {

    @XmlElement(name = "UpdateLocalidadesResult")
    protected BEEstado updateLocalidadesResult;
    protected BELocalidades beNueva;

    /**
     * Gets the value of the updateLocalidadesResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getUpdateLocalidadesResult() {
        return updateLocalidadesResult;
    }

    /**
     * Sets the value of the updateLocalidadesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setUpdateLocalidadesResult(BEEstado value) {
        this.updateLocalidadesResult = value;
    }

    /**
     * Gets the value of the beNueva property.
     * 
     * @return
     *     possible object is
     *     {@link BELocalidades }
     *     
     */
    public BELocalidades getBeNueva() {
        return beNueva;
    }

    /**
     * Sets the value of the beNueva property.
     * 
     * @param value
     *     allowed object is
     *     {@link BELocalidades }
     *     
     */
    public void setBeNueva(BELocalidades value) {
        this.beNueva = value;
    }

}
