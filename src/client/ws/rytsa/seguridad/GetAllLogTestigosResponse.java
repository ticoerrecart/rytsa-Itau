
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
 *         &lt;element name="GetAllLogTestigosResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beArray" type="{http://tempuri.org/}ArrayOfBELog" minOccurs="0"/>
 *         &lt;element name="totalrecord" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "getAllLogTestigosResult",
    "beArray",
    "totalrecord"
})
@XmlRootElement(name = "GetAllLogTestigosResponse")
public class GetAllLogTestigosResponse {

    @XmlElement(name = "GetAllLogTestigosResult")
    protected BEEstado getAllLogTestigosResult;
    protected ArrayOfBELog beArray;
    protected long totalrecord;

    /**
     * Gets the value of the getAllLogTestigosResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetAllLogTestigosResult() {
        return getAllLogTestigosResult;
    }

    /**
     * Sets the value of the getAllLogTestigosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetAllLogTestigosResult(BEEstado value) {
        this.getAllLogTestigosResult = value;
    }

    /**
     * Gets the value of the beArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBELog }
     *     
     */
    public ArrayOfBELog getBeArray() {
        return beArray;
    }

    /**
     * Sets the value of the beArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBELog }
     *     
     */
    public void setBeArray(ArrayOfBELog value) {
        this.beArray = value;
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

}
