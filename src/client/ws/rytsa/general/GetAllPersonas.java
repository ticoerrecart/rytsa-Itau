
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
 *         &lt;element name="BuscarNrodocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuscarNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Idtipodocumento" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TipoPersona" type="{http://tempuri.org/}Tipopersona"/>
 *         &lt;element name="Codigotipodocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nrodocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Idparticipante" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Idgrupoeconomico" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="totalrecord" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "buscarNrodocumento",
    "buscarNombre",
    "idtipodocumento",
    "tipoPersona",
    "codigotipodocumento",
    "nrodocumento",
    "idparticipante",
    "idgrupoeconomico",
    "totalrecord"
})
@XmlRootElement(name = "GetAllPersonas")
public class GetAllPersonas {

    @XmlElement(required = true)
    protected String idSesion;
    @XmlElement(name = "Lastrecord")
    protected long lastrecord;
    @XmlElement(name = "Maxrecord")
    protected long maxrecord;
    @XmlElement(name = "BuscarNrodocumento")
    protected String buscarNrodocumento;
    @XmlElement(name = "BuscarNombre")
    protected String buscarNombre;
    @XmlElement(name = "Idtipodocumento")
    protected long idtipodocumento;
    @XmlElement(name = "TipoPersona", required = true)
    protected Tipopersona tipoPersona;
    @XmlElement(name = "Codigotipodocumento")
    protected String codigotipodocumento;
    @XmlElement(name = "Nrodocumento")
    protected String nrodocumento;
    @XmlElement(name = "Idparticipante")
    protected long idparticipante;
    @XmlElement(name = "Idgrupoeconomico")
    protected long idgrupoeconomico;
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
     * Gets the value of the buscarNrodocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuscarNrodocumento() {
        return buscarNrodocumento;
    }

    /**
     * Sets the value of the buscarNrodocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuscarNrodocumento(String value) {
        this.buscarNrodocumento = value;
    }

    /**
     * Gets the value of the buscarNombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuscarNombre() {
        return buscarNombre;
    }

    /**
     * Sets the value of the buscarNombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuscarNombre(String value) {
        this.buscarNombre = value;
    }

    /**
     * Gets the value of the idtipodocumento property.
     * 
     */
    public long getIdtipodocumento() {
        return idtipodocumento;
    }

    /**
     * Sets the value of the idtipodocumento property.
     * 
     */
    public void setIdtipodocumento(long value) {
        this.idtipodocumento = value;
    }

    /**
     * Gets the value of the tipoPersona property.
     * 
     * @return
     *     possible object is
     *     {@link Tipopersona }
     *     
     */
    public Tipopersona getTipoPersona() {
        return tipoPersona;
    }

    /**
     * Sets the value of the tipoPersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tipopersona }
     *     
     */
    public void setTipoPersona(Tipopersona value) {
        this.tipoPersona = value;
    }

    /**
     * Gets the value of the codigotipodocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigotipodocumento() {
        return codigotipodocumento;
    }

    /**
     * Sets the value of the codigotipodocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigotipodocumento(String value) {
        this.codigotipodocumento = value;
    }

    /**
     * Gets the value of the nrodocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrodocumento() {
        return nrodocumento;
    }

    /**
     * Sets the value of the nrodocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrodocumento(String value) {
        this.nrodocumento = value;
    }

    /**
     * Gets the value of the idparticipante property.
     * 
     */
    public long getIdparticipante() {
        return idparticipante;
    }

    /**
     * Sets the value of the idparticipante property.
     * 
     */
    public void setIdparticipante(long value) {
        this.idparticipante = value;
    }

    /**
     * Gets the value of the idgrupoeconomico property.
     * 
     */
    public long getIdgrupoeconomico() {
        return idgrupoeconomico;
    }

    /**
     * Sets the value of the idgrupoeconomico property.
     * 
     */
    public void setIdgrupoeconomico(long value) {
        this.idgrupoeconomico = value;
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
