
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
 *         &lt;element name="GetAllGruposEconomicosResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
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
    "getAllGruposEconomicosResult",
    "beArray"
})
@XmlRootElement(name = "GetAllGruposEconomicosResponse")
public class GetAllGruposEconomicosResponse {

    @XmlElement(name = "GetAllGruposEconomicosResult")
    protected BEEstado getAllGruposEconomicosResult;
    protected ArrayOfBEGruposEconomicos beArray;

    /**
     * Gets the value of the getAllGruposEconomicosResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetAllGruposEconomicosResult() {
        return getAllGruposEconomicosResult;
    }

    /**
     * Sets the value of the getAllGruposEconomicosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetAllGruposEconomicosResult(BEEstado value) {
        this.getAllGruposEconomicosResult = value;
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
