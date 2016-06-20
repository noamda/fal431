package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetVmCandidates", propOrder = {"targetVmCandidates"})
public class TargetVmCandidates {
    @XmlElement(nillable = true)
    protected List<TargetVmCandidate> targetVmCandidates;

    public TargetVmCandidates() {
    }

    public TargetVmCandidates(List<TargetVmCandidate> targetVmCandidates) {
        this.targetVmCandidates = targetVmCandidates;
    }


    public List<TargetVmCandidate> getTargetVmCandidates() {
        if (this.targetVmCandidates == null) {
            this.targetVmCandidates = new ArrayList();
        }
        return this.targetVmCandidates;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof TargetVmCandidates)) {
            return false;
        }
        TargetVmCandidates otherObj = (TargetVmCandidates) obj;

        return this.targetVmCandidates == otherObj.targetVmCandidates ? true : this.targetVmCandidates != null ? this.targetVmCandidates.equals(otherObj.targetVmCandidates) : false;
    }


    public int hashCode() {
        return this.targetVmCandidates != null ? this.targetVmCandidates.hashCode() : 0;
    }


    public String toString() {
        return "TargetVmCandidates [targetVmCandidates=" + this.targetVmCandidates + "]";
    }
}


