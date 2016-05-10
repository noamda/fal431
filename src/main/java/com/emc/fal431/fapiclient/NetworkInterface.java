
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for networkInterface.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="networkInterface">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WAN"/>
 *     &lt;enumeration value="LAN"/>
 *     &lt;enumeration value="ISCSI1"/>
 *     &lt;enumeration value="ISCSI2"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "networkInterface")
@XmlEnum
public enum NetworkInterface {

    WAN("WAN"),
    LAN("LAN"),
    @XmlEnumValue("ISCSI1")
    ISCSI_1("ISCSI1"),
    @XmlEnumValue("ISCSI2")
    ISCSI_2("ISCSI2"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    NetworkInterface(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NetworkInterface fromValue(String v) {
        for (NetworkInterface c: NetworkInterface.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
