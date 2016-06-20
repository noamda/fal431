package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemStatus", propOrder = {"problems"})
public class SystemStatus {
    @XmlElement(nillable = true)
    protected List<ProblemDescription> problems;

    public SystemStatus() {
    }

    public SystemStatus(List<ProblemDescription> problems) {
        this.problems = problems;
    }


    public List<ProblemDescription> getProblems() {
        if (this.problems == null) {
            this.problems = new ArrayList();
        }
        return this.problems;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SystemStatus)) {
            return false;
        }
        SystemStatus otherObj = (SystemStatus) obj;

        return this.problems == otherObj.problems ? true : this.problems != null ? this.problems.equals(otherObj.problems) : false;
    }


    public int hashCode() {
        return this.problems != null ? this.problems.hashCode() : 0;
    }


    public String toString() {
        return "SystemStatus [problems=" + this.problems + "]";
    }
}


