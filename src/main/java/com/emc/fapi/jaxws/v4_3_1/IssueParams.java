package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "issueParams", propOrder = {"entities", "issueType"})
public class IssueParams {
    protected EntitySet entities;
    @XmlElement(nillable = true)
    protected IssueType issueType;

    public IssueParams() {
    }

    public IssueParams(EntitySet entities, IssueType issueType) {
        this.entities = entities;
        this.issueType = issueType;
    }


    public EntitySet getEntities() {
        return this.entities;
    }


    public void setEntities(EntitySet value) {
        this.entities = value;
    }


    public IssueType getIssueType() {
        return this.issueType;
    }


    public void setIssueType(IssueType value) {
        this.issueType = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof IssueParams)) {
            return false;
        }
        IssueParams otherObj = (IssueParams) obj;

        return (this.entities != null ? this.entities.equals(otherObj.entities) : this.entities == otherObj.entities) && (this.issueType != null ? this.issueType.equals(otherObj.issueType) : this.issueType == otherObj.issueType);
    }


    public int hashCode() {
        return (this.entities != null ? this.entities.hashCode() : 0) ^ (this.issueType != null ? this.issueType.hashCode() : 0);
    }


    public String toString() {
        return "IssueParams [entities=" + this.entities + ", " + "issueType=" + this.issueType + "]";
    }
}


