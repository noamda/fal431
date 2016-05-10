
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for imageAccessMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="imageAccessMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LoggedAccess"/>
 *     &lt;enumeration value="VirtualAccess"/>
 *     &lt;enumeration value="VirtualAccessWithRoll"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "imageAccessMode")
@XmlEnum
public enum ImageAccessMode {

    @XmlEnumValue("LoggedAccess")
    LoggedAccess("LoggedAccess"),
    @XmlEnumValue("VirtualAccess")
    VirtualAccess("VirtualAccess"),
    @XmlEnumValue("VirtualAccessWithRoll")
    VirtualAccessWithRoll("VirtualAccessWithRoll"),
    @XmlEnumValue("Unknown")
    Unknown("Unknown");
    private final String value;

    ImageAccessMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImageAccessMode fromValue(String v) {
        for (ImageAccessMode c: ImageAccessMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
