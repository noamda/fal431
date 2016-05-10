
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rpaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="rpaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Physical"/>
 *     &lt;enumeration value="Virtual"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "rpaType")
@XmlEnum
public enum RpaType {

    @XmlEnumValue("Physical")
    PHYSICAL("Physical"),
    @XmlEnumValue("Virtual")
    VIRTUAL("Virtual"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    RpaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RpaType fromValue(String v) {
        for (RpaType c: RpaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
