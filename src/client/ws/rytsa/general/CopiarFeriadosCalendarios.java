
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
 *         &lt;element name="idCalendarioOrigen" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idCalendarioDestino" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="eliminaFeriadosDestinos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "idCalendarioOrigen",
    "idCalendarioDestino",
    "eliminaFeriadosDestinos"
})
@XmlRootElement(name = "CopiarFeriadosCalendarios")
public class CopiarFeriadosCalendarios {

    @XmlElement(required = true)
    protected String idSesion;
    protected long idCalendarioOrigen;
    protected long idCalendarioDestino;
    protected boolean eliminaFeriadosDestinos;

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
     * Gets the value of the idCalendarioOrigen property.
     * 
     */
    public long getIdCalendarioOrigen() {
        return idCalendarioOrigen;
    }

    /**
     * Sets the value of the idCalendarioOrigen property.
     * 
     */
    public void setIdCalendarioOrigen(long value) {
        this.idCalendarioOrigen = value;
    }

    /**
     * Gets the value of the idCalendarioDestino property.
     * 
     */
    public long getIdCalendarioDestino() {
        return idCalendarioDestino;
    }

    /**
     * Sets the value of the idCalendarioDestino property.
     * 
     */
    public void setIdCalendarioDestino(long value) {
        this.idCalendarioDestino = value;
    }

    /**
     * Gets the value of the eliminaFeriadosDestinos property.
     * 
     */
    public boolean isEliminaFeriadosDestinos() {
        return eliminaFeriadosDestinos;
    }

    /**
     * Sets the value of the eliminaFeriadosDestinos property.
     * 
     */
    public void setEliminaFeriadosDestinos(boolean value) {
        this.eliminaFeriadosDestinos = value;
    }

}
