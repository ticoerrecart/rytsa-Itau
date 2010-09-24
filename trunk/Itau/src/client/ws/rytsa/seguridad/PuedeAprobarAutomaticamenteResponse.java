
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
 *         &lt;element name="PuedeAprobarAutomaticamenteResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="valido" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "puedeAprobarAutomaticamenteResult",
    "valido"
})
@XmlRootElement(name = "PuedeAprobarAutomaticamenteResponse")
public class PuedeAprobarAutomaticamenteResponse {

    @XmlElement(name = "PuedeAprobarAutomaticamenteResult")
    protected BEEstado puedeAprobarAutomaticamenteResult;
    protected boolean valido;

    /**
     * Gets the value of the puedeAprobarAutomaticamenteResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getPuedeAprobarAutomaticamenteResult() {
        return puedeAprobarAutomaticamenteResult;
    }

    /**
     * Sets the value of the puedeAprobarAutomaticamenteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setPuedeAprobarAutomaticamenteResult(BEEstado value) {
        this.puedeAprobarAutomaticamenteResult = value;
    }

    /**
     * Gets the value of the valido property.
     * 
     */
    public boolean isValido() {
        return valido;
    }

    /**
     * Sets the value of the valido property.
     * 
     */
    public void setValido(boolean value) {
        this.valido = value;
    }

}
