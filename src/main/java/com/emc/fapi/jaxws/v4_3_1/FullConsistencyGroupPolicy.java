package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FullConsistencyGroupPolicy", propOrder = {"groupUID", "groupPolicy", "groupName", "productionCopies", "copiesPolicies", "linksPolicies", "vmReplicationSetsPolicies"})
public class FullConsistencyGroupPolicy {
    @XmlElement(required = true)
    protected ConsistencyGroupUID groupUID;
    protected ConsistencyGroupPolicy groupPolicy;
    @XmlElement(required = true)
    protected String groupName;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopyUID> productionCopies;
    @XmlElement(nillable = true)
    protected List<FullConsistencyGroupCopyPolicy> copiesPolicies;
    @XmlElement(nillable = true)
    protected List<FullConsistencyGroupLinkPolicy> linksPolicies;
    @XmlElement(nillable = true)
    protected List<FullVmReplicationSetPolicy> vmReplicationSetsPolicies;

    public FullConsistencyGroupPolicy() {
    }

    public FullConsistencyGroupPolicy(ConsistencyGroupUID groupUID, ConsistencyGroupPolicy groupPolicy, String groupName, List<ConsistencyGroupCopyUID> productionCopies, List<FullConsistencyGroupCopyPolicy> copiesPolicies, List<FullConsistencyGroupLinkPolicy> linksPolicies, List<FullVmReplicationSetPolicy> vmReplicationSetsPolicies) {
        this.groupUID = groupUID;
        this.groupPolicy = groupPolicy;
        this.groupName = groupName;
        this.productionCopies = productionCopies;
        this.copiesPolicies = copiesPolicies;
        this.linksPolicies = linksPolicies;
        this.vmReplicationSetsPolicies = vmReplicationSetsPolicies;
    }


    public ConsistencyGroupUID getGroupUID() {
        return this.groupUID;
    }


    public void setGroupUID(ConsistencyGroupUID value) {
        this.groupUID = value;
    }


    public ConsistencyGroupPolicy getGroupPolicy() {
        return this.groupPolicy;
    }


    public void setGroupPolicy(ConsistencyGroupPolicy value) {
        this.groupPolicy = value;
    }


    public String getGroupName() {
        return this.groupName;
    }


    public void setGroupName(String value) {
        this.groupName = value;
    }


    public List<ConsistencyGroupCopyUID> getProductionCopies() {
        if (this.productionCopies == null) {
            this.productionCopies = new ArrayList();
        }
        return this.productionCopies;
    }


    public List<FullConsistencyGroupCopyPolicy> getCopiesPolicies() {
        if (this.copiesPolicies == null) {
            this.copiesPolicies = new ArrayList();
        }
        return this.copiesPolicies;
    }


    public List<FullConsistencyGroupLinkPolicy> getLinksPolicies() {
        if (this.linksPolicies == null) {
            this.linksPolicies = new ArrayList();
        }
        return this.linksPolicies;
    }


    public List<FullVmReplicationSetPolicy> getVmReplicationSetsPolicies() {
        if (this.vmReplicationSetsPolicies == null) {
            this.vmReplicationSetsPolicies = new ArrayList();
        }
        return this.vmReplicationSetsPolicies;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof FullConsistencyGroupPolicy)) {
            return false;
        }
        FullConsistencyGroupPolicy otherObj = (FullConsistencyGroupPolicy) obj;

        return (this.groupUID != null ? this.groupUID.equals(otherObj.groupUID) : this.groupUID == otherObj.groupUID) && (this.groupPolicy != null ? this.groupPolicy.equals(otherObj.groupPolicy) : this.groupPolicy == otherObj.groupPolicy) && (this.groupName != null ? this.groupName.equals(otherObj.groupName) : this.groupName == otherObj.groupName) && (this.productionCopies != null ? this.productionCopies.equals(otherObj.productionCopies) : this.productionCopies == otherObj.productionCopies) && (this.copiesPolicies != null ? this.copiesPolicies.equals(otherObj.copiesPolicies) : this.copiesPolicies == otherObj.copiesPolicies) && (this.linksPolicies != null ? this.linksPolicies.equals(otherObj.linksPolicies) : this.linksPolicies == otherObj.linksPolicies) && (this.vmReplicationSetsPolicies != null ? this.vmReplicationSetsPolicies.equals(otherObj.vmReplicationSetsPolicies) : this.vmReplicationSetsPolicies == otherObj.vmReplicationSetsPolicies);
    }


    public int hashCode() {
        return (this.groupUID != null ? this.groupUID.hashCode() : 0) ^ (this.groupPolicy != null ? this.groupPolicy.hashCode() : 0) ^ (this.groupName != null ? this.groupName.hashCode() : 0) ^ (this.productionCopies != null ? this.productionCopies.hashCode() : 0) ^ (this.copiesPolicies != null ? this.copiesPolicies.hashCode() : 0) ^ (this.linksPolicies != null ? this.linksPolicies.hashCode() : 0) ^ (this.vmReplicationSetsPolicies != null ? this.vmReplicationSetsPolicies.hashCode() : 0);
    }


    public String toString() {
        return "FullConsistencyGroupPolicy [groupUID=" + this.groupUID + ", " + "groupPolicy=" + this.groupPolicy + ", " + "groupName=" + this.groupName + ", " + "productionCopies=" + this.productionCopies + ", " + "copiesPolicies=" + this.copiesPolicies + ", " + "linksPolicies=" + this.linksPolicies + ", " + "vmReplicationSetsPolicies=" + this.vmReplicationSetsPolicies + "]";
    }
}


