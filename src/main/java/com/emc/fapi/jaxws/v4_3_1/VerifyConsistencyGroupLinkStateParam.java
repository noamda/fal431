package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifyConsistencyGroupLinkStateParam", propOrder = {"linkUID", "pipeState"})
public class VerifyConsistencyGroupLinkStateParam {
    @XmlElement(required = true)
    protected ConsistencyGroupLinkUID linkUID;
    @XmlElement(nillable = true)
    protected PipeState pipeState;

    public VerifyConsistencyGroupLinkStateParam() {
    }

    public VerifyConsistencyGroupLinkStateParam(ConsistencyGroupLinkUID linkUID, PipeState pipeState) {
        this.linkUID = linkUID;
        this.pipeState = pipeState;
    }


    public ConsistencyGroupLinkUID getLinkUID() {
        return this.linkUID;
    }


    public void setLinkUID(ConsistencyGroupLinkUID value) {
        this.linkUID = value;
    }


    public PipeState getPipeState() {
        return this.pipeState;
    }


    public void setPipeState(PipeState value) {
        this.pipeState = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VerifyConsistencyGroupLinkStateParam)) {
            return false;
        }
        VerifyConsistencyGroupLinkStateParam otherObj = (VerifyConsistencyGroupLinkStateParam) obj;

        return (this.linkUID != null ? this.linkUID.equals(otherObj.linkUID) : this.linkUID == otherObj.linkUID) && (this.pipeState != null ? this.pipeState.equals(otherObj.pipeState) : this.pipeState == otherObj.pipeState);
    }


    public int hashCode() {
        return (this.linkUID != null ? this.linkUID.hashCode() : 0) ^ (this.pipeState != null ? this.pipeState.hashCode() : 0);
    }


    public String toString() {
        return "VerifyConsistencyGroupLinkStateParam [linkUID=" + this.linkUID + ", " + "pipeState=" + this.pipeState + "]";
    }
}


