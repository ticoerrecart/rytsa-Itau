
package client.ws.rytsa.general;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoPlazo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoPlazo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE_TIPOPLAZO"/>
 *     &lt;enumeration value="PLAZO_RELATIVO"/>
 *     &lt;enumeration value="PLAZO_ABSOLUTO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoPlazo")
@XmlEnum
public enum TipoPlazo {

    NONE_TIPOPLAZO,
    PLAZO_RELATIVO,
    PLAZO_ABSOLUTO;

    public String value() {
        return name();
    }

    public static TipoPlazo fromValue(String v) {
        return valueOf(v);
    }

}
