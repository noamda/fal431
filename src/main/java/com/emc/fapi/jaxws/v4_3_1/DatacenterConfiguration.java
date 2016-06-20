package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatacenterConfiguration", propOrder = {"datacenterUID", "name", "esxClustersConfiguration", "datastoresConfiguration", "datastoreClustersConfiguration"})
public class DatacenterConfiguration {
    @XmlElement(nillable = true)
    protected DatacenterUID datacenterUID;
    protected String name;
    @XmlElement(nillable = true)
    protected List<EsxClusterConfiguration> esxClustersConfiguration;
    @XmlElement(nillable = true)
    protected List<DatastoreConfiguration> datastoresConfiguration;
    @XmlElement(nillable = true)
    protected List<DatastoreClusterConfiguration> datastoreClustersConfiguration;

    public DatacenterConfiguration() {
    }

    public DatacenterConfiguration(DatacenterUID datacenterUID, String name, List<EsxClusterConfiguration> esxClustersConfiguration, List<DatastoreConfiguration> datastoresConfiguration, List<DatastoreClusterConfiguration> datastoreClustersConfiguration) {
        this.datacenterUID = datacenterUID;
        this.name = name;
        this.esxClustersConfiguration = esxClustersConfiguration;
        this.datastoresConfiguration = datastoresConfiguration;
        this.datastoreClustersConfiguration = datastoreClustersConfiguration;
    }


    public DatacenterUID getDatacenterUID() {
        return this.datacenterUID;
    }


    public void setDatacenterUID(DatacenterUID value) {
        this.datacenterUID = value;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public List<EsxClusterConfiguration> getEsxClustersConfiguration() {
        if (this.esxClustersConfiguration == null) {
            this.esxClustersConfiguration = new ArrayList();
        }
        return this.esxClustersConfiguration;
    }


    public List<DatastoreConfiguration> getDatastoresConfiguration() {
        if (this.datastoresConfiguration == null) {
            this.datastoresConfiguration = new ArrayList();
        }
        return this.datastoresConfiguration;
    }


    public List<DatastoreClusterConfiguration> getDatastoreClustersConfiguration() {
        if (this.datastoreClustersConfiguration == null) {
            this.datastoreClustersConfiguration = new ArrayList();
        }
        return this.datastoreClustersConfiguration;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof DatacenterConfiguration)) {
            return false;
        }
        DatacenterConfiguration otherObj = (DatacenterConfiguration) obj;

        return (this.datacenterUID != null ? this.datacenterUID.equals(otherObj.datacenterUID) : this.datacenterUID == otherObj.datacenterUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.esxClustersConfiguration != null ? this.esxClustersConfiguration.equals(otherObj.esxClustersConfiguration) : this.esxClustersConfiguration == otherObj.esxClustersConfiguration) && (this.datastoresConfiguration != null ? this.datastoresConfiguration.equals(otherObj.datastoresConfiguration) : this.datastoresConfiguration == otherObj.datastoresConfiguration) && (this.datastoreClustersConfiguration != null ? this.datastoreClustersConfiguration.equals(otherObj.datastoreClustersConfiguration) : this.datastoreClustersConfiguration == otherObj.datastoreClustersConfiguration);
    }


    public int hashCode() {
        return (this.datacenterUID != null ? this.datacenterUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.esxClustersConfiguration != null ? this.esxClustersConfiguration.hashCode() : 0) ^ (this.datastoresConfiguration != null ? this.datastoresConfiguration.hashCode() : 0) ^ (this.datastoreClustersConfiguration != null ? this.datastoreClustersConfiguration.hashCode() : 0);
    }


    public String toString() {
        return "DatacenterConfiguration [datacenterUID=" + this.datacenterUID + ", " + "name=" + this.name + ", " + "esxClustersConfiguration=" + this.esxClustersConfiguration + ", " + "datastoresConfiguration=" + this.datastoresConfiguration + ", " + "datastoreClustersConfiguration=" + this.datastoreClustersConfiguration + "]";
    }
}


