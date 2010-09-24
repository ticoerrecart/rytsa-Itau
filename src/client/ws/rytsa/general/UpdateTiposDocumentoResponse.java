
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
 *         &lt;element name="UpdateTiposDocumentoResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beNueva" type="{http://tempuri.org/}BETiposDocumento" minOccurs="0"/>
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
    "updateTiposDocumentoResult",
    "beNueva"
})
@XmlRootElement(name = "UpdateTiposDocumentoResponse")
public class UpdateTiposDocumentoResponse {

    @XmlElement(name = "UpdateTiposDocumentoResult")
    protected BEEstado updateTiposDocumentoResult;
    protected BETiposDocumento beNueva;

    /**
     * Gets the value of the updateTiposDocumentoResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getUpdateTiposDocumentoResult() {
        return updateTiposDocumentoResult;
    }

    /**
     * Sets the value of the updateTiposDocumentoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setUpdateTiposDocumentoResult(BEEstado value) {
        this.updateTiposDocumentoResult = value;
    }

    /**
     * Gets the value of the beNueva property.
     * 
     * @return
     *     possible object is
     *     {@link BETiposDocumento }
     *     
     */
    public BETiposDocumento getBeNueva() {
        return beNueva;
    }

    /**
     * Sets the value of the beNueva property.
     * 
     * @param value
     *     allowed object is
     *     {@link BETiposDocumento }
     *     
     */
    public void setBeNueva(BETiposDocumento value) {
        this.beNueva = value;
    }

}
