
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for replicationMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="replicationMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="Snapshot"/>
 *     &lt;enumeration value="Asynchronous"/>
 *     &lt;enumeration value="PingPong"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "replicationMode")
@XmlEnum
public enum ReplicationMode {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    NA("NA"),
    @XmlEnumValue("Snapshot")
    SNAPSHOT("Snapshot"),
    @XmlEnumValue("Asynchronous")
    ASYNCHRONOUS("Asynchronous"),
    @XmlEnumValue("PingPong")
    PING_PONG("PingPong");
    private final String value;

    ReplicationMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReplicationMode fromValue(String v) {
        for (ReplicationMode c: ReplicationMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
