package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupLinkSettings", propOrder = {"groupLinkUID", "linkPolicy", "transferEnabled", "localLink"})
public class ConsistencyGroupLinkSettings {
    @XmlElement(required = true)
    protected ConsistencyGroupLinkUID groupLinkUID;
    @XmlElement(required = true)
    protected ConsistencyGroupLinkPolicy linkPolicy;
    protected boolean transferEnabled;
    protected boolean localLink;

    public ConsistencyGroupLinkSettings() {
    }

    public ConsistencyGroupLinkSettings(ConsistencyGroupLinkUID groupLinkUID, ConsistencyGroupLinkPolicy linkPolicy, boolean transferEnabled, boolean localLink) {
        this.groupLinkUID = groupLinkUID;
        this.linkPolicy = linkPolicy;
        this.transferEnabled = transferEnabled;
        this.localLink = localLink;
    }


    public ConsistencyGroupLinkUID getGroupLinkUID() {
        return this.groupLinkUID;
    }


    public void setGroupLinkUID(ConsistencyGroupLinkUID value) {
        this.groupLinkUID = value;
    }


    public ConsistencyGroupLinkPolicy getLinkPolicy() {
        return this.linkPolicy;
    }


    public void setLinkPolicy(ConsistencyGroupLinkPolicy value) {
        this.linkPolicy = value;
    }


    public boolean isTransferEnabled() {
        return this.transferEnabled;
    }


    public void setTransferEnabled(boolean value) {
        this.transferEnabled = value;
    }


    public boolean isLocalLink() {
        return this.localLink;
    }


    public void setLocalLink(boolean value) {
        this.localLink = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupLinkSettings)) {
            return false;
        }
        ConsistencyGroupLinkSettings otherObj = (ConsistencyGroupLinkSettings) obj;

        return (this.groupLinkUID != null ? this.groupLinkUID.equals(otherObj.groupLinkUID) : this.groupLinkUID == otherObj.groupLinkUID) && (this.linkPolicy != null ? this.linkPolicy.equals(otherObj.linkPolicy) : this.linkPolicy == otherObj.linkPolicy) && (this.transferEnabled == otherObj.transferEnabled) && (this.localLink == otherObj.localLink);
    }


    public int hashCode() {
        return (this.groupLinkUID != null ? this.groupLinkUID.hashCode() : 0) ^ (this.linkPolicy != null ? this.linkPolicy.hashCode() : 0) ^ (this.transferEnabled ? 1 : 0) ^ (this.localLink ? 1 : 0);
    }


    public String toString() {
        return "ConsistencyGroupLinkSettings [groupLinkUID=" + this.groupLinkUID + ", " + "linkPolicy=" + this.linkPolicy + ", " + "transferEnabled=" + this.transferEnabled + ", " + "localLink=" + this.localLink + "]";
    }
}


