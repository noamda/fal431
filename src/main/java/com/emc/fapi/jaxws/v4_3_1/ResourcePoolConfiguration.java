package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourcePoolConfiguration", propOrder = {"resourcePoolUuid", "name", "childResourcePoolsConfiguration"})
public class ResourcePoolConfiguration {
    protected VirtualResourcePoolUUID resourcePoolUuid;
    protected String name;
    @XmlElement(nillable = true)
    protected List<ResourcePoolConfiguration> childResourcePoolsConfiguration;

    public ResourcePoolConfiguration() {
    }

    public ResourcePoolConfiguration(VirtualResourcePoolUUID resourcePoolUuid, String name, List<ResourcePoolConfiguration> childResourcePoolsConfiguration) {
        this.resourcePoolUuid = resourcePoolUuid;
        this.name = name;
        this.childResourcePoolsConfiguration = childResourcePoolsConfiguration;
    }


    public VirtualResourcePoolUUID getResourcePoolUuid() {
        return this.resourcePoolUuid;
    }


    public void setResourcePoolUuid(VirtualResourcePoolUUID value) {
        this.resourcePoolUuid = value;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public List<ResourcePoolConfiguration> getChildResourcePoolsConfiguration() {
        if (this.childResourcePoolsConfiguration == null) {
            this.childResourcePoolsConfiguration = new ArrayList();
        }
        return this.childResourcePoolsConfiguration;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ResourcePoolConfiguration)) {
            return false;
        }
        ResourcePoolConfiguration otherObj = (ResourcePoolConfiguration) obj;

        return (this.resourcePoolUuid != null ? this.resourcePoolUuid.equals(otherObj.resourcePoolUuid) : this.resourcePoolUuid == otherObj.resourcePoolUuid) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.childResourcePoolsConfiguration != null ? this.childResourcePoolsConfiguration.equals(otherObj.childResourcePoolsConfiguration) : this.childResourcePoolsConfiguration == otherObj.childResourcePoolsConfiguration);
    }


    public int hashCode() {
        return (this.resourcePoolUuid != null ? this.resourcePoolUuid.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.childResourcePoolsConfiguration != null ? this.childResourcePoolsConfiguration.hashCode() : 0);
    }


    public String toString() {
        return "ResourcePoolConfiguration [resourcePoolUuid=" + this.resourcePoolUuid + ", " + "name=" + this.name + ", " + "childResourcePoolsConfiguration=" + this.childResourcePoolsConfiguration + "]";
    }
}


