
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchImageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="searchImageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="AllBookmarks"/>
 *     &lt;enumeration value="SystemBookmarks"/>
 *     &lt;enumeration value="UserBookmarks"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "searchImageType")
@XmlEnum
public enum SearchImageType {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("AllBookmarks")
    ALL_BOOKMARKS("AllBookmarks"),
    @XmlEnumValue("SystemBookmarks")
    SYSTEM_BOOKMARKS("SystemBookmarks"),
    @XmlEnumValue("UserBookmarks")
    USER_BOOKMARKS("UserBookmarks"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    SearchImageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchImageType fromValue(String v) {
        for (SearchImageType c: SearchImageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
