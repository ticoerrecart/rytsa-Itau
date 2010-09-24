
package client.ws.rytsa.general;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoParticipante.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoParticipante">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE_PARTICIPANTE"/>
 *     &lt;enumeration value="CARTERAPROPIA"/>
 *     &lt;enumeration value="AGENTE"/>
 *     &lt;enumeration value="CLIENTE"/>
 *     &lt;enumeration value="DEPOSITARIA"/>
 *     &lt;enumeration value="CUSTODIO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoParticipante")
@XmlEnum
public enum TipoParticipante {

    NONE_PARTICIPANTE,
    CARTERAPROPIA,
    AGENTE,
    CLIENTE,
    DEPOSITARIA,
    CUSTODIO;

    public String value() {
        return name();
    }

    public static TipoParticipante fromValue(String v) {
        return valueOf(v);
    }

}
