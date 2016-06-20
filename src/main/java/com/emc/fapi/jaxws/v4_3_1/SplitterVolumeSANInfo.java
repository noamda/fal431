package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("SplitterVolumeSANInfo")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitterVolumeSANInfo", propOrder = {"sanInfo"})
public class SplitterVolumeSANInfo
        extends SplitterVolume {
    protected VolumeSANInfo sanInfo;

    public SplitterVolumeSANInfo() {
    }

    public SplitterVolumeSANInfo(VolumeSANInfo sanInfo) {
        this.sanInfo = sanInfo;
    }


    public VolumeSANInfo getSanInfo() {
        return this.sanInfo;
    }


    public void setSanInfo(VolumeSANInfo value) {
        this.sanInfo = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SplitterVolumeSANInfo)) {
            return false;
        }
        SplitterVolumeSANInfo otherObj = (SplitterVolumeSANInfo) obj;

        return (super.equals(obj)) && (this.sanInfo != null ? this.sanInfo.equals(otherObj.sanInfo) : this.sanInfo == otherObj.sanInfo);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.sanInfo != null ? this.sanInfo.hashCode() : 0);
    }


    public String toString() {
        return "SplitterVolumeSANInfo [super=" + super.toString() + ", " + "sanInfo=" + this.sanInfo + "]";
    }
}


