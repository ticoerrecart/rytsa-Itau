
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
 *         &lt;element name="GetByIDTiposImpuestoResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="be" type="{http://tempuri.org/}BETiposImpuesto" minOccurs="0"/>
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
    "getByIDTiposImpuestoResult",
    "be"
})
@XmlRootElement(name = "GetByIDTiposImpuestoResponse")
public class GetByIDTiposImpuestoResponse {

    @XmlElement(name = "GetByIDTiposImpuestoResult")
    protected BEEstado getByIDTiposImpuestoResult;
    protected BETiposImpuesto be;

    /**
     * Gets the value of the getByIDTiposImpuestoResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetByIDTiposImpuestoResult() {
        return getByIDTiposImpuestoResult;
    }

    /**
     * Sets the value of the getByIDTiposImpuestoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetByIDTiposImpuestoResult(BEEstado value) {
        this.getByIDTiposImpuestoResult = value;
    }

    /**
     * Gets the value of the be property.
     * 
     * @return
     *     possible object is
     *     {@link BETiposImpuesto }
     *     
     */
    public BETiposImpuesto getBe() {
        return be;
    }

    /**
     * Sets the value of the be property.
     * 
     * @param value
     *     allowed object is
     *     {@link BETiposImpuesto }
     *     
     */
    public void setBe(BETiposImpuesto value) {
        this.be = value;
    }

}
