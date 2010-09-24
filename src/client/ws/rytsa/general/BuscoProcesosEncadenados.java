
package client.ws.rytsa.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="idAccion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TipoEvento" type="{http://tempuri.org/}TipoEvento"/>
 *         &lt;element name="beEstado" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
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
    "fecha",
    "idAccion",
    "tipoEvento",
    "beEstado"
})
@XmlRootElement(name = "BuscoProcesosEncadenados")
public class BuscoProcesosEncadenados {

    @XmlElement(required = true)
    protected String idSesion;
    @XmlElement(name = "Fecha", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    protected long idAccion;
    @XmlElement(name = "TipoEvento", required = true)
    protected TipoEvento tipoEvento;
    protected BEEstado beEstado;

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
     * Gets the value of the fecha property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the idAccion property.
     * 
     */
    public long getIdAccion() {
        return idAccion;
    }

    /**
     * Sets the value of the idAccion property.
     * 
     */
    public void setIdAccion(long value) {
        this.idAccion = value;
    }

    /**
     * Gets the value of the tipoEvento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEvento }
     *     
     */
    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    /**
     * Sets the value of the tipoEvento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEvento }
     *     
     */
    public void setTipoEvento(TipoEvento value) {
        this.tipoEvento = value;
    }

    /**
     * Gets the value of the beEstado property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getBeEstado() {
        return beEstado;
    }

    /**
     * Sets the value of the beEstado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setBeEstado(BEEstado value) {
        this.beEstado = value;
    }

}
