
package client.ws.rytsa.general;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BECategoriasImpuesto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BECategoriasImpuesto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BEWithID">
 *       &lt;sequence>
 *         &lt;element name="UltimaActualizacion" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Idtipoimpuesto" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Porcentaje" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="CodigoTipoImpuesto" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DescripcionTipoImpuesto" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BECategoriasImpuesto", propOrder = {
    "ultimaActualizacion"
})
public class BECategoriasImpuesto
    extends BEWithID
{

    @XmlElement(name = "UltimaActualizacion")
    protected byte[] ultimaActualizacion;
    @XmlAttribute(name = "Idtipoimpuesto", required = true)
    protected long idtipoimpuesto;
    @XmlAttribute(name = "Codigo")
    protected String codigo;
    @XmlAttribute(name = "Descripcion")
    protected String descripcion;
    @XmlAttribute(name = "Porcentaje", required = true)
    protected BigDecimal porcentaje;
    @XmlAttribute(name = "CodigoTipoImpuesto")
    protected String codigoTipoImpuesto;
    @XmlAttribute(name = "DescripcionTipoImpuesto")
    protected String descripcionTipoImpuesto;

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
     * Gets the value of the idtipoimpuesto property.
     * 
     */
    public long getIdtipoimpuesto() {
        return idtipoimpuesto;
    }

    /**
     * Sets the value of the idtipoimpuesto property.
     * 
     */
    public void setIdtipoimpuesto(long value) {
        this.idtipoimpuesto = value;
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
     * Gets the value of the porcentaje property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    /**
     * Sets the value of the porcentaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcentaje(BigDecimal value) {
        this.porcentaje = value;
    }

    /**
     * Gets the value of the codigoTipoImpuesto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTipoImpuesto() {
        return codigoTipoImpuesto;
    }

    /**
     * Sets the value of the codigoTipoImpuesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTipoImpuesto(String value) {
        this.codigoTipoImpuesto = value;
    }

    /**
     * Gets the value of the descripcionTipoImpuesto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionTipoImpuesto() {
        return descripcionTipoImpuesto;
    }

    /**
     * Sets the value of the descripcionTipoImpuesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionTipoImpuesto(String value) {
        this.descripcionTipoImpuesto = value;
    }

}
