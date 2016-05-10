
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for splitterStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="splitterStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="Down"/>
 *     &lt;enumeration value="UnsupportedVersion"/>
 *     &lt;enumeration value="Uncontrollable"/>
 *     &lt;enumeration value="Warning"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "splitterStatus")
@XmlEnum
public enum SplitterStatus {

    OK("OK"),
    @XmlEnumValue("Down")
    DOWN("Down"),
    @XmlEnumValue("UnsupportedVersion")
    UNSUPPORTED_VERSION("UnsupportedVersion"),
    @XmlEnumValue("Uncontrollable")
    UNCONTROLLABLE("Uncontrollable"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    SplitterStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SplitterStatus fromValue(String v) {
        for (SplitterStatus c: SplitterStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
