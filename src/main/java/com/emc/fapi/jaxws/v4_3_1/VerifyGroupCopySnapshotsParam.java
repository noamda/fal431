package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifyGroupCopySnapshotsParam", propOrder = {"snapshotDescription"})
public class VerifyGroupCopySnapshotsParam {
    @XmlElement(required = true)
    protected String snapshotDescription;

    public VerifyGroupCopySnapshotsParam() {
    }

    public VerifyGroupCopySnapshotsParam(String snapshotDescription) {
        this.snapshotDescription = snapshotDescription;
    }


    public String getSnapshotDescription() {
        return this.snapshotDescription;
    }


    public void setSnapshotDescription(String value) {
        this.snapshotDescription = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VerifyGroupCopySnapshotsParam)) {
            return false;
        }
        VerifyGroupCopySnapshotsParam otherObj = (VerifyGroupCopySnapshotsParam) obj;

        return this.snapshotDescription == otherObj.snapshotDescription ? true : this.snapshotDescription != null ? this.snapshotDescription.equals(otherObj.snapshotDescription) : false;
    }


    public int hashCode() {
        return this.snapshotDescription != null ? this.snapshotDescription.hashCode() : 0;
    }


    public String toString() {
        return "VerifyGroupCopySnapshotsParam [snapshotDescription=" + this.snapshotDescription + "]";
    }
}


