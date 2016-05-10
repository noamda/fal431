
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for phoenixClusterStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="phoenixClusterStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="Down"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "phoenixClusterStatus")
@XmlEnum
public enum PhoenixClusterStatus {

    OK("OK"),
    @XmlEnumValue("Down")
    DOWN("Down"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    PhoenixClusterStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PhoenixClusterStatus fromValue(String v) {
        for (PhoenixClusterStatus c: PhoenixClusterStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
