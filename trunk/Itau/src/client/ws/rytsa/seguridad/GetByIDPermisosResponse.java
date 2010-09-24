
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
 *         &lt;element name="GetByIDPermisosResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="bePermisos" type="{http://tempuri.org/}BEPermisos" minOccurs="0"/>
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
    "getByIDPermisosResult",
    "bePermisos"
})
@XmlRootElement(name = "GetByIDPermisosResponse")
public class GetByIDPermisosResponse {

    @XmlElement(name = "GetByIDPermisosResult")
    protected BEEstado getByIDPermisosResult;
    protected BEPermisos bePermisos;

    /**
     * Gets the value of the getByIDPermisosResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGetByIDPermisosResult() {
        return getByIDPermisosResult;
    }

    /**
     * Sets the value of the getByIDPermisosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGetByIDPermisosResult(BEEstado value) {
        this.getByIDPermisosResult = value;
    }

    /**
     * Gets the value of the bePermisos property.
     * 
     * @return
     *     possible object is
     *     {@link BEPermisos }
     *     
     */
    public BEPermisos getBePermisos() {
        return bePermisos;
    }

    /**
     * Sets the value of the bePermisos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEPermisos }
     *     
     */
    public void setBePermisos(BEPermisos value) {
        this.bePermisos = value;
    }

}
