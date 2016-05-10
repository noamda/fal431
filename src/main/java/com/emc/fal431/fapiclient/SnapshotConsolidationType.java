
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for snapshotConsolidationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="snapshotConsolidationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoConsolidation"/>
 *     &lt;enumeration value="Manual"/>
 *     &lt;enumeration value="Daily"/>
 *     &lt;enumeration value="Weekly"/>
 *     &lt;enumeration value="Monthly"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "snapshotConsolidationType")
@XmlEnum
public enum SnapshotConsolidationType {

    @XmlEnumValue("NoConsolidation")
    NO_CONSOLIDATION("NoConsolidation"),
    @XmlEnumValue("Manual")
    MANUAL("Manual"),
    @XmlEnumValue("Daily")
    DAILY("Daily"),
    @XmlEnumValue("Weekly")
    WEEKLY("Weekly"),
    @XmlEnumValue("Monthly")
    MONTHLY("Monthly"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    SnapshotConsolidationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SnapshotConsolidationType fromValue(String v) {
        for (SnapshotConsolidationType c: SnapshotConsolidationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
