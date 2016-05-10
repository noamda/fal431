
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eventLogScope.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eventLogScope">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RootCause"/>
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="Advanced"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eventLogScope")
@XmlEnum
public enum EventLogScope {

    @XmlEnumValue("RootCause")
    ROOT_CAUSE("RootCause"),
    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Advanced")
    ADVANCED("Advanced"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    EventLogScope(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventLogScope fromValue(String v) {
        for (EventLogScope c: EventLogScope.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
