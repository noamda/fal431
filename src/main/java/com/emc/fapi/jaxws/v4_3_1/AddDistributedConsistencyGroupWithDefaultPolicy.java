package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addDistributedConsistencyGroupWithDefaultPolicy", propOrder = {"groupName", "primaryRPA", "secondaryRPAsList"})
public class AddDistributedConsistencyGroupWithDefaultPolicy {
    protected String groupName;
    protected RpaUID primaryRPA;
    protected List<RpaUID> secondaryRPAsList;

    public AddDistributedConsistencyGroupWithDefaultPolicy() {
    }

    public AddDistributedConsistencyGroupWithDefaultPolicy(String groupName, RpaUID primaryRPA, List<RpaUID> secondaryRPAsList) {
        this.groupName = groupName;
        this.primaryRPA = primaryRPA;
        this.secondaryRPAsList = secondaryRPAsList;
    }


    public String getGroupName() {
        return this.groupName;
    }


    public void setGroupName(String value) {
        this.groupName = value;
    }


    public RpaUID getPrimaryRPA() {
        return this.primaryRPA;
    }


    public void setPrimaryRPA(RpaUID value) {
        this.primaryRPA = value;
    }


    public List<RpaUID> getSecondaryRPAsList() {
        if (this.secondaryRPAsList == null) {
            this.secondaryRPAsList = new ArrayList();
        }
        return this.secondaryRPAsList;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AddDistributedConsistencyGroupWithDefaultPolicy)) {
            return false;
        }
        AddDistributedConsistencyGroupWithDefaultPolicy otherObj = (AddDistributedConsistencyGroupWithDefaultPolicy) obj;

        return (this.groupName != null ? this.groupName.equals(otherObj.groupName) : this.groupName == otherObj.groupName) && (this.primaryRPA != null ? this.primaryRPA.equals(otherObj.primaryRPA) : this.primaryRPA == otherObj.primaryRPA) && (this.secondaryRPAsList != null ? this.secondaryRPAsList.equals(otherObj.secondaryRPAsList) : this.secondaryRPAsList == otherObj.secondaryRPAsList);
    }


    public int hashCode() {
        return (this.groupName != null ? this.groupName.hashCode() : 0) ^ (this.primaryRPA != null ? this.primaryRPA.hashCode() : 0) ^ (this.secondaryRPAsList != null ? this.secondaryRPAsList.hashCode() : 0);
    }


    public String toString() {
        return "AddDistributedConsistencyGroupWithDefaultPolicy [groupName=" + this.groupName + ", " + "primaryRPA=" + this.primaryRPA + ", " + "secondaryRPAsList=" + this.secondaryRPAsList + "]";
    }
}


