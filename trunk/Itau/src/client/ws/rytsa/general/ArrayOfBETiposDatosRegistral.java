
package client.ws.rytsa.general;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBETiposDatosRegistral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBETiposDatosRegistral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BETiposDatosRegistral" type="{http://tempuri.org/}BETiposDatosRegistral" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBETiposDatosRegistral", propOrder = {
    "beTiposDatosRegistral"
})
public class ArrayOfBETiposDatosRegistral {

    @XmlElement(name = "BETiposDatosRegistral", nillable = true)
    protected List<BETiposDatosRegistral> beTiposDatosRegistral;

    /**
     * Gets the value of the beTiposDatosRegistral property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beTiposDatosRegistral property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBETiposDatosRegistral().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BETiposDatosRegistral }
     * 
     * 
     */
    public List<BETiposDatosRegistral> getBETiposDatosRegistral() {
        if (beTiposDatosRegistral == null) {
            beTiposDatosRegistral = new ArrayList<BETiposDatosRegistral>();
        }
        return this.beTiposDatosRegistral;
    }

}
