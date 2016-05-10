
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for storageAccessState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="storageAccessState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DirectAccess"/>
 *     &lt;enumeration value="LoggedAccess"/>
 *     &lt;enumeration value="VirtualAccess"/>
 *     &lt;enumeration value="EnablingLoggedAccess"/>
 *     &lt;enumeration value="EnablingVirtualAccess"/>
 *     &lt;enumeration value="VirtualAccessRollingImage"/>
 *     &lt;enumeration value="LoggedAccessRollComplete"/>
 *     &lt;enumeration value="NoAccess"/>
 *     &lt;enumeration value="NoAccessUndoingWrites"/>
 *     &lt;enumeration value="NoAccessSpaceFull"/>
 *     &lt;enumeration value="NoAccessJournalPreserved"/>
 *     &lt;enumeration value="NoAccessBFSGroup"/>
 *     &lt;enumeration value="VirtualAccessCannotRollImage"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "storageAccessState")
@XmlEnum
public enum StorageAccessState {

    @XmlEnumValue("DirectAccess")
    DIRECT_ACCESS("DirectAccess"),
    @XmlEnumValue("LoggedAccess")
    LOGGED_ACCESS("LoggedAccess"),
    @XmlEnumValue("VirtualAccess")
    VIRTUAL_ACCESS("VirtualAccess"),
    @XmlEnumValue("EnablingLoggedAccess")
    ENABLING_LOGGED_ACCESS("EnablingLoggedAccess"),
    @XmlEnumValue("EnablingVirtualAccess")
    ENABLING_VIRTUAL_ACCESS("EnablingVirtualAccess"),
    @XmlEnumValue("VirtualAccessRollingImage")
    VIRTUAL_ACCESS_ROLLING_IMAGE("VirtualAccessRollingImage"),
    @XmlEnumValue("LoggedAccessRollComplete")
    LOGGED_ACCESS_ROLL_COMPLETE("LoggedAccessRollComplete"),
    @XmlEnumValue("NoAccess")
    NO_ACCESS("NoAccess"),
    @XmlEnumValue("NoAccessUndoingWrites")
    NO_ACCESS_UNDOING_WRITES("NoAccessUndoingWrites"),
    @XmlEnumValue("NoAccessSpaceFull")
    NO_ACCESS_SPACE_FULL("NoAccessSpaceFull"),
    @XmlEnumValue("NoAccessJournalPreserved")
    NO_ACCESS_JOURNAL_PRESERVED("NoAccessJournalPreserved"),
    @XmlEnumValue("NoAccessBFSGroup")
    NO_ACCESS_BFS_GROUP("NoAccessBFSGroup"),
    @XmlEnumValue("VirtualAccessCannotRollImage")
    VIRTUAL_ACCESS_CANNOT_ROLL_IMAGE("VirtualAccessCannotRollImage"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    StorageAccessState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StorageAccessState fromValue(String v) {
        for (StorageAccessState c: StorageAccessState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
