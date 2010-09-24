
package client.ws.rytsa.seguridad;

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
 *         &lt;element name="GetAllAccionRolResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beArray" type="{http://tempuri.org/}ArrayOfBEAccionRol" minOccurs="0"/>
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
    "getAllAccionRolResult",
    "beArray"
})
@XmlRootElement(name = "GetAllAccionRolResponse")
public class GetAllAccionRolResponse {

    @XmlElement(name = "GetAllAccionRolResult")
    protected BEEstado getAllAccionRolResult;
    protected ArrayOfBEAccionRol beArray;

    /**
     * Gets the value of the getAllAccionRolResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetAllAccionRolResult() {
        return getAllAccionRolResult;
    }

    /**
     * Sets the value of the getAllAccionRolResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetAllAccionRolResult(BEEstado value) {
        this.getAllAccionRolResult = value;
    }

    /**
     * Gets the value of the beArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBEAccionRol }
     *     
     */
    public ArrayOfBEAccionRol getBeArray() {
        return beArray;
    }

    /**
     * Sets the value of the beArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBEAccionRol }
     *     
     */
    public void setBeArray(ArrayOfBEAccionRol value) {
        this.beArray = value;
    }

}
