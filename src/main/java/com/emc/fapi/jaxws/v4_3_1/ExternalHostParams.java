package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalHostParams", propOrder = {"clusterUID", "hostNiceName", "configParams"})
public class ExternalHostParams {
    @XmlElement(required = true, nillable = true)
    protected ClusterUID clusterUID;
    @XmlElement(required = true)
    protected String hostNiceName;
    @XmlElement(required = true)
    protected ConfigurationParams configParams;

    public ExternalHostParams() {
    }

    public ExternalHostParams(ClusterUID clusterUID, String hostNiceName, ConfigurationParams configParams) {
        this.clusterUID = clusterUID;
        this.hostNiceName = hostNiceName;
        this.configParams = configParams;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public String getHostNiceName() {
        return this.hostNiceName;
    }


    public void setHostNiceName(String value) {
        this.hostNiceName = value;
    }


    public ConfigurationParams getConfigParams() {
        return this.configParams;
    }


    public void setConfigParams(ConfigurationParams value) {
        this.configParams = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ExternalHostParams)) {
            return false;
        }
        ExternalHostParams otherObj = (ExternalHostParams) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.hostNiceName != null ? this.hostNiceName.equals(otherObj.hostNiceName) : this.hostNiceName == otherObj.hostNiceName) && (this.configParams != null ? this.configParams.equals(otherObj.configParams) : this.configParams == otherObj.configParams);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.hostNiceName != null ? this.hostNiceName.hashCode() : 0) ^ (this.configParams != null ? this.configParams.hashCode() : 0);
    }


    public String toString() {
        return "ExternalHostParams [clusterUID=" + this.clusterUID + ", " + "hostNiceName=" + this.hostNiceName + ", " + "configParams=" + this.configParams + "]";
    }
}


