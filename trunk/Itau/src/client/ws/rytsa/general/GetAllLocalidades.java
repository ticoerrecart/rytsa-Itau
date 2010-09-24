
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
 *         &lt;element name="Idpais" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Idprovincia" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoProvincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Totalrecord" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "idpais",
    "idprovincia",
    "codigo",
    "codigoPais",
    "codigoProvincia",
    "totalrecord"
})
@XmlRootElement(name = "GetAllLocalidades")
public class GetAllLocalidades {

    @XmlElement(required = true)
    protected String idSesion;
    @XmlElement(name = "Lastrecord")
    protected long lastrecord;
    @XmlElement(name = "Maxrecord")
    protected long maxrecord;
    @XmlElement(name = "Idpais")
    protected long idpais;
    @XmlElement(name = "Idprovincia")
    protected long idprovincia;
    @XmlElement(name = "Codigo")
    protected String codigo;
    @XmlElement(name = "CodigoPais")
    protected String codigoPais;
    @XmlElement(name = "CodigoProvincia")
    protected String codigoProvincia;
    @XmlElement(name = "Totalrecord")
    protected long totalrecord;

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
     * Gets the value of the idprovincia property.
     * 
     */
    public long getIdprovincia() {
        return idprovincia;
    }

    /**
     * Sets the value of the idprovincia property.
     * 
     */
    public void setIdprovincia(long value) {
        this.idprovincia = value;
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
     * Gets the value of the codigoProvincia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoProvincia() {
        return codigoProvincia;
    }

    /**
     * Sets the value of the codigoProvincia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoProvincia(String value) {
        this.codigoProvincia = value;
    }

    /**
     * Gets the value of the totalrecord property.
     * 
     */
    public long getTotalrecord() {
        return totalrecord;
    }

    /**
     * Sets the value of the totalrecord property.
     * 
     */
    public void setTotalrecord(long value) {
        this.totalrecord = value;
    }

}
