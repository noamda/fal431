package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifyConsistencyGroupStateParam", propOrder = {"group", "againstSettings", "groupEnabled", "sourceCopy", "distributed", "links", "defaultLinkCondition", "linksConditions", "copies", "defaultCopyCondition", "copiesConditions", "settingsCondition", "username"})
public class VerifyConsistencyGroupStateParam {
    @XmlElement(required = true)
    protected ConsistencyGroupUID group;
    protected boolean againstSettings;
    protected Boolean groupEnabled;
    protected ConsistencyGroupCopyUID sourceCopy;
    protected Boolean distributed;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupLinkUID> links;
    protected VerifyConsistencyGroupLinkStateParam defaultLinkCondition;
    @XmlElement(nillable = true)
    protected List<VerifyConsistencyGroupLinkStateParam> linksConditions;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopyUID> copies;
    protected VerifyConsistencyGroupCopyStateParam defaultCopyCondition;
    @XmlElement(nillable = true)
    protected List<VerifyConsistencyGroupCopyStateParam> copiesConditions;
    protected VerifyConsistencyGroupStateParam settingsCondition;
    @XmlElement(required = true)
    protected String username;

    public VerifyConsistencyGroupStateParam() {
    }

    public VerifyConsistencyGroupStateParam(ConsistencyGroupUID group, boolean againstSettings, Boolean groupEnabled, ConsistencyGroupCopyUID sourceCopy, Boolean distributed, List<ConsistencyGroupLinkUID> links, VerifyConsistencyGroupLinkStateParam defaultLinkCondition, List<VerifyConsistencyGroupLinkStateParam> linksConditions, List<ConsistencyGroupCopyUID> copies, VerifyConsistencyGroupCopyStateParam defaultCopyCondition, List<VerifyConsistencyGroupCopyStateParam> copiesConditions, VerifyConsistencyGroupStateParam settingsCondition, String username) {
        this.group = group;
        this.againstSettings = againstSettings;
        this.groupEnabled = groupEnabled;
        this.sourceCopy = sourceCopy;
        this.distributed = distributed;
        this.links = links;
        this.defaultLinkCondition = defaultLinkCondition;
        this.linksConditions = linksConditions;
        this.copies = copies;
        this.defaultCopyCondition = defaultCopyCondition;
        this.copiesConditions = copiesConditions;
        this.settingsCondition = settingsCondition;
        this.username = username;
    }


    public ConsistencyGroupUID getGroup() {
        return this.group;
    }


    public void setGroup(ConsistencyGroupUID value) {
        this.group = value;
    }


    public boolean isAgainstSettings() {
        return this.againstSettings;
    }


    public void setAgainstSettings(boolean value) {
        this.againstSettings = value;
    }


    public Boolean isGroupEnabled() {
        return this.groupEnabled;
    }


    public void setGroupEnabled(Boolean value) {
        this.groupEnabled = value;
    }


    public ConsistencyGroupCopyUID getSourceCopy() {
        return this.sourceCopy;
    }


    public void setSourceCopy(ConsistencyGroupCopyUID value) {
        this.sourceCopy = value;
    }


    public Boolean isDistributed() {
        return this.distributed;
    }


    public void setDistributed(Boolean value) {
        this.distributed = value;
    }


    public List<ConsistencyGroupLinkUID> getLinks() {
        if (this.links == null) {
            this.links = new ArrayList();
        }
        return this.links;
    }


    public VerifyConsistencyGroupLinkStateParam getDefaultLinkCondition() {
        return this.defaultLinkCondition;
    }


    public void setDefaultLinkCondition(VerifyConsistencyGroupLinkStateParam value) {
        this.defaultLinkCondition = value;
    }


    public List<VerifyConsistencyGroupLinkStateParam> getLinksConditions() {
        if (this.linksConditions == null) {
            this.linksConditions = new ArrayList();
        }
        return this.linksConditions;
    }


    public List<ConsistencyGroupCopyUID> getCopies() {
        if (this.copies == null) {
            this.copies = new ArrayList();
        }
        return this.copies;
    }


    public VerifyConsistencyGroupCopyStateParam getDefaultCopyCondition() {
        return this.defaultCopyCondition;
    }


