
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
 *         &lt;element name="CreateAccionRolResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beAccionRol" type="{http://tempuri.org/}BEAccionRol" minOccurs="0"/>
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
    "createAccionRolResult",
    "beAccionRol"
})
@XmlRootElement(name = "CreateAccionRolResponse")
public class CreateAccionRolResponse {

    @XmlElement(name = "CreateAccionRolResult")
    protected BEEstado createAccionRolResult;
    protected BEAccionRol beAccionRol;

    /**
     * Gets the value of the createAccionRolResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getCreateAccionRolResult() {
        return createAccionRolResult;
    }

    /**
     * Sets the value of the createAccionRolResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setCreateAccionRolResult(BEEstado value) {
        this.createAccionRolResult = value;
    }

    /**
     * Gets the value of the beAccionRol property.
     * 
     * @return
     *     possible object is
     *     {@link BEAccionRol }
     *     
     */
    public BEAccionRol getBeAccionRol() {
        return beAccionRol;
    }

    /**
     * Sets the value of the beAccionRol property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEAccionRol }
     *     
     */
    public void setBeAccionRol(BEAccionRol value) {
        this.beAccionRol = value;
    }

}
