package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplicateVmsParam", propOrder = {"cgName", "productionCopy", "vmReplicationSets", "links", "copies", "startTransfer"})
public class ReplicateVmsParam {
    @XmlElement(required = true)
    protected String cgName;
    @XmlElement(required = true)
    protected GlobalCopyUID productionCopy;
    @XmlElement(required = true)
    protected List<VMReplicationSetParam> vmReplicationSets;
    @XmlElement(nillable = true)
    protected List<FullConsistencyGroupLinkPolicy> links;
    @XmlElement(required = true)
    protected List<ConsistencyGroupCopyParam> copies;
    protected boolean startTransfer;

    public ReplicateVmsParam() {
    }

    public ReplicateVmsParam(String cgName, GlobalCopyUID productionCopy, List<VMReplicationSetParam> vmReplicationSets, List<FullConsistencyGroupLinkPolicy> links, List<ConsistencyGroupCopyParam> copies, boolean startTransfer) {
        this.cgName = cgName;
        this.productionCopy = productionCopy;
        this.vmReplicationSets = vmReplicationSets;
        this.links = links;
        this.copies = copies;
        this.startTransfer = startTransfer;
    }


    public String getCgName() {
        return this.cgName;
    }


    public void setCgName(String value) {
        this.cgName = value;
    }


    public GlobalCopyUID getProductionCopy() {
        return this.productionCopy;
    }


    public void setProductionCopy(GlobalCopyUID value) {
        this.productionCopy = value;
    }


    public List<VMReplicationSetParam> getVmReplicationSets() {
        if (this.vmReplicationSets == null) {
            this.vmReplicationSets = new ArrayList();
        }
        return this.vmReplicationSets;
    }


    public List<FullConsistencyGroupLinkPolicy> getLinks() {
        if (this.links == null) {
            this.links = new ArrayList();
        }
        return this.links;
    }


    public List<ConsistencyGroupCopyParam> getCopies() {
        if (this.copies == null) {
            this.copies = new ArrayList();
        }
        return this.copies;
    }


    public boolean isStartTransfer() {
        return this.startTransfer;
    }


    public void setStartTransfer(boolean value) {
        this.startTransfer = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ReplicateVmsParam)) {
            return false;
        }
        ReplicateVmsParam otherObj = (ReplicateVmsParam) obj;

        return (this.cgName != null ? this.cgName.equals(otherObj.cgName) : this.cgName == otherObj.cgName) && (this.productionCopy != null ? this.productionCopy.equals(otherObj.productionCopy) : this.productionCopy == otherObj.productionCopy) && (this.vmReplicationSets != null ? this.vmReplicationSets.equals(otherObj.vmReplicationSets) : this.vmReplicationSets == otherObj.vmReplicationSets) && (this.links != null ? this.links.equals(otherObj.links) : this.links == otherObj.links) && (this.copies != null ? this.copies.equals(otherObj.copies) : this.copies == otherObj.copies) && (this.startTransfer == otherObj.startTransfer);
    }


    public int hashCode() {
        return (this.cgName != null ? this.cgName.hashCode() : 0) ^ (this.productionCopy != null ? this.productionCopy.hashCode() : 0) ^ (this.vmReplicationSets != null ? this.vmReplicationSets.hashCode() : 0) ^ (this.links != null ? this.links.hashCode() : 0) ^ (this.copies != null ? this.copies.hashCode() : 0) ^ (this.startTransfer ? 1 : 0);
    }


    public String toString() {
        return "ReplicateVmsParam [cgName=" + this.cgName + ", " + "productionCopy=" + this.productionCopy + ", " + "vmReplicationSets=" + this.vmReplicationSets + ", " + "links=" + this.links + ", " + "copies=" + this.copies + ", " + "startTransfer=" + this.startTransfer + "]";
    }
}


