
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recoverPointLicenseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="recoverPointLicenseType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SE"/>
 *     &lt;enumeration value="EX"/>
 *     &lt;enumeration value="CL"/>
 *     &lt;enumeration value="VE"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "recoverPointLicenseType")
@XmlEnum
public enum RecoverPointLicenseType {

    SE("SE"),
    EX("EX"),
    CL("CL"),
    VE("VE"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    RecoverPointLicenseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecoverPointLicenseType fromValue(String v) {
        for (RecoverPointLicenseType c: RecoverPointLicenseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
