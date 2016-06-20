package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Entity", propOrder = {"type", "uuid"})
public class Entity {
    @XmlElement(required = true)
    protected EntityType type;
    @XmlElement(required = true)
    protected String uuid;

    public Entity() {
    }

    public Entity(EntityType type, String uuid) {
        this.type = type;
        this.uuid = uuid;
    }


    public EntityType getType() {
        return this.type;
    }


    public void setType(EntityType value) {
        this.type = value;
    }


    public String getUuid() {
        return this.uuid;
    }


    public void setUuid(String value) {
        this.uuid = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof Entity)) {
            return false;
        }
        Entity otherObj = (Entity) obj;

        return (this.type != null ? this.type.equals(otherObj.type) : this.type == otherObj.type) && (this.uuid != null ? this.uuid.equals(otherObj.uuid) : this.uuid == otherObj.uuid);
    }


    public int hashCode() {
        return (this.type != null ? this.type.hashCode() : 0) ^ (this.uuid != null ? this.uuid.hashCode() : 0);
    }


    public String toString() {
        return "Entity [type=" + this.type + ", " + "uuid=" + this.uuid + "]";
    }
}


