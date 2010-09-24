
package client.ws.rytsa.general;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoPlantilla.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoPlantilla">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE_SIN_CLASIFICAR"/>
 *     &lt;enumeration value="tpBOLETO_DE_OPERACIONES"/>
 *     &lt;enumeration value="tpBOLETO_DE_INSTRUCCIONES"/>
 *     &lt;enumeration value="tpEMAIL_DE_OPERACIONES"/>
 *     &lt;enumeration value="tpBOLETO_ORDENES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoPlantilla")
@XmlEnum
public enum TipoPlantilla {

    NONE_SIN_CLASIFICAR("NONE_SIN_CLASIFICAR"),
    @XmlEnumValue("tpBOLETO_DE_OPERACIONES")
    TP_BOLETO_DE_OPERACIONES("tpBOLETO_DE_OPERACIONES"),
    @XmlEnumValue("tpBOLETO_DE_INSTRUCCIONES")
    TP_BOLETO_DE_INSTRUCCIONES("tpBOLETO_DE_INSTRUCCIONES"),
    @XmlEnumValue("tpEMAIL_DE_OPERACIONES")
    TP_EMAIL_DE_OPERACIONES("tpEMAIL_DE_OPERACIONES"),
    @XmlEnumValue("tpBOLETO_ORDENES")
    TP_BOLETO_ORDENES("tpBOLETO_ORDENES");
    private final String value;

    TipoPlantilla(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoPlantilla fromValue(String v) {
        for (TipoPlantilla c: TipoPlantilla.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
