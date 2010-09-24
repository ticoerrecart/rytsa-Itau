
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
 *         &lt;element name="DeleteParametrosResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
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
    "deleteParametrosResult"
})
@XmlRootElement(name = "DeleteParametrosResponse")
public class DeleteParametrosResponse {

    @XmlElement(name = "DeleteParametrosResult")
    protected BEEstado deleteParametrosResult;

    /**
     * Gets the value of the deleteParametrosResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getDeleteParametrosResult() {
        return deleteParametrosResult;
    }

    /**
     * Sets the value of the deleteParametrosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setDeleteParametrosResult(BEEstado value) {
        this.deleteParametrosResult = value;
    }

}
