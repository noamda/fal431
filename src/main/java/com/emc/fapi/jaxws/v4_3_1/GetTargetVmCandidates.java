package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTargetVmCandidates", propOrder = {"sourceVmParam", "vmReplicationTarget"})
public class GetTargetVmCandidates {
    @XmlElement(nillable = true)
    protected SourceVmParam sourceVmParam;
    @XmlElement(nillable = true)
    protected VmReplicationTarget vmReplicationTarget;

    public GetTargetVmCandidates() {
    }

    public GetTargetVmCandidates(SourceVmParam sourceVmParam, VmReplicationTarget vmReplicationTarget) {
        this.sourceVmParam = sourceVmParam;
        this.vmReplicationTarget = vmReplicationTarget;
    }


    public SourceVmParam getSourceVmParam() {
        return this.sourceVmParam;
    }


    public void setSourceVmParam(SourceVmParam value) {
        this.sourceVmParam = value;
    }


    public VmReplicationTarget getVmReplicationTarget() {
        return this.vmReplicationTarget;
    }


    public void setVmReplicationTarget(VmReplicationTarget value) {
        this.vmReplicationTarget = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetTargetVmCandidates)) {
            return false;
        }
        GetTargetVmCandidates otherObj = (GetTargetVmCandidates) obj;

        return (this.sourceVmParam != null ? this.sourceVmParam.equals(otherObj.sourceVmParam) : this.sourceVmParam == otherObj.sourceVmParam) && (this.vmReplicationTarget != null ? this.vmReplicationTarget.equals(otherObj.vmReplicationTarget) : this.vmReplicationTarget == otherObj.vmReplicationTarget);
    }


    public int hashCode() {
        return (this.sourceVmParam != null ? this.sourceVmParam.hashCode() : 0) ^ (this.vmReplicationTarget != null ? this.vmReplicationTarget.hashCode() : 0);
    }


    public String toString() {
        return "GetTargetVmCandidates [sourceVmParam=" + this.sourceVmParam + ", " + "vmReplicationTarget=" + this.vmReplicationTarget + "]";
    }
}


