package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateSetConsistencyGroupLinkPolicy", propOrder = {"groupLink", "newPolicy"})
public class ValidateSetConsistencyGroupLinkPolicy {
    protected ConsistencyGroupLinkUID groupLink;
    protected ConsistencyGroupLinkPolicy newPolicy;

    public ValidateSetConsistencyGroupLinkPolicy() {
    }

    public ValidateSetConsistencyGroupLinkPolicy(ConsistencyGroupLinkUID groupLink, ConsistencyGroupLinkPolicy newPolicy) {
        this.groupLink = groupLink;
        this.newPolicy = newPolicy;
    }


    public ConsistencyGroupLinkUID getGroupLink() {
        return this.groupLink;
    }


    public void setGroupLink(ConsistencyGroupLinkUID value) {
        this.groupLink = value;
    }


    public ConsistencyGroupLinkPolicy getNewPolicy() {
        return this.newPolicy;
    }


    public void setNewPolicy(ConsistencyGroupLinkPolicy value) {
        this.newPolicy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateSetConsistencyGroupLinkPolicy)) {
            return false;
        }
        ValidateSetConsistencyGroupLinkPolicy otherObj = (ValidateSetConsistencyGroupLinkPolicy) obj;

        return (this.groupLink != null ? this.groupLink.equals(otherObj.groupLink) : this.groupLink == otherObj.groupLink) && (this.newPolicy != null ? this.newPolicy.equals(otherObj.newPolicy) : this.newPolicy == otherObj.newPolicy);
    }


    public int hashCode() {
        return (this.groupLink != null ? this.groupLink.hashCode() : 0) ^ (this.newPolicy != null ? this.newPolicy.hashCode() : 0);
    }


    public String toString() {
        return "ValidateSetConsistencyGroupLinkPolicy [groupLink=" + this.groupLink + ", " + "newPolicy=" + this.newPolicy + "]";
    }
}


