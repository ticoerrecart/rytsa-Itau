
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
 *         &lt;element name="DisponibilizacionFeriadosResult" type="{http://tempuri.org/}ArrayOfDCFechaCalendario" minOccurs="0"/>
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
    "disponibilizacionFeriadosResult"
})
@XmlRootElement(name = "DisponibilizacionFeriadosResponse")
public class DisponibilizacionFeriadosResponse {

    @XmlElement(name = "DisponibilizacionFeriadosResult")
    protected ArrayOfDCFechaCalendario disponibilizacionFeriadosResult;

    /**
     * Gets the value of the disponibilizacionFeriadosResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDCFechaCalendario }
     *     
     */
    public ArrayOfDCFechaCalendario getDisponibilizacionFeriadosResult() {
        return disponibilizacionFeriadosResult;
    }

    /**
     * Sets the value of the disponibilizacionFeriadosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDCFechaCalendario }
     *     
     */
    public void setDisponibilizacionFeriadosResult(ArrayOfDCFechaCalendario value) {
        this.disponibilizacionFeriadosResult = value;
    }

}
