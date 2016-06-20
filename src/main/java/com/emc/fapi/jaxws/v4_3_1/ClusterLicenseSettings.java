package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("ClusterLicenseSettings")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterLicenseSettings", propOrder = {"clusterUID"})
public class ClusterLicenseSettings
        extends LicenseSettings {
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;

    public ClusterLicenseSettings() {
    }

    public ClusterLicenseSettings(ClusterUID clusterUID) {
        this.clusterUID = clusterUID;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClusterLicenseSettings)) {
            return false;
        }
        ClusterLicenseSettings otherObj = (ClusterLicenseSettings) obj;

        return (super.equals(obj)) && (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.clusterUID != null ? this.clusterUID.hashCode() : 0);
    }


    public String toString() {
        return "ClusterLicenseSettings [super=" + super.toString() + ", " + "clusterUID=" + this.clusterUID + "]";
    }
}