    public void setDefaultCopyCondition(VerifyConsistencyGroupCopyStateParam value) {
        this.defaultCopyCondition = value;
    }


    public List<VerifyConsistencyGroupCopyStateParam> getCopiesConditions() {
        if (this.copiesConditions == null) {
            this.copiesConditions = new ArrayList();
        }
        return this.copiesConditions;
    }


    public VerifyConsistencyGroupStateParam getSettingsCondition() {
        return this.settingsCondition;
    }


    public void setSettingsCondition(VerifyConsistencyGroupStateParam value) {
        this.settingsCondition = value;
    }


    public String getUsername() {
        return this.username;
    }


    public void setUsername(String value) {
        this.username = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VerifyConsistencyGroupStateParam)) {
            return false;
        }
        VerifyConsistencyGroupStateParam otherObj = (VerifyConsistencyGroupStateParam) obj;

        return (this.group != null ? this.group.equals(otherObj.group) : this.group == otherObj.group) && (this.againstSettings == otherObj.againstSettings) && (this.groupEnabled != null ? this.groupEnabled.equals(otherObj.groupEnabled) : this.groupEnabled == otherObj.groupEnabled) && (this.sourceCopy != null ? this.sourceCopy.equals(otherObj.sourceCopy) : this.sourceCopy == otherObj.sourceCopy) && (this.distributed != null ? this.distributed.equals(otherObj.distributed) : this.distributed == otherObj.distributed) && (this.links != null ? this.links.equals(otherObj.links) : this.links == otherObj.links) && (this.defaultLinkCondition != null ? this.defaultLinkCondition.equals(otherObj.defaultLinkCondition) : this.defaultLinkCondition == otherObj.defaultLinkCondition) && (this.linksConditions != null ? this.linksConditions.equals(otherObj.linksConditions) : this.linksConditions == otherObj.linksConditions) && (this.copies != null ? this.copies.equals(otherObj.copies) : this.copies == otherObj.copies) && (this.defaultCopyCondition != null ? this.defaultCopyCondition.equals(otherObj.defaultCopyCondition) : this.defaultCopyCondition == otherObj.defaultCopyCondition) && (this.copiesConditions != null ? this.copiesConditions.equals(otherObj.copiesConditions) : this.copiesConditions == otherObj.copiesConditions) && (this.settingsCondition != null ? this.settingsCondition.equals(otherObj.settingsCondition) : this.settingsCondition == otherObj.settingsCondition) && (this.username != null ? this.username.equals(otherObj.username) : this.username == otherObj.username);
    }


    public int hashCode() {
        return (this.group != null ? this.group.hashCode() : 0) ^ (this.againstSettings ? 1 : 0) ^ (this.groupEnabled != null ? this.groupEnabled.hashCode() : 0) ^ (this.sourceCopy != null ? this.sourceCopy.hashCode() : 0) ^ (this.distributed != null ? this.distributed.hashCode() : 0) ^ (this.links != null ? this.links.hashCode() : 0) ^ (this.defaultLinkCondition != null ? this.defaultLinkCondition.hashCode() : 0) ^ (this.linksConditions != null ? this.linksConditions.hashCode() : 0) ^ (this.copies != null ? this.copies.hashCode() : 0) ^ (this.defaultCopyCondition != null ? this.defaultCopyCondition.hashCode() : 0) ^ (this.copiesConditions != null ? this.copiesConditions.hashCode() : 0) ^ (this.settingsCondition != null ? this.settingsCondition.hashCode() : 0) ^ (this.username != null ? this.username.hashCode() : 0);
    }


    public String toString() {
        return "VerifyConsistencyGroupStateParam [group=" + this.group + ", " + "againstSettings=" + this.againstSettings + ", " + "groupEnabled=" + this.groupEnabled + ", " + "sourceCopy=" + this.sourceCopy + ", " + "distributed=" + this.distributed + ", " + "links=" + this.links + ", " + "defaultLinkCondition=" + this.defaultLinkCondition + ", " + "linksConditions=" + this.linksConditions + ", " + "copies=" + this.copies + ", " + "defaultCopyCondition=" + this.defaultCopyCondition + ", " + "copiesConditions=" + this.copiesConditions + ", " + "settingsCondition=" + this.settingsCondition + ", " + "username=" + this.username + "]";
    }
}


