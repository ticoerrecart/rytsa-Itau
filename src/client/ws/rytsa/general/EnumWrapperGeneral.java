
package client.ws.rytsa.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumWrapperGeneral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnumWrapperGeneral">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BEBase">
 *       &lt;sequence>
 *         &lt;element name="TipoPlantilla" type="{http://tempuri.org/}TipoPlantilla"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnumWrapperGeneral", propOrder = {
    "tipoPlantilla"
})
public class EnumWrapperGeneral
    extends BEBase
{

    @XmlElement(name = "TipoPlantilla", required = true)
    protected TipoPlantilla tipoPlantilla;

    /**
     * Gets the value of the tipoPlantilla property.
     * 
     * @return
     *     possible object is
     *     {@link TipoPlantilla }
     *     
     */
    public TipoPlantilla getTipoPlantilla() {
        return tipoPlantilla;
    }

    /**
     * Sets the value of the tipoPlantilla property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPlantilla }
     *     
     */
    public void setTipoPlantilla(TipoPlantilla value) {
        this.tipoPlantilla = value;
    }

}
