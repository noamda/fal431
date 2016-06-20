package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VnxLoginInformation", propOrder = {"endPoints", "vnxCredentials"})
public class VnxLoginInformation {
    @XmlElement(nillable = true)
    protected List<VnxEndPoint> endPoints;
    @XmlElement(nillable = true)
    protected VnxCredentials vnxCredentials;

    public VnxLoginInformation() {
    }

    public VnxLoginInformation(List<VnxEndPoint> endPoints, VnxCredentials vnxCredentials) {
        this.endPoints = endPoints;
        this.vnxCredentials = vnxCredentials;
    }


    public List<VnxEndPoint> getEndPoints() {
        if (this.endPoints == null) {
            this.endPoints = new ArrayList();
        }
        return this.endPoints;
    }


    public VnxCredentials getVnxCredentials() {
        return this.vnxCredentials;
    }


    public void setVnxCredentials(VnxCredentials value) {
        this.vnxCredentials = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VnxLoginInformation)) {
            return false;
        }
        VnxLoginInformation otherObj = (VnxLoginInformation) obj;

        return (this.endPoints != null ? this.endPoints.equals(otherObj.endPoints) : this.endPoints == otherObj.endPoints) && (this.vnxCredentials != null ? this.vnxCredentials.equals(otherObj.vnxCredentials) : this.vnxCredentials == otherObj.vnxCredentials);
    }


    public int hashCode() {
        return (this.endPoints != null ? this.endPoints.hashCode() : 0) ^ (this.vnxCredentials != null ? this.vnxCredentials.hashCode() : 0);
    }


    public String toString() {
        return "VnxLoginInformation [endPoints=" + this.endPoints + ", " + "vnxCredentials=" + this.vnxCredentials + "]";
    }
}


