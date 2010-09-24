
package client.ws.rytsa.seguridad;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBEWithFK complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBEWithFK">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BEWithFK" type="{http://tempuri.org/}BEWithFK" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBEWithFK", propOrder = {
    "beWithFK"
})
public class ArrayOfBEWithFK {

    @XmlElement(name = "BEWithFK", nillable = true)
    protected List<BEWithFK> beWithFK;

    /**
     * Gets the value of the beWithFK property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beWithFK property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBEWithFK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BEWithFK }
     * 
     * 
     */
    public List<BEWithFK> getBEWithFK() {
        if (beWithFK == null) {
            beWithFK = new ArrayList<BEWithFK>();
        }
        return this.beWithFK;
    }

}
