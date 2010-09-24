
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
 *         &lt;element name="GetByIDTiposSociedadResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="be" type="{http://tempuri.org/}BETiposSociedad" minOccurs="0"/>
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
    "getByIDTiposSociedadResult",
    "be"
})
@XmlRootElement(name = "GetByIDTiposSociedadResponse")
public class GetByIDTiposSociedadResponse {

    @XmlElement(name = "GetByIDTiposSociedadResult")
    protected BEEstado getByIDTiposSociedadResult;
    protected BETiposSociedad be;

    /**
     * Gets the value of the getByIDTiposSociedadResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetByIDTiposSociedadResult() {
        return getByIDTiposSociedadResult;
    }

    /**
     * Sets the value of the getByIDTiposSociedadResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetByIDTiposSociedadResult(BEEstado value) {
        this.getByIDTiposSociedadResult = value;
    }

    /**
     * Gets the value of the be property.
     * 
     * @return
     *     possible object is
     *     {@link BETiposSociedad }
     *     
     */
    public BETiposSociedad getBe() {
        return be;
    }

    /**
     * Sets the value of the be property.
     * 
     * @param value
     *     allowed object is
     *     {@link BETiposSociedad }
     *     
     */
    public void setBe(BETiposSociedad value) {
        this.be = value;
    }

}
