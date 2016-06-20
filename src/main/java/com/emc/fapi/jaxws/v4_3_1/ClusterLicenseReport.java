package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterLicenseReport", propOrder = {"activeLicenses", "clusters", "expiredLicenes", "inactiveLicenes"})
public class ClusterLicenseReport {
    @XmlElement(nillable = true)
    protected List<LicenseSettings> activeLicenses;
    @XmlElement(nillable = true)
    protected List<ClusterUID> clusters;
    @XmlElement(nillable = true)
    protected List<LicenseSettings> expiredLicenes;
    @XmlElement(nillable = true)
    protected List<LicenseSettings> inactiveLicenes;

    public ClusterLicenseReport() {
    }

    public ClusterLicenseReport(List<LicenseSettings> activeLicenses, List<ClusterUID> clusters, List<LicenseSettings> expiredLicenes, List<LicenseSettings> inactiveLicenes) {
        this.activeLicenses = activeLicenses;
        this.clusters = clusters;
        this.expiredLicenes = expiredLicenes;
        this.inactiveLicenes = inactiveLicenes;
    }


    public List<LicenseSettings> getActiveLicenses() {
        if (this.activeLicenses == null) {
            this.activeLicenses = new ArrayList();
        }
        return this.activeLicenses;
    }


    public List<ClusterUID> getClusters() {
        if (this.clusters == null) {
            this.clusters = new ArrayList();
        }
        return this.clusters;
    }


    public List<LicenseSettings> getExpiredLicenes() {
        if (this.expiredLicenes == null) {
            this.expiredLicenes = new ArrayList();
        }
        return this.expiredLicenes;
    }


    public List<LicenseSettings> getInactiveLicenes() {
        if (this.inactiveLicenes == null) {
            this.inactiveLicenes = new ArrayList();
        }
        return this.inactiveLicenes;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClusterLicenseReport)) {
            return false;
        }
        ClusterLicenseReport otherObj = (ClusterLicenseReport) obj;

        return (this.activeLicenses != null ? this.activeLicenses.equals(otherObj.activeLicenses) : this.activeLicenses == otherObj.activeLicenses) && (this.clusters != null ? this.clusters.equals(otherObj.clusters) : this.clusters == otherObj.clusters) && (this.expiredLicenes != null ? this.expiredLicenes.equals(otherObj.expiredLicenes) : this.expiredLicenes == otherObj.expiredLicenes) && (this.inactiveLicenes != null ? this.inactiveLicenes.equals(otherObj.inactiveLicenes) : this.inactiveLicenes == otherObj.inactiveLicenes);
    }


    public int hashCode() {
        return (this.activeLicenses != null ? this.activeLicenses.hashCode() : 0) ^ (this.clusters != null ? this.clusters.hashCode() : 0) ^ (this.expiredLicenes != null ? this.expiredLicenes.hashCode() : 0) ^ (this.inactiveLicenes != null ? this.inactiveLicenes.hashCode() : 0);
    }


    public String toString() {
        return "ClusterLicenseReport [activeLicenses=" + this.activeLicenses + ", " + "clusters=" + this.clusters + ", " + "expiredLicenes=" + this.expiredLicenes + ", " + "inactiveLicenes=" + this.inactiveLicenes + "]";
    }
}


