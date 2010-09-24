
package client.ws.rytsa.general;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Tipopersona.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Tipopersona">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="tpNONE"/>
 *     &lt;enumeration value="tpFISICA"/>
 *     &lt;enumeration value="tpJURIDICA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Tipopersona")
@XmlEnum
public enum Tipopersona {

    @XmlEnumValue("tpNONE")
    TP_NONE("tpNONE"),
    @XmlEnumValue("tpFISICA")
    TP_FISICA("tpFISICA"),
    @XmlEnumValue("tpJURIDICA")
    TP_JURIDICA("tpJURIDICA");
    private final String value;

    Tipopersona(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Tipopersona fromValue(String v) {
        for (Tipopersona c: Tipopersona.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
