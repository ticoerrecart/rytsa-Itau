
package client.ws.rytsa.general;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoEntidadDomicilios.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoEntidadDomicilios">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="tedNONE"/>
 *     &lt;enumeration value="tedPERSONAS"/>
 *     &lt;enumeration value="tedTIPO_CUENTA_LIQUIDACION"/>
 *     &lt;enumeration value="tedPERSONAS_NOVEDADES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoEntidadDomicilios")
@XmlEnum
public enum TipoEntidadDomicilios {

    @XmlEnumValue("tedNONE")
    TED_NONE("tedNONE"),
    @XmlEnumValue("tedPERSONAS")
    TED_PERSONAS("tedPERSONAS"),
    @XmlEnumValue("tedTIPO_CUENTA_LIQUIDACION")
    TED_TIPO_CUENTA_LIQUIDACION("tedTIPO_CUENTA_LIQUIDACION"),
    @XmlEnumValue("tedPERSONAS_NOVEDADES")
    TED_PERSONAS_NOVEDADES("tedPERSONAS_NOVEDADES");
    private final String value;

    TipoEntidadDomicilios(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoEntidadDomicilios fromValue(String v) {
        for (TipoEntidadDomicilios c: TipoEntidadDomicilios.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
