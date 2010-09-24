
package client.ws.rytsa.valuaciones;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EstadoProcesoInformarNovedadesValuaciones.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EstadoProcesoInformarNovedadesValuaciones">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ProcesadoCompletamente"/>
 *     &lt;enumeration value="ProcesadoParcialmente"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EstadoProcesoInformarNovedadesValuaciones")
@XmlEnum
public enum EstadoProcesoInformarNovedadesValuaciones {

    @XmlEnumValue("ProcesadoCompletamente")
    PROCESADO_COMPLETAMENTE("ProcesadoCompletamente"),
    @XmlEnumValue("ProcesadoParcialmente")
    PROCESADO_PARCIALMENTE("ProcesadoParcialmente");
    private final String value;

    EstadoProcesoInformarNovedadesValuaciones(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EstadoProcesoInformarNovedadesValuaciones fromValue(String v) {
        for (EstadoProcesoInformarNovedadesValuaciones c: EstadoProcesoInformarNovedadesValuaciones.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
