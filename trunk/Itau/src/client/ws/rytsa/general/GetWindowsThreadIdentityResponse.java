
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
 *         &lt;element name="GetWindowsThreadIdentityResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getWindowsThreadIdentityResult"
})
@XmlRootElement(name = "GetWindowsThreadIdentityResponse")
public class GetWindowsThreadIdentityResponse {

    @XmlElement(name = "GetWindowsThreadIdentityResult")
    protected String getWindowsThreadIdentityResult;

    /**
     * Gets the value of the getWindowsThreadIdentityResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetWindowsThreadIdentityResult() {
        return getWindowsThreadIdentityResult;
    }

    /**
     * Sets the value of the getWindowsThreadIdentityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetWindowsThreadIdentityResult(String value) {
        this.getWindowsThreadIdentityResult = value;
    }

}
