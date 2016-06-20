package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumeSANInfo", propOrder = {"channel", "lun", "path", "target"})
public class VolumeSANInfo {
    protected Integer channel;
    protected Integer lun;
    protected String path;
    protected Long target;

    public VolumeSANInfo() {
    }

    public VolumeSANInfo(Integer channel, Integer lun, String path, Long target) {
        this.channel = channel;
        this.lun = lun;
        this.path = path;
        this.target = target;
    }


    public Integer getChannel() {
        return this.channel;
    }


    public void setChannel(Integer value) {
        this.channel = value;
    }


    public Integer getLun() {
        return this.lun;
    }


    public void setLun(Integer value) {
        this.lun = value;
    }


    public String getPath() {
        return this.path;
    }


    public void setPath(String value) {
        this.path = value;
    }


    public Long getTarget() {
        return this.target;
    }


    public void setTarget(Long value) {
        this.target = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VolumeSANInfo)) {
            return false;
        }
        VolumeSANInfo otherObj = (VolumeSANInfo) obj;

        return (this.channel != null ? this.channel.equals(otherObj.channel) : this.channel == otherObj.channel) && (this.lun != null ? this.lun.equals(otherObj.lun) : this.lun == otherObj.lun) && (this.path != null ? this.path.equals(otherObj.path) : this.path == otherObj.path) && (this.target != null ? this.target.equals(otherObj.target) : this.target == otherObj.target);
    }


    public int hashCode() {
        return (this.channel != null ? this.channel.hashCode() : 0) ^ (this.lun != null ? this.lun.hashCode() : 0) ^ (this.path != null ? this.path.hashCode() : 0) ^ (this.target != null ? this.target.hashCode() : 0);
    }


    public String toString() {
        return "VolumeSANInfo [channel=" + this.channel + ", " + "lun=" + this.lun + ", " + "path=" + this.path + ", " + "target=" + this.target + "]";
    }
}


