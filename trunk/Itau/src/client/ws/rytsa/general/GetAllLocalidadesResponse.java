
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
 *         &lt;element name="GetAllLocalidadesResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="Totalrecord" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="beArray" type="{http://tempuri.org/}ArrayOfBELocalidades" minOccurs="0"/>
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
    "getAllLocalidadesResult",
    "totalrecord",
    "beArray"
})
@XmlRootElement(name = "GetAllLocalidadesResponse")
public class GetAllLocalidadesResponse {

    @XmlElement(name = "GetAllLocalidadesResult")
    protected BEEstado getAllLocalidadesResult;
    @XmlElement(name = "Totalrecord")
    protected long totalrecord;
    protected ArrayOfBELocalidades beArray;

    /**
     * Gets the value of the getAllLocalidadesResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetAllLocalidadesResult() {
        return getAllLocalidadesResult;
    }

    /**
     * Sets the value of the getAllLocalidadesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetAllLocalidadesResult(BEEstado value) {
        this.getAllLocalidadesResult = value;
    }

    /**
     * Gets the value of the totalrecord property.
     * 
     */
    public long getTotalrecord() {
        return totalrecord;
    }

    /**
     * Sets the value of the totalrecord property.
     * 
     */
    public void setTotalrecord(long value) {
        this.totalrecord = value;
    }

    /**
     * Gets the value of the beArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBELocalidades }
     *     
     */
    public ArrayOfBELocalidades getBeArray() {
        return beArray;
    }

    /**
     * Sets the value of the beArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBELocalidades }
     *     
     */
    public void setBeArray(ArrayOfBELocalidades value) {
        this.beArray = value;
    }

}
