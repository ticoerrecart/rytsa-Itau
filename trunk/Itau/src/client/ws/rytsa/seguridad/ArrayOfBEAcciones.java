
package client.ws.rytsa.seguridad;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBEAcciones complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBEAcciones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BEAcciones" type="{http://tempuri.org/}BEAcciones" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBEAcciones", propOrder = {
    "beAcciones"
})
public class ArrayOfBEAcciones {

    @XmlElement(name = "BEAcciones", nillable = true)
    protected List<BEAcciones> beAcciones;

    /**
     * Gets the value of the beAcciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beAcciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBEAcciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BEAcciones }
     * 
     * 
     */
    public List<BEAcciones> getBEAcciones() {
        if (beAcciones == null) {
            beAcciones = new ArrayList<BEAcciones>();
        }
        return this.beAcciones;
    }

}
