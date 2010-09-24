
package client.ws.rytsa.seguridad;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoLogin.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoLogin">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SIN_RESTRICCIONES"/>
 *     &lt;enumeration value="UNICO_POR_APLICACION"/>
 *     &lt;enumeration value="UNICO_POR_SISTEMA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoLogin")
@XmlEnum
public enum TipoLogin {

    SIN_RESTRICCIONES,
    UNICO_POR_APLICACION,
    UNICO_POR_SISTEMA;

    public String value() {
        return name();
    }

    public static TipoLogin fromValue(String v) {
        return valueOf(v);
    }

}
