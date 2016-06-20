package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityInfo", propOrder = {"entity", "name"})
public class EntityInfo {
    @XmlElement(nillable = true)
    protected Entity entity;
    protected String name;

    public EntityInfo() {
    }

    public EntityInfo(Entity entity, String name) {
        this.entity = entity;
        this.name = name;
    }


    public Entity getEntity() {
        return this.entity;
    }


    public void setEntity(Entity value) {
        this.entity = value;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof EntityInfo)) {
            return false;
        }
        EntityInfo otherObj = (EntityInfo) obj;

        return (this.entity != null ? this.entity.equals(otherObj.entity) : this.entity == otherObj.entity) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name);
    }


    public int hashCode() {
        return (this.entity != null ? this.entity.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0);
    }


    public String toString() {
        return "EntityInfo [entity=" + this.entity + ", " + "name=" + this.name + "]";
    }
}


