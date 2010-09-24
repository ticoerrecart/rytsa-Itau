
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
 *         &lt;element name="GetByIDLookupPersonasResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="be" type="{http://tempuri.org/}BEPersonas" minOccurs="0"/>
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
    "getByIDLookupPersonasResult",
    "be"
})
@XmlRootElement(name = "GetByIDLookupPersonasResponse")
public class GetByIDLookupPersonasResponse {

    @XmlElement(name = "GetByIDLookupPersonasResult")
    protected BEEstado getByIDLookupPersonasResult;
    protected BEPersonas be;

    /**
     * Gets the value of the getByIDLookupPersonasResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetByIDLookupPersonasResult() {
        return getByIDLookupPersonasResult;
    }

    /**
     * Sets the value of the getByIDLookupPersonasResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetByIDLookupPersonasResult(BEEstado value) {
        this.getByIDLookupPersonasResult = value;
    }

    /**
     * Gets the value of the be property.
     * 
     * @return
     *     possible object is
     *     {@link BEPersonas }
     *     
     */
    public BEPersonas getBe() {
        return be;
    }

    /**
     * Sets the value of the be property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEPersonas }
     *     
     */
    public void setBe(BEPersonas value) {
        this.be = value;
    }

}
