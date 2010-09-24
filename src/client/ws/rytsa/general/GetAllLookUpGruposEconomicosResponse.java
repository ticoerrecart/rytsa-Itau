
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
 *         &lt;element name="GetAllLookUpGruposEconomicosResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beArray" type="{http://tempuri.org/}ArrayOfBEGruposEconomicos" minOccurs="0"/>
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
    "getAllLookUpGruposEconomicosResult",
    "beArray"
})
@XmlRootElement(name = "GetAllLookUpGruposEconomicosResponse")
public class GetAllLookUpGruposEconomicosResponse {

    @XmlElement(name = "GetAllLookUpGruposEconomicosResult")
    protected BEEstado getAllLookUpGruposEconomicosResult;
    protected ArrayOfBEGruposEconomicos beArray;

    /**
     * Gets the value of the getAllLookUpGruposEconomicosResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetAllLookUpGruposEconomicosResult() {
        return getAllLookUpGruposEconomicosResult;
    }

    /**
     * Sets the value of the getAllLookUpGruposEconomicosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetAllLookUpGruposEconomicosResult(BEEstado value) {
        this.getAllLookUpGruposEconomicosResult = value;
    }

    /**
     * Gets the value of the beArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBEGruposEconomicos }
     *     
     */
    public ArrayOfBEGruposEconomicos getBeArray() {
        return beArray;
    }

    /**
     * Sets the value of the beArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBEGruposEconomicos }
     *     
     */
    public void setBeArray(ArrayOfBEGruposEconomicos value) {
        this.beArray = value;
    }

}
