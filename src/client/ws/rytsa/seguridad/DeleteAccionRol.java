
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
 *         &lt;element name="beAccionRol" type="{http://tempuri.org/}BEAccionRol" minOccurs="0"/>
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
    "beAccionRol"
})
@XmlRootElement(name = "DeleteAccionRol")
public class DeleteAccionRol {

    @XmlElement(required = true)
    protected String idSesion;
    protected BEAccionRol beAccionRol;

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
     * Gets the value of the beAccionRol property.
     * 
     * @return
     *     possible object is
     *     {@link BEAccionRol }
     *     
     */
    public BEAccionRol getBeAccionRol() {
        return beAccionRol;
    }

    /**
     * Sets the value of the beAccionRol property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEAccionRol }
     *     
     */
    public void setBeAccionRol(BEAccionRol value) {
        this.beAccionRol = value;
    }

}
