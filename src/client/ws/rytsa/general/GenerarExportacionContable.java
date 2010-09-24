
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
 *         &lt;element name="idUsuarioGeneracion" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "idUsuarioGeneracion"
})
@XmlRootElement(name = "GenerarExportacionContable")
public class GenerarExportacionContable {

    protected BESesiones beSesion;
    protected long idUsuarioGeneracion;

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
     * Gets the value of the idUsuarioGeneracion property.
     * 
     */
    public long getIdUsuarioGeneracion() {
        return idUsuarioGeneracion;
    }

    /**
     * Sets the value of the idUsuarioGeneracion property.
     * 
     */
    public void setIdUsuarioGeneracion(long value) {
        this.idUsuarioGeneracion = value;
    }

}
