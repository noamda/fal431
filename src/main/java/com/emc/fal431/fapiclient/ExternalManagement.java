
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for externalManagement.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="externalManagement">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="RPCE"/>
 *     &lt;enumeration value="SRM"/>
 *     &lt;enumeration value="REE"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "externalManagement")
@XmlEnum
public enum ExternalManagement {

    @XmlEnumValue("None")
    NONE("None"),
    RPCE("RPCE"),
    SRM("SRM"),
    REE("REE"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ExternalManagement(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExternalManagement fromValue(String v) {
        for (ExternalManagement c: ExternalManagement.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
