
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
 *         &lt;element name="Lastrecord" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Maxrecord" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Idpais" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CodigoPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoCajaValores" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "lastrecord",
    "maxrecord",
    "codigo",
    "idpais",
    "codigoPais",
    "codigoCajaValores"
})
@XmlRootElement(name = "GetAllProvincias")
public class GetAllProvincias {

    @XmlElement(required = true)
    protected String idSesion;
    @XmlElement(name = "Lastrecord")
    protected long lastrecord;
    @XmlElement(name = "Maxrecord")
    protected long maxrecord;
    @XmlElement(name = "Codigo")
    protected String codigo;
    @XmlElement(name = "Idpais")
    protected long idpais;
    @XmlElement(name = "CodigoPais")
    protected String codigoPais;
    @XmlElement(name = "CodigoCajaValores")
    protected String codigoCajaValores;

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
     * Gets the value of the lastrecord property.
     * 
     */
    public long getLastrecord() {
        return lastrecord;
    }

    /**
     * Sets the value of the lastrecord property.
     * 
     */
    public void setLastrecord(long value) {
        this.lastrecord = value;
    }

    /**
     * Gets the value of the maxrecord property.
     * 
     */
    public long getMaxrecord() {
        return maxrecord;
    }

    /**
     * Sets the value of the maxrecord property.
     * 
     */
    public void setMaxrecord(long value) {
        this.maxrecord = value;
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
     * Gets the value of the idpais property.
     * 
     */
    public long getIdpais() {
        return idpais;
    }

    /**
     * Sets the value of the idpais property.
     * 
     */
    public void setIdpais(long value) {
        this.idpais = value;
    }

    /**
     * Gets the value of the codigoPais property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPais() {
        return codigoPais;
    }

    /**
     * Sets the value of the codigoPais property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPais(String value) {
        this.codigoPais = value;
    }

    /**
     * Gets the value of the codigoCajaValores property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCajaValores() {
        return codigoCajaValores;
    }

    /**
     * Sets the value of the codigoCajaValores property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCajaValores(String value) {
        this.codigoCajaValores = value;
    }

}
