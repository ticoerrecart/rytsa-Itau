
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
 *         &lt;element name="idSesion" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="beOriginal" type="{http://tempuri.org/}BEAccionRol" minOccurs="0"/>
 *         &lt;element name="beNueva" type="{http://tempuri.org/}BEAccionRol" minOccurs="0"/>
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
    "idSesion",
    "beOriginal",
    "beNueva"
})
@XmlRootElement(name = "UpdateAccionRol")
public class UpdateAccionRol {

    @XmlElement(required = true)
    protected String idSesion;
    protected BEAccionRol beOriginal;
    protected BEAccionRol beNueva;

    /**
     * Gets the value of the idSesion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSesion() {
        return idSesion;
    }

    /**
     * Sets the value of the idSesion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSesion(String value) {
        this.idSesion = value;
    }

    /**
     * Gets the value of the beOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link BEAccionRol }
     *     
     */
    public BEAccionRol getBeOriginal() {
        return beOriginal;
    }

    /**
     * Sets the value of the beOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEAccionRol }
     *     
     */
    public void setBeOriginal(BEAccionRol value) {
        this.beOriginal = value;
    }

    /**
     * Gets the value of the beNueva property.
     * 
     * @return
     *     possible object is
     *     {@link BEAccionRol }
     *     
     */
    public BEAccionRol getBeNueva() {
        return beNueva;
    }

    /**
     * Sets the value of the beNueva property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEAccionRol }
     *     
     */
    public void setBeNueva(BEAccionRol value) {
        this.beNueva = value;
    }

}
