package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupLinkInfo", propOrder = {"groupName", "linkUID", "sourceCopyName", "targetCopyName"})
public class ConsistencyGroupLinkInfo {
    protected String groupName;
    protected ConsistencyGroupLinkUID linkUID;
    protected String sourceCopyName;
    protected String targetCopyName;

    public ConsistencyGroupLinkInfo() {
    }

    public ConsistencyGroupLinkInfo(String groupName, ConsistencyGroupLinkUID linkUID, String sourceCopyName, String targetCopyName) {
        this.groupName = groupName;
        this.linkUID = linkUID;
        this.sourceCopyName = sourceCopyName;
        this.targetCopyName = targetCopyName;
    }


    public String getGroupName() {
        return this.groupName;
    }


    public void setGroupName(String value) {
        this.groupName = value;
    }


    public ConsistencyGroupLinkUID getLinkUID() {
        return this.linkUID;
    }


    public void setLinkUID(ConsistencyGroupLinkUID value) {
        this.linkUID = value;
    }


    public String getSourceCopyName() {
        return this.sourceCopyName;
    }


    public void setSourceCopyName(String value) {
        this.sourceCopyName = value;
    }


    public String getTargetCopyName() {
        return this.targetCopyName;
    }


    public void setTargetCopyName(String value) {
        this.targetCopyName = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupLinkInfo)) {
            return false;
        }
        ConsistencyGroupLinkInfo otherObj = (ConsistencyGroupLinkInfo) obj;

        return (this.groupName != null ? this.groupName.equals(otherObj.groupName) : this.groupName == otherObj.groupName) && (this.linkUID != null ? this.linkUID.equals(otherObj.linkUID) : this.linkUID == otherObj.linkUID) && (this.sourceCopyName != null ? this.sourceCopyName.equals(otherObj.sourceCopyName) : this.sourceCopyName == otherObj.sourceCopyName) && (this.targetCopyName != null ? this.targetCopyName.equals(otherObj.targetCopyName) : this.targetCopyName == otherObj.targetCopyName);
    }


    public int hashCode() {
        return (this.groupName != null ? this.groupName.hashCode() : 0) ^ (this.linkUID != null ? this.linkUID.hashCode() : 0) ^ (this.sourceCopyName != null ? this.sourceCopyName.hashCode() : 0) ^ (this.targetCopyName != null ? this.targetCopyName.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupLinkInfo [groupName=" + this.groupName + ", " + "linkUID=" + this.linkUID + ", " + "sourceCopyName=" + this.sourceCopyName + ", " + "targetCopyName=" + this.targetCopyName + "]";
    }
}


