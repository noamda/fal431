package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupCopyParam", propOrder = {"copyUID", "copyName", "volumeCreationParams"})
public class ConsistencyGroupCopyParam {
    @XmlElement(required = true)
    protected GlobalCopyUID copyUID;
    @XmlElement(required = true)
    protected String copyName;
    @XmlElement(required = true)
    protected ConsistencyGroupCopyVolumeCreationParams volumeCreationParams;

    public ConsistencyGroupCopyParam() {
    }

    public ConsistencyGroupCopyParam(GlobalCopyUID copyUID, String copyName, ConsistencyGroupCopyVolumeCreationParams volumeCreationParams) {
        this.copyUID = copyUID;
        this.copyName = copyName;
        this.volumeCreationParams = volumeCreationParams;
    }


    public GlobalCopyUID getCopyUID() {
        return this.copyUID;
    }


    public void setCopyUID(GlobalCopyUID value) {
        this.copyUID = value;
    }


    public String getCopyName() {
        return this.copyName;
    }


    public void setCopyName(String value) {
        this.copyName = value;
    }


    public ConsistencyGroupCopyVolumeCreationParams getVolumeCreationParams() {
        return this.volumeCreationParams;
    }


    public void setVolumeCreationParams(ConsistencyGroupCopyVolumeCreationParams value) {
        this.volumeCreationParams = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupCopyParam)) {
            return false;
        }
        ConsistencyGroupCopyParam otherObj = (ConsistencyGroupCopyParam) obj;

        return (this.copyUID != null ? this.copyUID.equals(otherObj.copyUID) : this.copyUID == otherObj.copyUID) && (this.copyName != null ? this.copyName.equals(otherObj.copyName) : this.copyName == otherObj.copyName) && (this.volumeCreationParams != null ? this.volumeCreationParams.equals(otherObj.volumeCreationParams) : this.volumeCreationParams == otherObj.volumeCreationParams);
    }


    public int hashCode() {
        return (this.copyUID != null ? this.copyUID.hashCode() : 0) ^ (this.copyName != null ? this.copyName.hashCode() : 0) ^ (this.volumeCreationParams != null ? this.volumeCreationParams.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupCopyParam [copyUID=" + this.copyUID + ", " + "copyName=" + this.copyName + ", " + "volumeCreationParams=" + this.volumeCreationParams + "]";
    }
}


