
package client.ws.rytsa.general;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBETiposComprobante complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBETiposComprobante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BETiposComprobante" type="{http://tempuri.org/}BETiposComprobante" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBETiposComprobante", propOrder = {
    "beTiposComprobante"
})
public class ArrayOfBETiposComprobante {

    @XmlElement(name = "BETiposComprobante", nillable = true)
    protected List<BETiposComprobante> beTiposComprobante;

    /**
     * Gets the value of the beTiposComprobante property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beTiposComprobante property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBETiposComprobante().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BETiposComprobante }
     * 
     * 
     */
    public List<BETiposComprobante> getBETiposComprobante() {
        if (beTiposComprobante == null) {
            beTiposComprobante = new ArrayList<BETiposComprobante>();
        }
        return this.beTiposComprobante;
    }

}
