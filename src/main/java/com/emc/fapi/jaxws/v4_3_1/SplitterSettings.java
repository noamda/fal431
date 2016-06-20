package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "JsonSubType")
@JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value = AggregatedSplitterSettings.class, name = "AggregatedSplitterSettings"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = ArrayBasedSplitterSettings.class, name = "ArrayBasedSplitterSettings")})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitterSettings", propOrder = {"splitterUID", "splitterName", "attachedUserVolumes", "arrayUID"})
@XmlSeeAlso({ArrayBasedSplitterSettings.class, AggregatedSplitterSettings.class})
public class SplitterSettings {
    @XmlElement(nillable = true)
    protected SplitterUID splitterUID;
    protected String splitterName;
    @XmlElement(nillable = true)
    protected List<AttachedUserVolumeInfo> attachedUserVolumes;
    @XmlElement(nillable = true)
    protected ArrayUID arrayUID;

    public SplitterSettings() {
    }

    public SplitterSettings(SplitterUID splitterUID, String splitterName, List<AttachedUserVolumeInfo> attachedUserVolumes, ArrayUID arrayUID) {
        this.splitterUID = splitterUID;
        this.splitterName = splitterName;
        this.attachedUserVolumes = attachedUserVolumes;
        this.arrayUID = arrayUID;
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


    public List<AttachedUserVolumeInfo> getAttachedUserVolumes() {
        if (this.attachedUserVolumes == null) {
            this.attachedUserVolumes = new ArrayList();
        }
        return this.attachedUserVolumes;
    }


    public ArrayUID getArrayUID() {
        return this.arrayUID;
    }


    public void setArrayUID(ArrayUID value) {
        this.arrayUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SplitterSettings)) {
            return false;
        }
        SplitterSettings otherObj = (SplitterSettings) obj;

        return (this.splitterUID != null ? this.splitterUID.equals(otherObj.splitterUID) : this.splitterUID == otherObj.splitterUID) && (this.splitterName != null ? this.splitterName.equals(otherObj.splitterName) : this.splitterName == otherObj.splitterName) && (this.attachedUserVolumes != null ? this.attachedUserVolumes.equals(otherObj.attachedUserVolumes) : this.attachedUserVolumes == otherObj.attachedUserVolumes) && (this.arrayUID != null ? this.arrayUID.equals(otherObj.arrayUID) : this.arrayUID == otherObj.arrayUID);
    }


    public int hashCode() {
        return (this.splitterUID != null ? this.splitterUID.hashCode() : 0) ^ (this.splitterName != null ? this.splitterName.hashCode() : 0) ^ (this.attachedUserVolumes != null ? this.attachedUserVolumes.hashCode() : 0) ^ (this.arrayUID != null ? this.arrayUID.hashCode() : 0);
    }


    public String toString() {
        return "SplitterSettings [splitterUID=" + this.splitterUID + ", " + "splitterName=" + this.splitterName + ", " + "attachedUserVolumes=" + this.attachedUserVolumes + ", " + "arrayUID=" + this.arrayUID + "]";
    }
}


