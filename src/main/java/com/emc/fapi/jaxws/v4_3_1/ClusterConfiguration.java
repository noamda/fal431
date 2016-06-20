package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterConfiguration", propOrder = {"cluster", "rpasConfiguration", "managementIPs", "internalClusterName", "remoteISCSITargetsPortsConfiguration", "remoteClustersConnectionInformation", "gateways", "timeZoneInfo", "clusterName", "domain", "dnsIPs", "productType", "numberOfExposedLUNs", "initiatorOnlyMode", "numberOfVirtualPorts", "numberOfInitiatorIQNs"})
public class ClusterConfiguration {
    protected ClusterUID cluster;
    @XmlElement(nillable = true)
    protected List<RPAConfiguration> rpasConfiguration;
    @XmlElement(nillable = true)
    protected List<IPInformation> managementIPs;
    protected String internalClusterName;
    @XmlElement(nillable = true)
    protected List<RemoteISCSIPortsConfiguration> remoteISCSITargetsPortsConfiguration;
    @XmlElement(nillable = true)
    protected List<RemoteClusterConnectionInformation> remoteClustersConnectionInformation;
    @XmlElement(nillable = true)
    protected List<GatewayInformation> gateways;
    @XmlElement(nillable = true)
    protected TimeZoneInfo timeZoneInfo;
    protected String clusterName;
    protected String domain;
    @XmlElement(nillable = true)
    protected List<String> dnsIPs;
    @XmlElement(nillable = true)
    protected ProductType productType;
    protected int numberOfExposedLUNs;
    protected boolean initiatorOnlyMode;
    protected int numberOfVirtualPorts;
    protected int numberOfInitiatorIQNs;

    public ClusterConfiguration() {
    }

    public ClusterConfiguration(ClusterUID cluster, List<RPAConfiguration> rpasConfiguration, List<IPInformation> managementIPs, String internalClusterName, List<RemoteISCSIPortsConfiguration> remoteISCSITargetsPortsConfiguration, List<RemoteClusterConnectionInformation> remoteClustersConnectionInformation, List<GatewayInformation> gateways, TimeZoneInfo timeZoneInfo, String clusterName, String domain, List<String> dnsIPs, ProductType productType, int numberOfExposedLUNs, boolean initiatorOnlyMode, int numberOfVirtualPorts, int numberOfInitiatorIQNs) {
        this.cluster = cluster;
        this.rpasConfiguration = rpasConfiguration;
        this.managementIPs = managementIPs;
        this.internalClusterName = internalClusterName;
        this.remoteISCSITargetsPortsConfiguration = remoteISCSITargetsPortsConfiguration;
        this.remoteClustersConnectionInformation = remoteClustersConnectionInformation;
        this.gateways = gateways;
        this.timeZoneInfo = timeZoneInfo;
        this.clusterName = clusterName;
        this.domain = domain;
        this.dnsIPs = dnsIPs;
        this.productType = productType;
        this.numberOfExposedLUNs = numberOfExposedLUNs;
        this.initiatorOnlyMode = initiatorOnlyMode;
        this.numberOfVirtualPorts = numberOfVirtualPorts;
        this.numberOfInitiatorIQNs = numberOfInitiatorIQNs;
    }


    public ClusterUID getCluster() {
        return this.cluster;
    }


    public void setCluster(ClusterUID value) {
        this.cluster = value;
    }


    public List<RPAConfiguration> getRpasConfiguration() {
        if (this.rpasConfiguration == null) {
            this.rpasConfiguration = new ArrayList();
        }
        return this.rpasConfiguration;
    }


    public List<IPInformation> getManagementIPs() {
        if (this.managementIPs == null) {
            this.managementIPs = new ArrayList();
        }
        return this.managementIPs;
    }


    public String getInternalClusterName() {
        return this.internalClusterName;
    }


    public void setInternalClusterName(String value) {
        this.internalClusterName = value;
    }


    public List<RemoteISCSIPortsConfiguration> getRemoteISCSITargetsPortsConfiguration() {
        if (this.remoteISCSITargetsPortsConfiguration == null) {
            this.remoteISCSITargetsPortsConfiguration = new ArrayList();
        }
        return this.remoteISCSITargetsPortsConfiguration;
    }


    public List<RemoteClusterConnectionInformation> getRemoteClustersConnectionInformation() {
        if (this.remoteClustersConnectionInformation == null) {
            this.remoteClustersConnectionInformation = new ArrayList();
        }
        return this.remoteClustersConnectionInformation;
    }


    public List<GatewayInformation> getGateways() {
        if (this.gateways == null) {
            this.gateways = new ArrayList();
        }
        return this.gateways;
    }


    public TimeZoneInfo getTimeZoneInfo() {
        return this.timeZoneInfo;
    }


    public void setTimeZoneInfo(TimeZoneInfo value) {
        this.timeZoneInfo = value;
    }


    public String getClusterName() {
        return this.clusterName;
    }


    public void setClusterName(String value) {
        this.clusterName = value;
    }


    public String getDomain() {
        return this.domain;
    }


    public void setDomain(String value) {
        this.domain = value;
    }


    public List<String> getDnsIPs() {
        if (this.dnsIPs == null) {
            this.dnsIPs = new ArrayList();
        }
        return this.dnsIPs;
    }


    public ProductType getProductType() {
        return this.productType;
    }


    public void setProductType(ProductType value) {
        this.productType = value;
    }


