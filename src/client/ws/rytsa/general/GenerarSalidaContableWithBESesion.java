
package client.ws.rytsa.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="beSesion" type="{http://tempuri.org/}BESesiones" minOccurs="0"/>
 *         &lt;element name="idProceso" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="infoAdicional" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "beSesion",
    "idProceso",
    "infoAdicional"
})
@XmlRootElement(name = "GenerarSalidaContableWithBESesion")
public class GenerarSalidaContableWithBESesion {

    protected BESesiones beSesion;
    protected int idProceso;
    protected boolean infoAdicional;

    /**
     * Gets the value of the beSesion property.
     * 
     * @return
     *     possible object is
     *     {@link BESesiones }
     *     
     */
    public BESesiones getBeSesion() {
        return beSesion;
    }

    /**
     * Sets the value of the beSesion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BESesiones }
     *     
     */
    public void setBeSesion(BESesiones value) {
        this.beSesion = value;
    }

    /**
     * Gets the value of the idProceso property.
     * 
     */
    public int getIdProceso() {
        return idProceso;
    }

    /**
     * Sets the value of the idProceso property.
     * 
     */
    public void setIdProceso(int value) {
        this.idProceso = value;
    }

    /**
     * Gets the value of the infoAdicional property.
     * 
     */
    public boolean isInfoAdicional() {
        return infoAdicional;
    }

    /**
     * Sets the value of the infoAdicional property.
     * 
     */
    public void setInfoAdicional(boolean value) {
        this.infoAdicional = value;
    }

}
