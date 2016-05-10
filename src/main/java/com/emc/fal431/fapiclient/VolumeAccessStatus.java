
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for volumeAccessStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="volumeAccessStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="Reserved"/>
 *     &lt;enumeration value="BadSector"/>
 *     &lt;enumeration value="ReadOnly"/>
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "volumeAccessStatus")
@XmlEnum
public enum VolumeAccessStatus {

    OK("OK"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Reserved")
    RESERVED("Reserved"),
    @XmlEnumValue("BadSector")
    BAD_SECTOR("BadSector"),
    @XmlEnumValue("ReadOnly")
    READ_ONLY("ReadOnly"),
    NA("NA"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VolumeAccessStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VolumeAccessStatus fromValue(String v) {
        for (VolumeAccessStatus c: VolumeAccessStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
