package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAvailableVolumesFromAllClusters", propOrder = {"refreshView"})
public class GetAvailableVolumesFromAllClusters {
    protected boolean refreshView;

    public GetAvailableVolumesFromAllClusters() {
    }

    public GetAvailableVolumesFromAllClusters(boolean refreshView) {
        this.refreshView = refreshView;
    }


    public boolean isRefreshView() {
        return this.refreshView;
    }


    public void setRefreshView(boolean value) {
        this.refreshView = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetAvailableVolumesFromAllClusters)) {
            return false;
        }
        GetAvailableVolumesFromAllClusters otherObj = (GetAvailableVolumesFromAllClusters) obj;

        return this.refreshView == otherObj.refreshView;
    }


    public int hashCode() {
        return this.refreshView ? 1 : 0;
    }


    public String toString() {
        return "GetAvailableVolumesFromAllClusters [refreshView=" + this.refreshView + "]";
    }
}


