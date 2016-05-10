
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vmProtectionStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="vmProtectionStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotProtected"/>
 *     &lt;enumeration value="PartiallyProtected"/>
 *     &lt;enumeration value="FullyProtected"/>
 *     &lt;enumeration value="NoLuns"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "vmProtectionStatus")
@XmlEnum
public enum VmProtectionStatus {

    @XmlEnumValue("NotProtected")
    NOT_PROTECTED("NotProtected"),
    @XmlEnumValue("PartiallyProtected")
    PARTIALLY_PROTECTED("PartiallyProtected"),
    @XmlEnumValue("FullyProtected")
    FULLY_PROTECTED("FullyProtected"),
    @XmlEnumValue("NoLuns")
    NO_LUNS("NoLuns"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VmProtectionStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VmProtectionStatus fromValue(String v) {
        for (VmProtectionStatus c: VmProtectionStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
