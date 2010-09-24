
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
 *         &lt;element name="GetAllLookUpPlantillas_informesResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beArray" type="{http://tempuri.org/}ArrayOfBEPlantillas_informes" minOccurs="0"/>
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
    "getAllLookUpPlantillasInformesResult",
    "beArray"
})
@XmlRootElement(name = "GetAllLookUpPlantillas_informesResponse")
public class GetAllLookUpPlantillasInformesResponse {

    @XmlElement(name = "GetAllLookUpPlantillas_informesResult")
    protected BEEstado getAllLookUpPlantillasInformesResult;
    protected ArrayOfBEPlantillasInformes beArray;

    /**
     * Gets the value of the getAllLookUpPlantillasInformesResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetAllLookUpPlantillasInformesResult() {
        return getAllLookUpPlantillasInformesResult;
    }

    /**
     * Sets the value of the getAllLookUpPlantillasInformesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetAllLookUpPlantillasInformesResult(BEEstado value) {
        this.getAllLookUpPlantillasInformesResult = value;
    }

    /**
     * Gets the value of the beArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBEPlantillasInformes }
     *     
     */
    public ArrayOfBEPlantillasInformes getBeArray() {
        return beArray;
    }

    /**
     * Sets the value of the beArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBEPlantillasInformes }
     *     
     */
    public void setBeArray(ArrayOfBEPlantillasInformes value) {
        this.beArray = value;
    }

}
