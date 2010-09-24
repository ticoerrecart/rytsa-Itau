
package client.ws.rytsa.general;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBEGruposEconomicos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBEGruposEconomicos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BEGruposEconomicos" type="{http://tempuri.org/}BEGruposEconomicos" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBEGruposEconomicos", propOrder = {
    "beGruposEconomicos"
})
public class ArrayOfBEGruposEconomicos {

    @XmlElement(name = "BEGruposEconomicos", nillable = true)
    protected List<BEGruposEconomicos> beGruposEconomicos;

    /**
     * Gets the value of the beGruposEconomicos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beGruposEconomicos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBEGruposEconomicos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BEGruposEconomicos }
     * 
     * 
     */
    public List<BEGruposEconomicos> getBEGruposEconomicos() {
        if (beGruposEconomicos == null) {
            beGruposEconomicos = new ArrayList<BEGruposEconomicos>();
        }
        return this.beGruposEconomicos;
    }

}
