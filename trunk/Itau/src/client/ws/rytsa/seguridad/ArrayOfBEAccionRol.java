
package client.ws.rytsa.seguridad;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBEAccionRol complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBEAccionRol">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BEAccionRol" type="{http://tempuri.org/}BEAccionRol" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBEAccionRol", propOrder = {
    "beAccionRol"
})
public class ArrayOfBEAccionRol {

    @XmlElement(name = "BEAccionRol", nillable = true)
    protected List<BEAccionRol> beAccionRol;

    /**
     * Gets the value of the beAccionRol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beAccionRol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBEAccionRol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BEAccionRol }
     * 
     * 
     */
    public List<BEAccionRol> getBEAccionRol() {
        if (beAccionRol == null) {
            beAccionRol = new ArrayList<BEAccionRol>();
        }
        return this.beAccionRol;
    }

}
