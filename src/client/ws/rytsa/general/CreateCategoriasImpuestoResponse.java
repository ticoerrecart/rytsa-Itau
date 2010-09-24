
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
 *         &lt;element name="CreateCategoriasImpuestoResult" type="{http://tempuri.org/}BEEstado" minOccurs="0"/>
 *         &lt;element name="be" type="{http://tempuri.org/}BECategoriasImpuesto" minOccurs="0"/>
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
    "createCategoriasImpuestoResult",
    "be"
})
@XmlRootElement(name = "CreateCategoriasImpuestoResponse")
public class CreateCategoriasImpuestoResponse {

    @XmlElement(name = "CreateCategoriasImpuestoResult")
    protected BEEstado createCategoriasImpuestoResult;
    protected BECategoriasImpuesto be;

    /**
     * Gets the value of the createCategoriasImpuestoResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEEstado }
     *     
     */
    public BEEstado getCreateCategoriasImpuestoResult() {
        return createCategoriasImpuestoResult;
    }

    /**
     * Sets the value of the createCategoriasImpuestoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEEstado }
     *     
     */
    public void setCreateCategoriasImpuestoResult(BEEstado value) {
        this.createCategoriasImpuestoResult = value;
    }

    /**
     * Gets the value of the be property.
     * 
     * @return
     *     possible object is
     *     {@link BECategoriasImpuesto }
     *     
     */
    public BECategoriasImpuesto getBe() {
        return be;
    }

    /**
     * Sets the value of the be property.
     * 
     * @param value
     *     allowed object is
     *     {@link BECategoriasImpuesto }
     *     
     */
    public void setBe(BECategoriasImpuesto value) {
        this.be = value;
    }

}