    public int getNumberOfExposedLUNs() {
        return this.numberOfExposedLUNs;
    }


    public void setNumberOfExposedLUNs(int value) {
        this.numberOfExposedLUNs = value;
    }


    public boolean isInitiatorOnlyMode() {
        return this.initiatorOnlyMode;
    }


    public void setInitiatorOnlyMode(boolean value) {
        this.initiatorOnlyMode = value;
    }


    public int getNumberOfVirtualPorts() {
        return this.numberOfVirtualPorts;
    }


    public void setNumberOfVirtualPorts(int value) {
        this.numberOfVirtualPorts = value;
    }


    public int getNumberOfInitiatorIQNs() {
        return this.numberOfInitiatorIQNs;
    }


    public void setNumberOfInitiatorIQNs(int value) {
        this.numberOfInitiatorIQNs = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClusterConfiguration)) {
            return false;
        }
        ClusterConfiguration otherObj = (ClusterConfiguration) obj;

        return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.rpasConfiguration != null ? this.rpasConfiguration.equals(otherObj.rpasConfiguration) : this.rpasConfiguration == otherObj.rpasConfiguration) && (this.managementIPs != null ? this.managementIPs.equals(otherObj.managementIPs) : this.managementIPs == otherObj.managementIPs) && (this.internalClusterName != null ? this.internalClusterName.equals(otherObj.internalClusterName) : this.internalClusterName == otherObj.internalClusterName) && (this.remoteISCSITargetsPortsConfiguration != null ? this.remoteISCSITargetsPortsConfiguration.equals(otherObj.remoteISCSITargetsPortsConfiguration) : this.remoteISCSITargetsPortsConfiguration == otherObj.remoteISCSITargetsPortsConfiguration) && (this.remoteClustersConnectionInformation != null ? this.remoteClustersConnectionInformation.equals(otherObj.remoteClustersConnectionInformation) : this.remoteClustersConnectionInformation == otherObj.remoteClustersConnectionInformation) && (this.gateways != null ? this.gateways.equals(otherObj.gateways) : this.gateways == otherObj.gateways) && (this.timeZoneInfo != null ? this.timeZoneInfo.equals(otherObj.timeZoneInfo) : this.timeZoneInfo == otherObj.timeZoneInfo) && (this.clusterName != null ? this.clusterName.equals(otherObj.clusterName) : this.clusterName == otherObj.clusterName) && (this.domain != null ? this.domain.equals(otherObj.domain) : this.domain == otherObj.domain) && (this.dnsIPs != null ? this.dnsIPs.equals(otherObj.dnsIPs) : this.dnsIPs == otherObj.dnsIPs) && (this.productType != null ? this.productType.equals(otherObj.productType) : this.productType == otherObj.productType) && (this.numberOfExposedLUNs == otherObj.numberOfExposedLUNs) && (this.initiatorOnlyMode == otherObj.initiatorOnlyMode) && (this.numberOfVirtualPorts == otherObj.numberOfVirtualPorts) && (this.numberOfInitiatorIQNs == otherObj.numberOfInitiatorIQNs);
    }


    public int hashCode() {
        return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.rpasConfiguration != null ? this.rpasConfiguration.hashCode() : 0) ^ (this.managementIPs != null ? this.managementIPs.hashCode() : 0) ^ (this.internalClusterName != null ? this.internalClusterName.hashCode() : 0) ^ (this.remoteISCSITargetsPortsConfiguration != null ? this.remoteISCSITargetsPortsConfiguration.hashCode() : 0) ^ (this.remoteClustersConnectionInformation != null ? this.remoteClustersConnectionInformation.hashCode() : 0) ^ (this.gateways != null ? this.gateways.hashCode() : 0) ^ (this.timeZoneInfo != null ? this.timeZoneInfo.hashCode() : 0) ^ (this.clusterName != null ? this.clusterName.hashCode() : 0) ^ (this.domain != null ? this.domain.hashCode() : 0) ^ (this.dnsIPs != null ? this.dnsIPs.hashCode() : 0) ^ (this.productType != null ? this.productType.hashCode() : 0) ^ this.numberOfExposedLUNs ^ (this.initiatorOnlyMode ? 1 : 0) ^ this.numberOfVirtualPorts ^ this.numberOfInitiatorIQNs;
    }


    public String toString() {
        return "ClusterConfiguration [cluster=" + this.cluster + ", " + "rpasConfiguration=" + this.rpasConfiguration + ", " + "managementIPs=" + this.managementIPs + ", " + "internalClusterName=" + this.internalClusterName + ", " + "remoteISCSITargetsPortsConfiguration=" + this.remoteISCSITargetsPortsConfiguration + ", " + "remoteClustersConnectionInformation=" + this.remoteClustersConnectionInformation + ", " + "gateways=" + this.gateways + ", " + "timeZoneInfo=" + this.timeZoneInfo + ", " + "clusterName=" + this.clusterName + ", " + "domain=" + this.domain + ", " + "dnsIPs=" + this.dnsIPs + ", " + "productType=" + this.productType + ", " + "numberOfExposedLUNs=" + this.numberOfExposedLUNs + ", " + "initiatorOnlyMode=" + this.initiatorOnlyMode + ", " + "numberOfVirtualPorts=" + this.numberOfVirtualPorts + ", " + "numberOfInitiatorIQNs=" + this.numberOfInitiatorIQNs + "]";
    }
}


