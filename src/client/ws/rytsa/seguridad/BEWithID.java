
package client.ws.rytsa.seguridad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BEWithID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BEWithID">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BEBase">
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BEWithID")
public class BEWithID
    extends BEBase
{

    @XmlAttribute(name = "ID", required = true)
    protected long id;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(long value) {
        this.id = value;
    }

}
