package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBalanceLoadRecommendationWithGroupsToExclude", propOrder = {"groupsToExclude"})
public class GetBalanceLoadRecommendationWithGroupsToExclude {
    protected List<ConsistencyGroupUID> groupsToExclude;

    public GetBalanceLoadRecommendationWithGroupsToExclude() {
    }

    public GetBalanceLoadRecommendationWithGroupsToExclude(List<ConsistencyGroupUID> groupsToExclude) {
        this.groupsToExclude = groupsToExclude;
    }


    public List<ConsistencyGroupUID> getGroupsToExclude() {
        if (this.groupsToExclude == null) {
            this.groupsToExclude = new ArrayList();
        }
        return this.groupsToExclude;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetBalanceLoadRecommendationWithGroupsToExclude)) {
            return false;
        }
        GetBalanceLoadRecommendationWithGroupsToExclude otherObj = (GetBalanceLoadRecommendationWithGroupsToExclude) obj;

        return this.groupsToExclude == otherObj.groupsToExclude ? true : this.groupsToExclude != null ? this.groupsToExclude.equals(otherObj.groupsToExclude) : false;
    }


    public int hashCode() {
        return this.groupsToExclude != null ? this.groupsToExclude.hashCode() : 0;
    }


    public String toString() {
        return "GetBalanceLoadRecommendationWithGroupsToExclude [groupsToExclude=" + this.groupsToExclude + "]";
    }
}


