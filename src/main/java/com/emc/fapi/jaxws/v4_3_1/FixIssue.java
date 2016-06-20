package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fixIssue", propOrder = {"arrayUID", "entities", "issueType"})
public class FixIssue {
    @XmlElement(nillable = true)
    protected ArrayUID arrayUID;
    protected List<Entity> entities;
    @XmlElement(nillable = true)
    protected IssueType issueType;

    public FixIssue() {
    }

    public FixIssue(ArrayUID arrayUID, List<Entity> entities, IssueType issueType) {
        this.arrayUID = arrayUID;
        this.entities = entities;
        this.issueType = issueType;
    }


    public ArrayUID getArrayUID() {
        return this.arrayUID;
    }


    public void setArrayUID(ArrayUID value) {
        this.arrayUID = value;
    }


    public List<Entity> getEntities() {
        if (this.entities == null) {
            this.entities = new ArrayList();
        }
        return this.entities;
    }


    public IssueType getIssueType() {
        return this.issueType;
    }


    public void setIssueType(IssueType value) {
        this.issueType = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof FixIssue)) {
            return false;
        }
        FixIssue otherObj = (FixIssue) obj;

        return (this.arrayUID != null ? this.arrayUID.equals(otherObj.arrayUID) : this.arrayUID == otherObj.arrayUID) && (this.entities != null ? this.entities.equals(otherObj.entities) : this.entities == otherObj.entities) && (this.issueType != null ? this.issueType.equals(otherObj.issueType) : this.issueType == otherObj.issueType);
    }


    public int hashCode() {
        return (this.arrayUID != null ? this.arrayUID.hashCode() : 0) ^ (this.entities != null ? this.entities.hashCode() : 0) ^ (this.issueType != null ? this.issueType.hashCode() : 0);
    }


    public String toString() {
        return "FixIssue [arrayUID=" + this.arrayUID + ", " + "entities=" + this.entities + ", " + "issueType=" + this.issueType + "]";
    }
}


