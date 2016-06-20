package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoredParametersStatus", propOrder = {"parameters"})
public class MonitoredParametersStatus {
    @XmlElement(nillable = true)
    protected List<MonitoredParameter> parameters;

    public MonitoredParametersStatus() {
    }

    public MonitoredParametersStatus(List<MonitoredParameter> parameters) {
        this.parameters = parameters;
    }


    public List<MonitoredParameter> getParameters() {
        if (this.parameters == null) {
            this.parameters = new ArrayList();
        }
        return this.parameters;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof MonitoredParametersStatus)) {
            return false;
        }
        MonitoredParametersStatus otherObj = (MonitoredParametersStatus) obj;

        return this.parameters == otherObj.parameters ? true : this.parameters != null ? this.parameters.equals(otherObj.parameters) : false;
    }


    public int hashCode() {
        return this.parameters != null ? this.parameters.hashCode() : 0;
    }


    public String toString() {
        return "MonitoredParametersStatus [parameters=" + this.parameters + "]";
    }
}


