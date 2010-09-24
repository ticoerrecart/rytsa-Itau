
package client.ws.rytsa.seguridad;

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
 *         &lt;element name="GetAllLookUpUsuariosResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beArray" type="{http://tempuri.org/}ArrayOfBEUsuarios" minOccurs="0"/>
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
    "getAllLookUpUsuariosResult",
    "beArray"
})
@XmlRootElement(name = "GetAllLookUpUsuariosResponse")
public class GetAllLookUpUsuariosResponse {

    @XmlElement(name = "GetAllLookUpUsuariosResult")
    protected BEEstado getAllLookUpUsuariosResult;
    protected ArrayOfBEUsuarios beArray;

    /**
     * Gets the value of the getAllLookUpUsuariosResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetAllLookUpUsuariosResult() {
        return getAllLookUpUsuariosResult;
    }

    /**
     * Sets the value of the getAllLookUpUsuariosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetAllLookUpUsuariosResult(BEEstado value) {
        this.getAllLookUpUsuariosResult = value;
    }

    /**
     * Gets the value of the beArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBEUsuarios }
     *     
     */
    public ArrayOfBEUsuarios getBeArray() {
        return beArray;
    }

    /**
     * Sets the value of the beArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBEUsuarios }
     *     
     */
    public void setBeArray(ArrayOfBEUsuarios value) {
        this.beArray = value;
    }

}
