package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rescanSplitterVolumesConnections", propOrder = {"splitter"})
public class RescanSplitterVolumesConnections {
    protected SplitterUID splitter;

    public RescanSplitterVolumesConnections() {
    }

    public RescanSplitterVolumesConnections(SplitterUID splitter) {
        this.splitter = splitter;
    }


    public SplitterUID getSplitter() {
        return this.splitter;
    }


    public void setSplitter(SplitterUID value) {
        this.splitter = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RescanSplitterVolumesConnections)) {
            return false;
        }
        RescanSplitterVolumesConnections otherObj = (RescanSplitterVolumesConnections) obj;

        return this.splitter == otherObj.splitter ? true : this.splitter != null ? this.splitter.equals(otherObj.splitter) : false;
    }


    public int hashCode() {
        return this.splitter != null ? this.splitter.hashCode() : 0;
    }


    public String toString() {
        return "RescanSplitterVolumesConnections [splitter=" + this.splitter + "]";
    }
}


