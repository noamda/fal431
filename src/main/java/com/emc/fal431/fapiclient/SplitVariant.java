
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for splitVariant.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="splitVariant">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="TSP"/>
 *     &lt;enumeration value="Redirect"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "splitVariant")
@XmlEnum
public enum SplitVariant {

    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    TSP("TSP"),
    @XmlEnumValue("Redirect")
    REDIRECT("Redirect"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    SplitVariant(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SplitVariant fromValue(String v) {
        for (SplitVariant c: SplitVariant.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
