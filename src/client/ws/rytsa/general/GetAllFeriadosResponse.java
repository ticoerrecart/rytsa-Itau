
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
 *         &lt;element name="GetAllFeriadosResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beArray" type="{http://tempuri.org/}ArrayOfBEFeriados" minOccurs="0"/>
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
    "getAllFeriadosResult",
    "beArray"
})
@XmlRootElement(name = "GetAllFeriadosResponse")
public class GetAllFeriadosResponse {

    @XmlElement(name = "GetAllFeriadosResult")
    protected BEEstado getAllFeriadosResult;
    protected ArrayOfBEFeriados beArray;

    /**
     * Gets the value of the getAllFeriadosResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetAllFeriadosResult() {
        return getAllFeriadosResult;
    }

    /**
     * Sets the value of the getAllFeriadosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetAllFeriadosResult(BEEstado value) {
        this.getAllFeriadosResult = value;
    }

    /**
     * Gets the value of the beArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBEFeriados }
     *     
     */
    public ArrayOfBEFeriados getBeArray() {
        return beArray;
    }

    /**
     * Sets the value of the beArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBEFeriados }
     *     
     */
    public void setBeArray(ArrayOfBEFeriados value) {
        this.beArray = value;
    }

}
