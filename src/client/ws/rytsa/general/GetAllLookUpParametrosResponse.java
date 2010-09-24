
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
 *         &lt;element name="GetAllLookUpParametrosResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beArray" type="{http://tempuri.org/}ArrayOfBEParametros" minOccurs="0"/>
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
    "getAllLookUpParametrosResult",
    "beArray"
})
@XmlRootElement(name = "GetAllLookUpParametrosResponse")
public class GetAllLookUpParametrosResponse {

    @XmlElement(name = "GetAllLookUpParametrosResult")
    protected BEEstado getAllLookUpParametrosResult;
    protected ArrayOfBEParametros beArray;

    /**
     * Gets the value of the getAllLookUpParametrosResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetAllLookUpParametrosResult() {
        return getAllLookUpParametrosResult;
    }

    /**
     * Sets the value of the getAllLookUpParametrosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetAllLookUpParametrosResult(BEEstado value) {
        this.getAllLookUpParametrosResult = value;
    }

    /**
     * Gets the value of the beArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBEParametros }
     *     
     */
    public ArrayOfBEParametros getBeArray() {
        return beArray;
    }

    /**
     * Sets the value of the beArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBEParametros }
     *     
     */
    public void setBeArray(ArrayOfBEParametros value) {
        this.beArray = value;
    }

}
