package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

import javax.xml.bind.annotation.*;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "JsonSubType")
@JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value = SplitterVolumeSANInfo.class, name = "SplitterVolumeSANInfo")})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitterVolume", propOrder = {"splitterUID", "deviceUID"})
@XmlSeeAlso({SplitterVolumeSANInfo.class})
public class SplitterVolume {
    @XmlElement(nillable = true)
    protected SplitterUID splitterUID;
    @XmlElement(nillable = true)
    protected DeviceUID deviceUID;

    public SplitterVolume() {
    }

    public SplitterVolume(SplitterUID splitterUID, DeviceUID deviceUID) {
        this.splitterUID = splitterUID;
        this.deviceUID = deviceUID;
    }


    public SplitterUID getSplitterUID() {
        return this.splitterUID;
    }


    public void setSplitterUID(SplitterUID value) {
        this.splitterUID = value;
    }


    public DeviceUID getDeviceUID() {
        return this.deviceUID;
    }


    public void setDeviceUID(DeviceUID value) {
        this.deviceUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SplitterVolume)) {
            return false;
        }
        SplitterVolume otherObj = (SplitterVolume) obj;

        return (this.splitterUID != null ? this.splitterUID.equals(otherObj.splitterUID) : this.splitterUID == otherObj.splitterUID) && (this.deviceUID != null ? this.deviceUID.equals(otherObj.deviceUID) : this.deviceUID == otherObj.deviceUID);
    }


    public int hashCode() {
        return (this.splitterUID != null ? this.splitterUID.hashCode() : 0) ^ (this.deviceUID != null ? this.deviceUID.hashCode() : 0);
    }


    public String toString() {
        return "SplitterVolume [splitterUID=" + this.splitterUID + ", " + "deviceUID=" + this.deviceUID + "]";
    }
}


