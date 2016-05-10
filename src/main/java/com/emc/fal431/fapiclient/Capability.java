
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for capability.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="capability">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SyncReplication"/>
 *     &lt;enumeration value="VolumesGreaterThanTwoTeraBytes"/>
 *     &lt;enumeration value="VirtualAccess"/>
 *     &lt;enumeration value="VirtualAccessWithRoll"/>
 *     &lt;enumeration value="ReadOnlyOnReplica"/>
 *     &lt;enumeration value="FakeVolumeSize"/>
 *     &lt;enumeration value="VolumeResize"/>
 *     &lt;enumeration value="UnmapVolumeCommand"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "capability")
@XmlEnum
public enum Capability {

    @XmlEnumValue("SyncReplication")
    SYNC_REPLICATION("SyncReplication"),
    @XmlEnumValue("VolumesGreaterThanTwoTeraBytes")
    VOLUMES_GREATER_THAN_TWO_TERA_BYTES("VolumesGreaterThanTwoTeraBytes"),
    @XmlEnumValue("VirtualAccess")
    VIRTUAL_ACCESS("VirtualAccess"),
    @XmlEnumValue("VirtualAccessWithRoll")
    VIRTUAL_ACCESS_WITH_ROLL("VirtualAccessWithRoll"),
    @XmlEnumValue("ReadOnlyOnReplica")
    READ_ONLY_ON_REPLICA("ReadOnlyOnReplica"),
    @XmlEnumValue("FakeVolumeSize")
    FAKE_VOLUME_SIZE("FakeVolumeSize"),
    @XmlEnumValue("VolumeResize")
    VOLUME_RESIZE("VolumeResize"),
    @XmlEnumValue("UnmapVolumeCommand")
    UNMAP_VOLUME_COMMAND("UnmapVolumeCommand"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    Capability(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Capability fromValue(String v) {
        for (Capability c: Capability.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
