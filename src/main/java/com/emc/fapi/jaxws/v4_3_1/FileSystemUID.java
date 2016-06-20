package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileSystemUID", propOrder = {"id", "vnxUID"})
public class FileSystemUID {
    protected long id;
    @XmlElement(required = true, nillable = true)
    protected VnxUID vnxUID;

    public FileSystemUID() {
    }

    public FileSystemUID(long id, VnxUID vnxUID) {
        this.id = id;
        this.vnxUID = vnxUID;
    }


    public long getId() {
        return this.id;
    }


    public void setId(long value) {
        this.id = value;
    }


    public VnxUID getVnxUID() {
        return this.vnxUID;
    }


    public void setVnxUID(VnxUID value) {
        this.vnxUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof FileSystemUID)) {
            return false;
        }
        FileSystemUID otherObj = (FileSystemUID) obj;

        return (this.id == otherObj.id) && (this.vnxUID != null ? this.vnxUID.equals(otherObj.vnxUID) : this.vnxUID == otherObj.vnxUID);
    }


    public int hashCode() {
        return (int) this.id ^ (this.vnxUID != null ? this.vnxUID.hashCode() : 0);
    }


    public String toString() {
        return "FileSystemUID [id=" + this.id + ", " + "vnxUID=" + this.vnxUID + "]";
    }
}


