package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDefaultConsistencyGroupLinkPolicy", propOrder = {"isLocalLink"})
public class GetDefaultConsistencyGroupLinkPolicy {
    protected boolean isLocalLink;

    public GetDefaultConsistencyGroupLinkPolicy() {
    }

    public GetDefaultConsistencyGroupLinkPolicy(boolean isLocalLink) {
        this.isLocalLink = isLocalLink;
    }


    public boolean isIsLocalLink() {
        return this.isLocalLink;
    }


    public void setIsLocalLink(boolean value) {
        this.isLocalLink = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetDefaultConsistencyGroupLinkPolicy)) {
            return false;
        }
        GetDefaultConsistencyGroupLinkPolicy otherObj = (GetDefaultConsistencyGroupLinkPolicy) obj;

        return this.isLocalLink == otherObj.isLocalLink;
    }


    public int hashCode() {
        return this.isLocalLink ? 1 : 0;
    }


    public String toString() {
        return "GetDefaultConsistencyGroupLinkPolicy [isLocalLink=" + this.isLocalLink + "]";
    }
}


