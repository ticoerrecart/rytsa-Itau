
package client.ws.rytsa.general;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBETiposImpuesto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBETiposImpuesto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BETiposImpuesto" type="{http://tempuri.org/}BETiposImpuesto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBETiposImpuesto", propOrder = {
    "beTiposImpuesto"
})
public class ArrayOfBETiposImpuesto {

    @XmlElement(name = "BETiposImpuesto", nillable = true)
    protected List<BETiposImpuesto> beTiposImpuesto;

    /**
     * Gets the value of the beTiposImpuesto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beTiposImpuesto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBETiposImpuesto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BETiposImpuesto }
     * 
     * 
     */
    public List<BETiposImpuesto> getBETiposImpuesto() {
        if (beTiposImpuesto == null) {
            beTiposImpuesto = new ArrayList<BETiposImpuesto>();
        }
        return this.beTiposImpuesto;
    }

}
