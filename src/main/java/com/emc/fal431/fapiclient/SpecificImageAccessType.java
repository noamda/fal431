
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for specificImageAccessType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="specificImageAccessType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Next"/>
 *     &lt;enumeration value="Previous"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "specificImageAccessType")
@XmlEnum
public enum SpecificImageAccessType {

    @XmlEnumValue("Next")
    NEXT("Next"),
    @XmlEnumValue("Previous")
    PREVIOUS("Previous"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    SpecificImageAccessType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpecificImageAccessType fromValue(String v) {
        for (SpecificImageAccessType c: SpecificImageAccessType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
