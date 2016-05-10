
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="arrayType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Vnx"/>
 *     &lt;enumeration value="Symmetrix"/>
 *     &lt;enumeration value="Vplex"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "arrayType")
@XmlEnum
public enum ArrayType {

    @XmlEnumValue("Vnx")
    VNX("Vnx"),
    @XmlEnumValue("Symmetrix")
    SYMMETRIX("Symmetrix"),
    @XmlEnumValue("Vplex")
    VPLEX("Vplex"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ArrayType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ArrayType fromValue(String v) {
        for (ArrayType c: ArrayType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
