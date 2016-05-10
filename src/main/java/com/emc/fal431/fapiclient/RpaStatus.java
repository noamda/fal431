
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rpaStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="rpaStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="Down"/>
 *     &lt;enumeration value="RemovedForMaintenance"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "rpaStatus")
@XmlEnum
public enum RpaStatus {

    OK("OK"),
    @XmlEnumValue("Down")
    DOWN("Down"),
    @XmlEnumValue("RemovedForMaintenance")
    REMOVED_FOR_MAINTENANCE("RemovedForMaintenance"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    RpaStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RpaStatus fromValue(String v) {
        for (RpaStatus c: RpaStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
