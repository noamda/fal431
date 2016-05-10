
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for journalCompressionLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="journalCompressionLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Medium"/>
 *     &lt;enumeration value="High"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "journalCompressionLevel")
@XmlEnum
public enum JournalCompressionLevel {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Medium")
    MEDIUM("Medium"),
    @XmlEnumValue("High")
    HIGH("High"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    JournalCompressionLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JournalCompressionLevel fromValue(String v) {
        for (JournalCompressionLevel c: JournalCompressionLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
