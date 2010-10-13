
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
 *         &lt;element name="GetAllLookUpTiposDocumentoResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
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
    "getAllLookUpTiposDocumentoResult",
    "beArray"
})
@XmlRootElement(name = "GetAllLookUpTiposDocumentoResponse")
public class GetAllLookUpTiposDocumentoResponse {

    @XmlElement(name = "GetAllLookUpTiposDocumentoResult")
    protected BEEstado getAllLookUpTiposDocumentoResult;
    protected ArrayOfBETiposDocumento beArray;

    /**
     * Gets the value of the getAllLookUpTiposDocumentoResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetAllLookUpTiposDocumentoResult() {
        return getAllLookUpTiposDocumentoResult;
    }

    /**
     * Sets the value of the getAllLookUpTiposDocumentoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetAllLookUpTiposDocumentoResult(BEEstado value) {
        this.getAllLookUpTiposDocumentoResult = value;
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