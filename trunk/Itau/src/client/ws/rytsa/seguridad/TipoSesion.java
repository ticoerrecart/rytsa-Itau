
package client.ws.rytsa.seguridad;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoSesion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoSesion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TODAS_SESIONES"/>
 *     &lt;enumeration value="SOLO_ACTIVAS"/>
 *     &lt;enumeration value="SOLO_CERRADAS_LOGOUT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoSesion")
@XmlEnum
public enum TipoSesion {

    TODAS_SESIONES,
    SOLO_ACTIVAS,
    SOLO_CERRADAS_LOGOUT;

    public String value() {
        return name();
    }

    public static TipoSesion fromValue(String v) {
        return valueOf(v);
    }

}
