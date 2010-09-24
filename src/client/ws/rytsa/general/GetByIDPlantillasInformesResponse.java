
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
 *         &lt;element name="GetByIDPlantillas_informesResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="be" type="{http://tempuri.org/}BEPlantillas_informes" minOccurs="0"/>
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
    "getByIDPlantillasInformesResult",
    "be"
})
@XmlRootElement(name = "GetByIDPlantillas_informesResponse")
public class GetByIDPlantillasInformesResponse {

    @XmlElement(name = "GetByIDPlantillas_informesResult")
    protected BEEstado getByIDPlantillasInformesResult;
    protected BEPlantillasInformes be;

    /**
     * Gets the value of the getByIDPlantillasInformesResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetByIDPlantillasInformesResult() {
        return getByIDPlantillasInformesResult;
    }

    /**
     * Sets the value of the getByIDPlantillasInformesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetByIDPlantillasInformesResult(BEEstado value) {
        this.getByIDPlantillasInformesResult = value;
    }

    /**
     * Gets the value of the be property.
     * 
     * @return
     *     possible object is
     *     {@link BEPlantillasInformes }
     *     
     */
    public BEPlantillasInformes getBe() {
        return be;
    }

    /**
     * Sets the value of the be property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEPlantillasInformes }
     *     
     */
    public void setBe(BEPlantillasInformes value) {
        this.be = value;
    }

}
