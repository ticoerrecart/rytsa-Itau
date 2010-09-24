
package client.ws.rytsa.general;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBETablaMaestra complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBETablaMaestra">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BETablaMaestra" type="{http://tempuri.org/}BETablaMaestra" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBETablaMaestra", propOrder = {
    "beTablaMaestra"
})
public class ArrayOfBETablaMaestra {

    @XmlElement(name = "BETablaMaestra", nillable = true)
    protected List<BETablaMaestra> beTablaMaestra;

    /**
     * Gets the value of the beTablaMaestra property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beTablaMaestra property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBETablaMaestra().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BETablaMaestra }
     * 
     * 
     */
    public List<BETablaMaestra> getBETablaMaestra() {
        if (beTablaMaestra == null) {
            beTablaMaestra = new ArrayList<BETablaMaestra>();
        }
        return this.beTablaMaestra;
    }

}
