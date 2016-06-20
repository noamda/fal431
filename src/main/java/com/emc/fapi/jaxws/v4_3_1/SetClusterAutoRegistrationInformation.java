package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setClusterAutoRegistrationInformation", propOrder = {"clusterUID", "autoRegInfo"})
public class SetClusterAutoRegistrationInformation {
    @XmlElement(namespace = "http:
            protected ClusterUID clusterUID;
            protected ClusterAutoRegistrationInformation autoRegInfo;

            public SetClusterAutoRegistrationInformation(){}

            public SetClusterAutoRegistrationInformation(ClusterUID clusterUID, ClusterAutoRegistrationInformation autoRegInfo) {
        this.clusterUID = clusterUID;
        this.autoRegInfo = autoRegInfo;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public ClusterAutoRegistrationInformation getAutoRegInfo() {
        return this.autoRegInfo;
    }


    public void setAutoRegInfo(ClusterAutoRegistrationInformation value) {
        this.autoRegInfo = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetClusterAutoRegistrationInformation)) {
            return false;
        }
        SetClusterAutoRegistrationInformation otherObj = (SetClusterAutoRegistrationInformation) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.autoRegInfo != null ? this.autoRegInfo.equals(otherObj.autoRegInfo) : this.autoRegInfo == otherObj.autoRegInfo);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.autoRegInfo != null ? this.autoRegInfo.hashCode() : 0);
    }


    public String toString() {
        return "SetClusterAutoRegistrationInformation [clusterUID=" + this.clusterUID + ", " + "autoRegInfo=" + this.autoRegInfo + "]";
    }
}


