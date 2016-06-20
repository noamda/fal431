package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fixIssues", propOrder = {"arrayUID", "entities"})
public class FixIssues {
    @XmlElement(nillable = true)
    protected ArrayUID arrayUID;
    protected List<Entity> entities;

    public FixIssues() {
    }

    public FixIssues(ArrayUID arrayUID, List<Entity> entities) {
        this.arrayUID = arrayUID;
        this.entities = entities;
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


    public boolean equals(Object obj) {
        if (!(obj instanceof FixIssues)) {
            return false;
        }
        FixIssues otherObj = (FixIssues) obj;

        return (this.arrayUID != null ? this.arrayUID.equals(otherObj.arrayUID) : this.arrayUID == otherObj.arrayUID) && (this.entities != null ? this.entities.equals(otherObj.entities) : this.entities == otherObj.entities);
    }


    public int hashCode() {
        return (this.arrayUID != null ? this.arrayUID.hashCode() : 0) ^ (this.entities != null ? this.entities.hashCode() : 0);
    }


    public String toString() {
        return "FixIssues [arrayUID=" + this.arrayUID + ", " + "entities=" + this.entities + "]";
    }
}


