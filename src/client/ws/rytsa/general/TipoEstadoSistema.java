
package client.ws.rytsa.general;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoEstadoSistema.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoEstadoSistema">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ULTIMO"/>
 *     &lt;enumeration value="ULTIMO_ABIERTO"/>
 *     &lt;enumeration value="ULTIMO_CERRADO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoEstadoSistema")
@XmlEnum
public enum TipoEstadoSistema {

    ULTIMO,
    ULTIMO_ABIERTO,
    ULTIMO_CERRADO;

    public String value() {
        return name();
    }

    public static TipoEstadoSistema fromValue(String v) {
        return valueOf(v);
    }

}
