
package client.ws.rytsa.general;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoEvento.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoEvento">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="teNONE"/>
 *     &lt;enumeration value="teBEFORE"/>
 *     &lt;enumeration value="teAFTER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoEvento")
@XmlEnum
public enum TipoEvento {

    @XmlEnumValue("teNONE")
    TE_NONE("teNONE"),
    @XmlEnumValue("teBEFORE")
    TE_BEFORE("teBEFORE"),
    @XmlEnumValue("teAFTER")
    TE_AFTER("teAFTER");
    private final String value;

    TipoEvento(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoEvento fromValue(String v) {
        for (TipoEvento c: TipoEvento.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
