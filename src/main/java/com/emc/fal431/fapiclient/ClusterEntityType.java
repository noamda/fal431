
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clusterEntityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="clusterEntityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RPA"/>
 *     &lt;enumeration value="Splitter"/>
 *     &lt;enumeration value="Volume"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "clusterEntityType")
@XmlEnum
public enum ClusterEntityType {

    RPA("RPA"),
    @XmlEnumValue("Splitter")
    SPLITTER("Splitter"),
    @XmlEnumValue("Volume")
    VOLUME("Volume"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ClusterEntityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClusterEntityType fromValue(String v) {
        for (ClusterEntityType c: ClusterEntityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
