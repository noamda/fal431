package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifyConsistencyGroupCopyStateParam", propOrder = {"copyUID", "enabled", "activePrimaryRPA", "secondaryRPAs", "possibleJournalStates", "accessedImageTime", "possibleStorageAccessStates"})
public class VerifyConsistencyGroupCopyStateParam {
    @XmlElement(required = true)
    protected ConsistencyGroupCopyUID copyUID;
    protected Boolean enabled;
    protected Integer activePrimaryRPA;
    @XmlElement(nillable = true)
    protected List<Integer> secondaryRPAs;
    @XmlElement(required = true)
    protected List<JournalState> possibleJournalStates;
    protected TimeFrame accessedImageTime;
    @XmlElement(required = true)
    protected List<StorageAccessState> possibleStorageAccessStates;

    public VerifyConsistencyGroupCopyStateParam() {
    }

    public VerifyConsistencyGroupCopyStateParam(ConsistencyGroupCopyUID copyUID, Boolean enabled, Integer activePrimaryRPA, List<Integer> secondaryRPAs, List<JournalState> possibleJournalStates, TimeFrame accessedImageTime, List<StorageAccessState> possibleStorageAccessStates) {
        this.copyUID = copyUID;
        this.enabled = enabled;
        this.activePrimaryRPA = activePrimaryRPA;
        this.secondaryRPAs = secondaryRPAs;
        this.possibleJournalStates = possibleJournalStates;
        this.accessedImageTime = accessedImageTime;
        this.possibleStorageAccessStates = possibleStorageAccessStates;
    }


    public ConsistencyGroupCopyUID getCopyUID() {
        return this.copyUID;
    }


    public void setCopyUID(ConsistencyGroupCopyUID value) {
        this.copyUID = value;
    }


    public Boolean isEnabled() {
        return this.enabled;
    }


    public void setEnabled(Boolean value) {
        this.enabled = value;
    }


    public Integer getActivePrimaryRPA() {
        return this.activePrimaryRPA;
    }


    public void setActivePrimaryRPA(Integer value) {
        this.activePrimaryRPA = value;
    }


    public List<Integer> getSecondaryRPAs() {
        if (this.secondaryRPAs == null) {
            this.secondaryRPAs = new ArrayList();
        }
        return this.secondaryRPAs;
    }


    public List<JournalState> getPossibleJournalStates() {
        if (this.possibleJournalStates == null) {
            this.possibleJournalStates = new ArrayList();
        }
        return this.possibleJournalStates;
    }


    public TimeFrame getAccessedImageTime() {
        return this.accessedImageTime;
    }


    public void setAccessedImageTime(TimeFrame value) {
        this.accessedImageTime = value;
    }


    public List<StorageAccessState> getPossibleStorageAccessStates() {
        if (this.possibleStorageAccessStates == null) {
            this.possibleStorageAccessStates = new ArrayList();
        }
        return this.possibleStorageAccessStates;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VerifyConsistencyGroupCopyStateParam)) {
            return false;
        }
        VerifyConsistencyGroupCopyStateParam otherObj = (VerifyConsistencyGroupCopyStateParam) obj;

        return (this.copyUID != null ? this.copyUID.equals(otherObj.copyUID) : this.copyUID == otherObj.copyUID) && (this.enabled != null ? this.enabled.equals(otherObj.enabled) : this.enabled == otherObj.enabled) && (this.activePrimaryRPA != null ? this.activePrimaryRPA.equals(otherObj.activePrimaryRPA) : this.activePrimaryRPA == otherObj.activePrimaryRPA) && (this.secondaryRPAs != null ? this.secondaryRPAs.equals(otherObj.secondaryRPAs) : this.secondaryRPAs == otherObj.secondaryRPAs) && (this.possibleJournalStates != null ? this.possibleJournalStates.equals(otherObj.possibleJournalStates) : this.possibleJournalStates == otherObj.possibleJournalStates) && (this.accessedImageTime != null ? this.accessedImageTime.equals(otherObj.accessedImageTime) : this.accessedImageTime == otherObj.accessedImageTime) && (this.possibleStorageAccessStates != null ? this.possibleStorageAccessStates.equals(otherObj.possibleStorageAccessStates) : this.possibleStorageAccessStates == otherObj.possibleStorageAccessStates);
    }


    public int hashCode() {
        return (this.copyUID != null ? this.copyUID.hashCode() : 0) ^ (this.enabled != null ? this.enabled.hashCode() : 0) ^ (this.activePrimaryRPA != null ? this.activePrimaryRPA.hashCode() : 0) ^ (this.secondaryRPAs != null ? this.secondaryRPAs.hashCode() : 0) ^ (this.possibleJournalStates != null ? this.possibleJournalStates.hashCode() : 0) ^ (this.accessedImageTime != null ? this.accessedImageTime.hashCode() : 0) ^ (this.possibleStorageAccessStates != null ? this.possibleStorageAccessStates.hashCode() : 0);
    }


    public String toString() {
        return "VerifyConsistencyGroupCopyStateParam [copyUID=" + this.copyUID + ", " + "enabled=" + this.enabled + ", " + "activePrimaryRPA=" + this.activePrimaryRPA + ", " + "secondaryRPAs=" + this.secondaryRPAs + ", " + "possibleJournalStates=" + this.possibleJournalStates + ", " + "accessedImageTime=" + this.accessedImageTime + ", " + "possibleStorageAccessStates=" + this.possibleStorageAccessStates + "]";
    }
}


