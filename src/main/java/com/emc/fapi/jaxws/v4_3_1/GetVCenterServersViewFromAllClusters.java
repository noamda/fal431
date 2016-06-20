package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVCenterServersViewFromAllClusters", propOrder = {"shouldRescan"})
public class GetVCenterServersViewFromAllClusters {
    protected boolean shouldRescan;

    public GetVCenterServersViewFromAllClusters() {
    }

    public GetVCenterServersViewFromAllClusters(boolean shouldRescan) {
        this.shouldRescan = shouldRescan;
    }


    public boolean isShouldRescan() {
        return this.shouldRescan;
    }


    public void setShouldRescan(boolean value) {
        this.shouldRescan = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetVCenterServersViewFromAllClusters)) {
            return false;
        }
        GetVCenterServersViewFromAllClusters otherObj = (GetVCenterServersViewFromAllClusters) obj;

        return this.shouldRescan == otherObj.shouldRescan;
    }


    public int hashCode() {
        return this.shouldRescan ? 1 : 0;
    }


    public String toString() {
        return "GetVCenterServersViewFromAllClusters [shouldRescan=" + this.shouldRescan + "]";
    }
}


