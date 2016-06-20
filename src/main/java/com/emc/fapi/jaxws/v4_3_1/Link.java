package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "link", propOrder = {"href", "rel"})
public class Link {
    protected String href;
    protected String rel;

    public Link() {
    }

    public Link(String href, String rel) {
        this.href = href;
        this.rel = rel;
    }


    public String getHref() {
        return this.href;
    }


    public void setHref(String value) {
        this.href = value;
    }


    public String getRel() {
        return this.rel;
    }


    public void setRel(String value) {
        this.rel = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof Link)) {
            return false;
        }
        Link otherObj = (Link) obj;

        return (this.href != null ? this.href.equals(otherObj.href) : this.href == otherObj.href) && (this.rel != null ? this.rel.equals(otherObj.rel) : this.rel == otherObj.rel);
    }


    public int hashCode() {
        return (this.href != null ? this.href.hashCode() : 0) ^ (this.rel != null ? this.rel.hashCode() : 0);
    }


    public String toString() {
        return "Link [href=" + this.href + ", " + "rel=" + this.rel + "]";
    }
}


