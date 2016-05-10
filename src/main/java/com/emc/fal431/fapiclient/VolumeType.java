
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for volumeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="volumeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="User"/>
 *     &lt;enumeration value="Journal"/>
 *     &lt;enumeration value="Repository"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "volumeType")
@XmlEnum
public enum VolumeType {

    @XmlEnumValue("User")
    USER("User"),
    @XmlEnumValue("Journal")
    JOURNAL("Journal"),
    @XmlEnumValue("Repository")
    REPOSITORY("Repository"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VolumeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VolumeType fromValue(String v) {
        for (VolumeType c: VolumeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
