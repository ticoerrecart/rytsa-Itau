
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
 *         &lt;element name="GetByIDAccionRolResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="be" type="{http://tempuri.org/}BEAccionRol" minOccurs="0"/>
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
    "getByIDAccionRolResult",
    "be"
})
@XmlRootElement(name = "GetByIDAccionRolResponse")
public class GetByIDAccionRolResponse {

    @XmlElement(name = "GetByIDAccionRolResult")
    protected BEEstado getByIDAccionRolResult;
    protected BEAccionRol be;

    /**
     * Gets the value of the getByIDAccionRolResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetByIDAccionRolResult() {
        return getByIDAccionRolResult;
    }

    /**
     * Sets the value of the getByIDAccionRolResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetByIDAccionRolResult(BEEstado value) {
        this.getByIDAccionRolResult = value;
    }

    /**
     * Gets the value of the be property.
     * 
     * @return
     *     possible object is
     *     {@link BEAccionRol }
     *     
     */
    public BEAccionRol getBe() {
        return be;
    }

    /**
     * Sets the value of the be property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEAccionRol }
     *     
     */
    public void setBe(BEAccionRol value) {
        this.be = value;
    }

}
