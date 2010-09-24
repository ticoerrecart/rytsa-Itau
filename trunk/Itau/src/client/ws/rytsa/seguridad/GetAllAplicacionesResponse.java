
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
 *         &lt;element name="GetAllAplicacionesResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beArray" type="{http://tempuri.org/}ArrayOfBEAplicaciones" minOccurs="0"/>
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
    "getAllAplicacionesResult",
    "beArray"
})
@XmlRootElement(name = "GetAllAplicacionesResponse")
public class GetAllAplicacionesResponse {

    @XmlElement(name = "GetAllAplicacionesResult")
    protected BEEstado getAllAplicacionesResult;
    protected ArrayOfBEAplicaciones beArray;

    /**
     * Gets the value of the getAllAplicacionesResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetAllAplicacionesResult() {
        return getAllAplicacionesResult;
    }

    /**
     * Sets the value of the getAllAplicacionesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetAllAplicacionesResult(BEEstado value) {
        this.getAllAplicacionesResult = value;
    }

    /**
     * Gets the value of the beArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBEAplicaciones }
     *     
     */
    public ArrayOfBEAplicaciones getBeArray() {
        return beArray;
    }

    /**
     * Sets the value of the beArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBEAplicaciones }
     *     
     */
    public void setBeArray(ArrayOfBEAplicaciones value) {
        this.beArray = value;
    }

}
