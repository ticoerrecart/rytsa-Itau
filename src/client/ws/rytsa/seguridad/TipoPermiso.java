
package client.ws.rytsa.seguridad;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoPermiso.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoPermiso">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONSULTA"/>
 *     &lt;enumeration value="SALIDAS"/>
 *     &lt;enumeration value="MODIFICACION"/>
 *     &lt;enumeration value="BAJA"/>
 *     &lt;enumeration value="ALTA"/>
 *     &lt;enumeration value="SUPERVISION"/>
 *     &lt;enumeration value="IMPORTACION"/>
 *     &lt;enumeration value="APROBACION_AUTOMATICA"/>
 *     &lt;enumeration value="EJECUCION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoPermiso")
@XmlEnum
public enum TipoPermiso {

    CONSULTA,
    SALIDAS,
    MODIFICACION,
    BAJA,
    ALTA,
    SUPERVISION,
    IMPORTACION,
    APROBACION_AUTOMATICA,
    EJECUCION;

    public String value() {
        return name();
    }

    public static TipoPermiso fromValue(String v) {
        return valueOf(v);
    }

}
