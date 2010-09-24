
package client.ws.rytsa.general;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBETiposSociedad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBETiposSociedad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BETiposSociedad" type="{http://tempuri.org/}BETiposSociedad" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBETiposSociedad", propOrder = {
    "beTiposSociedad"
})
public class ArrayOfBETiposSociedad {

    @XmlElement(name = "BETiposSociedad", nillable = true)
    protected List<BETiposSociedad> beTiposSociedad;

    /**
     * Gets the value of the beTiposSociedad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beTiposSociedad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBETiposSociedad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BETiposSociedad }
     * 
     * 
     */
    public List<BETiposSociedad> getBETiposSociedad() {
        if (beTiposSociedad == null) {
            beTiposSociedad = new ArrayList<BETiposSociedad>();
        }
        return this.beTiposSociedad;
    }

}
