
package client.ws.rytsa.general;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBECategoriasImpuesto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBECategoriasImpuesto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BECategoriasImpuesto" type="{http://tempuri.org/}BECategoriasImpuesto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBECategoriasImpuesto", propOrder = {
    "beCategoriasImpuesto"
})
public class ArrayOfBECategoriasImpuesto {

    @XmlElement(name = "BECategoriasImpuesto", nillable = true)
    protected List<BECategoriasImpuesto> beCategoriasImpuesto;

    /**
     * Gets the value of the beCategoriasImpuesto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beCategoriasImpuesto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBECategoriasImpuesto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BECategoriasImpuesto }
     * 
     * 
     */
    public List<BECategoriasImpuesto> getBECategoriasImpuesto() {
        if (beCategoriasImpuesto == null) {
            beCategoriasImpuesto = new ArrayList<BECategoriasImpuesto>();
        }
        return this.beCategoriasImpuesto;
    }

}
