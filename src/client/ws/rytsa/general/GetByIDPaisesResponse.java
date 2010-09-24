
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
 *         &lt;element name="GetByIDPaisesResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="be" type="{http://tempuri.org/}BEPaises" minOccurs="0"/>
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
    "getByIDPaisesResult",
    "be"
})
@XmlRootElement(name = "GetByIDPaisesResponse")
public class GetByIDPaisesResponse {

    @XmlElement(name = "GetByIDPaisesResult")
    protected BEEstado getByIDPaisesResult;
    protected BEPaises be;

    /**
     * Gets the value of the getByIDPaisesResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetByIDPaisesResult() {
        return getByIDPaisesResult;
    }

    /**
     * Sets the value of the getByIDPaisesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetByIDPaisesResult(BEEstado value) {
        this.getByIDPaisesResult = value;
    }

    /**
     * Gets the value of the be property.
     * 
     * @return
     *     possible object is
     *     {@link BEPaises }
     *     
     */
    public BEPaises getBe() {
        return be;
    }

    /**
     * Sets the value of the be property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEPaises }
     *     
     */
    public void setBe(BEPaises value) {
        this.be = value;
    }

}
