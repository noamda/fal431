package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalSystemConfiguration", propOrder = {"accountId", "clustersConfigurations", "mtusInformation"})
public class GlobalSystemConfiguration {
    protected String accountId;
    @XmlElement(nillable = true)
    protected List<ClusterConfiguration> clustersConfigurations;
    @XmlElement(nillable = true)
    protected List<MTUInformation> mtusInformation;

    public GlobalSystemConfiguration() {
    }

    public GlobalSystemConfiguration(String accountId, List<ClusterConfiguration> clustersConfigurations, List<MTUInformation> mtusInformation) {
        this.accountId = accountId;
        this.clustersConfigurations = clustersConfigurations;
        this.mtusInformation = mtusInformation;
    }


    public String getAccountId() {
        return this.accountId;
    }


    public void setAccountId(String value) {
        this.accountId = value;
    }


    public List<ClusterConfiguration> getClustersConfigurations() {
        if (this.clustersConfigurations == null) {
            this.clustersConfigurations = new ArrayList();
        }
        return this.clustersConfigurations;
    }


    public List<MTUInformation> getMtusInformation() {
        if (this.mtusInformation == null) {
            this.mtusInformation = new ArrayList();
        }
        return this.mtusInformation;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GlobalSystemConfiguration)) {
            return false;
        }
        GlobalSystemConfiguration otherObj = (GlobalSystemConfiguration) obj;

        return (this.accountId != null ? this.accountId.equals(otherObj.accountId) : this.accountId == otherObj.accountId) && (this.clustersConfigurations != null ? this.clustersConfigurations.equals(otherObj.clustersConfigurations) : this.clustersConfigurations == otherObj.clustersConfigurations) && (this.mtusInformation != null ? this.mtusInformation.equals(otherObj.mtusInformation) : this.mtusInformation == otherObj.mtusInformation);
    }


    public int hashCode() {
        return (this.accountId != null ? this.accountId.hashCode() : 0) ^ (this.clustersConfigurations != null ? this.clustersConfigurations.hashCode() : 0) ^ (this.mtusInformation != null ? this.mtusInformation.hashCode() : 0);
    }


    public String toString() {
        return "GlobalSystemConfiguration [accountId=" + this.accountId + ", " + "clustersConfigurations=" + this.clustersConfigurations + ", " + "mtusInformation=" + this.mtusInformation + "]";
    }
}


