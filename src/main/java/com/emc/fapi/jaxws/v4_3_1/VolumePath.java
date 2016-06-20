package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumePath", propOrder = {"volume", "path"})
public class VolumePath {
    protected long volume;
    @XmlElement(nillable = true)
    protected Path path;

    public VolumePath() {
    }

    public VolumePath(long volume, Path path) {
        this.volume = volume;
        this.path = path;
    }


    public long getVolume() {
        return this.volume;
    }


    public void setVolume(long value) {
        this.volume = value;
    }


    public Path getPath() {
        return this.path;
    }


    public void setPath(Path value) {
        this.path = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VolumePath)) {
            return false;
        }
        VolumePath otherObj = (VolumePath) obj;

        return (this.volume == otherObj.volume) && (this.path != null ? this.path.equals(otherObj.path) : this.path == otherObj.path);
    }


    public int hashCode() {
        return (int) this.volume ^ (this.path != null ? this.path.hashCode() : 0);
    }


    public String toString() {
        return "VolumePath [volume=" + this.volume + ", " + "path=" + this.path + "]";
    }
}


