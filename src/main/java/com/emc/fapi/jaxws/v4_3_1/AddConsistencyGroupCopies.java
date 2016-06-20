package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addConsistencyGroupCopies", propOrder = {"newCopies"})
public class AddConsistencyGroupCopies {
    protected List<NewConsistencyGroupCopySettingsParam> newCopies;

    public AddConsistencyGroupCopies() {
    }

    public AddConsistencyGroupCopies(List<NewConsistencyGroupCopySettingsParam> newCopies) {
        this.newCopies = newCopies;
    }


    public List<NewConsistencyGroupCopySettingsParam> getNewCopies() {
        if (this.newCopies == null) {
            this.newCopies = new ArrayList();
        }
        return this.newCopies;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AddConsistencyGroupCopies)) {
            return false;
        }
        AddConsistencyGroupCopies otherObj = (AddConsistencyGroupCopies) obj;

        return this.newCopies == otherObj.newCopies ? true : this.newCopies != null ? this.newCopies.equals(otherObj.newCopies) : false;
    }


    public int hashCode() {
        return this.newCopies != null ? this.newCopies.hashCode() : 0;
    }


    public String toString() {
        return "AddConsistencyGroupCopies [newCopies=" + this.newCopies + "]";
    }
}


