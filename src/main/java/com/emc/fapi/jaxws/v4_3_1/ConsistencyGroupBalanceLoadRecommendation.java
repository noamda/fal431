package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupBalanceLoadRecommendation", propOrder = {"groupUID", "primaryRPANumber", "secondaryRPAsNumbers"})
public class ConsistencyGroupBalanceLoadRecommendation {
    @XmlElement(required = true)
    protected ConsistencyGroupUID groupUID;
    protected int primaryRPANumber;
    @XmlElement(nillable = true)
    protected List<Integer> secondaryRPAsNumbers;

    public ConsistencyGroupBalanceLoadRecommendation() {
    }

    public ConsistencyGroupBalanceLoadRecommendation(ConsistencyGroupUID groupUID, int primaryRPANumber, List<Integer> secondaryRPAsNumbers) {
        this.groupUID = groupUID;
        this.primaryRPANumber = primaryRPANumber;
        this.secondaryRPAsNumbers = secondaryRPAsNumbers;
    }


    public ConsistencyGroupUID getGroupUID() {
        return this.groupUID;
    }


    public void setGroupUID(ConsistencyGroupUID value) {
        this.groupUID = value;
    }


    public int getPrimaryRPANumber() {
        return this.primaryRPANumber;
    }


    public void setPrimaryRPANumber(int value) {
        this.primaryRPANumber = value;
    }


    public List<Integer> getSecondaryRPAsNumbers() {
        if (this.secondaryRPAsNumbers == null) {
            this.secondaryRPAsNumbers = new ArrayList();
        }
        return this.secondaryRPAsNumbers;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupBalanceLoadRecommendation)) {
            return false;
        }
        ConsistencyGroupBalanceLoadRecommendation otherObj = (ConsistencyGroupBalanceLoadRecommendation) obj;

        return (this.groupUID != null ? this.groupUID.equals(otherObj.groupUID) : this.groupUID == otherObj.groupUID) && (this.primaryRPANumber == otherObj.primaryRPANumber) && (this.secondaryRPAsNumbers != null ? this.secondaryRPAsNumbers.equals(otherObj.secondaryRPAsNumbers) : this.secondaryRPAsNumbers == otherObj.secondaryRPAsNumbers);
    }


    public int hashCode() {
        return (this.groupUID != null ? this.groupUID.hashCode() : 0) ^ this.primaryRPANumber ^ (this.secondaryRPAsNumbers != null ? this.secondaryRPAsNumbers.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupBalanceLoadRecommendation [groupUID=" + this.groupUID + ", " + "primaryRPANumber=" + this.primaryRPANumber + ", " + "secondaryRPAsNumbers=" + this.secondaryRPAsNumbers + "]";
    }
}


