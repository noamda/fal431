
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for splitterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="splitterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Clariion"/>
 *     &lt;enumeration value="Symmetrix"/>
 *     &lt;enumeration value="VplexArray"/>
 *     &lt;enumeration value="VplexDirector"/>
 *     &lt;enumeration value="VNX2e"/>
 *     &lt;enumeration value="VNX2eSP"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "splitterType")
@XmlEnum
public enum SplitterType {

    @XmlEnumValue("Clariion")
    CLARIION("Clariion"),
    @XmlEnumValue("Symmetrix")
    SYMMETRIX("Symmetrix"),
    @XmlEnumValue("VplexArray")
    VPLEX_ARRAY("VplexArray"),
    @XmlEnumValue("VplexDirector")
    VPLEX_DIRECTOR("VplexDirector"),
    @XmlEnumValue("VNX2e")
    VNX_2_E("VNX2e"),
    @XmlEnumValue("VNX2eSP")
    VNX_2_E_SP("VNX2eSP"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    SplitterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SplitterType fromValue(String v) {
        for (SplitterType c: SplitterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
