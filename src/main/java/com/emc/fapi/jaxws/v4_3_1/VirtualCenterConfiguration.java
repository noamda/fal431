package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualCenterConfiguration", propOrder = {"virtualCenterUID", "name", "datacentersConfiguration"})
public class VirtualCenterConfiguration {
    @XmlElement(nillable = true)
    protected VirtualCenterUID virtualCenterUID;
    protected String name;
    @XmlElement(nillable = true)
    protected List<DatacenterConfiguration> datacentersConfiguration;

    public VirtualCenterConfiguration() {
    }

    public VirtualCenterConfiguration(VirtualCenterUID virtualCenterUID, String name, List<DatacenterConfiguration> datacentersConfiguration) {
        this.virtualCenterUID = virtualCenterUID;
        this.name = name;
        this.datacentersConfiguration = datacentersConfiguration;
    }


    public VirtualCenterUID getVirtualCenterUID() {
        return this.virtualCenterUID;
    }


    public void setVirtualCenterUID(VirtualCenterUID value) {
        this.virtualCenterUID = value;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public List<DatacenterConfiguration> getDatacentersConfiguration() {
        if (this.datacentersConfiguration == null) {
            this.datacentersConfiguration = new ArrayList();
        }
        return this.datacentersConfiguration;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VirtualCenterConfiguration)) {
            return false;
        }
        VirtualCenterConfiguration otherObj = (VirtualCenterConfiguration) obj;

        return (this.virtualCenterUID != null ? this.virtualCenterUID.equals(otherObj.virtualCenterUID) : this.virtualCenterUID == otherObj.virtualCenterUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.datacentersConfiguration != null ? this.datacentersConfiguration.equals(otherObj.datacentersConfiguration) : this.datacentersConfiguration == otherObj.datacentersConfiguration);
    }


    public int hashCode() {
        return (this.virtualCenterUID != null ? this.virtualCenterUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.datacentersConfiguration != null ? this.datacentersConfiguration.hashCode() : 0);
    }


    public String toString() {
        return "VirtualCenterConfiguration [virtualCenterUID=" + this.virtualCenterUID + ", " + "name=" + this.name + ", " + "datacentersConfiguration=" + this.datacentersConfiguration + "]";
    }
}


