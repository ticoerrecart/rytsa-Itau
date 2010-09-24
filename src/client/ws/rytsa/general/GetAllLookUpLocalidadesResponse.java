
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
 *         &lt;element name="GetAllLookUpLocalidadesResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beArray" type="{http://tempuri.org/}ArrayOfBELocalidades" minOccurs="0"/>
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
    "getAllLookUpLocalidadesResult",
    "beArray"
})
@XmlRootElement(name = "GetAllLookUpLocalidadesResponse")
public class GetAllLookUpLocalidadesResponse {

    @XmlElement(name = "GetAllLookUpLocalidadesResult")
    protected BEEstado getAllLookUpLocalidadesResult;
    protected ArrayOfBELocalidades beArray;

    /**
     * Gets the value of the getAllLookUpLocalidadesResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetAllLookUpLocalidadesResult() {
        return getAllLookUpLocalidadesResult;
    }

    /**
     * Sets the value of the getAllLookUpLocalidadesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetAllLookUpLocalidadesResult(BEEstado value) {
        this.getAllLookUpLocalidadesResult = value;
    }

    /**
     * Gets the value of the beArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBELocalidades }
     *     
     */
    public ArrayOfBELocalidades getBeArray() {
        return beArray;
    }

    /**
     * Sets the value of the beArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBELocalidades }
     *     
     */
    public void setBeArray(ArrayOfBELocalidades value) {
        this.beArray = value;
    }

}
