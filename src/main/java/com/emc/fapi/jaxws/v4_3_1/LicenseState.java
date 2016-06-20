package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseState", propOrder = {"licenseUID", "licenseStatus", "daysUntilExpiration", "clustersUID", "licenseCapacityUnitAndUsed"})
public class LicenseState {
    @XmlElement(nillable = true)
    protected LicenseUID licenseUID;
    @XmlElement(nillable = true)
    protected LicenseStatus licenseStatus;
    protected Integer daysUntilExpiration;
    @XmlElement(nillable = true)
    protected List<ClusterUID> clustersUID;
    @XmlElement(nillable = true)
    protected LicenseCapacityUnitAndUsed licenseCapacityUnitAndUsed;

    public LicenseState() {
    }

    public LicenseState(LicenseUID licenseUID, LicenseStatus licenseStatus, Integer daysUntilExpiration, List<ClusterUID> clustersUID, LicenseCapacityUnitAndUsed licenseCapacityUnitAndUsed) {
        this.licenseUID = licenseUID;
        this.licenseStatus = licenseStatus;
        this.daysUntilExpiration = daysUntilExpiration;
        this.clustersUID = clustersUID;
        this.licenseCapacityUnitAndUsed = licenseCapacityUnitAndUsed;
    }


    public LicenseUID getLicenseUID() {
        return this.licenseUID;
    }


    public void setLicenseUID(LicenseUID value) {
        this.licenseUID = value;
    }


    public LicenseStatus getLicenseStatus() {
        return this.licenseStatus;
    }


    public void setLicenseStatus(LicenseStatus value) {
        this.licenseStatus = value;
    }


    public Integer getDaysUntilExpiration() {
        return this.daysUntilExpiration;
    }


    public void setDaysUntilExpiration(Integer value) {
        this.daysUntilExpiration = value;
    }


    public List<ClusterUID> getClustersUID() {
        if (this.clustersUID == null) {
            this.clustersUID = new ArrayList();
        }
        return this.clustersUID;
    }


    public LicenseCapacityUnitAndUsed getLicenseCapacityUnitAndUsed() {
        return this.licenseCapacityUnitAndUsed;
    }


    public void setLicenseCapacityUnitAndUsed(LicenseCapacityUnitAndUsed value) {
        this.licenseCapacityUnitAndUsed = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof LicenseState)) {
            return false;
        }
        LicenseState otherObj = (LicenseState) obj;

        return (this.licenseUID != null ? this.licenseUID.equals(otherObj.licenseUID) : this.licenseUID == otherObj.licenseUID) && (this.licenseStatus != null ? this.licenseStatus.equals(otherObj.licenseStatus) : this.licenseStatus == otherObj.licenseStatus) && (this.daysUntilExpiration != null ? this.daysUntilExpiration.equals(otherObj.daysUntilExpiration) : this.daysUntilExpiration == otherObj.daysUntilExpiration) && (this.clustersUID != null ? this.clustersUID.equals(otherObj.clustersUID) : this.clustersUID == otherObj.clustersUID) && (this.licenseCapacityUnitAndUsed != null ? this.licenseCapacityUnitAndUsed.equals(otherObj.licenseCapacityUnitAndUsed) : this.licenseCapacityUnitAndUsed == otherObj.licenseCapacityUnitAndUsed);
    }


    public int hashCode() {
        return (this.licenseUID != null ? this.licenseUID.hashCode() : 0) ^ (this.licenseStatus != null ? this.licenseStatus.hashCode() : 0) ^ (this.daysUntilExpiration != null ? this.daysUntilExpiration.hashCode() : 0) ^ (this.clustersUID != null ? this.clustersUID.hashCode() : 0) ^ (this.licenseCapacityUnitAndUsed != null ? this.licenseCapacityUnitAndUsed.hashCode() : 0);
    }


    public String toString() {
        return "LicenseState [licenseUID=" + this.licenseUID + ", " + "licenseStatus=" + this.licenseStatus + ", " + "daysUntilExpiration=" + this.daysUntilExpiration + ", " + "clustersUID=" + this.clustersUID + ", " + "licenseCapacityUnitAndUsed=" + this.licenseCapacityUnitAndUsed + "]";
    }
}


