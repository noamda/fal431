
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for quantityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="quantityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="microseconds"/>
 *     &lt;enumeration value="milliseconds"/>
 *     &lt;enumeration value="seconds"/>
 *     &lt;enumeration value="minutes"/>
 *     &lt;enumeration value="hours"/>
 *     &lt;enumeration value="days"/>
 *     &lt;enumeration value="bytes"/>
 *     &lt;enumeration value="KB"/>
 *     &lt;enumeration value="MB"/>
 *     &lt;enumeration value="GB"/>
 *     &lt;enumeration value="TB"/>
 *     &lt;enumeration value="writes"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "quantityType")
@XmlEnum
public enum QuantityType {

    @XmlEnumValue("microseconds")
    MICROSECONDS("microseconds"),
    @XmlEnumValue("milliseconds")
    MILLISECONDS("milliseconds"),
    @XmlEnumValue("seconds")
    SECONDS("seconds"),
    @XmlEnumValue("minutes")
    MINUTES("minutes"),
    @XmlEnumValue("hours")
    HOURS("hours"),
    @XmlEnumValue("days")
    DAYS("days"),
    @XmlEnumValue("bytes")
    BYTES("bytes"),
    KB("KB"),
    MB("MB"),
    GB("GB"),
    TB("TB"),
    @XmlEnumValue("writes")
    WRITES("writes"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    QuantityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuantityType fromValue(String v) {
        for (QuantityType c: QuantityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
