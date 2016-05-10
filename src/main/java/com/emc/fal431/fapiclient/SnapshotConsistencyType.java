
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for snapshotConsistencyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="snapshotConsistencyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ConsistencyUnknown"/>
 *     &lt;enumeration value="ApplicationConsistent"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "snapshotConsistencyType")
@XmlEnum
public enum SnapshotConsistencyType {

    @XmlEnumValue("ConsistencyUnknown")
    ConsistencyUnknown("ConsistencyUnknown"),
    @XmlEnumValue("ApplicationConsistent")
    ApplicationConsistent("ApplicationConsistent"),
    @XmlEnumValue("Unknown")
    Unknown("Unknown");
    private final String value;

    SnapshotConsistencyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SnapshotConsistencyType fromValue(String v) {
        for (SnapshotConsistencyType c: SnapshotConsistencyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
