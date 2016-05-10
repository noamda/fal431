
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eventLogLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eventLogLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Info"/>
 *     &lt;enumeration value="Warning"/>
 *     &lt;enumeration value="TransientWarning"/>
 *     &lt;enumeration value="ClearedWarning"/>
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="TransientError"/>
 *     &lt;enumeration value="ClearedError"/>
 *     &lt;enumeration value="Critical"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eventLogLevel")
@XmlEnum
public enum EventLogLevel {

    @XmlEnumValue("Info")
    INFO("Info"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("TransientWarning")
    TRANSIENT_WARNING("TransientWarning"),
    @XmlEnumValue("ClearedWarning")
    CLEARED_WARNING("ClearedWarning"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("TransientError")
    TRANSIENT_ERROR("TransientError"),
    @XmlEnumValue("ClearedError")
    CLEARED_ERROR("ClearedError"),
    @XmlEnumValue("Critical")
    CRITICAL("Critical"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    EventLogLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventLogLevel fromValue(String v) {
        for (EventLogLevel c: EventLogLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
