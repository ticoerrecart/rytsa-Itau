
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
 *         &lt;element name="GetAllTablaMaestraResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beArray" type="{http://tempuri.org/}ArrayOfBETablaMaestra" minOccurs="0"/>
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
    "getAllTablaMaestraResult",
    "beArray"
})
@XmlRootElement(name = "GetAllTablaMaestraResponse")
public class GetAllTablaMaestraResponse {

    @XmlElement(name = "GetAllTablaMaestraResult")
    protected BEEstado getAllTablaMaestraResult;
    protected ArrayOfBETablaMaestra beArray;

    /**
     * Gets the value of the getAllTablaMaestraResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetAllTablaMaestraResult() {
        return getAllTablaMaestraResult;
    }

    /**
     * Sets the value of the getAllTablaMaestraResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetAllTablaMaestraResult(BEEstado value) {
        this.getAllTablaMaestraResult = value;
    }

    /**
     * Gets the value of the beArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBETablaMaestra }
     *     
     */
    public ArrayOfBETablaMaestra getBeArray() {
        return beArray;
    }

    /**
     * Sets the value of the beArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBETablaMaestra }
     *     
     */
    public void setBeArray(ArrayOfBETablaMaestra value) {
        this.beArray = value;
    }

}
