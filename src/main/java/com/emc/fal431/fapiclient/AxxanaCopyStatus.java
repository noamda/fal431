
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for axxanaCopyStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="axxanaCopyStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ok"/>
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="Initializing"/>
 *     &lt;enumeration value="Down"/>
 *     &lt;enumeration value="ExceedingLagPolicy"/>
 *     &lt;enumeration value="FailedToCreate"/>
 *     &lt;enumeration value="MemoryProblem"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "axxanaCopyStatus")
@XmlEnum
public enum AxxanaCopyStatus {

    @XmlEnumValue("Ok")
    OK("Ok"),
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("Initializing")
    INITIALIZING("Initializing"),
    @XmlEnumValue("Down")
    DOWN("Down"),
    @XmlEnumValue("ExceedingLagPolicy")
    EXCEEDING_LAG_POLICY("ExceedingLagPolicy"),
    @XmlEnumValue("FailedToCreate")
    FAILED_TO_CREATE("FailedToCreate"),
    @XmlEnumValue("MemoryProblem")
    MEMORY_PROBLEM("MemoryProblem"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    AxxanaCopyStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AxxanaCopyStatus fromValue(String v) {
        for (AxxanaCopyStatus c: AxxanaCopyStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
