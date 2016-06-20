package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MountInformation", propOrder = {"dataMover", "mountPath", "readOnly", "sharesInfo"})
public class MountInformation {
    protected String dataMover;
    protected String mountPath;
    protected boolean readOnly;
    @XmlElement(nillable = true)
    protected List<ShareInformation> sharesInfo;

    public MountInformation() {
    }

    public MountInformation(String dataMover, String mountPath, boolean readOnly, List<ShareInformation> sharesInfo) {
        this.dataMover = dataMover;
        this.mountPath = mountPath;
        this.readOnly = readOnly;
        this.sharesInfo = sharesInfo;
    }


    public String getDataMover() {
        return this.dataMover;
    }


    public void setDataMover(String value) {
        this.dataMover = value;
    }


    public String getMountPath() {
        return this.mountPath;
    }


    public void setMountPath(String value) {
        this.mountPath = value;
    }


    public boolean isReadOnly() {
        return this.readOnly;
    }


    public void setReadOnly(boolean value) {
        this.readOnly = value;
    }


    public List<ShareInformation> getSharesInfo() {
        if (this.sharesInfo == null) {
            this.sharesInfo = new ArrayList();
        }
        return this.sharesInfo;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof MountInformation)) {
            return false;
        }
        MountInformation otherObj = (MountInformation) obj;

        return (this.dataMover != null ? this.dataMover.equals(otherObj.dataMover) : this.dataMover == otherObj.dataMover) && (this.mountPath != null ? this.mountPath.equals(otherObj.mountPath) : this.mountPath == otherObj.mountPath) && (this.readOnly == otherObj.readOnly) && (this.sharesInfo != null ? this.sharesInfo.equals(otherObj.sharesInfo) : this.sharesInfo == otherObj.sharesInfo);
    }


    public int hashCode() {
        return (this.dataMover != null ? this.dataMover.hashCode() : 0) ^ (this.mountPath != null ? this.mountPath.hashCode() : 0) ^ (this.readOnly ? 1 : 0) ^ (this.sharesInfo != null ? this.sharesInfo.hashCode() : 0);
    }


    public String toString() {
        return "MountInformation [dataMover=" + this.dataMover + ", " + "mountPath=" + this.mountPath + ", " + "readOnly=" + this.readOnly + ", " + "sharesInfo=" + this.sharesInfo + "]";
    }
}


