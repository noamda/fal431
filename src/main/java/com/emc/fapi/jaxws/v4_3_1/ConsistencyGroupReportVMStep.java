package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;
import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.*;


@JsonTypeName("ConsistencyGroupReportVMStep")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "JsonSubType")
@JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value = ConsistencyGroupReportStartUpStep.class, name = "ConsistencyGroupReportStartUpStep")})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupReportVMStep", propOrder = {"vmUid"})
@XmlSeeAlso({ConsistencyGroupReportStartUpStep.class})
public class ConsistencyGroupReportVMStep
        extends ConsistencyGroupReportStep {
    @XmlElement(nillable = true)
    protected VmUID vmUid;

    public ConsistencyGroupReportVMStep() {
    }

    public ConsistencyGroupReportVMStep(VmUID vmUid) {
        this.vmUid = vmUid;
    }


    public VmUID getVmUid() {
        return this.vmUid;
    }


    public void setVmUid(VmUID value) {
        this.vmUid = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupReportVMStep)) {
            return false;
        }
        ConsistencyGroupReportVMStep otherObj = (ConsistencyGroupReportVMStep) obj;

        return (super.equals(obj)) && (this.vmUid != null ? this.vmUid.equals(otherObj.vmUid) : this.vmUid == otherObj.vmUid);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.vmUid != null ? this.vmUid.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupReportVMStep [super=" + super.toString() + ", " + "vmUid=" + this.vmUid + "]";
    }
}


