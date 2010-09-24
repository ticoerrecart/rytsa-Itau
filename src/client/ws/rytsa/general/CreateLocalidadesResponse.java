
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
 *         &lt;element name="CreateLocalidadesResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="be" type="{http://tempuri.org/}BELocalidades" minOccurs="0"/>
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
    "createLocalidadesResult",
    "be"
})
@XmlRootElement(name = "CreateLocalidadesResponse")
public class CreateLocalidadesResponse {

    @XmlElement(name = "CreateLocalidadesResult")
    protected BEEstado createLocalidadesResult;
    protected BELocalidades be;

    /**
     * Gets the value of the createLocalidadesResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getCreateLocalidadesResult() {
        return createLocalidadesResult;
    }

    /**
     * Sets the value of the createLocalidadesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setCreateLocalidadesResult(BEEstado value) {
        this.createLocalidadesResult = value;
    }

    /**
     * Gets the value of the be property.
     * 
     * @return
     *     possible object is
     *     {@link BELocalidades }
     *     
     */
    public BELocalidades getBe() {
        return be;
    }

    /**
     * Sets the value of the be property.
     * 
     * @param value
     *     allowed object is
     *     {@link BELocalidades }
     *     
     */
    public void setBe(BELocalidades value) {
        this.be = value;
    }

}
