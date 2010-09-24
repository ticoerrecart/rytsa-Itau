
package client.ws.rytsa.seguridad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BESesiones complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BESesiones">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BEBase">
 *       &lt;sequence>
 *         &lt;element name="UltimaActualizacion" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://microsoft.com/wsdl/types/}guid" />
 *       &lt;attribute name="IdUsuario" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="Ip" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FechaInicio" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="FechaFinalizacion" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="IdAplicacion" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BESesiones", propOrder = {
    "ultimaActualizacion"
})
public class BESesiones
    extends BEBase
{

    @XmlElement(name = "UltimaActualizacion")
    protected byte[] ultimaActualizacion;
    @XmlAttribute(name = "ID", required = true)
    protected String id;
    @XmlAttribute(name = "IdUsuario", required = true)
    protected long idUsuario;
    @XmlAttribute(name = "Ip")
    protected String ip;
    @XmlAttribute(name = "FechaInicio", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaInicio;
    @XmlAttribute(name = "FechaFinalizacion", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaFinalizacion;
    @XmlAttribute(name = "IdAplicacion", required = true)
    protected int idAplicacion;

    /**
     * Gets the value of the ultimaActualizacion property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getUltimaActualizacion() {
        return ultimaActualizacion;
    }

    /**
     * Sets the value of the ultimaActualizacion property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setUltimaActualizacion(byte[] value) {
        this.ultimaActualizacion = ((byte[]) value);
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
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
     * Gets the value of the ip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIp() {
        return ip;
    }

    /**
     * Sets the value of the ip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIp(String value) {
        this.ip = value;
    }

    /**
     * Gets the value of the fechaInicio property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Sets the value of the fechaInicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInicio(XMLGregorianCalendar value) {
        this.fechaInicio = value;
    }

    /**
     * Gets the value of the fechaFinalizacion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    /**
     * Sets the value of the fechaFinalizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaFinalizacion(XMLGregorianCalendar value) {
        this.fechaFinalizacion = value;
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

}
