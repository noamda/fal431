package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "restSnapshotConsistencyType", propOrder = {"restEnum"})
public class RestSnapshotConsistencyType {
    protected SnapshotConsistencyType restEnum;

    public RestSnapshotConsistencyType() {
    }

    public RestSnapshotConsistencyType(SnapshotConsistencyType restEnum) {
        this.restEnum = restEnum;
    }


    public SnapshotConsistencyType getRestEnum() {
        return this.restEnum;
    }


    public void setRestEnum(SnapshotConsistencyType value) {
        this.restEnum = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RestSnapshotConsistencyType)) {
            return false;
        }
        RestSnapshotConsistencyType otherObj = (RestSnapshotConsistencyType) obj;

        return this.restEnum == otherObj.restEnum ? true : this.restEnum != null ? this.restEnum.equals(otherObj.restEnum) : false;
    }


    public int hashCode() {
        return this.restEnum != null ? this.restEnum.hashCode() : 0;
    }


    public String toString() {
        return "RestSnapshotConsistencyType [restEnum=" + this.restEnum + "]";
    }
}


