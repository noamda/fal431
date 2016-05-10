
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bookmarkConsolidationPolicy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="bookmarkConsolidationPolicy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AlwaysConsolidate"/>
 *     &lt;enumeration value="SurviveDaily"/>
 *     &lt;enumeration value="SurviveWeekly"/>
 *     &lt;enumeration value="SurviveMonthly"/>
 *     &lt;enumeration value="NeverConsolidate"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "bookmarkConsolidationPolicy")
@XmlEnum
public enum BookmarkConsolidationPolicy {

    @XmlEnumValue("AlwaysConsolidate")
    AlwaysConsolidate("AlwaysConsolidate"),
    @XmlEnumValue("SurviveDaily")
    SurviveDaily("SurviveDaily"),
    @XmlEnumValue("SurviveWeekly")
    SurviveWeekly("SurviveWeekly"),
    @XmlEnumValue("SurviveMonthly")
    SurviveMonthly("SurviveMonthly"),
    @XmlEnumValue("NeverConsolidate")
    NeverConsolidate("NeverConsolidate"),
    @XmlEnumValue("Unknown")
    Unknown("Unknown");
    private final String value;

    BookmarkConsolidationPolicy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BookmarkConsolidationPolicy fromValue(String v) {
        for (BookmarkConsolidationPolicy c: BookmarkConsolidationPolicy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
