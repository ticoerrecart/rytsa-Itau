
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
 *         &lt;element name="UpdateGruposEconomicosResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beNueva" type="{http://tempuri.org/}BEGruposEconomicos" minOccurs="0"/>
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
    "updateGruposEconomicosResult",
    "beNueva"
})
@XmlRootElement(name = "UpdateGruposEconomicosResponse")
public class UpdateGruposEconomicosResponse {

    @XmlElement(name = "UpdateGruposEconomicosResult")
    protected BEEstado updateGruposEconomicosResult;
    protected BEGruposEconomicos beNueva;

    /**
     * Gets the value of the updateGruposEconomicosResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getUpdateGruposEconomicosResult() {
        return updateGruposEconomicosResult;
    }

    /**
     * Sets the value of the updateGruposEconomicosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setUpdateGruposEconomicosResult(BEEstado value) {
        this.updateGruposEconomicosResult = value;
    }

    /**
     * Gets the value of the beNueva property.
     * 
     * @return
     *     possible object is
     *     {@link BEGruposEconomicos }
     *     
     */
    public BEGruposEconomicos getBeNueva() {
        return beNueva;
    }

    /**
     * Sets the value of the beNueva property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEGruposEconomicos }
     *     
     */
    public void setBeNueva(BEGruposEconomicos value) {
        this.beNueva = value;
    }

}
