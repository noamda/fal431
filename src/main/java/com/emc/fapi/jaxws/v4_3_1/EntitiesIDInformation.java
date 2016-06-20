package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entitiesIDInformation", propOrder = {"entities", "rootDisplayName"})
public class EntitiesIDInformation {
    @XmlElement(nillable = true)
    protected List<EntityIDInformation> entities;
    protected String rootDisplayName;

    public EntitiesIDInformation() {
    }

    public EntitiesIDInformation(List<EntityIDInformation> entities, String rootDisplayName) {
        this.entities = entities;
        this.rootDisplayName = rootDisplayName;
    }


    public List<EntityIDInformation> getEntities() {
        if (this.entities == null) {
            this.entities = new ArrayList();
        }
        return this.entities;
    }


    public String getRootDisplayName() {
        return this.rootDisplayName;
    }


    public void setRootDisplayName(String value) {
        this.rootDisplayName = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof EntitiesIDInformation)) {
            return false;
        }
        EntitiesIDInformation otherObj = (EntitiesIDInformation) obj;

        return (this.entities != null ? this.entities.equals(otherObj.entities) : this.entities == otherObj.entities) && (this.rootDisplayName != null ? this.rootDisplayName.equals(otherObj.rootDisplayName) : this.rootDisplayName == otherObj.rootDisplayName);
    }


    public int hashCode() {
        return (this.entities != null ? this.entities.hashCode() : 0) ^ (this.rootDisplayName != null ? this.rootDisplayName.hashCode() : 0);
    }


    public String toString() {
        return "EntitiesIDInformation [entities=" + this.entities + ", " + "rootDisplayName=" + this.rootDisplayName + "]";
    }
}


