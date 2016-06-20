package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addConsistencyGroupLink", propOrder = {"groupLink", "policy"})
public class AddConsistencyGroupLink {
    protected ConsistencyGroupLinkUID groupLink;
    protected ConsistencyGroupLinkPolicy policy;

    public AddConsistencyGroupLink() {
    }

    public AddConsistencyGroupLink(ConsistencyGroupLinkUID groupLink, ConsistencyGroupLinkPolicy policy) {
        this.groupLink = groupLink;
        this.policy = policy;
    }


    public ConsistencyGroupLinkUID getGroupLink() {
        return this.groupLink;
    }


    public void setGroupLink(ConsistencyGroupLinkUID value) {
        this.groupLink = value;
    }


    public ConsistencyGroupLinkPolicy getPolicy() {
        return this.policy;
    }


    public void setPolicy(ConsistencyGroupLinkPolicy value) {
        this.policy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AddConsistencyGroupLink)) {
            return false;
        }
        AddConsistencyGroupLink otherObj = (AddConsistencyGroupLink) obj;

        return (this.groupLink != null ? this.groupLink.equals(otherObj.groupLink) : this.groupLink == otherObj.groupLink) && (this.policy != null ? this.policy.equals(otherObj.policy) : this.policy == otherObj.policy);
    }


    public int hashCode() {
        return (this.groupLink != null ? this.groupLink.hashCode() : 0) ^ (this.policy != null ? this.policy.hashCode() : 0);
    }


    public String toString() {
        return "AddConsistencyGroupLink [groupLink=" + this.groupLink + ", " + "policy=" + this.policy + "]";
    }
}


