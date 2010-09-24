
package client.ws.rytsa.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdProgresoProceso" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idProgresoProceso"
})
@XmlRootElement(name = "ObtenerProgresoProceso")
public class ObtenerProgresoProceso {

    @XmlElement(name = "IdProgresoProceso")
    protected long idProgresoProceso;

    /**
     * Gets the value of the idProgresoProceso property.
     * 
     */
    public long getIdProgresoProceso() {
        return idProgresoProceso;
    }

    /**
     * Sets the value of the idProgresoProceso property.
     * 
     */
    public void setIdProgresoProceso(long value) {
        this.idProgresoProceso = value;
    }

}
