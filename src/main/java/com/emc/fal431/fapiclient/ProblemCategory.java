
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for problemCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="problemCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Splitter"/>
 *     &lt;enumeration value="Device"/>
 *     &lt;enumeration value="RPA"/>
 *     &lt;enumeration value="Link"/>
 *     &lt;enumeration value="System"/>
 *     &lt;enumeration value="ConsistencyGroup"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "problemCategory")
@XmlEnum
public enum ProblemCategory {

    @XmlEnumValue("Splitter")
    SPLITTER("Splitter"),
    @XmlEnumValue("Device")
    DEVICE("Device"),
    RPA("RPA"),
    @XmlEnumValue("Link")
    LINK("Link"),
    @XmlEnumValue("System")
    SYSTEM("System"),
    @XmlEnumValue("ConsistencyGroup")
    CONSISTENCY_GROUP("ConsistencyGroup"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ProblemCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProblemCategory fromValue(String v) {
        for (ProblemCategory c: ProblemCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
