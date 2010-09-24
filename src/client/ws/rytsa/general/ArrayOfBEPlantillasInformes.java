
package client.ws.rytsa.general;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBEPlantillas_informes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBEPlantillas_informes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BEPlantillas_informes" type="{http://tempuri.org/}BEPlantillas_informes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBEPlantillas_informes", propOrder = {
    "bePlantillasInformes"
})
public class ArrayOfBEPlantillasInformes {

    @XmlElement(name = "BEPlantillas_informes", nillable = true)
    protected List<BEPlantillasInformes> bePlantillasInformes;

    /**
     * Gets the value of the bePlantillasInformes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bePlantillasInformes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBEPlantillasInformes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BEPlantillasInformes }
     * 
     * 
     */
    public List<BEPlantillasInformes> getBEPlantillasInformes() {
        if (bePlantillasInformes == null) {
            bePlantillasInformes = new ArrayList<BEPlantillasInformes>();
        }
        return this.bePlantillasInformes;
    }

}
