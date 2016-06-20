package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "restClusterMaintenanceMode", propOrder = {"restEnum"})
public class RestClusterMaintenanceMode {
    protected ClusterMaintenanceMode restEnum;

    public RestClusterMaintenanceMode() {
    }

    public RestClusterMaintenanceMode(ClusterMaintenanceMode restEnum) {
        this.restEnum = restEnum;
    }


    public ClusterMaintenanceMode getRestEnum() {
        return this.restEnum;
    }


    public void setRestEnum(ClusterMaintenanceMode value) {
        this.restEnum = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RestClusterMaintenanceMode)) {
            return false;
        }
        RestClusterMaintenanceMode otherObj = (RestClusterMaintenanceMode) obj;

        return this.restEnum == otherObj.restEnum ? true : this.restEnum != null ? this.restEnum.equals(otherObj.restEnum) : false;
    }


    public int hashCode() {
        return this.restEnum != null ? this.restEnum.hashCode() : 0;
    }


    public String toString() {
        return "RestClusterMaintenanceMode [restEnum=" + this.restEnum + "]";
    }
}


