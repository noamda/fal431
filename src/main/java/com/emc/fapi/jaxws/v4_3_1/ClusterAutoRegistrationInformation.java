package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterAutoRegistrationInformation", propOrder = {"companyName", "connectHome", "connectInMethodHardware", "connectInMethodSoftware", "installationResource", "installatoinType", "location", "salesOrderNumber", "sitePartyId", "vce"})
public class ClusterAutoRegistrationInformation {
    protected String companyName;
    protected ConnectHomeMethod connectHome;
    protected ConnectInMethod connectInMethodHardware;
    protected ConnectInMethod connectInMethodSoftware;
    protected InstallationPerformingResource installationResource;
    protected InstallationActivityType installatoinType;
    protected String location;
    protected String salesOrderNumber;
    protected String sitePartyId;
    protected Boolean vce;

    public ClusterAutoRegistrationInformation() {
    }

    public ClusterAutoRegistrationInformation(String companyName, ConnectHomeMethod connectHome, ConnectInMethod connectInMethodHardware, ConnectInMethod connectInMethodSoftware, InstallationPerformingResource installationResource, InstallationActivityType installatoinType, String location, String salesOrderNumber, String sitePartyId, Boolean vce) {
        this.companyName = companyName;
        this.connectHome = connectHome;
        this.connectInMethodHardware = connectInMethodHardware;
        this.connectInMethodSoftware = connectInMethodSoftware;
        this.installationResource = installationResource;
        this.installatoinType = installatoinType;
        this.location = location;
        this.salesOrderNumber = salesOrderNumber;
        this.sitePartyId = sitePartyId;
        this.vce = vce;
    }


    public String getCompanyName() {
        return this.companyName;
    }


    public void setCompanyName(String value) {
        this.companyName = value;
    }


    public ConnectHomeMethod getConnectHome() {
        return this.connectHome;
    }


    public void setConnectHome(ConnectHomeMethod value) {
        this.connectHome = value;
    }


    public ConnectInMethod getConnectInMethodHardware() {
        return this.connectInMethodHardware;
    }


    public void setConnectInMethodHardware(ConnectInMethod value) {
        this.connectInMethodHardware = value;
    }


    public ConnectInMethod getConnectInMethodSoftware() {
        return this.connectInMethodSoftware;
    }


    public void setConnectInMethodSoftware(ConnectInMethod value) {
        this.connectInMethodSoftware = value;
    }


    public InstallationPerformingResource getInstallationResource() {
        return this.installationResource;
    }


    public void setInstallationResource(InstallationPerformingResource value) {
        this.installationResource = value;
    }


    public InstallationActivityType getInstallatoinType() {
        return this.installatoinType;
    }


    public void setInstallatoinType(InstallationActivityType value) {
        this.installatoinType = value;
    }


    public String getLocation() {
        return this.location;
    }


    public void setLocation(String value) {
        this.location = value;
    }


    public String getSalesOrderNumber() {
        return this.salesOrderNumber;
    }


    public void setSalesOrderNumber(String value) {
        this.salesOrderNumber = value;
    }


    public String getSitePartyId() {
        return this.sitePartyId;
    }


    public void setSitePartyId(String value) {
        this.sitePartyId = value;
    }


    public Boolean isVce() {
        return this.vce;
    }


    public void setVce(Boolean value) {
        this.vce = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClusterAutoRegistrationInformation)) {
            return false;
        }
        ClusterAutoRegistrationInformation otherObj = (ClusterAutoRegistrationInformation) obj;

        return (this.companyName != null ? this.companyName.equals(otherObj.companyName) : this.companyName == otherObj.companyName) && (this.connectHome != null ? this.connectHome.equals(otherObj.connectHome) : this.connectHome == otherObj.connectHome) && (this.connectInMethodHardware != null ? this.connectInMethodHardware.equals(otherObj.connectInMethodHardware) : this.connectInMethodHardware == otherObj.connectInMethodHardware) && (this.connectInMethodSoftware != null ? this.connectInMethodSoftware.equals(otherObj.connectInMethodSoftware) : this.connectInMethodSoftware == otherObj.connectInMethodSoftware) && (this.installationResource != null ? this.installationResource.equals(otherObj.installationResource) : this.installationResource == otherObj.installationResource) && (this.installatoinType != null ? this.installatoinType.equals(otherObj.installatoinType) : this.installatoinType == otherObj.installatoinType) && (this.location != null ? this.location.equals(otherObj.location) : this.location == otherObj.location) && (this.salesOrderNumber != null ? this.salesOrderNumber.equals(otherObj.salesOrderNumber) : this.salesOrderNumber == otherObj.salesOrderNumber) && (this.sitePartyId != null ? this.sitePartyId.equals(otherObj.sitePartyId) : this.sitePartyId == otherObj.sitePartyId) && (this.vce != null ? this.vce.equals(otherObj.vce) : this.vce == otherObj.vce);
    }


    public int hashCode() {
        return (this.companyName != null ? this.companyName.hashCode() : 0) ^ (this.connectHome != null ? this.connectHome.hashCode() : 0) ^ (this.connectInMethodHardware != null ? this.connectInMethodHardware.hashCode() : 0) ^ (this.connectInMethodSoftware != null ? this.connectInMethodSoftware.hashCode() : 0) ^ (this.installationResource != null ? this.installationResource.hashCode() : 0) ^ (this.installatoinType != null ? this.installatoinType.hashCode() : 0) ^ (this.location != null ? this.location.hashCode() : 0) ^ (this.salesOrderNumber != null ? this.salesOrderNumber.hashCode() : 0) ^ (this.sitePartyId != null ? this.sitePartyId.hashCode() : 0) ^ (this.vce != null ? this.vce.hashCode() : 0);
    }


    public String toString() {
        return "ClusterAutoRegistrationInformation [companyName=" + this.companyName + ", " + "connectHome=" + this.connectHome + ", " + "connectInMethodHardware=" + this.connectInMethodHardware + ", " + "connectInMethodSoftware=" + this.connectInMethodSoftware + ", " + "installationResource=" + this.installationResource + ", " + "installatoinType=" + this.installatoinType + ", " + "location=" + this.location + ", " + "salesOrderNumber=" + this.salesOrderNumber + ", " + "sitePartyId=" + this.sitePartyId + ", " + "vce=" + this.vce + "]";
    }
}


