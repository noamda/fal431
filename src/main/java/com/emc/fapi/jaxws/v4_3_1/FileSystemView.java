package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileSystemView", propOrder = {"vnxUID", "fileSystemsExtendedInformation", "connectivityStatus", "vdms", "dateMovers", "storagePools"})
public class FileSystemView {
    @XmlElement(nillable = true)
    protected VnxUID vnxUID;
    @XmlElement(nillable = true)
    protected List<FileSystemExtendedInformation> fileSystemsExtendedInformation;
    @XmlElement(nillable = true)
    protected ConnectivityStatus connectivityStatus;
    @XmlElement(nillable = true)
    protected List<DataMoverView> vdms;
    @XmlElement(nillable = true)
    protected List<DataMoverView> dateMovers;
    @XmlElement(nillable = true)
    protected List<String> storagePools;

    public FileSystemView() {
    }

    public FileSystemView(VnxUID vnxUID, List<FileSystemExtendedInformation> fileSystemsExtendedInformation, ConnectivityStatus connectivityStatus, List<DataMoverView> vdms, List<DataMoverView> dateMovers, List<String> storagePools) {
        this.vnxUID = vnxUID;
        this.fileSystemsExtendedInformation = fileSystemsExtendedInformation;
        this.connectivityStatus = connectivityStatus;
        this.vdms = vdms;
        this.dateMovers = dateMovers;
        this.storagePools = storagePools;
    }


    public VnxUID getVnxUID() {
        return this.vnxUID;
    }


    public void setVnxUID(VnxUID value) {
        this.vnxUID = value;
    }


    public List<FileSystemExtendedInformation> getFileSystemsExtendedInformation() {
        if (this.fileSystemsExtendedInformation == null) {
            this.fileSystemsExtendedInformation = new ArrayList();
        }
        return this.fileSystemsExtendedInformation;
    }


    public ConnectivityStatus getConnectivityStatus() {
        return this.connectivityStatus;
    }


    public void setConnectivityStatus(ConnectivityStatus value) {
        this.connectivityStatus = value;
    }


    public List<DataMoverView> getVdms() {
        if (this.vdms == null) {
            this.vdms = new ArrayList();
        }
        return this.vdms;
    }


    public List<DataMoverView> getDateMovers() {
        if (this.dateMovers == null) {
            this.dateMovers = new ArrayList();
        }
        return this.dateMovers;
    }


    public List<String> getStoragePools() {
        if (this.storagePools == null) {
            this.storagePools = new ArrayList();
        }
        return this.storagePools;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof FileSystemView)) {
            return false;
        }
        FileSystemView otherObj = (FileSystemView) obj;

        return (this.vnxUID != null ? this.vnxUID.equals(otherObj.vnxUID) : this.vnxUID == otherObj.vnxUID) && (this.fileSystemsExtendedInformation != null ? this.fileSystemsExtendedInformation.equals(otherObj.fileSystemsExtendedInformation) : this.fileSystemsExtendedInformation == otherObj.fileSystemsExtendedInformation) && (this.connectivityStatus != null ? this.connectivityStatus.equals(otherObj.connectivityStatus) : this.connectivityStatus == otherObj.connectivityStatus) && (this.vdms != null ? this.vdms.equals(otherObj.vdms) : this.vdms == otherObj.vdms) && (this.dateMovers != null ? this.dateMovers.equals(otherObj.dateMovers) : this.dateMovers == otherObj.dateMovers) && (this.storagePools != null ? this.storagePools.equals(otherObj.storagePools) : this.storagePools == otherObj.storagePools);
    }


    public int hashCode() {
        return (this.vnxUID != null ? this.vnxUID.hashCode() : 0) ^ (this.fileSystemsExtendedInformation != null ? this.fileSystemsExtendedInformation.hashCode() : 0) ^ (this.connectivityStatus != null ? this.connectivityStatus.hashCode() : 0) ^ (this.vdms != null ? this.vdms.hashCode() : 0) ^ (this.dateMovers != null ? this.dateMovers.hashCode() : 0) ^ (this.storagePools != null ? this.storagePools.hashCode() : 0);
    }


    public String toString() {
        return "FileSystemView [vnxUID=" + this.vnxUID + ", " + "fileSystemsExtendedInformation=" + this.fileSystemsExtendedInformation + ", " + "connectivityStatus=" + this.connectivityStatus + ", " + "vdms=" + this.vdms + ", " + "dateMovers=" + this.dateMovers + ", " + "storagePools=" + this.storagePools + "]";
    }
}


