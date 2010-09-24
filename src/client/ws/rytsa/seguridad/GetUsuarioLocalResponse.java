
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
 *         &lt;element name="GetUsuarioLocalResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
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
    "getUsuarioLocalResult",
    "beArray"
})
@XmlRootElement(name = "GetUsuarioLocalResponse")
public class GetUsuarioLocalResponse {

    @XmlElement(name = "GetUsuarioLocalResult")
    protected BEEstado getUsuarioLocalResult;
    protected ArrayOfBEUsuarios beArray;

    /**
     * Gets the value of the getUsuarioLocalResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetUsuarioLocalResult() {
        return getUsuarioLocalResult;
    }

    /**
     * Sets the value of the getUsuarioLocalResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetUsuarioLocalResult(BEEstado value) {
        this.getUsuarioLocalResult = value;
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
