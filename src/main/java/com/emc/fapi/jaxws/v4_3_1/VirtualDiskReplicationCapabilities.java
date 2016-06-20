package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskReplicationCapabilities", propOrder = {"includable", "includedByDefault", "cantBeIncludedReason"})
public class VirtualDiskReplicationCapabilities {
    protected boolean includable;
    protected boolean includedByDefault;
    protected String cantBeIncludedReason;

    public VirtualDiskReplicationCapabilities() {
    }

    public VirtualDiskReplicationCapabilities(boolean includable, boolean includedByDefault, String cantBeIncludedReason) {
        this.includable = includable;
        this.includedByDefault = includedByDefault;
        this.cantBeIncludedReason = cantBeIncludedReason;
    }


    public boolean isIncludable() {
        return this.includable;
    }


    public void setIncludable(boolean value) {
        this.includable = value;
    }


    public boolean isIncludedByDefault() {
        return this.includedByDefault;
    }


    public void setIncludedByDefault(boolean value) {
        this.includedByDefault = value;
    }


    public String getCantBeIncludedReason() {
        return this.cantBeIncludedReason;
    }


    public void setCantBeIncludedReason(String value) {
        this.cantBeIncludedReason = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VirtualDiskReplicationCapabilities)) {
            return false;
        }
        VirtualDiskReplicationCapabilities otherObj = (VirtualDiskReplicationCapabilities) obj;

        return (this.includable == otherObj.includable) && (this.includedByDefault == otherObj.includedByDefault) && (this.cantBeIncludedReason != null ? this.cantBeIncludedReason.equals(otherObj.cantBeIncludedReason) : this.cantBeIncludedReason == otherObj.cantBeIncludedReason);
    }


    public int hashCode() {
        return (this.includable ? 1 : 0) ^ (this.includedByDefault ? 1 : 0) ^ (this.cantBeIncludedReason != null ? this.cantBeIncludedReason.hashCode() : 0);
    }


    public String toString() {
        return "VirtualDiskReplicationCapabilities [includable=" + this.includable + ", " + "includedByDefault=" + this.includedByDefault + ", " + "cantBeIncludedReason=" + this.cantBeIncludedReason + "]";
    }
}


