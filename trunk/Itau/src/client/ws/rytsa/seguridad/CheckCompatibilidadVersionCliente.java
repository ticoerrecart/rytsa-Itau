
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
 *         &lt;element name="Idaplicacion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="VersionCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idaplicacion",
    "versionCliente"
})
@XmlRootElement(name = "CheckCompatibilidadVersionCliente")
public class CheckCompatibilidadVersionCliente {

    @XmlElement(name = "Idaplicacion")
    protected long idaplicacion;
    @XmlElement(name = "VersionCliente")
    protected String versionCliente;

    /**
     * Gets the value of the idaplicacion property.
     * 
     */
    public long getIdaplicacion() {
        return idaplicacion;
    }

    /**
     * Sets the value of the idaplicacion property.
     * 
     */
    public void setIdaplicacion(long value) {
        this.idaplicacion = value;
    }

    /**
     * Gets the value of the versionCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionCliente() {
        return versionCliente;
    }

    /**
     * Sets the value of the versionCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionCliente(String value) {
        this.versionCliente = value;
    }

}
