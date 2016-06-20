package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyTemplates", propOrder = {"consistencyGroupCopyPolicyTemplate", "consistencyGroupLinkPolicyTemplate", "defaultGroupCopyPolicyName", "defaultLocalGroupLinkPolicyName", "defaultRemoteGroupLinkPolicyName"})
public class PolicyTemplates {
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopyPolicyTemplate> consistencyGroupCopyPolicyTemplate;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupLinkPolicyTemplate> consistencyGroupLinkPolicyTemplate;
    protected String defaultGroupCopyPolicyName;
    protected String defaultLocalGroupLinkPolicyName;
    protected String defaultRemoteGroupLinkPolicyName;

    public PolicyTemplates() {
    }

    public PolicyTemplates(List<ConsistencyGroupCopyPolicyTemplate> consistencyGroupCopyPolicyTemplate, List<ConsistencyGroupLinkPolicyTemplate> consistencyGroupLinkPolicyTemplate, String defaultGroupCopyPolicyName, String defaultLocalGroupLinkPolicyName, String defaultRemoteGroupLinkPolicyName) {
        this.consistencyGroupCopyPolicyTemplate = consistencyGroupCopyPolicyTemplate;
        this.consistencyGroupLinkPolicyTemplate = consistencyGroupLinkPolicyTemplate;
        this.defaultGroupCopyPolicyName = defaultGroupCopyPolicyName;
        this.defaultLocalGroupLinkPolicyName = defaultLocalGroupLinkPolicyName;
        this.defaultRemoteGroupLinkPolicyName = defaultRemoteGroupLinkPolicyName;
    }


    public List<ConsistencyGroupCopyPolicyTemplate> getConsistencyGroupCopyPolicyTemplate() {
        if (this.consistencyGroupCopyPolicyTemplate == null) {
            this.consistencyGroupCopyPolicyTemplate = new ArrayList();
        }
        return this.consistencyGroupCopyPolicyTemplate;
    }


    public List<ConsistencyGroupLinkPolicyTemplate> getConsistencyGroupLinkPolicyTemplate() {
        if (this.consistencyGroupLinkPolicyTemplate == null) {
            this.consistencyGroupLinkPolicyTemplate = new ArrayList();
        }
        return this.consistencyGroupLinkPolicyTemplate;
    }


    public String getDefaultGroupCopyPolicyName() {
        return this.defaultGroupCopyPolicyName;
    }


    public void setDefaultGroupCopyPolicyName(String value) {
        this.defaultGroupCopyPolicyName = value;
    }


    public String getDefaultLocalGroupLinkPolicyName() {
        return this.defaultLocalGroupLinkPolicyName;
    }


    public void setDefaultLocalGroupLinkPolicyName(String value) {
        this.defaultLocalGroupLinkPolicyName = value;
    }


    public String getDefaultRemoteGroupLinkPolicyName() {
        return this.defaultRemoteGroupLinkPolicyName;
    }


    public void setDefaultRemoteGroupLinkPolicyName(String value) {
        this.defaultRemoteGroupLinkPolicyName = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof PolicyTemplates)) {
            return false;
        }
        PolicyTemplates otherObj = (PolicyTemplates) obj;

        return (this.consistencyGroupCopyPolicyTemplate != null ? this.consistencyGroupCopyPolicyTemplate.equals(otherObj.consistencyGroupCopyPolicyTemplate) : this.consistencyGroupCopyPolicyTemplate == otherObj.consistencyGroupCopyPolicyTemplate) && (this.consistencyGroupLinkPolicyTemplate != null ? this.consistencyGroupLinkPolicyTemplate.equals(otherObj.consistencyGroupLinkPolicyTemplate) : this.consistencyGroupLinkPolicyTemplate == otherObj.consistencyGroupLinkPolicyTemplate) && (this.defaultGroupCopyPolicyName != null ? this.defaultGroupCopyPolicyName.equals(otherObj.defaultGroupCopyPolicyName) : this.defaultGroupCopyPolicyName == otherObj.defaultGroupCopyPolicyName) && (this.defaultLocalGroupLinkPolicyName != null ? this.defaultLocalGroupLinkPolicyName.equals(otherObj.defaultLocalGroupLinkPolicyName) : this.defaultLocalGroupLinkPolicyName == otherObj.defaultLocalGroupLinkPolicyName) && (this.defaultRemoteGroupLinkPolicyName != null ? this.defaultRemoteGroupLinkPolicyName.equals(otherObj.defaultRemoteGroupLinkPolicyName) : this.defaultRemoteGroupLinkPolicyName == otherObj.defaultRemoteGroupLinkPolicyName);
    }


    public int hashCode() {
        return (this.consistencyGroupCopyPolicyTemplate != null ? this.consistencyGroupCopyPolicyTemplate.hashCode() : 0) ^ (this.consistencyGroupLinkPolicyTemplate != null ? this.consistencyGroupLinkPolicyTemplate.hashCode() : 0) ^ (this.defaultGroupCopyPolicyName != null ? this.defaultGroupCopyPolicyName.hashCode() : 0) ^ (this.defaultLocalGroupLinkPolicyName != null ? this.defaultLocalGroupLinkPolicyName.hashCode() : 0) ^ (this.defaultRemoteGroupLinkPolicyName != null ? this.defaultRemoteGroupLinkPolicyName.hashCode() : 0);
    }


    public String toString() {
        return "PolicyTemplates [consistencyGroupCopyPolicyTemplate=" + this.consistencyGroupCopyPolicyTemplate + ", " + "consistencyGroupLinkPolicyTemplate=" + this.consistencyGroupLinkPolicyTemplate + ", " + "defaultGroupCopyPolicyName=" + this.defaultGroupCopyPolicyName + ", " + "defaultLocalGroupLinkPolicyName=" + this.defaultLocalGroupLinkPolicyName + ", " + "defaultRemoteGroupLinkPolicyName=" + this.defaultRemoteGroupLinkPolicyName + "]";
    }
}


