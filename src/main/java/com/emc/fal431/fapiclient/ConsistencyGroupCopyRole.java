
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consistencyGroupCopyRole.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="consistencyGroupCopyRole">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="TemporaryActive"/>
 *     &lt;enumeration value="Replica"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "consistencyGroupCopyRole")
@XmlEnum
public enum ConsistencyGroupCopyRole {

    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("TemporaryActive")
    TEMPORARY_ACTIVE("TemporaryActive"),
    @XmlEnumValue("Replica")
    REPLICA("Replica"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ConsistencyGroupCopyRole(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConsistencyGroupCopyRole fromValue(String v) {
        for (ConsistencyGroupCopyRole c: ConsistencyGroupCopyRole.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
