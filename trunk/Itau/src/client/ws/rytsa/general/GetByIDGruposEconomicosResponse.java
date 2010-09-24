
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
 *         &lt;element name="GetByIDGruposEconomicosResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
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
    "getByIDGruposEconomicosResult",
    "be"
})
@XmlRootElement(name = "GetByIDGruposEconomicosResponse")
public class GetByIDGruposEconomicosResponse {

    @XmlElement(name = "GetByIDGruposEconomicosResult")
    protected BEEstado getByIDGruposEconomicosResult;
    protected BEGruposEconomicos be;

    /**
     * Gets the value of the getByIDGruposEconomicosResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetByIDGruposEconomicosResult() {
        return getByIDGruposEconomicosResult;
    }

    /**
     * Sets the value of the getByIDGruposEconomicosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetByIDGruposEconomicosResult(BEEstado value) {
        this.getByIDGruposEconomicosResult = value;
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
