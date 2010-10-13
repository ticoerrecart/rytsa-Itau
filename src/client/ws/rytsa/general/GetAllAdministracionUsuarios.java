
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
 *         &lt;element name="idSesion" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="lastRecord" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="maxRecord" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idSucursal" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="IdParticipante" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "idSesion",
    "lastRecord",
    "maxRecord",
    "idSucursal",
    "idParticipante"
})
@XmlRootElement(name = "GetAllAdministracionUsuarios")
public class GetAllAdministracionUsuarios {

    @XmlElement(required = true)
    protected String idSesion;
    protected long lastRecord;
    protected long maxRecord;
    protected long idSucursal;
    @XmlElement(name = "IdParticipante")
    protected long idParticipante;

    /**
     * Gets the value of the idSesion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSesion() {
        return idSesion;
    }

    /**
     * Sets the value of the idSesion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSesion(String value) {
        this.idSesion = value;
    }

    /**
     * Gets the value of the lastRecord property.
     * 
     */
    public long getLastRecord() {
        return lastRecord;
    }

    /**
     * Sets the value of the lastRecord property.
     * 
     */
    public void setLastRecord(long value) {
        this.lastRecord = value;
    }

    /**
     * Gets the value of the maxRecord property.
     * 
     */
    public long getMaxRecord() {
        return maxRecord;
    }

    /**
     * Sets the value of the maxRecord property.
     * 
     */
    public void setMaxRecord(long value) {
        this.maxRecord = value;
    }

    /**
     * Gets the value of the idSucursal property.
     * 
     */
    public long getIdSucursal() {
        return idSucursal;
    }

    /**
     * Sets the value of the idSucursal property.
     * 
     */
    public void setIdSucursal(long value) {
        this.idSucursal = value;
    }

    /**
     * Gets the value of the idParticipante property.
     * 
     */
    public long getIdParticipante() {
        return idParticipante;
    }

    /**
     * Sets the value of the idParticipante property.
     * 
     */
    public void setIdParticipante(long value) {
        this.idParticipante = value;
    }

}