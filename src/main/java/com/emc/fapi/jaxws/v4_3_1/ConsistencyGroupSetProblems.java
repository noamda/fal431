package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupSetProblems", propOrder = {"errorMessage", "illegalGroups"})
public class ConsistencyGroupSetProblems {
    protected String errorMessage;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupUID> illegalGroups;

    public ConsistencyGroupSetProblems() {
    }

    public ConsistencyGroupSetProblems(String errorMessage, List<ConsistencyGroupUID> illegalGroups) {
        this.errorMessage = errorMessage;
        this.illegalGroups = illegalGroups;
    }


    public String getErrorMessage() {
        return this.errorMessage;
    }


    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }


    public List<ConsistencyGroupUID> getIllegalGroups() {
        if (this.illegalGroups == null) {
            this.illegalGroups = new ArrayList();
        }
        return this.illegalGroups;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupSetProblems)) {
            return false;
        }
        ConsistencyGroupSetProblems otherObj = (ConsistencyGroupSetProblems) obj;

        return (this.errorMessage != null ? this.errorMessage.equals(otherObj.errorMessage) : this.errorMessage == otherObj.errorMessage) && (this.illegalGroups != null ? this.illegalGroups.equals(otherObj.illegalGroups) : this.illegalGroups == otherObj.illegalGroups);
    }


    public int hashCode() {
        return (this.errorMessage != null ? this.errorMessage.hashCode() : 0) ^ (this.illegalGroups != null ? this.illegalGroups.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupSetProblems [errorMessage=" + this.errorMessage + ", " + "illegalGroups=" + this.illegalGroups + "]";
    }
}


