
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
 *         &lt;element name="GenerarExportacionContableResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="idProceso" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "generarExportacionContableResult",
    "idProceso"
})
@XmlRootElement(name = "GenerarExportacionContableResponse")
public class GenerarExportacionContableResponse {

    @XmlElement(name = "GenerarExportacionContableResult")
    protected BEEstado generarExportacionContableResult;
    protected long idProceso;

    /**
     * Gets the value of the generarExportacionContableResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getGenerarExportacionContableResult() {
        return generarExportacionContableResult;
    }

    /**
     * Sets the value of the generarExportacionContableResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setGenerarExportacionContableResult(BEEstado value) {
        this.generarExportacionContableResult = value;
    }

    /**
     * Gets the value of the idProceso property.
     * 
     */
    public long getIdProceso() {
        return idProceso;
    }

    /**
     * Sets the value of the idProceso property.
     * 
     */
    public void setIdProceso(long value) {
        this.idProceso = value;
    }

}
