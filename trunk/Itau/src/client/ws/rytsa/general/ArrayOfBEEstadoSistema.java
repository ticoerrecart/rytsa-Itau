
package client.ws.rytsa.general;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBEEstado_sistema complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBEEstado_sistema">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BEEstado_sistema" type="{http://tempuri.org/}BEEstado_sistema" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBEEstado_sistema", propOrder = {
    "beEstadoSistema"
})
public class ArrayOfBEEstadoSistema {

    @XmlElement(name = "BEEstado_sistema", nillable = true)
    protected List<BEEstadoSistema> beEstadoSistema;

    /**
     * Gets the value of the beEstadoSistema property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beEstadoSistema property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBEEstadoSistema().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BEEstadoSistema }
     * 
     * 
     */
    public List<BEEstadoSistema> getBEEstadoSistema() {
        if (beEstadoSistema == null) {
            beEstadoSistema = new ArrayList<BEEstadoSistema>();
        }
        return this.beEstadoSistema;
    }

}
