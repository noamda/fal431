package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupInformation", propOrder = {"groupUID", "name", "enabled", "productionCopiesUID", "groupCopiesInformation"})
public class ConsistencyGroupInformation {
    @XmlElement(nillable = true)
    protected ConsistencyGroupUID groupUID;
    protected String name;
    protected boolean enabled;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopyUID> productionCopiesUID;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopyInformation> groupCopiesInformation;

    public ConsistencyGroupInformation() {
    }

    public ConsistencyGroupInformation(ConsistencyGroupUID groupUID, String name, boolean enabled, List<ConsistencyGroupCopyUID> productionCopiesUID, List<ConsistencyGroupCopyInformation> groupCopiesInformation) {
        this.groupUID = groupUID;
        this.name = name;
        this.enabled = enabled;
        this.productionCopiesUID = productionCopiesUID;
        this.groupCopiesInformation = groupCopiesInformation;
    }


    public ConsistencyGroupUID getGroupUID() {
        return this.groupUID;
    }


    public void setGroupUID(ConsistencyGroupUID value) {
        this.groupUID = value;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public boolean isEnabled() {
        return this.enabled;
    }


    public void setEnabled(boolean value) {
        this.enabled = value;
    }


    public List<ConsistencyGroupCopyUID> getProductionCopiesUID() {
        if (this.productionCopiesUID == null) {
            this.productionCopiesUID = new ArrayList();
        }
        return this.productionCopiesUID;
    }


    public List<ConsistencyGroupCopyInformation> getGroupCopiesInformation() {
        if (this.groupCopiesInformation == null) {
            this.groupCopiesInformation = new ArrayList();
        }
        return this.groupCopiesInformation;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupInformation)) {
            return false;
        }
        ConsistencyGroupInformation otherObj = (ConsistencyGroupInformation) obj;

        return (this.groupUID != null ? this.groupUID.equals(otherObj.groupUID) : this.groupUID == otherObj.groupUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.enabled == otherObj.enabled) && (this.productionCopiesUID != null ? this.productionCopiesUID.equals(otherObj.productionCopiesUID) : this.productionCopiesUID == otherObj.productionCopiesUID) && (this.groupCopiesInformation != null ? this.groupCopiesInformation.equals(otherObj.groupCopiesInformation) : this.groupCopiesInformation == otherObj.groupCopiesInformation);
    }


    public int hashCode() {
        return (this.groupUID != null ? this.groupUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.enabled ? 1 : 0) ^ (this.productionCopiesUID != null ? this.productionCopiesUID.hashCode() : 0) ^ (this.groupCopiesInformation != null ? this.groupCopiesInformation.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupInformation [groupUID=" + this.groupUID + ", " + "name=" + this.name + ", " + "enabled=" + this.enabled + ", " + "productionCopiesUID=" + this.productionCopiesUID + ", " + "groupCopiesInformation=" + this.groupCopiesInformation + "]";
    }
}


