
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
 *         &lt;element name="UpdateAdministracionUsuariosResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beNueva" type="{http://tempuri.org/}BEUsuarios" minOccurs="0"/>
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
    "updateAdministracionUsuariosResult",
    "beNueva"
})
@XmlRootElement(name = "UpdateAdministracionUsuariosResponse")
public class UpdateAdministracionUsuariosResponse {

    @XmlElement(name = "UpdateAdministracionUsuariosResult")
    protected BEEstado updateAdministracionUsuariosResult;
    protected BEUsuarios beNueva;

    /**
     * Gets the value of the updateAdministracionUsuariosResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getUpdateAdministracionUsuariosResult() {
        return updateAdministracionUsuariosResult;
    }

    /**
     * Sets the value of the updateAdministracionUsuariosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setUpdateAdministracionUsuariosResult(BEEstado value) {
        this.updateAdministracionUsuariosResult = value;
    }

    /**
     * Gets the value of the beNueva property.
     * 
     * @return
     *     possible object is
     *     {@link BEUsuarios }
     *     
     */
    public BEUsuarios getBeNueva() {
        return beNueva;
    }

    /**
     * Sets the value of the beNueva property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEUsuarios }
     *     
     */
    public void setBeNueva(BEUsuarios value) {
        this.beNueva = value;
    }

}
