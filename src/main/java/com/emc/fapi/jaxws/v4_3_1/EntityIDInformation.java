package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entityIDInformation", propOrder = {"entities", "pathParamName"})
public class EntityIDInformation {
    @XmlElement(nillable = true)
    protected List<EntityInformation> entities;
    protected String pathParamName;

    public EntityIDInformation() {
    }

    public EntityIDInformation(List<EntityInformation> entities, String pathParamName) {
        this.entities = entities;
        this.pathParamName = pathParamName;
    }


    public List<EntityInformation> getEntities() {
        if (this.entities == null) {
            this.entities = new ArrayList();
        }
        return this.entities;
    }


    public String getPathParamName() {
        return this.pathParamName;
    }


    public void setPathParamName(String value) {
        this.pathParamName = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof EntityIDInformation)) {
            return false;
        }
        EntityIDInformation otherObj = (EntityIDInformation) obj;

        return (this.entities != null ? this.entities.equals(otherObj.entities) : this.entities == otherObj.entities) && (this.pathParamName != null ? this.pathParamName.equals(otherObj.pathParamName) : this.pathParamName == otherObj.pathParamName);
    }


    public int hashCode() {
        return (this.entities != null ? this.entities.hashCode() : 0) ^ (this.pathParamName != null ? this.pathParamName.hashCode() : 0);
    }


    public String toString() {
        return "EntityIDInformation [entities=" + this.entities + ", " + "pathParamName=" + this.pathParamName + "]";
    }
}


