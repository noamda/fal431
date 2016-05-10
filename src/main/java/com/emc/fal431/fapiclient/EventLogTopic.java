
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eventLogTopic.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eventLogTopic">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="Management"/>
 *     &lt;enumeration value="Cluster"/>
 *     &lt;enumeration value="RPA"/>
 *     &lt;enumeration value="ConsistencyGroup"/>
 *     &lt;enumeration value="Splitter"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eventLogTopic")
@XmlEnum
public enum EventLogTopic {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Management")
    MANAGEMENT("Management"),
    @XmlEnumValue("Cluster")
    CLUSTER("Cluster"),
    RPA("RPA"),
    @XmlEnumValue("ConsistencyGroup")
    CONSISTENCY_GROUP("ConsistencyGroup"),
    @XmlEnumValue("Splitter")
    SPLITTER("Splitter"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    EventLogTopic(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventLogTopic fromValue(String v) {
        for (EventLogTopic c: EventLogTopic.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
