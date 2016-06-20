package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rescanSANVolumesInAllClusters", propOrder = {"checkExistingVolumesAsWell"})
public class RescanSANVolumesInAllClusters {
    protected boolean checkExistingVolumesAsWell;

    public RescanSANVolumesInAllClusters() {
    }

    public RescanSANVolumesInAllClusters(boolean checkExistingVolumesAsWell) {
        this.checkExistingVolumesAsWell = checkExistingVolumesAsWell;
    }


    public boolean isCheckExistingVolumesAsWell() {
        return this.checkExistingVolumesAsWell;
    }


    public void setCheckExistingVolumesAsWell(boolean value) {
        this.checkExistingVolumesAsWell = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RescanSANVolumesInAllClusters)) {
            return false;
        }
        RescanSANVolumesInAllClusters otherObj = (RescanSANVolumesInAllClusters) obj;

        return this.checkExistingVolumesAsWell == otherObj.checkExistingVolumesAsWell;
    }


    public int hashCode() {
        return this.checkExistingVolumesAsWell ? 1 : 0;
    }


    public String toString() {
        return "RescanSANVolumesInAllClusters [checkExistingVolumesAsWell=" + this.checkExistingVolumesAsWell + "]";
    }
}


