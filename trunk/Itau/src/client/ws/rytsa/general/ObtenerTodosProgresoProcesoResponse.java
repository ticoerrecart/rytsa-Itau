
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
 *         &lt;element name="ObtenerTodosProgresoProcesoResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="beArray" type="{http://tempuri.org/}ArrayOfBEProgresoProceso" minOccurs="0"/>
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
    "obtenerTodosProgresoProcesoResult",
    "beArray"
})
@XmlRootElement(name = "ObtenerTodosProgresoProcesoResponse")
public class ObtenerTodosProgresoProcesoResponse {

    @XmlElement(name = "ObtenerTodosProgresoProcesoResult")
    protected BEEstado obtenerTodosProgresoProcesoResult;
    protected ArrayOfBEProgresoProceso beArray;

    /**
     * Gets the value of the obtenerTodosProgresoProcesoResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getObtenerTodosProgresoProcesoResult() {
        return obtenerTodosProgresoProcesoResult;
    }

    /**
     * Sets the value of the obtenerTodosProgresoProcesoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setObtenerTodosProgresoProcesoResult(BEEstado value) {
        this.obtenerTodosProgresoProcesoResult = value;
    }

    /**
     * Gets the value of the beArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBEProgresoProceso }
     *     
     */
    public ArrayOfBEProgresoProceso getBeArray() {
        return beArray;
    }

    /**
     * Sets the value of the beArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBEProgresoProceso }
     *     
     */
    public void setBeArray(ArrayOfBEProgresoProceso value) {
        this.beArray = value;
    }

}
