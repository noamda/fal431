package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FullConsistencyGroupLinkPolicy", propOrder = {"linkUID", "linkPolicy"})
public class FullConsistencyGroupLinkPolicy {
    @XmlElement(required = true)
    protected ConsistencyGroupLinkUID linkUID;
    @XmlElement(required = true)
    protected ConsistencyGroupLinkPolicy linkPolicy;

    public FullConsistencyGroupLinkPolicy() {
    }

    public FullConsistencyGroupLinkPolicy(ConsistencyGroupLinkUID linkUID, ConsistencyGroupLinkPolicy linkPolicy) {
        this.linkUID = linkUID;
        this.linkPolicy = linkPolicy;
    }


    public ConsistencyGroupLinkUID getLinkUID() {
        return this.linkUID;
    }


    public void setLinkUID(ConsistencyGroupLinkUID value) {
        this.linkUID = value;
    }


    public ConsistencyGroupLinkPolicy getLinkPolicy() {
        return this.linkPolicy;
    }


    public void setLinkPolicy(ConsistencyGroupLinkPolicy value) {
        this.linkPolicy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof FullConsistencyGroupLinkPolicy)) {
            return false;
        }
        FullConsistencyGroupLinkPolicy otherObj = (FullConsistencyGroupLinkPolicy) obj;

        return (this.linkUID != null ? this.linkUID.equals(otherObj.linkUID) : this.linkUID == otherObj.linkUID) && (this.linkPolicy != null ? this.linkPolicy.equals(otherObj.linkPolicy) : this.linkPolicy == otherObj.linkPolicy);
    }


    public int hashCode() {
        return (this.linkUID != null ? this.linkUID.hashCode() : 0) ^ (this.linkPolicy != null ? this.linkPolicy.hashCode() : 0);
    }


    public String toString() {
        return "FullConsistencyGroupLinkPolicy [linkUID=" + this.linkUID + ", " + "linkPolicy=" + this.linkPolicy + "]";
    }
}


