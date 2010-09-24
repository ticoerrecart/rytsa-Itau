
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
 *         &lt;element name="UpdateCategoriasImpuestoResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beNueva" type="{http://tempuri.org/}BECategoriasImpuesto" minOccurs="0"/>
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
    "updateCategoriasImpuestoResult",
    "beNueva"
})
@XmlRootElement(name = "UpdateCategoriasImpuestoResponse")
public class UpdateCategoriasImpuestoResponse {

    @XmlElement(name = "UpdateCategoriasImpuestoResult")
    protected BEEstado updateCategoriasImpuestoResult;
    protected BECategoriasImpuesto beNueva;

    /**
     * Gets the value of the updateCategoriasImpuestoResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getUpdateCategoriasImpuestoResult() {
        return updateCategoriasImpuestoResult;
    }

    /**
     * Sets the value of the updateCategoriasImpuestoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setUpdateCategoriasImpuestoResult(BEEstado value) {
        this.updateCategoriasImpuestoResult = value;
    }

    /**
     * Gets the value of the beNueva property.
     * 
     * @return
     *     possible object is
     *     {@link BECategoriasImpuesto }
     *     
     */
    public BECategoriasImpuesto getBeNueva() {
        return beNueva;
    }

    /**
     * Sets the value of the beNueva property.
     * 
     * @param value
     *     allowed object is
     *     {@link BECategoriasImpuesto }
     *     
     */
    public void setBeNueva(BECategoriasImpuesto value) {
        this.beNueva = value;
    }

}
