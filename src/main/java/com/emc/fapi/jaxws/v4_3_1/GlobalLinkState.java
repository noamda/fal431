package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalLinkState", propOrder = {"deduplicationSupported", "globalLink"})
public class GlobalLinkState {
    protected boolean deduplicationSupported;
    protected GlobalLinkUID globalLink;

    public GlobalLinkState() {
    }

    public GlobalLinkState(boolean deduplicationSupported, GlobalLinkUID globalLink) {
        this.deduplicationSupported = deduplicationSupported;
        this.globalLink = globalLink;
    }


    public boolean isDeduplicationSupported() {
        return this.deduplicationSupported;
    }


    public void setDeduplicationSupported(boolean value) {
        this.deduplicationSupported = value;
    }


    public GlobalLinkUID getGlobalLink() {
        return this.globalLink;
    }


    public void setGlobalLink(GlobalLinkUID value) {
        this.globalLink = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GlobalLinkState)) {
            return false;
        }
        GlobalLinkState otherObj = (GlobalLinkState) obj;

        return (this.deduplicationSupported == otherObj.deduplicationSupported) && (this.globalLink != null ? this.globalLink.equals(otherObj.globalLink) : this.globalLink == otherObj.globalLink);
    }


    public int hashCode() {
        return (this.deduplicationSupported ? 1 : 0) ^ (this.globalLink != null ? this.globalLink.hashCode() : 0);
    }


    public String toString() {
        return "GlobalLinkState [deduplicationSupported=" + this.deduplicationSupported + ", " + "globalLink=" + this.globalLink + "]";
    }
}


