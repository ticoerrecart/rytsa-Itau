
package client.ws.rytsa.general;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBEEscritorios complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBEEscritorios">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BEEscritorios" type="{http://tempuri.org/}BEEscritorios" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBEEscritorios", propOrder = {
    "beEscritorios"
})
public class ArrayOfBEEscritorios {

    @XmlElement(name = "BEEscritorios", nillable = true)
    protected List<BEEscritorios> beEscritorios;

    /**
     * Gets the value of the beEscritorios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beEscritorios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBEEscritorios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BEEscritorios }
     * 
     * 
     */
    public List<BEEscritorios> getBEEscritorios() {
        if (beEscritorios == null) {
            beEscritorios = new ArrayList<BEEscritorios>();
        }
        return this.beEscritorios;
    }

}
