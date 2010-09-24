
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
 *         &lt;element name="GetAllLookUpTiposSociedadResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beArray" type="{http://tempuri.org/}ArrayOfBETiposSociedad" minOccurs="0"/>
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
    "getAllLookUpTiposSociedadResult",
    "beArray"
})
@XmlRootElement(name = "GetAllLookUpTiposSociedadResponse")
public class GetAllLookUpTiposSociedadResponse {

    @XmlElement(name = "GetAllLookUpTiposSociedadResult")
    protected BEEstado getAllLookUpTiposSociedadResult;
    protected ArrayOfBETiposSociedad beArray;

    /**
     * Gets the value of the getAllLookUpTiposSociedadResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetAllLookUpTiposSociedadResult() {
        return getAllLookUpTiposSociedadResult;
    }

    /**
     * Sets the value of the getAllLookUpTiposSociedadResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetAllLookUpTiposSociedadResult(BEEstado value) {
        this.getAllLookUpTiposSociedadResult = value;
    }

    /**
     * Gets the value of the beArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBETiposSociedad }
     *     
     */
    public ArrayOfBETiposSociedad getBeArray() {
        return beArray;
    }

    /**
     * Sets the value of the beArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBETiposSociedad }
     *     
     */
    public void setBeArray(ArrayOfBETiposSociedad value) {
        this.beArray = value;
    }

}
