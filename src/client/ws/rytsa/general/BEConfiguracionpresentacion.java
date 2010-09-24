
package client.ws.rytsa.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BEConfiguracionpresentacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BEConfiguracionpresentacion">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BEWithID">
 *       &lt;sequence>
 *         &lt;element name="UltimaActualizacion" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MostrarMesasPrincipal" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Invisibilizar_menues" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BEConfiguracionpresentacion", propOrder = {
    "ultimaActualizacion"
})
public class BEConfiguracionpresentacion
    extends BEWithID
{

    @XmlElement(name = "UltimaActualizacion")
    protected byte[] ultimaActualizacion;
    @XmlAttribute(name = "MostrarMesasPrincipal", required = true)
    protected boolean mostrarMesasPrincipal;
    @XmlAttribute(name = "Invisibilizar_menues", required = true)
    protected boolean invisibilizarMenues;

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
     * Gets the value of the mostrarMesasPrincipal property.
     * 
     */
    public boolean isMostrarMesasPrincipal() {
        return mostrarMesasPrincipal;
    }

    /**
     * Sets the value of the mostrarMesasPrincipal property.
     * 
     */
    public void setMostrarMesasPrincipal(boolean value) {
        this.mostrarMesasPrincipal = value;
    }

    /**
     * Gets the value of the invisibilizarMenues property.
     * 
     */
    public boolean isInvisibilizarMenues() {
        return invisibilizarMenues;
    }

    /**
     * Sets the value of the invisibilizarMenues property.
     * 
     */
    public void setInvisibilizarMenues(boolean value) {
        this.invisibilizarMenues = value;
    }

}
