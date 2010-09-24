
package client.ws.rytsa.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BETablaMaestra complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BETablaMaestra">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BEWithID">
 *       &lt;sequence>
 *         &lt;element name="UltimaActualizacion" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CodigoTabla" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CodigoDato" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Abreviatura" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BETablaMaestra", propOrder = {
    "ultimaActualizacion"
})
public class BETablaMaestra
    extends BEWithID
{

    @XmlElement(name = "UltimaActualizacion")
    protected byte[] ultimaActualizacion;
    @XmlAttribute(name = "CodigoTabla")
    protected String codigoTabla;
    @XmlAttribute(name = "CodigoDato")
    protected String codigoDato;
    @XmlAttribute(name = "Descripcion")
    protected String descripcion;
    @XmlAttribute(name = "Abreviatura")
    protected String abreviatura;

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
     * Gets the value of the codigoTabla property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTabla() {
        return codigoTabla;
    }

    /**
     * Sets the value of the codigoTabla property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTabla(String value) {
        this.codigoTabla = value;
    }

    /**
     * Gets the value of the codigoDato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDato() {
        return codigoDato;
    }

    /**
     * Sets the value of the codigoDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDato(String value) {
        this.codigoDato = value;
    }

    /**
     * Gets the value of the descripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the abreviatura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbreviatura() {
        return abreviatura;
    }

    /**
     * Sets the value of the abreviatura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbreviatura(String value) {
        this.abreviatura = value;
    }

}
