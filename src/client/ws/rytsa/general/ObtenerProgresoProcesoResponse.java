
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
 *         &lt;element name="ObtenerProgresoProcesoResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="be" type="{http://tempuri.org/}BEProgresoProceso" minOccurs="0"/>
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
    "obtenerProgresoProcesoResult",
    "be"
})
@XmlRootElement(name = "ObtenerProgresoProcesoResponse")
public class ObtenerProgresoProcesoResponse {

    @XmlElement(name = "ObtenerProgresoProcesoResult")
    protected BEEstado obtenerProgresoProcesoResult;
    protected BEProgresoProceso be;

    /**
     * Gets the value of the obtenerProgresoProcesoResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getObtenerProgresoProcesoResult() {
        return obtenerProgresoProcesoResult;
    }

    /**
     * Sets the value of the obtenerProgresoProcesoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setObtenerProgresoProcesoResult(BEEstado value) {
        this.obtenerProgresoProcesoResult = value;
    }

    /**
     * Gets the value of the be property.
     * 
     * @return
     *     possible object is
     *     {@link BEProgresoProceso }
     *     
     */
    public BEProgresoProceso getBe() {
        return be;
    }

    /**
     * Sets the value of the be property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEProgresoProceso }
     *     
     */
    public void setBe(BEProgresoProceso value) {
        this.be = value;
    }

}
