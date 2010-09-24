
package client.ws.rytsa.general;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoEstadoActualSistema.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoEstadoActualSistema">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE_TIPOESTADOACTUALSISTEMA"/>
 *     &lt;enumeration value="ABIERTO"/>
 *     &lt;enumeration value="CERRADO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoEstadoActualSistema")
@XmlEnum
public enum TipoEstadoActualSistema {

    NONE_TIPOESTADOACTUALSISTEMA,
    ABIERTO,
    CERRADO;

    public String value() {
        return name();
    }

    public static TipoEstadoActualSistema fromValue(String v) {
        return valueOf(v);
    }

}
