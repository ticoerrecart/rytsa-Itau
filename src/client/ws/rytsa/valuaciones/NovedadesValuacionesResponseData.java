
package client.ws.rytsa.valuaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NovedadesValuacionesResponseData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NovedadesValuacionesResponseData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EstadoProceso" type="{http://api.patron.mae.com.ar/sistemasexternos/itau}EstadoProcesoInformarNovedadesValuaciones"/>
 *         &lt;element name="ErroresNovedadesValuaciones" type="{http://api.patron.mae.com.ar/sistemasexternos/itau}ArrayOfErrorNovedadValuacionData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NovedadesValuacionesResponseData", propOrder = {
    "estadoProceso",
    "erroresNovedadesValuaciones"
})
public class NovedadesValuacionesResponseData {

    @XmlElement(name = "EstadoProceso", required = true)
    protected EstadoProcesoInformarNovedadesValuaciones estadoProceso;
    @XmlElement(name = "ErroresNovedadesValuaciones")
    protected ArrayOfErrorNovedadValuacionData erroresNovedadesValuaciones;

    /**
     * Gets the value of the estadoProceso property.
     * 
     * @return
     *     possible object is
     *     {@link EstadoProcesoInformarNovedadesValuaciones }
     *     
     */
    public EstadoProcesoInformarNovedadesValuaciones getEstadoProceso() {
        return estadoProceso;
    }

    /**
     * Sets the value of the estadoProceso property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoProcesoInformarNovedadesValuaciones }
     *     
     */
    public void setEstadoProceso(EstadoProcesoInformarNovedadesValuaciones value) {
        this.estadoProceso = value;
    }

    /**
     * Gets the value of the erroresNovedadesValuaciones property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfErrorNovedadValuacionData }
     *     
     */
    public ArrayOfErrorNovedadValuacionData getErroresNovedadesValuaciones() {
        return erroresNovedadesValuaciones;
    }

    /**
     * Sets the value of the erroresNovedadesValuaciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfErrorNovedadValuacionData }
     *     
     */
    public void setErroresNovedadesValuaciones(ArrayOfErrorNovedadValuacionData value) {
        this.erroresNovedadesValuaciones = value;
    }

}
