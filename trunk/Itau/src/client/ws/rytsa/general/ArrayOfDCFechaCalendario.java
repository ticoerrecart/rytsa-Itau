
package client.ws.rytsa.general;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDCFechaCalendario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDCFechaCalendario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DCFechaCalendario" type="{http://tempuri.org/}DCFechaCalendario" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDCFechaCalendario", propOrder = {
    "dcFechaCalendario"
})
public class ArrayOfDCFechaCalendario {

    @XmlElement(name = "DCFechaCalendario", nillable = true)
    protected List<DCFechaCalendario> dcFechaCalendario;

    /**
     * Gets the value of the dcFechaCalendario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dcFechaCalendario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDCFechaCalendario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DCFechaCalendario }
     * 
     * 
     */
    public List<DCFechaCalendario> getDCFechaCalendario() {
        if (dcFechaCalendario == null) {
            dcFechaCalendario = new ArrayList<DCFechaCalendario>();
        }
        return this.dcFechaCalendario;
    }

}
