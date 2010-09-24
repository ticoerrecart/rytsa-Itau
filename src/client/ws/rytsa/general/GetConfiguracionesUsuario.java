
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
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idAplicacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdEscritorio" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "idUsuario",
    "idAplicacion",
    "codigo",
    "idEscritorio"
})
@XmlRootElement(name = "GetConfiguraciones_usuario")
public class GetConfiguracionesUsuario {

    @XmlElement(required = true)
    protected String idSesion;
    protected long idUsuario;
    protected int idAplicacion;
    protected String codigo;
    @XmlElement(name = "IdEscritorio")
    protected long idEscritorio;

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
     * Gets the value of the idUsuario property.
     * 
     */
    public long getIdUsuario() {
        return idUsuario;
    }

    /**
     * Sets the value of the idUsuario property.
     * 
     */
    public void setIdUsuario(long value) {
        this.idUsuario = value;
    }

    /**
     * Gets the value of the idAplicacion property.
     * 
     */
    public int getIdAplicacion() {
        return idAplicacion;
    }

    /**
     * Sets the value of the idAplicacion property.
     * 
     */
    public void setIdAplicacion(int value) {
        this.idAplicacion = value;
    }

    /**
     * Gets the value of the codigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the idEscritorio property.
     * 
     */
    public long getIdEscritorio() {
        return idEscritorio;
    }

    /**
     * Sets the value of the idEscritorio property.
     * 
     */
    public void setIdEscritorio(long value) {
        this.idEscritorio = value;
    }

}
