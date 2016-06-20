package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "restLinkList", propOrder = {"linkList"})
public class RestLinkList {
    @XmlElement(nillable = true)
    protected List<Link> linkList;

    public RestLinkList() {
    }

    public RestLinkList(List<Link> linkList) {
        this.linkList = linkList;
    }


    public List<Link> getLinkList() {
        if (this.linkList == null) {
            this.linkList = new ArrayList();
        }
        return this.linkList;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RestLinkList)) {
            return false;
        }
        RestLinkList otherObj = (RestLinkList) obj;

        return this.linkList == otherObj.linkList ? true : this.linkList != null ? this.linkList.equals(otherObj.linkList) : false;
    }


    public int hashCode() {
        return this.linkList != null ? this.linkList.hashCode() : 0;
    }


    public String toString() {
        return "RestLinkList [linkList=" + this.linkList + "]";
    }
}


