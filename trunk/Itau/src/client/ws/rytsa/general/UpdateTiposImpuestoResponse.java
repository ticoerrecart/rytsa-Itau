
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
 *         &lt;element name="UpdateTiposImpuestoResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beNueva" type="{http://tempuri.org/}BETiposImpuesto" minOccurs="0"/>
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
    "updateTiposImpuestoResult",
    "beNueva"
})
@XmlRootElement(name = "UpdateTiposImpuestoResponse")
public class UpdateTiposImpuestoResponse {

    @XmlElement(name = "UpdateTiposImpuestoResult")
    protected BEEstado updateTiposImpuestoResult;
    protected BETiposImpuesto beNueva;

    /**
     * Gets the value of the updateTiposImpuestoResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getUpdateTiposImpuestoResult() {
        return updateTiposImpuestoResult;
    }

    /**
     * Sets the value of the updateTiposImpuestoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setUpdateTiposImpuestoResult(BEEstado value) {
        this.updateTiposImpuestoResult = value;
    }

    /**
     * Gets the value of the beNueva property.
     * 
     * @return
     *     possible object is
     *     {@link BETiposImpuesto }
     *     
     */
    public BETiposImpuesto getBeNueva() {
        return beNueva;
    }

    /**
     * Sets the value of the beNueva property.
     * 
     * @param value
     *     allowed object is
     *     {@link BETiposImpuesto }
     *     
     */
    public void setBeNueva(BETiposImpuesto value) {
        this.beNueva = value;
    }

}
