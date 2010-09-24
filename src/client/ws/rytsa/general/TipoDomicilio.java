
package client.ws.rytsa.general;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoDomicilio.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoDomicilio">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="tdNONE"/>
 *     &lt;enumeration value="tdREAL"/>
 *     &lt;enumeration value="tdLEGAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoDomicilio")
@XmlEnum
public enum TipoDomicilio {

    @XmlEnumValue("tdNONE")
    TD_NONE("tdNONE"),
    @XmlEnumValue("tdREAL")
    TD_REAL("tdREAL"),
    @XmlEnumValue("tdLEGAL")
    TD_LEGAL("tdLEGAL");
    private final String value;

    TipoDomicilio(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoDomicilio fromValue(String v) {
        for (TipoDomicilio c: TipoDomicilio.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
