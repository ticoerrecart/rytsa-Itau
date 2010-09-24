
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
 *         &lt;element name="ObtnerFeriadosPorRangoFechaResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="listaFechaCalendario" type="{http://tempuri.org/}ArrayOfDCFechaCalendario" minOccurs="0"/>
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
    "obtnerFeriadosPorRangoFechaResult",
    "listaFechaCalendario"
})
@XmlRootElement(name = "ObtnerFeriadosPorRangoFechaResponse")
public class ObtnerFeriadosPorRangoFechaResponse {

    @XmlElement(name = "ObtnerFeriadosPorRangoFechaResult")
    protected BEEstado obtnerFeriadosPorRangoFechaResult;
    protected ArrayOfDCFechaCalendario listaFechaCalendario;

    /**
     * Gets the value of the obtnerFeriadosPorRangoFechaResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getObtnerFeriadosPorRangoFechaResult() {
        return obtnerFeriadosPorRangoFechaResult;
    }

    /**
     * Sets the value of the obtnerFeriadosPorRangoFechaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setObtnerFeriadosPorRangoFechaResult(BEEstado value) {
        this.obtnerFeriadosPorRangoFechaResult = value;
    }

    /**
     * Gets the value of the listaFechaCalendario property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDCFechaCalendario }
     *     
     */
    public ArrayOfDCFechaCalendario getListaFechaCalendario() {
        return listaFechaCalendario;
    }

    /**
     * Sets the value of the listaFechaCalendario property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDCFechaCalendario }
     *     
     */
    public void setListaFechaCalendario(ArrayOfDCFechaCalendario value) {
        this.listaFechaCalendario = value;
    }

}
