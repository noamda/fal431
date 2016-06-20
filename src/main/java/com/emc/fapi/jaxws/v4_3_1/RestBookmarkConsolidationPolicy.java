package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "restBookmarkConsolidationPolicy", propOrder = {"restEnum"})
public class RestBookmarkConsolidationPolicy {
    protected BookmarkConsolidationPolicy restEnum;

    public RestBookmarkConsolidationPolicy() {
    }

    public RestBookmarkConsolidationPolicy(BookmarkConsolidationPolicy restEnum) {
        this.restEnum = restEnum;
    }


    public BookmarkConsolidationPolicy getRestEnum() {
        return this.restEnum;
    }


    public void setRestEnum(BookmarkConsolidationPolicy value) {
        this.restEnum = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RestBookmarkConsolidationPolicy)) {
            return false;
        }
        RestBookmarkConsolidationPolicy otherObj = (RestBookmarkConsolidationPolicy) obj;

        return this.restEnum == otherObj.restEnum ? true : this.restEnum != null ? this.restEnum.equals(otherObj.restEnum) : false;
    }


    public int hashCode() {
        return this.restEnum != null ? this.restEnum.hashCode() : 0;
    }


    public String toString() {
        return "RestBookmarkConsolidationPolicy [restEnum=" + this.restEnum + "]";
    }
}


