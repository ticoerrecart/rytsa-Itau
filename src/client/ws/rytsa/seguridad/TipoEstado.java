
package client.ws.rytsa.seguridad;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoEstado.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoEstado">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INFORMATION"/>
 *     &lt;enumeration value="WARNING"/>
 *     &lt;enumeration value="ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoEstado")
@XmlEnum
public enum TipoEstado {

    INFORMATION,
    WARNING,
    ERROR;

    public String value() {
        return name();
    }

    public static TipoEstado fromValue(String v) {
        return valueOf(v);
    }

}
