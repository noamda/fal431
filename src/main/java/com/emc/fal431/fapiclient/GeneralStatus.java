
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for generalStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="generalStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Warning"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "generalStatus")
@XmlEnum
public enum GeneralStatus {

    OK("OK"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Warning")
    WARNING("Warning");
    private final String value;

    GeneralStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeneralStatus fromValue(String v) {
        for (GeneralStatus c: GeneralStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
