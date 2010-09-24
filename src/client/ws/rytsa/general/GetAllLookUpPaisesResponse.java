
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
 *         &lt;element name="GetAllLookUpPaisesResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beArray" type="{http://tempuri.org/}ArrayOfBEPaises" minOccurs="0"/>
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
    "getAllLookUpPaisesResult",
    "beArray"
})
@XmlRootElement(name = "GetAllLookUpPaisesResponse")
public class GetAllLookUpPaisesResponse {

    @XmlElement(name = "GetAllLookUpPaisesResult")
    protected BEEstado getAllLookUpPaisesResult;
    protected ArrayOfBEPaises beArray;

    /**
     * Gets the value of the getAllLookUpPaisesResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetAllLookUpPaisesResult() {
        return getAllLookUpPaisesResult;
    }

    /**
     * Sets the value of the getAllLookUpPaisesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetAllLookUpPaisesResult(BEEstado value) {
        this.getAllLookUpPaisesResult = value;
    }

    /**
     * Gets the value of the beArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBEPaises }
     *     
     */
    public ArrayOfBEPaises getBeArray() {
        return beArray;
    }

    /**
     * Sets the value of the beArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBEPaises }
     *     
     */
    public void setBeArray(ArrayOfBEPaises value) {
        this.beArray = value;
    }

}
