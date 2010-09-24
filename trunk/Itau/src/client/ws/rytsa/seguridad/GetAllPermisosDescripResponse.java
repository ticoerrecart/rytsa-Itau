
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
 *         &lt;element name="GetAllPermisosDescripResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beArray" type="{http://tempuri.org/}ArrayOfBEPermisos" minOccurs="0"/>
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
    "getAllPermisosDescripResult",
    "beArray"
})
@XmlRootElement(name = "GetAllPermisosDescripResponse")
public class GetAllPermisosDescripResponse {

    @XmlElement(name = "GetAllPermisosDescripResult")
    protected BEEstado getAllPermisosDescripResult;
    protected ArrayOfBEPermisos beArray;

    /**
     * Gets the value of the getAllPermisosDescripResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetAllPermisosDescripResult() {
        return getAllPermisosDescripResult;
    }

    /**
     * Sets the value of the getAllPermisosDescripResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetAllPermisosDescripResult(BEEstado value) {
        this.getAllPermisosDescripResult = value;
    }

    /**
     * Gets the value of the beArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBEPermisos }
     *     
     */
    public ArrayOfBEPermisos getBeArray() {
        return beArray;
    }

    /**
     * Sets the value of the beArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBEPermisos }
     *     
     */
    public void setBeArray(ArrayOfBEPermisos value) {
        this.beArray = value;
    }

}
