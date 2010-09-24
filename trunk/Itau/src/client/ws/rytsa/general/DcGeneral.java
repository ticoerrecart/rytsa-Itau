
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
 *         &lt;element name="_dcGeneral" type="{http://tempuri.org/}DCWithID" minOccurs="0"/>
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
    "dcGeneral"
})
@XmlRootElement(name = "_dcGeneral")
public class DcGeneral {

    @XmlElement(name = "_dcGeneral")
    protected DCWithID dcGeneral;

    /**
     * Gets the value of the dcGeneral property.
     * 
     * @return
     *     possible object is
     *     {@link DCWithID }
     *     
     */
    public DCWithID getDcGeneral() {
        return dcGeneral;
    }

    /**
     * Sets the value of the dcGeneral property.
     * 
     * @param value
     *     allowed object is
     *     {@link DCWithID }
     *     
     */
    public void setDcGeneral(DCWithID value) {
        this.dcGeneral = value;
    }

}
