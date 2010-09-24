
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
 *         &lt;element name="GetByIDTiposDocumentoResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="be" type="{http://tempuri.org/}BETiposDocumento" minOccurs="0"/>
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
    "getByIDTiposDocumentoResult",
    "be"
})
@XmlRootElement(name = "GetByIDTiposDocumentoResponse")
public class GetByIDTiposDocumentoResponse {

    @XmlElement(name = "GetByIDTiposDocumentoResult")
    protected BEEstado getByIDTiposDocumentoResult;
    protected BETiposDocumento be;

    /**
     * Gets the value of the getByIDTiposDocumentoResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetByIDTiposDocumentoResult() {
        return getByIDTiposDocumentoResult;
    }

    /**
     * Sets the value of the getByIDTiposDocumentoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetByIDTiposDocumentoResult(BEEstado value) {
        this.getByIDTiposDocumentoResult = value;
    }

    /**
     * Gets the value of the be property.
     * 
     * @return
     *     possible object is
     *     {@link BETiposDocumento }
     *     
     */
    public BETiposDocumento getBe() {
        return be;
    }

    /**
     * Sets the value of the be property.
     * 
     * @param value
     *     allowed object is
     *     {@link BETiposDocumento }
     *     
     */
    public void setBe(BETiposDocumento value) {
        this.be = value;
    }

}
