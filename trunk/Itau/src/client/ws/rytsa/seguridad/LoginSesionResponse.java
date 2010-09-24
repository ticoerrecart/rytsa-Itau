
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
 *         &lt;element name="LoginSesionResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beSesiones" type="{http://tempuri.org/}BESesiones" minOccurs="0"/>
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
    "loginSesionResult",
    "beSesiones"
})
@XmlRootElement(name = "LoginSesionResponse")
public class LoginSesionResponse {

    @XmlElement(name = "LoginSesionResult")
    protected BEEstado loginSesionResult;
    protected BESesiones beSesiones;

    /**
     * Gets the value of the loginSesionResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getLoginSesionResult() {
        return loginSesionResult;
    }

    /**
     * Sets the value of the loginSesionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setLoginSesionResult(BEEstado value) {
        this.loginSesionResult = value;
    }

    /**
     * Gets the value of the beSesiones property.
     * 
     * @return
     *     possible object is
     *     {@link BESesiones }
     *     
     */
    public BESesiones getBeSesiones() {
        return beSesiones;
    }

    /**
     * Sets the value of the beSesiones property.
     * 
     * @param value
     *     allowed object is
     *     {@link BESesiones }
     *     
     */
    public void setBeSesiones(BESesiones value) {
        this.beSesiones = value;
    }

}
