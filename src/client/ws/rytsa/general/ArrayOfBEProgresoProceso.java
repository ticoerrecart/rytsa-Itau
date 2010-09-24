
package client.ws.rytsa.general;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBEProgresoProceso complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBEProgresoProceso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BEProgresoProceso" type="{http://tempuri.org/}BEProgresoProceso" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBEProgresoProceso", propOrder = {
    "beProgresoProceso"
})
public class ArrayOfBEProgresoProceso {

    @XmlElement(name = "BEProgresoProceso", nillable = true)
    protected List<BEProgresoProceso> beProgresoProceso;

    /**
     * Gets the value of the beProgresoProceso property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beProgresoProceso property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBEProgresoProceso().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BEProgresoProceso }
     * 
     * 
     */
    public List<BEProgresoProceso> getBEProgresoProceso() {
        if (beProgresoProceso == null) {
            beProgresoProceso = new ArrayList<BEProgresoProceso>();
        }
        return this.beProgresoProceso;
    }

}
