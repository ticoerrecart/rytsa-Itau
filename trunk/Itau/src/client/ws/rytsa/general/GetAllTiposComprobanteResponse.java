
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
 *         &lt;element name="GetAllTiposComprobanteResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beArray" type="{http://tempuri.org/}ArrayOfBETiposComprobante" minOccurs="0"/>
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
    "getAllTiposComprobanteResult",
    "beArray"
})
@XmlRootElement(name = "GetAllTiposComprobanteResponse")
public class GetAllTiposComprobanteResponse {

    @XmlElement(name = "GetAllTiposComprobanteResult")
    protected BEEstado getAllTiposComprobanteResult;
    protected ArrayOfBETiposComprobante beArray;

    /**
     * Gets the value of the getAllTiposComprobanteResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetAllTiposComprobanteResult() {
        return getAllTiposComprobanteResult;
    }

    /**
     * Sets the value of the getAllTiposComprobanteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetAllTiposComprobanteResult(BEEstado value) {
        this.getAllTiposComprobanteResult = value;
    }

    /**
     * Gets the value of the beArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBETiposComprobante }
     *     
     */
    public ArrayOfBETiposComprobante getBeArray() {
        return beArray;
    }

    /**
     * Sets the value of the beArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBETiposComprobante }
     *     
     */
    public void setBeArray(ArrayOfBETiposComprobante value) {
        this.beArray = value;
    }

}
