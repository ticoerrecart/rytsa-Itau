
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
 *         &lt;element name="SetConfiguracionseguridadResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="be" type="{http://tempuri.org/}BEConfiguracionseguridad" minOccurs="0"/>
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
    "setConfiguracionseguridadResult",
    "be"
})
@XmlRootElement(name = "SetConfiguracionseguridadResponse")
public class SetConfiguracionseguridadResponse {

    @XmlElement(name = "SetConfiguracionseguridadResult")
    protected BEEstado setConfiguracionseguridadResult;
    protected BEConfiguracionseguridad be;

    /**
     * Gets the value of the setConfiguracionseguridadResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getSetConfiguracionseguridadResult() {
        return setConfiguracionseguridadResult;
    }

    /**
     * Sets the value of the setConfiguracionseguridadResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setSetConfiguracionseguridadResult(BEEstado value) {
        this.setConfiguracionseguridadResult = value;
    }

    /**
     * Gets the value of the be property.
     * 
     * @return
     *     possible object is
     *     {@link BEConfiguracionseguridad }
     *     
     */
    public BEConfiguracionseguridad getBe() {
        return be;
    }

    /**
     * Sets the value of the be property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEConfiguracionseguridad }
     *     
     */
    public void setBe(BEConfiguracionseguridad value) {
        this.be = value;
    }

}
