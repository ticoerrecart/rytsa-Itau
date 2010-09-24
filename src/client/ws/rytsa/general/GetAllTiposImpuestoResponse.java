
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
 *         &lt;element name="GetAllTiposImpuestoResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beArray" type="{http://tempuri.org/}ArrayOfBETiposImpuesto" minOccurs="0"/>
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
    "getAllTiposImpuestoResult",
    "beArray"
})
@XmlRootElement(name = "GetAllTiposImpuestoResponse")
public class GetAllTiposImpuestoResponse {

    @XmlElement(name = "GetAllTiposImpuestoResult")
    protected BEEstado getAllTiposImpuestoResult;
    protected ArrayOfBETiposImpuesto beArray;

    /**
     * Gets the value of the getAllTiposImpuestoResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetAllTiposImpuestoResult() {
        return getAllTiposImpuestoResult;
    }

    /**
     * Sets the value of the getAllTiposImpuestoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetAllTiposImpuestoResult(BEEstado value) {
        this.getAllTiposImpuestoResult = value;
    }

    /**
     * Gets the value of the beArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBETiposImpuesto }
     *     
     */
    public ArrayOfBETiposImpuesto getBeArray() {
        return beArray;
    }

    /**
     * Sets the value of the beArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBETiposImpuesto }
     *     
     */
    public void setBeArray(ArrayOfBETiposImpuesto value) {
        this.beArray = value;
    }

}
