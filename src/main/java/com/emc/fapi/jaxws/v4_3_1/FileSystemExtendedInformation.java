package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileSystemExtendedInformation", propOrder = {"fileSystemInformation", "storageUsed", "hasProtectedFiles", "mountInformationList", "unmountedShareInformationList"})
public class FileSystemExtendedInformation {
    @XmlElement(nillable = true)
    protected FileSystemInformation fileSystemInformation;
    protected long storageUsed;
    protected boolean hasProtectedFiles;
    @XmlElement(nillable = true)
    protected List<MountInformation> mountInformationList;
    @XmlElement(nillable = true)
    protected List<ShareInformation> unmountedShareInformationList;

    public FileSystemExtendedInformation() {
    }

    public FileSystemExtendedInformation(FileSystemInformation fileSystemInformation, long storageUsed, boolean hasProtectedFiles, List<MountInformation> mountInformationList, List<ShareInformation> unmountedShareInformationList) {
        this.fileSystemInformation = fileSystemInformation;
        this.storageUsed = storageUsed;
        this.hasProtectedFiles = hasProtectedFiles;
        this.mountInformationList = mountInformationList;
        this.unmountedShareInformationList = unmountedShareInformationList;
    }


    public FileSystemInformation getFileSystemInformation() {
        return this.fileSystemInformation;
    }


    public void setFileSystemInformation(FileSystemInformation value) {
        this.fileSystemInformation = value;
    }


    public long getStorageUsed() {
        return this.storageUsed;
    }


    public void setStorageUsed(long value) {
        this.storageUsed = value;
    }


    public boolean isHasProtectedFiles() {
        return this.hasProtectedFiles;
    }


    public void setHasProtectedFiles(boolean value) {
        this.hasProtectedFiles = value;
    }


    public List<MountInformation> getMountInformationList() {
        if (this.mountInformationList == null) {
            this.mountInformationList = new ArrayList();
        }
        return this.mountInformationList;
    }


    public List<ShareInformation> getUnmountedShareInformationList() {
        if (this.unmountedShareInformationList == null) {
            this.unmountedShareInformationList = new ArrayList();
        }
        return this.unmountedShareInformationList;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof FileSystemExtendedInformation)) {
            return false;
        }
        FileSystemExtendedInformation otherObj = (FileSystemExtendedInformation) obj;

        return (this.fileSystemInformation != null ? this.fileSystemInformation.equals(otherObj.fileSystemInformation) : this.fileSystemInformation == otherObj.fileSystemInformation) && (this.storageUsed == otherObj.storageUsed) && (this.hasProtectedFiles == otherObj.hasProtectedFiles) && (this.mountInformationList != null ? this.mountInformationList.equals(otherObj.mountInformationList) : this.mountInformationList == otherObj.mountInformationList) && (this.unmountedShareInformationList != null ? this.unmountedShareInformationList.equals(otherObj.unmountedShareInformationList) : this.unmountedShareInformationList == otherObj.unmountedShareInformationList);
    }


    public int hashCode() {
        return (this.fileSystemInformation != null ? this.fileSystemInformation.hashCode() : 0) ^ (int) this.storageUsed ^ (this.hasProtectedFiles ? 1 : 0) ^ (this.mountInformationList != null ? this.mountInformationList.hashCode() : 0) ^ (this.unmountedShareInformationList != null ? this.unmountedShareInformationList.hashCode() : 0);
    }


    public String toString() {
        return "FileSystemExtendedInformation [fileSystemInformation=" + this.fileSystemInformation + ", " + "storageUsed=" + this.storageUsed + ", " + "hasProtectedFiles=" + this.hasProtectedFiles + ", " + "mountInformationList=" + this.mountInformationList + ", " + "unmountedShareInformationList=" + this.unmountedShareInformationList + "]";
    }
}


