package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkAdvancedPolicy", propOrder = {"performLongInitialization", "snapshotGranularity"})
public class LinkAdvancedPolicy {
    protected boolean performLongInitialization;
    @XmlElement(required = true, nillable = true)
    protected SnapshotGranularity snapshotGranularity;

    public LinkAdvancedPolicy() {
    }

    public LinkAdvancedPolicy(boolean performLongInitialization, SnapshotGranularity snapshotGranularity) {
        this.performLongInitialization = performLongInitialization;
        this.snapshotGranularity = snapshotGranularity;
    }


    public boolean isPerformLongInitialization() {
        return this.performLongInitialization;
    }


    public void setPerformLongInitialization(boolean value) {
        this.performLongInitialization = value;
    }


    public SnapshotGranularity getSnapshotGranularity() {
        return this.snapshotGranularity;
    }


    public void setSnapshotGranularity(SnapshotGranularity value) {
        this.snapshotGranularity = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof LinkAdvancedPolicy)) {
            return false;
        }
        LinkAdvancedPolicy otherObj = (LinkAdvancedPolicy) obj;

        return (this.performLongInitialization == otherObj.performLongInitialization) && (this.snapshotGranularity != null ? this.snapshotGranularity.equals(otherObj.snapshotGranularity) : this.snapshotGranularity == otherObj.snapshotGranularity);
    }


    public int hashCode() {
        return (this.performLongInitialization ? 1 : 0) ^ (this.snapshotGranularity != null ? this.snapshotGranularity.hashCode() : 0);
    }


    public String toString() {
        return "LinkAdvancedPolicy [performLongInitialization=" + this.performLongInitialization + ", " + "snapshotGranularity=" + this.snapshotGranularity + "]";
    }
}


