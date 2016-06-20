package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterFileSystemView", propOrder = {"clusterUID", "fileSystemViews"})
public class ClusterFileSystemView {
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    @XmlElement(nillable = true)
    protected List<FileSystemView> fileSystemViews;

    public ClusterFileSystemView() {
    }

    public ClusterFileSystemView(ClusterUID clusterUID, List<FileSystemView> fileSystemViews) {
        this.clusterUID = clusterUID;
        this.fileSystemViews = fileSystemViews;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public List<FileSystemView> getFileSystemViews() {
        if (this.fileSystemViews == null) {
            this.fileSystemViews = new ArrayList();
        }
        return this.fileSystemViews;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClusterFileSystemView)) {
            return false;
        }
        ClusterFileSystemView otherObj = (ClusterFileSystemView) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.fileSystemViews != null ? this.fileSystemViews.equals(otherObj.fileSystemViews) : this.fileSystemViews == otherObj.fileSystemViews);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.fileSystemViews != null ? this.fileSystemViews.hashCode() : 0);
    }


    public String toString() {
        return "ClusterFileSystemView [clusterUID=" + this.clusterUID + ", " + "fileSystemViews=" + this.fileSystemViews + "]";
    }
}


