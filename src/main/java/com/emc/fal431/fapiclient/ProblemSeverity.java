
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for problemSeverity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="problemSeverity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="Critical"/>
 *     &lt;enumeration value="Warning"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="OK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "problemSeverity")
@XmlEnum
public enum ProblemSeverity {

    @XmlEnumValue("Error")
    Error("Error"),
    @XmlEnumValue("Critical")
    Critical("Critical"),
    @XmlEnumValue("Warning")
    Warning("Warning"),
    @XmlEnumValue("Unknown")
    Unknown("Unknown"),
    OK("OK");
    private final String value;

    ProblemSeverity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProblemSeverity fromValue(String v) {
        for (ProblemSeverity c: ProblemSeverity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
