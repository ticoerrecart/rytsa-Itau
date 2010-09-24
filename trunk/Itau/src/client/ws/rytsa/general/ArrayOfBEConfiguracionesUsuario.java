
package client.ws.rytsa.general;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBEConfiguraciones_usuario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBEConfiguraciones_usuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BEConfiguraciones_usuario" type="{http://tempuri.org/}BEConfiguraciones_usuario" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBEConfiguraciones_usuario", propOrder = {
    "beConfiguracionesUsuario"
})
public class ArrayOfBEConfiguracionesUsuario {

    @XmlElement(name = "BEConfiguraciones_usuario", nillable = true)
    protected List<BEConfiguracionesUsuario> beConfiguracionesUsuario;

    /**
     * Gets the value of the beConfiguracionesUsuario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beConfiguracionesUsuario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBEConfiguracionesUsuario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BEConfiguracionesUsuario }
     * 
     * 
     */
    public List<BEConfiguracionesUsuario> getBEConfiguracionesUsuario() {
        if (beConfiguracionesUsuario == null) {
            beConfiguracionesUsuario = new ArrayList<BEConfiguracionesUsuario>();
        }
        return this.beConfiguracionesUsuario;
    }

}
