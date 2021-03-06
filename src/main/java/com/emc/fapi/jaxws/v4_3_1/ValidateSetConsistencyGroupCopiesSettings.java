package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateSetConsistencyGroupCopiesSettings", propOrder = {"group", "copiesChanges"})
public class ValidateSetConsistencyGroupCopiesSettings {
    protected ConsistencyGroupUID group;
    protected List<ConsistencyGroupCopySettingsChangesParam> copiesChanges;

    public ValidateSetConsistencyGroupCopiesSettings() {
    }

    public ValidateSetConsistencyGroupCopiesSettings(ConsistencyGroupUID group, List<ConsistencyGroupCopySettingsChangesParam> copiesChanges) {
        this.group = group;
        this.copiesChanges = copiesChanges;
    }


    public ConsistencyGroupUID getGroup() {
        return this.group;
    }


    public void setGroup(ConsistencyGroupUID value) {
        this.group = value;
    }


    public List<ConsistencyGroupCopySettingsChangesParam> getCopiesChanges() {
        if (this.copiesChanges == null) {
            this.copiesChanges = new ArrayList();
        }
        return this.copiesChanges;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateSetConsistencyGroupCopiesSettings)) {
            return false;
        }
        ValidateSetConsistencyGroupCopiesSettings otherObj = (ValidateSetConsistencyGroupCopiesSettings) obj;

        return (this.group != null ? this.group.equals(otherObj.group) : this.group == otherObj.group) && (this.copiesChanges != null ? this.copiesChanges.equals(otherObj.copiesChanges) : this.copiesChanges == otherObj.copiesChanges);
    }


    public int hashCode() {
        return (this.group != null ? this.group.hashCode() : 0) ^ (this.copiesChanges != null ? this.copiesChanges.hashCode() : 0);
    }


    public String toString() {
        return "ValidateSetConsistencyGroupCopiesSettings [group=" + this.group + ", " + "copiesChanges=" + this.copiesChanges + "]";
    }
}


