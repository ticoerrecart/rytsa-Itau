
package client.ws.rytsa.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BEPlantillas_informes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BEPlantillas_informes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BEWithID">
 *       &lt;attribute name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Texto" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Tipo" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="CodigoSalidas" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BEPlantillas_informes")
public class BEPlantillasInformes
    extends BEWithID
{

    @XmlAttribute(name = "Descripcion")
    protected String descripcion;
    @XmlAttribute(name = "Texto")
    protected String texto;
    @XmlAttribute(name = "Tipo", required = true)
    protected int tipo;
    @XmlAttribute(name = "CodigoSalidas")
    protected String codigoSalidas;

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
     * Gets the value of the texto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTexto() {
        return texto;
    }

    /**
     * Sets the value of the texto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTexto(String value) {
        this.texto = value;
    }

    /**
     * Gets the value of the tipo property.
     * 
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     */
    public void setTipo(int value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the codigoSalidas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoSalidas() {
        return codigoSalidas;
    }

    /**
     * Sets the value of the codigoSalidas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoSalidas(String value) {
        this.codigoSalidas = value;
    }

}
