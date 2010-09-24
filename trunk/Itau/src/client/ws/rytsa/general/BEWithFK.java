
package client.ws.rytsa.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BEWithFK complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BEWithFK">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BEWithID">
 *       &lt;attribute name="FK" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BEWithFK")
public class BEWithFK
    extends BEWithID
{

    @XmlAttribute(name = "FK", required = true)
    protected long fk;

    /**
     * Gets the value of the fk property.
     * 
     */
    public long getFK() {
        return fk;
    }

    /**
     * Sets the value of the fk property.
     * 
     */
    public void setFK(long value) {
        this.fk = value;
    }

}
