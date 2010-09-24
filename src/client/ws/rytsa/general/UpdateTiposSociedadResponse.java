
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
 *         &lt;element name="UpdateTiposSociedadResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beNueva" type="{http://tempuri.org/}BETiposSociedad" minOccurs="0"/>
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
    "updateTiposSociedadResult",
    "beNueva"
})
@XmlRootElement(name = "UpdateTiposSociedadResponse")
public class UpdateTiposSociedadResponse {

    @XmlElement(name = "UpdateTiposSociedadResult")
    protected BEEstado updateTiposSociedadResult;
    protected BETiposSociedad beNueva;

    /**
     * Gets the value of the updateTiposSociedadResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getUpdateTiposSociedadResult() {
        return updateTiposSociedadResult;
    }

    /**
     * Sets the value of the updateTiposSociedadResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setUpdateTiposSociedadResult(BEEstado value) {
        this.updateTiposSociedadResult = value;
    }

    /**
     * Gets the value of the beNueva property.
     * 
     * @return
     *     possible object is
     *     {@link BETiposSociedad }
     *     
     */
    public BETiposSociedad getBeNueva() {
        return beNueva;
    }

    /**
     * Sets the value of the beNueva property.
     * 
     * @param value
     *     allowed object is
     *     {@link BETiposSociedad }
     *     
     */
    public void setBeNueva(BETiposSociedad value) {
        this.beNueva = value;
    }

}
