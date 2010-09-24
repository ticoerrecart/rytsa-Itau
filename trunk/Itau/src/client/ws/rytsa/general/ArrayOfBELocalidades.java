
package client.ws.rytsa.general;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBELocalidades complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBELocalidades">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BELocalidades" type="{http://tempuri.org/}BELocalidades" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBELocalidades", propOrder = {
    "beLocalidades"
})
public class ArrayOfBELocalidades {

    @XmlElement(name = "BELocalidades", nillable = true)
    protected List<BELocalidades> beLocalidades;

    /**
     * Gets the value of the beLocalidades property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beLocalidades property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBELocalidades().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BELocalidades }
     * 
     * 
     */
    public List<BELocalidades> getBELocalidades() {
        if (beLocalidades == null) {
            beLocalidades = new ArrayList<BELocalidades>();
        }
        return this.beLocalidades;
    }

}
