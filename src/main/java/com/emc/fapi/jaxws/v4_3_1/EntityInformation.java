package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entityInformation", propOrder = {"displayName", "idValue", "subEntities"})
public class EntityInformation {
    protected String displayName;
    protected String idValue;
    @XmlElement(nillable = true)
    protected List<EntityIDInformation> subEntities;

    public EntityInformation() {
    }

    public EntityInformation(String displayName, String idValue, List<EntityIDInformation> subEntities) {
        this.displayName = displayName;
        this.idValue = idValue;
        this.subEntities = subEntities;
    }


    public String getDisplayName() {
        return this.displayName;
    }


    public void setDisplayName(String value) {
        this.displayName = value;
    }


    public String getIdValue() {
        return this.idValue;
    }


    public void setIdValue(String value) {
        this.idValue = value;
    }


    public List<EntityIDInformation> getSubEntities() {
        if (this.subEntities == null) {
            this.subEntities = new ArrayList();
        }
        return this.subEntities;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof EntityInformation)) {
            return false;
        }
        EntityInformation otherObj = (EntityInformation) obj;

        return (this.displayName != null ? this.displayName.equals(otherObj.displayName) : this.displayName == otherObj.displayName) && (this.idValue != null ? this.idValue.equals(otherObj.idValue) : this.idValue == otherObj.idValue) && (this.subEntities != null ? this.subEntities.equals(otherObj.subEntities) : this.subEntities == otherObj.subEntities);
    }


    public int hashCode() {
        return (this.displayName != null ? this.displayName.hashCode() : 0) ^ (this.idValue != null ? this.idValue.hashCode() : 0) ^ (this.subEntities != null ? this.subEntities.hashCode() : 0);
    }


    public String toString() {
        return "EntityInformation [displayName=" + this.displayName + ", " + "idValue=" + this.idValue + ", " + "subEntities=" + this.subEntities + "]";
    }
}


