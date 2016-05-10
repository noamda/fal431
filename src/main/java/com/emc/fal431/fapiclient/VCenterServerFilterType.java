
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vCenterServerFilterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="vCenterServerFilterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ESX"/>
 *     &lt;enumeration value="VM"/>
 *     &lt;enumeration value="Lun"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "vCenterServerFilterType")
@XmlEnum
public enum VCenterServerFilterType {

    ESX("ESX"),
    VM("VM"),
    @XmlEnumValue("Lun")
    LUN("Lun"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VCenterServerFilterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VCenterServerFilterType fromValue(String v) {
        for (VCenterServerFilterType c: VCenterServerFilterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
