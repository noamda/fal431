package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("JournalVolumeSettings")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournalVolumeSettings", propOrder = {"groupCopyUID"})
public class JournalVolumeSettings
        extends VolumeSettings {
    protected ConsistencyGroupCopyUID groupCopyUID;

    public JournalVolumeSettings() {
    }

    public JournalVolumeSettings(ConsistencyGroupCopyUID groupCopyUID) {
        this.groupCopyUID = groupCopyUID;
    }


    public ConsistencyGroupCopyUID getGroupCopyUID() {
        return this.groupCopyUID;
    }


    public void setGroupCopyUID(ConsistencyGroupCopyUID value) {
        this.groupCopyUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof JournalVolumeSettings)) {
            return false;
        }
        JournalVolumeSettings otherObj = (JournalVolumeSettings) obj;

        return (super.equals(obj)) && (this.groupCopyUID != null ? this.groupCopyUID.equals(otherObj.groupCopyUID) : this.groupCopyUID == otherObj.groupCopyUID);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.groupCopyUID != null ? this.groupCopyUID.hashCode() : 0);
    }


    public String toString() {
        return "JournalVolumeSettings [super=" + super.toString() + ", " + "groupCopyUID=" + this.groupCopyUID + "]";
    }
}


