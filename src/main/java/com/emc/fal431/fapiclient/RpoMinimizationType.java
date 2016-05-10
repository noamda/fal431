
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rpoMinimizationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="rpoMinimizationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MinimizeLag"/>
 *     &lt;enumeration value="MinimizeBandwidth"/>
 *     &lt;enumeration value="Irrelevant"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "rpoMinimizationType")
@XmlEnum
public enum RpoMinimizationType {

    @XmlEnumValue("MinimizeLag")
    MINIMIZE_LAG("MinimizeLag"),
    @XmlEnumValue("MinimizeBandwidth")
    MINIMIZE_BANDWIDTH("MinimizeBandwidth"),
    @XmlEnumValue("Irrelevant")
    IRRELEVANT("Irrelevant"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    RpoMinimizationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RpoMinimizationType fromValue(String v) {
        for (RpoMinimizationType c: RpoMinimizationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}