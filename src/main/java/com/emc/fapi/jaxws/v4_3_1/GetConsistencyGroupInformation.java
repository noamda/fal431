package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getConsistencyGroupInformation", propOrder = {"groupUID"})
public class GetConsistencyGroupInformation {
    protected ConsistencyGroupUID groupUID;

    public GetConsistencyGroupInformation() {
    }

    public GetConsistencyGroupInformation(ConsistencyGroupUID groupUID) {
        this.groupUID = groupUID;
    }


    public ConsistencyGroupUID getGroupUID() {
        return this.groupUID;
    }


    public void setGroupUID(ConsistencyGroupUID value) {
        this.groupUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetConsistencyGroupInformation)) {
            return false;
        }
        GetConsistencyGroupInformation otherObj = (GetConsistencyGroupInformation) obj;

        return this.groupUID == otherObj.groupUID ? true : this.groupUID != null ? this.groupUID.equals(otherObj.groupUID) : false;
    }


    public int hashCode() {
        return this.groupUID != null ? this.groupUID.hashCode() : 0;
    }


    public String toString() {
        return "GetConsistencyGroupInformation [groupUID=" + this.groupUID + "]";
    }
}


