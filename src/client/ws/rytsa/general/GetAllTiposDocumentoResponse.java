
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
 *         &lt;element name="GetAllTiposDocumentoResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beArray" type="{http://tempuri.org/}ArrayOfBETiposDocumento" minOccurs="0"/>
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
    "getAllTiposDocumentoResult",
    "beArray"
})
@XmlRootElement(name = "GetAllTiposDocumentoResponse")
public class GetAllTiposDocumentoResponse {

    @XmlElement(name = "GetAllTiposDocumentoResult")
    protected BEEstado getAllTiposDocumentoResult;
    protected ArrayOfBETiposDocumento beArray;

    /**
     * Gets the value of the getAllTiposDocumentoResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetAllTiposDocumentoResult() {
        return getAllTiposDocumentoResult;
    }

    /**
     * Sets the value of the getAllTiposDocumentoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetAllTiposDocumentoResult(BEEstado value) {
        this.getAllTiposDocumentoResult = value;
    }

    /**
     * Gets the value of the beArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBETiposDocumento }
     *     
     */
    public ArrayOfBETiposDocumento getBeArray() {
        return beArray;
    }

    /**
     * Sets the value of the beArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBETiposDocumento }
     *     
     */
    public void setBeArray(ArrayOfBETiposDocumento value) {
        this.beArray = value;
    }

}
