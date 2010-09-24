
package client.ws.rytsa.seguridad;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoUsuarioLogin.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoUsuarioLogin">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VALIDA_USUARIO_PASSWORD"/>
 *     &lt;enumeration value="VALIDA_USUARIO"/>
 *     &lt;enumeration value="OPCION2"/>
 *     &lt;enumeration value="OPCION3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoUsuarioLogin")
@XmlEnum
public enum TipoUsuarioLogin {

    VALIDA_USUARIO_PASSWORD("VALIDA_USUARIO_PASSWORD"),
    VALIDA_USUARIO("VALIDA_USUARIO"),
    @XmlEnumValue("OPCION2")
    OPCION_2("OPCION2"),
    @XmlEnumValue("OPCION3")
    OPCION_3("OPCION3");
    private final String value;

    TipoUsuarioLogin(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoUsuarioLogin fromValue(String v) {
        for (TipoUsuarioLogin c: TipoUsuarioLogin.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
