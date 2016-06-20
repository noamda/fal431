package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupCopyProtectionWindowsInfo", propOrder = {"groupCopyUID", "protectionWindows"})
public class ConsistencyGroupCopyProtectionWindowsInfo {
    protected ConsistencyGroupCopyUID groupCopyUID;
    protected ProtectionWindowsInfo protectionWindows;

    public ConsistencyGroupCopyProtectionWindowsInfo() {
    }

    public ConsistencyGroupCopyProtectionWindowsInfo(ConsistencyGroupCopyUID groupCopyUID, ProtectionWindowsInfo protectionWindows) {
        this.groupCopyUID = groupCopyUID;
        this.protectionWindows = protectionWindows;
    }


    public ConsistencyGroupCopyUID getGroupCopyUID() {
        return this.groupCopyUID;
    }


    public void setGroupCopyUID(ConsistencyGroupCopyUID value) {
        this.groupCopyUID = value;
    }


    public ProtectionWindowsInfo getProtectionWindows() {
        return this.protectionWindows;
    }


    public void setProtectionWindows(ProtectionWindowsInfo value) {
        this.protectionWindows = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupCopyProtectionWindowsInfo)) {
            return false;
        }
        ConsistencyGroupCopyProtectionWindowsInfo otherObj = (ConsistencyGroupCopyProtectionWindowsInfo) obj;

        return (this.groupCopyUID != null ? this.groupCopyUID.equals(otherObj.groupCopyUID) : this.groupCopyUID == otherObj.groupCopyUID) && (this.protectionWindows != null ? this.protectionWindows.equals(otherObj.protectionWindows) : this.protectionWindows == otherObj.protectionWindows);
    }


    public int hashCode() {
        return (this.groupCopyUID != null ? this.groupCopyUID.hashCode() : 0) ^ (this.protectionWindows != null ? this.protectionWindows.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupCopyProtectionWindowsInfo [groupCopyUID=" + this.groupCopyUID + ", " + "protectionWindows=" + this.protectionWindows + "]";
    }
}


