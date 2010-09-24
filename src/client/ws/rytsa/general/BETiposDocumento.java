
package client.ws.rytsa.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BETiposDocumento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BETiposDocumento">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BEWithID">
 *       &lt;sequence>
 *         &lt;element name="UltimaActualizacion" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Descripcionlarga" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Valornumerico" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Valoralfanumerico" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CodigoCajaValores" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Idprovinciaexpendedora" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BETiposDocumento", propOrder = {
    "ultimaActualizacion"
})
public class BETiposDocumento
    extends BEWithID
{

    @XmlElement(name = "UltimaActualizacion")
    protected byte[] ultimaActualizacion;
    @XmlAttribute(name = "Descripcionlarga")
    protected String descripcionlarga;
    @XmlAttribute(name = "Valornumerico", required = true)
    protected int valornumerico;
    @XmlAttribute(name = "Valoralfanumerico")
    protected String valoralfanumerico;
    @XmlAttribute(name = "CodigoCajaValores")
    protected String codigoCajaValores;
    @XmlAttribute(name = "Idprovinciaexpendedora", required = true)
    protected long idprovinciaexpendedora;

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
     * Gets the value of the descripcionlarga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionlarga() {
        return descripcionlarga;
    }

    /**
     * Sets the value of the descripcionlarga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionlarga(String value) {
        this.descripcionlarga = value;
    }

    /**
     * Gets the value of the valornumerico property.
     * 
     */
    public int getValornumerico() {
        return valornumerico;
    }

    /**
     * Sets the value of the valornumerico property.
     * 
     */
    public void setValornumerico(int value) {
        this.valornumerico = value;
    }

    /**
     * Gets the value of the valoralfanumerico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValoralfanumerico() {
        return valoralfanumerico;
    }

    /**
     * Sets the value of the valoralfanumerico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValoralfanumerico(String value) {
        this.valoralfanumerico = value;
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

    /**
     * Gets the value of the idprovinciaexpendedora property.
     * 
     */
    public long getIdprovinciaexpendedora() {
        return idprovinciaexpendedora;
    }

    /**
     * Sets the value of the idprovinciaexpendedora property.
     * 
     */
    public void setIdprovinciaexpendedora(long value) {
        this.idprovinciaexpendedora = value;
    }

}
