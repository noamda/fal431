package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removePassiveConsistencyGroupLink", propOrder = {"groupLink"})
public class RemovePassiveConsistencyGroupLink {
    protected ConsistencyGroupLinkUID groupLink;

    public RemovePassiveConsistencyGroupLink() {
    }

    public RemovePassiveConsistencyGroupLink(ConsistencyGroupLinkUID groupLink) {
        this.groupLink = groupLink;
    }


    public ConsistencyGroupLinkUID getGroupLink() {
        return this.groupLink;
    }


    public void setGroupLink(ConsistencyGroupLinkUID value) {
        this.groupLink = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RemovePassiveConsistencyGroupLink)) {
            return false;
        }
        RemovePassiveConsistencyGroupLink otherObj = (RemovePassiveConsistencyGroupLink) obj;

        return this.groupLink == otherObj.groupLink ? true : this.groupLink != null ? this.groupLink.equals(otherObj.groupLink) : false;
    }


    public int hashCode() {
        return this.groupLink != null ? this.groupLink.hashCode() : 0;
    }


    public String toString() {
        return "RemovePassiveConsistencyGroupLink [groupLink=" + this.groupLink + "]";
    }
}


