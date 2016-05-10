
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for journalState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="journalState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Distributing"/>
 *     &lt;enumeration value="EnablingLoggedAccess"/>
 *     &lt;enumeration value="EnablingVirtualAccess"/>
 *     &lt;enumeration value="SnapshotAccess"/>
 *     &lt;enumeration value="ErrorAccessingVirtualImage"/>
 *     &lt;enumeration value="Locking"/>
 *     &lt;enumeration value="Locked"/>
 *     &lt;enumeration value="LongResync"/>
 *     &lt;enumeration value="Recovering"/>
 *     &lt;enumeration value="Inaccessible"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "journalState")
@XmlEnum
public enum JournalState {

    @XmlEnumValue("Distributing")
    DISTRIBUTING("Distributing"),
    @XmlEnumValue("EnablingLoggedAccess")
    ENABLING_LOGGED_ACCESS("EnablingLoggedAccess"),
    @XmlEnumValue("EnablingVirtualAccess")
    ENABLING_VIRTUAL_ACCESS("EnablingVirtualAccess"),
    @XmlEnumValue("SnapshotAccess")
    SNAPSHOT_ACCESS("SnapshotAccess"),
    @XmlEnumValue("ErrorAccessingVirtualImage")
    ERROR_ACCESSING_VIRTUAL_IMAGE("ErrorAccessingVirtualImage"),
    @XmlEnumValue("Locking")
    LOCKING("Locking"),
    @XmlEnumValue("Locked")
    LOCKED("Locked"),
    @XmlEnumValue("LongResync")
    LONG_RESYNC("LongResync"),
    @XmlEnumValue("Recovering")
    RECOVERING("Recovering"),
    @XmlEnumValue("Inaccessible")
    INACCESSIBLE("Inaccessible"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    JournalState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JournalState fromValue(String v) {
        for (JournalState c: JournalState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
