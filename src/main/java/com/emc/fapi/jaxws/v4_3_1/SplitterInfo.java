package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitterInfo", propOrder = {"splitterUID", "splitterName"})
public class SplitterInfo {
    @XmlElement(required = true, nillable = true)
    protected SplitterUID splitterUID;
    @XmlElement(required = true)
    protected String splitterName;

    public SplitterInfo() {
    }

    public SplitterInfo(SplitterUID splitterUID, String splitterName) {
        this.splitterUID = splitterUID;
        this.splitterName = splitterName;
    }


    public SplitterUID getSplitterUID() {
        return this.splitterUID;
    }


    public void setSplitterUID(SplitterUID value) {
        this.splitterUID = value;
    }


    public String getSplitterName() {
        return this.splitterName;
    }


    public void setSplitterName(String value) {
        this.splitterName = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SplitterInfo)) {
            return false;
        }
        SplitterInfo otherObj = (SplitterInfo) obj;

        return (this.splitterUID != null ? this.splitterUID.equals(otherObj.splitterUID) : this.splitterUID == otherObj.splitterUID) && (this.splitterName != null ? this.splitterName.equals(otherObj.splitterName) : this.splitterName == otherObj.splitterName);
    }


    public int hashCode() {
        return (this.splitterUID != null ? this.splitterUID.hashCode() : 0) ^ (this.splitterName != null ? this.splitterName.hashCode() : 0);
    }


    public String toString() {
        return "SplitterInfo [splitterUID=" + this.splitterUID + ", " + "splitterName=" + this.splitterName + "]";
    }
}


