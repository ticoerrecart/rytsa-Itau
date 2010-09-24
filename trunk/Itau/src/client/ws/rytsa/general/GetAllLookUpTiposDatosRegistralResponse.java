
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
 *         &lt;element name="GetAllLookUpTiposDatosRegistralResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beArray" type="{http://tempuri.org/}ArrayOfBETiposDatosRegistral" minOccurs="0"/>
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
    "getAllLookUpTiposDatosRegistralResult",
    "beArray"
})
@XmlRootElement(name = "GetAllLookUpTiposDatosRegistralResponse")
public class GetAllLookUpTiposDatosRegistralResponse {

    @XmlElement(name = "GetAllLookUpTiposDatosRegistralResult")
    protected BEEstado getAllLookUpTiposDatosRegistralResult;
    protected ArrayOfBETiposDatosRegistral beArray;

    /**
     * Gets the value of the getAllLookUpTiposDatosRegistralResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetAllLookUpTiposDatosRegistralResult() {
        return getAllLookUpTiposDatosRegistralResult;
    }

    /**
     * Sets the value of the getAllLookUpTiposDatosRegistralResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetAllLookUpTiposDatosRegistralResult(BEEstado value) {
        this.getAllLookUpTiposDatosRegistralResult = value;
    }

    /**
     * Gets the value of the beArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBETiposDatosRegistral }
     *     
     */
    public ArrayOfBETiposDatosRegistral getBeArray() {
        return beArray;
    }

    /**
     * Sets the value of the beArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBETiposDatosRegistral }
     *     
     */
    public void setBeArray(ArrayOfBETiposDatosRegistral value) {
        this.beArray = value;
    }

}
