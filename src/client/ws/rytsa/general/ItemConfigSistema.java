
package client.ws.rytsa.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemConfigSistema complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemConfigSistema">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="T_Session" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="T_Refresco_Mensajes" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="T_Alerta_Mensajes" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="T_Estado_Sistema" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="T_Permisos" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemConfigSistema", propOrder = {
    "tSession",
    "tRefrescoMensajes",
    "tAlertaMensajes",
    "tEstadoSistema",
    "tPermisos"
})
public class ItemConfigSistema {

    @XmlElement(name = "T_Session")
    protected long tSession;
    @XmlElement(name = "T_Refresco_Mensajes")
    protected long tRefrescoMensajes;
    @XmlElement(name = "T_Alerta_Mensajes")
    protected long tAlertaMensajes;
    @XmlElement(name = "T_Estado_Sistema")
    protected long tEstadoSistema;
    @XmlElement(name = "T_Permisos")
    protected long tPermisos;

    /**
     * Gets the value of the tSession property.
     * 
     */
    public long getTSession() {
        return tSession;
    }

    /**
     * Sets the value of the tSession property.
     * 
     */
    public void setTSession(long value) {
        this.tSession = value;
    }

    /**
     * Gets the value of the tRefrescoMensajes property.
     * 
     */
    public long getTRefrescoMensajes() {
        return tRefrescoMensajes;
    }

    /**
     * Sets the value of the tRefrescoMensajes property.
     * 
     */
    public void setTRefrescoMensajes(long value) {
        this.tRefrescoMensajes = value;
    }

    /**
     * Gets the value of the tAlertaMensajes property.
     * 
     */
    public long getTAlertaMensajes() {
        return tAlertaMensajes;
    }

    /**
     * Sets the value of the tAlertaMensajes property.
     * 
     */
    public void setTAlertaMensajes(long value) {
        this.tAlertaMensajes = value;
    }

    /**
     * Gets the value of the tEstadoSistema property.
     * 
     */
    public long getTEstadoSistema() {
        return tEstadoSistema;
    }

    /**
     * Sets the value of the tEstadoSistema property.
     * 
     */
    public void setTEstadoSistema(long value) {
        this.tEstadoSistema = value;
    }

    /**
     * Gets the value of the tPermisos property.
     * 
     */
    public long getTPermisos() {
        return tPermisos;
    }

    /**
     * Sets the value of the tPermisos property.
     * 
     */
    public void setTPermisos(long value) {
        this.tPermisos = value;
    }

}
