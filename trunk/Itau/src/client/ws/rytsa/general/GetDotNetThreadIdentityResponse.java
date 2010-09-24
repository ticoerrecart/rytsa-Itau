
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
 *         &lt;element name="GetDotNetThreadIdentityResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getDotNetThreadIdentityResult"
})
@XmlRootElement(name = "GetDotNetThreadIdentityResponse")
public class GetDotNetThreadIdentityResponse {

    @XmlElement(name = "GetDotNetThreadIdentityResult")
    protected String getDotNetThreadIdentityResult;

    /**
     * Gets the value of the getDotNetThreadIdentityResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDotNetThreadIdentityResult() {
        return getDotNetThreadIdentityResult;
    }

    /**
     * Sets the value of the getDotNetThreadIdentityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDotNetThreadIdentityResult(String value) {
        this.getDotNetThreadIdentityResult = value;
    }

}
