
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hostOS.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="hostOS">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AIX"/>
 *     &lt;enumeration value="HPUX"/>
 *     &lt;enumeration value="Linux2_4"/>
 *     &lt;enumeration value="Linux2_6"/>
 *     &lt;enumeration value="Solaris"/>
 *     &lt;enumeration value="VMware_ESX"/>
 *     &lt;enumeration value="VMware_ESX_Windows"/>
 *     &lt;enumeration value="Windows"/>
 *     &lt;enumeration value="Other_Mixed"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "hostOS")
@XmlEnum
public enum HostOS {

    AIX("AIX"),
    HPUX("HPUX"),
    @XmlEnumValue("Linux2_4")
    LINUX_2_4("Linux2_4"),
    @XmlEnumValue("Linux2_6")
    LINUX_2_6("Linux2_6"),
    @XmlEnumValue("Solaris")
    SOLARIS("Solaris"),
    @XmlEnumValue("VMware_ESX")
    V_MWARE_ESX("VMware_ESX"),
    @XmlEnumValue("VMware_ESX_Windows")
    V_MWARE_ESX_WINDOWS("VMware_ESX_Windows"),
    @XmlEnumValue("Windows")
    WINDOWS("Windows"),
    @XmlEnumValue("Other_Mixed")
    OTHER_MIXED("Other_Mixed"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    HostOS(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HostOS fromValue(String v) {
        for (HostOS c: HostOS.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
