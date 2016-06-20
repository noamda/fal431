package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeJournalVolume", propOrder = {"groupCopy", "volumeID"})
public class RemoveJournalVolume {
    protected ConsistencyGroupCopyUID groupCopy;
    protected DeviceUID volumeID;

    public RemoveJournalVolume() {
    }

    public RemoveJournalVolume(ConsistencyGroupCopyUID groupCopy, DeviceUID volumeID) {
        this.groupCopy = groupCopy;
        this.volumeID = volumeID;
    }


    public ConsistencyGroupCopyUID getGroupCopy() {
        return this.groupCopy;
    }


    public void setGroupCopy(ConsistencyGroupCopyUID value) {
        this.groupCopy = value;
    }


    public DeviceUID getVolumeID() {
        return this.volumeID;
    }


    public void setVolumeID(DeviceUID value) {
        this.volumeID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RemoveJournalVolume)) {
            return false;
        }
        RemoveJournalVolume otherObj = (RemoveJournalVolume) obj;

        return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.volumeID != null ? this.volumeID.equals(otherObj.volumeID) : this.volumeID == otherObj.volumeID);
    }


    public int hashCode() {
        return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.volumeID != null ? this.volumeID.hashCode() : 0);
    }


    public String toString() {
        return "RemoveJournalVolume [groupCopy=" + this.groupCopy + ", " + "volumeID=" + this.volumeID + "]";
    }
}


