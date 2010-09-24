
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
 *         &lt;element name="idSesion" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="idUsuarioSiopel" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="informar_inicio_interface_siopel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="informar_importacion_precios" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "idUsuarioSiopel",
    "informarInicioInterfaceSiopel",
    "informarImportacionPrecios"
})
@XmlRootElement(name = "SetInterfaceSiopel")
public class SetInterfaceSiopel {

    @XmlElement(required = true)
    protected String idSesion;
    protected long idUsuarioSiopel;
    @XmlElement(name = "informar_inicio_interface_siopel")
    protected boolean informarInicioInterfaceSiopel;
    @XmlElement(name = "informar_importacion_precios")
    protected boolean informarImportacionPrecios;

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
     * Gets the value of the idUsuarioSiopel property.
     * 
     */
    public long getIdUsuarioSiopel() {
        return idUsuarioSiopel;
    }

    /**
     * Sets the value of the idUsuarioSiopel property.
     * 
     */
    public void setIdUsuarioSiopel(long value) {
        this.idUsuarioSiopel = value;
    }

    /**
     * Gets the value of the informarInicioInterfaceSiopel property.
     * 
     */
    public boolean isInformarInicioInterfaceSiopel() {
        return informarInicioInterfaceSiopel;
    }

    /**
     * Sets the value of the informarInicioInterfaceSiopel property.
     * 
     */
    public void setInformarInicioInterfaceSiopel(boolean value) {
        this.informarInicioInterfaceSiopel = value;
    }

    /**
     * Gets the value of the informarImportacionPrecios property.
     * 
     */
    public boolean isInformarImportacionPrecios() {
        return informarImportacionPrecios;
    }

    /**
     * Sets the value of the informarImportacionPrecios property.
     * 
     */
    public void setInformarImportacionPrecios(boolean value) {
        this.informarImportacionPrecios = value;
    }

}
