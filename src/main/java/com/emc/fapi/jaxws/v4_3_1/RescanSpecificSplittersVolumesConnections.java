package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rescanSpecificSplittersVolumesConnections", propOrder = {"splitters"})
public class RescanSpecificSplittersVolumesConnections {
    protected List<SplitterUID> splitters;

    public RescanSpecificSplittersVolumesConnections() {
    }

    public RescanSpecificSplittersVolumesConnections(List<SplitterUID> splitters) {
        this.splitters = splitters;
    }


    public List<SplitterUID> getSplitters() {
        if (this.splitters == null) {
            this.splitters = new ArrayList();
        }
        return this.splitters;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RescanSpecificSplittersVolumesConnections)) {
            return false;
        }
        RescanSpecificSplittersVolumesConnections otherObj = (RescanSpecificSplittersVolumesConnections) obj;

        return this.splitters == otherObj.splitters ? true : this.splitters != null ? this.splitters.equals(otherObj.splitters) : false;
    }


    public int hashCode() {
        return this.splitters != null ? this.splitters.hashCode() : 0;
    }


    public String toString() {
        return "RescanSpecificSplittersVolumesConnections [splitters=" + this.splitters + "]";
    }
}


