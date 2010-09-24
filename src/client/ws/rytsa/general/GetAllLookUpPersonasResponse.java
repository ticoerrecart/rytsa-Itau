
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
 *         &lt;element name="GetAllLookUpPersonasResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="totalrecord" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="beArray" type="{http://tempuri.org/}ArrayOfBEPersonas" minOccurs="0"/>
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
    "getAllLookUpPersonasResult",
    "totalrecord",
    "beArray"
})
@XmlRootElement(name = "GetAllLookUpPersonasResponse")
public class GetAllLookUpPersonasResponse {

    @XmlElement(name = "GetAllLookUpPersonasResult")
    protected BEEstado getAllLookUpPersonasResult;
    protected long totalrecord;
    protected ArrayOfBEPersonas beArray;

    /**
     * Gets the value of the getAllLookUpPersonasResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetAllLookUpPersonasResult() {
        return getAllLookUpPersonasResult;
    }

    /**
     * Sets the value of the getAllLookUpPersonasResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetAllLookUpPersonasResult(BEEstado value) {
        this.getAllLookUpPersonasResult = value;
    }

    /**
     * Gets the value of the totalrecord property.
     * 
     */
    public long getTotalrecord() {
        return totalrecord;
    }

    /**
     * Sets the value of the totalrecord property.
     * 
     */
    public void setTotalrecord(long value) {
        this.totalrecord = value;
    }

    /**
     * Gets the value of the beArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBEPersonas }
     *     
     */
    public ArrayOfBEPersonas getBeArray() {
        return beArray;
    }

    /**
     * Sets the value of the beArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBEPersonas }
     *     
     */
    public void setBeArray(ArrayOfBEPersonas value) {
        this.beArray = value;
    }

}
