
package client.ws.rytsa.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BEParametros complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BEParametros">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BEWithID">
 *       &lt;sequence>
 *         &lt;element name="UltimaActualizacion" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DescripcionCorta" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DescripcionLarga" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ValorNumerico" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="ValorAlfanumerico" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Abreviatura" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Grupos" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OpcionBinaria" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BEParametros", propOrder = {
    "ultimaActualizacion"
})
public class BEParametros
    extends BEWithID
{

    @XmlElement(name = "UltimaActualizacion")
    protected byte[] ultimaActualizacion;
    @XmlAttribute(name = "DescripcionCorta")
    protected String descripcionCorta;
    @XmlAttribute(name = "DescripcionLarga")
    protected String descripcionLarga;
    @XmlAttribute(name = "ValorNumerico", required = true)
    protected long valorNumerico;
    @XmlAttribute(name = "ValorAlfanumerico")
    protected String valorAlfanumerico;
    @XmlAttribute(name = "Abreviatura")
    protected String abreviatura;
    @XmlAttribute(name = "Grupos")
    protected String grupos;
    @XmlAttribute(name = "OpcionBinaria", required = true)
    protected boolean opcionBinaria;

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
     * Gets the value of the descripcionCorta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionCorta() {
        return descripcionCorta;
    }

    /**
     * Sets the value of the descripcionCorta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionCorta(String value) {
        this.descripcionCorta = value;
    }

    /**
     * Gets the value of the descripcionLarga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionLarga() {
        return descripcionLarga;
    }

    /**
     * Sets the value of the descripcionLarga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionLarga(String value) {
        this.descripcionLarga = value;
    }

    /**
     * Gets the value of the valorNumerico property.
     * 
     */
    public long getValorNumerico() {
        return valorNumerico;
    }

    /**
     * Sets the value of the valorNumerico property.
     * 
     */
    public void setValorNumerico(long value) {
        this.valorNumerico = value;
    }

    /**
     * Gets the value of the valorAlfanumerico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorAlfanumerico() {
        return valorAlfanumerico;
    }

    /**
     * Sets the value of the valorAlfanumerico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorAlfanumerico(String value) {
        this.valorAlfanumerico = value;
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

    /**
     * Gets the value of the grupos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrupos() {
        return grupos;
    }

    /**
     * Sets the value of the grupos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrupos(String value) {
        this.grupos = value;
    }

    /**
     * Gets the value of the opcionBinaria property.
     * 
     */
    public boolean isOpcionBinaria() {
        return opcionBinaria;
    }

    /**
     * Sets the value of the opcionBinaria property.
     * 
     */
    public void setOpcionBinaria(boolean value) {
        this.opcionBinaria = value;
    }

}
