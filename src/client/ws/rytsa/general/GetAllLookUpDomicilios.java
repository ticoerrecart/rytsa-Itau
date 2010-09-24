
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
 *         &lt;element name="lastRecord" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="maxRecord" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TipoEntidad" type="{http://tempuri.org/}TipoEntidadDomicilios"/>
 *         &lt;element name="Identidad" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TipoDomicilio" type="{http://tempuri.org/}TipoDomicilio"/>
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
    "lastRecord",
    "maxRecord",
    "tipoEntidad",
    "identidad",
    "tipoDomicilio"
})
@XmlRootElement(name = "GetAllLookUpDomicilios")
public class GetAllLookUpDomicilios {

    @XmlElement(required = true)
    protected String idSesion;
    protected long lastRecord;
    protected long maxRecord;
    @XmlElement(name = "TipoEntidad", required = true)
    protected TipoEntidadDomicilios tipoEntidad;
    @XmlElement(name = "Identidad")
    protected long identidad;
    @XmlElement(name = "TipoDomicilio", required = true)
    protected TipoDomicilio tipoDomicilio;

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
     * Gets the value of the lastRecord property.
     * 
     */
    public long getLastRecord() {
        return lastRecord;
    }

    /**
     * Sets the value of the lastRecord property.
     * 
     */
    public void setLastRecord(long value) {
        this.lastRecord = value;
    }

    /**
     * Gets the value of the maxRecord property.
     * 
     */
    public long getMaxRecord() {
        return maxRecord;
    }

    /**
     * Sets the value of the maxRecord property.
     * 
     */
    public void setMaxRecord(long value) {
        this.maxRecord = value;
    }

    /**
     * Gets the value of the tipoEntidad property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEntidadDomicilios }
     *     
     */
    public TipoEntidadDomicilios getTipoEntidad() {
        return tipoEntidad;
    }

    /**
     * Sets the value of the tipoEntidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEntidadDomicilios }
     *     
     */
    public void setTipoEntidad(TipoEntidadDomicilios value) {
        this.tipoEntidad = value;
    }

    /**
     * Gets the value of the identidad property.
     * 
     */
    public long getIdentidad() {
        return identidad;
    }

    /**
     * Sets the value of the identidad property.
     * 
     */
    public void setIdentidad(long value) {
        this.identidad = value;
    }

    /**
     * Gets the value of the tipoDomicilio property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDomicilio }
     *     
     */
    public TipoDomicilio getTipoDomicilio() {
        return tipoDomicilio;
    }

    /**
     * Sets the value of the tipoDomicilio property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDomicilio }
     *     
     */
    public void setTipoDomicilio(TipoDomicilio value) {
        this.tipoDomicilio = value;
    }

}
