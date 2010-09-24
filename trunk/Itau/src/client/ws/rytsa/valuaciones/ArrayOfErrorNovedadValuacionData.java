
package client.ws.rytsa.valuaciones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfErrorNovedadValuacionData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfErrorNovedadValuacionData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorNovedadValuacionData" type="{http://api.patron.mae.com.ar/sistemasexternos/itau}ErrorNovedadValuacionData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfErrorNovedadValuacionData", propOrder = {
    "errorNovedadValuacionData"
})
public class ArrayOfErrorNovedadValuacionData {

    @XmlElement(name = "ErrorNovedadValuacionData", nillable = true)
    protected List<ErrorNovedadValuacionData> errorNovedadValuacionData;

    /**
     * Gets the value of the errorNovedadValuacionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorNovedadValuacionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorNovedadValuacionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorNovedadValuacionData }
     * 
     * 
     */
    public List<ErrorNovedadValuacionData> getErrorNovedadValuacionData() {
        if (errorNovedadValuacionData == null) {
            errorNovedadValuacionData = new ArrayList<ErrorNovedadValuacionData>();
        }
        return this.errorNovedadValuacionData;
    }

}
