package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("ConsistencyGroupReportStartUpStep")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupReportStartUpStep", propOrder = {"vmStartUpActionUID"})
public class ConsistencyGroupReportStartUpStep
        extends ConsistencyGroupReportVMStep {
    @XmlElement(nillable = true)
    protected VmStartUpActionUID vmStartUpActionUID;

    public ConsistencyGroupReportStartUpStep() {
    }

    public ConsistencyGroupReportStartUpStep(VmStartUpActionUID vmStartUpActionUID) {
        this.vmStartUpActionUID = vmStartUpActionUID;
    }


    public VmStartUpActionUID getVmStartUpActionUID() {
        return this.vmStartUpActionUID;
    }


    public void setVmStartUpActionUID(VmStartUpActionUID value) {
        this.vmStartUpActionUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupReportStartUpStep)) {
            return false;
        }
        ConsistencyGroupReportStartUpStep otherObj = (ConsistencyGroupReportStartUpStep) obj;

        return (super.equals(obj)) && (this.vmStartUpActionUID != null ? this.vmStartUpActionUID.equals(otherObj.vmStartUpActionUID) : this.vmStartUpActionUID == otherObj.vmStartUpActionUID);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.vmStartUpActionUID != null ? this.vmStartUpActionUID.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupReportStartUpStep [super=" + super.toString() + ", " + "vmStartUpActionUID=" + this.vmStartUpActionUID + "]";
    }
}


