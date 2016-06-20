package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateRemovePassiveConsistencyGroupLink", propOrder = {"groupLink"})
public class ValidateRemovePassiveConsistencyGroupLink {
    protected ConsistencyGroupLinkUID groupLink;

    public ValidateRemovePassiveConsistencyGroupLink() {
    }

    public ValidateRemovePassiveConsistencyGroupLink(ConsistencyGroupLinkUID groupLink) {
        this.groupLink = groupLink;
    }


    public ConsistencyGroupLinkUID getGroupLink() {
        return this.groupLink;
    }


    public void setGroupLink(ConsistencyGroupLinkUID value) {
        this.groupLink = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateRemovePassiveConsistencyGroupLink)) {
            return false;
        }
        ValidateRemovePassiveConsistencyGroupLink otherObj = (ValidateRemovePassiveConsistencyGroupLink) obj;

        return this.groupLink == otherObj.groupLink ? true : this.groupLink != null ? this.groupLink.equals(otherObj.groupLink) : false;
    }


    public int hashCode() {
        return this.groupLink != null ? this.groupLink.hashCode() : 0;
    }


    public String toString() {
        return "ValidateRemovePassiveConsistencyGroupLink [groupLink=" + this.groupLink + "]";
    }
}


