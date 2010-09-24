
package client.ws.rytsa.general;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBEProvincias complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBEProvincias">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BEProvincias" type="{http://tempuri.org/}BEProvincias" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBEProvincias", propOrder = {
    "beProvincias"
})
public class ArrayOfBEProvincias {

    @XmlElement(name = "BEProvincias", nillable = true)
    protected List<BEProvincias> beProvincias;

    /**
     * Gets the value of the beProvincias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beProvincias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBEProvincias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BEProvincias }
     * 
     * 
     */
    public List<BEProvincias> getBEProvincias() {
        if (beProvincias == null) {
            beProvincias = new ArrayList<BEProvincias>();
        }
        return this.beProvincias;
    }

}
