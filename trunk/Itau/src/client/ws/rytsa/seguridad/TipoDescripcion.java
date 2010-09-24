
package client.ws.rytsa.seguridad;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoDescripcion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoDescripcion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DESC_TEXTO"/>
 *     &lt;enumeration value="DESC_XML"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoDescripcion")
@XmlEnum
public enum TipoDescripcion {

    DESC_TEXTO,
    DESC_XML;

    public String value() {
        return name();
    }

    public static TipoDescripcion fromValue(String v) {
        return valueOf(v);
    }

}
