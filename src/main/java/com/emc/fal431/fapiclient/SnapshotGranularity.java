
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for snapshotGranularity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="snapshotGranularity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Dynamic"/>
 *     &lt;enumeration value="FixedPerSecond"/>
 *     &lt;enumeration value="FixedPerWrite"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "snapshotGranularity")
@XmlEnum
public enum SnapshotGranularity {

    @XmlEnumValue("Dynamic")
    DYNAMIC("Dynamic"),
    @XmlEnumValue("FixedPerSecond")
    FIXED_PER_SECOND("FixedPerSecond"),
    @XmlEnumValue("FixedPerWrite")
    FIXED_PER_WRITE("FixedPerWrite"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    SnapshotGranularity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SnapshotGranularity fromValue(String v) {
        for (SnapshotGranularity c: SnapshotGranularity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
