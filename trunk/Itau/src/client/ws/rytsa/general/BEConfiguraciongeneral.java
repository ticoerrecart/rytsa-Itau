
package client.ws.rytsa.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BEConfiguraciongeneral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BEConfiguraciongeneral">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BEWithID">
 *       &lt;attribute name="Chequearoperacionesnovedades" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Validarconexionsiopelfriend" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BEConfiguraciongeneral")
public class BEConfiguraciongeneral
    extends BEWithID
{

    @XmlAttribute(name = "Chequearoperacionesnovedades", required = true)
    protected boolean chequearoperacionesnovedades;
    @XmlAttribute(name = "Validarconexionsiopelfriend", required = true)
    protected boolean validarconexionsiopelfriend;

    /**
     * Gets the value of the chequearoperacionesnovedades property.
     * 
     */
    public boolean isChequearoperacionesnovedades() {
        return chequearoperacionesnovedades;
    }

    /**
     * Sets the value of the chequearoperacionesnovedades property.
     * 
     */
    public void setChequearoperacionesnovedades(boolean value) {
        this.chequearoperacionesnovedades = value;
    }

    /**
     * Gets the value of the validarconexionsiopelfriend property.
     * 
     */
    public boolean isValidarconexionsiopelfriend() {
        return validarconexionsiopelfriend;
    }

    /**
     * Sets the value of the validarconexionsiopelfriend property.
     * 
     */
    public void setValidarconexionsiopelfriend(boolean value) {
        this.validarconexionsiopelfriend = value;
    }

}
