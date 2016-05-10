
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ipVersion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ipVersion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IPv4"/>
 *     &lt;enumeration value="IPv6"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ipVersion")
@XmlEnum
public enum IpVersion {

    @XmlEnumValue("IPv4")
    I_PV_4("IPv4"),
    @XmlEnumValue("IPv6")
    I_PV_6("IPv6"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    IpVersion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IpVersion fromValue(String v) {
        for (IpVersion c: IpVersion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
