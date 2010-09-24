
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
 *         &lt;element name="GetAllLookUpProvinciasResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beArray" type="{http://tempuri.org/}ArrayOfBEProvincias" minOccurs="0"/>
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
    "getAllLookUpProvinciasResult",
    "beArray"
})
@XmlRootElement(name = "GetAllLookUpProvinciasResponse")
public class GetAllLookUpProvinciasResponse {

    @XmlElement(name = "GetAllLookUpProvinciasResult")
    protected BEEstado getAllLookUpProvinciasResult;
    protected ArrayOfBEProvincias beArray;

    /**
     * Gets the value of the getAllLookUpProvinciasResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetAllLookUpProvinciasResult() {
        return getAllLookUpProvinciasResult;
    }

    /**
     * Sets the value of the getAllLookUpProvinciasResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetAllLookUpProvinciasResult(BEEstado value) {
        this.getAllLookUpProvinciasResult = value;
    }

    /**
     * Gets the value of the beArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBEProvincias }
     *     
     */
    public ArrayOfBEProvincias getBeArray() {
        return beArray;
    }

    /**
     * Sets the value of the beArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBEProvincias }
     *     
     */
    public void setBeArray(ArrayOfBEProvincias value) {
        this.beArray = value;
    }

}
