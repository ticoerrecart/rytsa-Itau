
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
 *         &lt;element name="CreateGruposEconomicosResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="be" type="{http://tempuri.org/}BEGruposEconomicos" minOccurs="0"/>
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
    "createGruposEconomicosResult",
    "be"
})
@XmlRootElement(name = "CreateGruposEconomicosResponse")
public class CreateGruposEconomicosResponse {

    @XmlElement(name = "CreateGruposEconomicosResult")
    protected BEEstado createGruposEconomicosResult;
    protected BEGruposEconomicos be;

    /**
     * Gets the value of the createGruposEconomicosResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getCreateGruposEconomicosResult() {
        return createGruposEconomicosResult;
    }

    /**
     * Sets the value of the createGruposEconomicosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setCreateGruposEconomicosResult(BEEstado value) {
        this.createGruposEconomicosResult = value;
    }

    /**
     * Gets the value of the be property.
     * 
     * @return
     *     possible object is
     *     {@link BEGruposEconomicos }
     *     
     */
    public BEGruposEconomicos getBe() {
        return be;
    }

    /**
     * Sets the value of the be property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEGruposEconomicos }
     *     
     */
    public void setBe(BEGruposEconomicos value) {
        this.be = value;
    }

}
