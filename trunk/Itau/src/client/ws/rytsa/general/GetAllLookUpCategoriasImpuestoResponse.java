
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
 *         &lt;element name="GetAllLookUpCategoriasImpuestoResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beArray" type="{http://tempuri.org/}ArrayOfBECategoriasImpuesto" minOccurs="0"/>
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
    "getAllLookUpCategoriasImpuestoResult",
    "beArray"
})
@XmlRootElement(name = "GetAllLookUpCategoriasImpuestoResponse")
public class GetAllLookUpCategoriasImpuestoResponse {

    @XmlElement(name = "GetAllLookUpCategoriasImpuestoResult")
    protected BEEstado getAllLookUpCategoriasImpuestoResult;
    protected ArrayOfBECategoriasImpuesto beArray;

    /**
     * Gets the value of the getAllLookUpCategoriasImpuestoResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetAllLookUpCategoriasImpuestoResult() {
        return getAllLookUpCategoriasImpuestoResult;
    }

    /**
     * Sets the value of the getAllLookUpCategoriasImpuestoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetAllLookUpCategoriasImpuestoResult(BEEstado value) {
        this.getAllLookUpCategoriasImpuestoResult = value;
    }

    /**
     * Gets the value of the beArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBECategoriasImpuesto }
     *     
     */
    public ArrayOfBECategoriasImpuesto getBeArray() {
        return beArray;
    }

    /**
     * Sets the value of the beArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBECategoriasImpuesto }
     *     
     */
    public void setBeArray(ArrayOfBECategoriasImpuesto value) {
        this.beArray = value;
    }

}
