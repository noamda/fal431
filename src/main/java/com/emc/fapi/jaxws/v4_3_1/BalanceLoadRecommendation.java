package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceLoadRecommendation", propOrder = {"groupsRecommendation", "resultEvent", "resultOutput"})
public class BalanceLoadRecommendation {
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupBalanceLoadRecommendation> groupsRecommendation;
    protected String resultEvent;
    protected String resultOutput;

    public BalanceLoadRecommendation() {
    }

    public BalanceLoadRecommendation(List<ConsistencyGroupBalanceLoadRecommendation> groupsRecommendation, String resultEvent, String resultOutput) {
        this.groupsRecommendation = groupsRecommendation;
        this.resultEvent = resultEvent;
        this.resultOutput = resultOutput;
    }


    public List<ConsistencyGroupBalanceLoadRecommendation> getGroupsRecommendation() {
        if (this.groupsRecommendation == null) {
            this.groupsRecommendation = new ArrayList();
        }
        return this.groupsRecommendation;
    }


    public String getResultEvent() {
        return this.resultEvent;
    }


    public void setResultEvent(String value) {
        this.resultEvent = value;
    }


    public String getResultOutput() {
        return this.resultOutput;
    }


    public void setResultOutput(String value) {
        this.resultOutput = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof BalanceLoadRecommendation)) {
            return false;
        }
        BalanceLoadRecommendation otherObj = (BalanceLoadRecommendation) obj;

        return (this.groupsRecommendation != null ? this.groupsRecommendation.equals(otherObj.groupsRecommendation) : this.groupsRecommendation == otherObj.groupsRecommendation) && (this.resultEvent != null ? this.resultEvent.equals(otherObj.resultEvent) : this.resultEvent == otherObj.resultEvent) && (this.resultOutput != null ? this.resultOutput.equals(otherObj.resultOutput) : this.resultOutput == otherObj.resultOutput);
    }


    public int hashCode() {
        return (this.groupsRecommendation != null ? this.groupsRecommendation.hashCode() : 0) ^ (this.resultEvent != null ? this.resultEvent.hashCode() : 0) ^ (this.resultOutput != null ? this.resultOutput.hashCode() : 0);
    }


    public String toString() {
        return "BalanceLoadRecommendation [groupsRecommendation=" + this.groupsRecommendation + ", " + "resultEvent=" + this.resultEvent + ", " + "resultOutput=" + this.resultOutput + "]";
    }
}


