
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for volumeStorageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="volumeStorageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ClariionOrVNX"/>
 *     &lt;enumeration value="Symmetrix"/>
 *     &lt;enumeration value="VPLEX"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "volumeStorageType")
@XmlEnum
public enum VolumeStorageType {

    @XmlEnumValue("ClariionOrVNX")
    CLARIION_OR_VNX("ClariionOrVNX"),
    @XmlEnumValue("Symmetrix")
    SYMMETRIX("Symmetrix"),
    VPLEX("VPLEX"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VolumeStorageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VolumeStorageType fromValue(String v) {
        for (VolumeStorageType c: VolumeStorageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
