package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileSystemInformation", propOrder = {"fileSystemUID", "volumes", "name", "defaultMountPath", "defaultDataMover", "size", "vdm"})
public class FileSystemInformation {
    @XmlElement(nillable = true)
    protected FileSystemUID fileSystemUID;
    @XmlElement(nillable = true)
    protected List<DeviceUID> volumes;
    protected String name;
    protected String defaultMountPath;
    protected String defaultDataMover;
    protected long size;
    protected boolean vdm;

    public FileSystemInformation() {
    }

    public FileSystemInformation(FileSystemUID fileSystemUID, List<DeviceUID> volumes, String name, String defaultMountPath, String defaultDataMover, long size, boolean vdm) {
        this.fileSystemUID = fileSystemUID;
        this.volumes = volumes;
        this.name = name;
        this.defaultMountPath = defaultMountPath;
        this.defaultDataMover = defaultDataMover;
        this.size = size;
        this.vdm = vdm;
    }


    public FileSystemUID getFileSystemUID() {
        return this.fileSystemUID;
    }


    public void setFileSystemUID(FileSystemUID value) {
        this.fileSystemUID = value;
    }


    public List<DeviceUID> getVolumes() {
        if (this.volumes == null) {
            this.volumes = new ArrayList();
        }
        return this.volumes;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public String getDefaultMountPath() {
        return this.defaultMountPath;
    }


    public void setDefaultMountPath(String value) {
        this.defaultMountPath = value;
    }


    public String getDefaultDataMover() {
        return this.defaultDataMover;
    }


    public void setDefaultDataMover(String value) {
        this.defaultDataMover = value;
    }


    public long getSize() {
        return this.size;
    }


    public void setSize(long value) {
        this.size = value;
    }


    public boolean isVdm() {
        return this.vdm;
    }


    public void setVdm(boolean value) {
        this.vdm = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof FileSystemInformation)) {
            return false;
        }
        FileSystemInformation otherObj = (FileSystemInformation) obj;

        return (this.fileSystemUID != null ? this.fileSystemUID.equals(otherObj.fileSystemUID) : this.fileSystemUID == otherObj.fileSystemUID) && (this.volumes != null ? this.volumes.equals(otherObj.volumes) : this.volumes == otherObj.volumes) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.defaultMountPath != null ? this.defaultMountPath.equals(otherObj.defaultMountPath) : this.defaultMountPath == otherObj.defaultMountPath) && (this.defaultDataMover != null ? this.defaultDataMover.equals(otherObj.defaultDataMover) : this.defaultDataMover == otherObj.defaultDataMover) && (this.size == otherObj.size) && (this.vdm == otherObj.vdm);
    }


    public int hashCode() {
        return (this.fileSystemUID != null ? this.fileSystemUID.hashCode() : 0) ^ (this.volumes != null ? this.volumes.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.defaultMountPath != null ? this.defaultMountPath.hashCode() : 0) ^ (this.defaultDataMover != null ? this.defaultDataMover.hashCode() : 0) ^ (int) this.size ^ (this.vdm ? 1 : 0);
    }


    public String toString() {
        return "FileSystemInformation [fileSystemUID=" + this.fileSystemUID + ", " + "volumes=" + this.volumes + ", " + "name=" + this.name + ", " + "defaultMountPath=" + this.defaultMountPath + ", " + "defaultDataMover=" + this.defaultDataMover + ", " + "size=" + this.size + ", " + "vdm=" + this.vdm + "]";
    }
}


