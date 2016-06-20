package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitterSANView", propOrder = {"splitterUID", "volumes"})
public class SplitterSANView {
    @XmlElement(nillable = true)
    protected SplitterUID splitterUID;
    @XmlElement(nillable = true)
    protected List<SplitterVolumeSANInfo> volumes;

    public SplitterSANView() {
    }

    public SplitterSANView(SplitterUID splitterUID, List<SplitterVolumeSANInfo> volumes) {
        this.splitterUID = splitterUID;
        this.volumes = volumes;
    }


    public SplitterUID getSplitterUID() {
        return this.splitterUID;
    }


    public void setSplitterUID(SplitterUID value) {
        this.splitterUID = value;
    }


    public List<SplitterVolumeSANInfo> getVolumes() {
        if (this.volumes == null) {
            this.volumes = new ArrayList();
        }
        return this.volumes;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SplitterSANView)) {
            return false;
        }
        SplitterSANView otherObj = (SplitterSANView) obj;

        return (this.splitterUID != null ? this.splitterUID.equals(otherObj.splitterUID) : this.splitterUID == otherObj.splitterUID) && (this.volumes != null ? this.volumes.equals(otherObj.volumes) : this.volumes == otherObj.volumes);
    }


    public int hashCode() {
        return (this.splitterUID != null ? this.splitterUID.hashCode() : 0) ^ (this.volumes != null ? this.volumes.hashCode() : 0);
    }


    public String toString() {
        return "SplitterSANView [splitterUID=" + this.splitterUID + ", " + "volumes=" + this.volumes + "]";
    }
}


