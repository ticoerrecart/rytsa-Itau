
package client.ws.rytsa.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BETiposImpuesto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BETiposImpuesto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BEWithID">
 *       &lt;sequence>
 *         &lt;element name="UltimaActualizacion" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Idconcepto" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NombreConcepto" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CrearConceptoAutomaticamente" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BETiposImpuesto", propOrder = {
    "ultimaActualizacion"
})
public class BETiposImpuesto
    extends BEWithID
{

    @XmlElement(name = "UltimaActualizacion")
    protected byte[] ultimaActualizacion;
    @XmlAttribute(name = "Idconcepto", required = true)
    protected long idconcepto;
    @XmlAttribute(name = "Codigo")
    protected String codigo;
    @XmlAttribute(name = "Descripcion")
    protected String descripcion;
    @XmlAttribute(name = "NombreConcepto")
    protected String nombreConcepto;
    @XmlAttribute(name = "CrearConceptoAutomaticamente", required = true)
    protected boolean crearConceptoAutomaticamente;

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
     * Gets the value of the idconcepto property.
     * 
     */
    public long getIdconcepto() {
        return idconcepto;
    }

    /**
     * Sets the value of the idconcepto property.
     * 
     */
    public void setIdconcepto(long value) {
        this.idconcepto = value;
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
     * Gets the value of the nombreConcepto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreConcepto() {
        return nombreConcepto;
    }

    /**
     * Sets the value of the nombreConcepto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreConcepto(String value) {
        this.nombreConcepto = value;
    }

    /**
     * Gets the value of the crearConceptoAutomaticamente property.
     * 
     */
    public boolean isCrearConceptoAutomaticamente() {
        return crearConceptoAutomaticamente;
    }

    /**
     * Sets the value of the crearConceptoAutomaticamente property.
     * 
     */
    public void setCrearConceptoAutomaticamente(boolean value) {
        this.crearConceptoAutomaticamente = value;
    }

}
