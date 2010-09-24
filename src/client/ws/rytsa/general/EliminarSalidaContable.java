
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
 *         &lt;element name="idProceso" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idejercicio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numasiento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nummov" type="{http://www.w3.org/2001/XMLSchema}short"/>
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
    "idProceso",
    "idejercicio",
    "numasiento",
    "nummov"
})
@XmlRootElement(name = "EliminarSalidaContable")
public class EliminarSalidaContable {

    @XmlElement(required = true)
    protected String idSesion;
    protected int idProceso;
    protected int idejercicio;
    protected int numasiento;
    protected short nummov;

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
     * Gets the value of the idProceso property.
     * 
     */
    public int getIdProceso() {
        return idProceso;
    }

    /**
     * Sets the value of the idProceso property.
     * 
     */
    public void setIdProceso(int value) {
        this.idProceso = value;
    }

    /**
     * Gets the value of the idejercicio property.
     * 
     */
    public int getIdejercicio() {
        return idejercicio;
    }

    /**
     * Sets the value of the idejercicio property.
     * 
     */
    public void setIdejercicio(int value) {
        this.idejercicio = value;
    }

    /**
     * Gets the value of the numasiento property.
     * 
     */
    public int getNumasiento() {
        return numasiento;
    }

    /**
     * Sets the value of the numasiento property.
     * 
     */
    public void setNumasiento(int value) {
        this.numasiento = value;
    }

    /**
     * Gets the value of the nummov property.
     * 
     */
    public short getNummov() {
        return nummov;
    }

    /**
     * Sets the value of the nummov property.
     * 
     */
    public void setNummov(short value) {
        this.nummov = value;
    }

}
