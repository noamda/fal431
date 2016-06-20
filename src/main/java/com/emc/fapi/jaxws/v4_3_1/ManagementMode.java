package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagementMode", propOrder = {"managedByRecoverPoint", "externalManagement"})
public class ManagementMode {
    protected boolean managedByRecoverPoint;
    @XmlElement(required = true, nillable = true)
    protected ExternalManagement externalManagement;

    public ManagementMode() {
    }

    public ManagementMode(boolean managedByRecoverPoint, ExternalManagement externalManagement) {
        this.managedByRecoverPoint = managedByRecoverPoint;
        this.externalManagement = externalManagement;
    }


    public boolean isManagedByRecoverPoint() {
        return this.managedByRecoverPoint;
    }


    public void setManagedByRecoverPoint(boolean value) {
        this.managedByRecoverPoint = value;
    }


    public ExternalManagement getExternalManagement() {
        return this.externalManagement;
    }


    public void setExternalManagement(ExternalManagement value) {
        this.externalManagement = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ManagementMode)) {
            return false;
        }
        ManagementMode otherObj = (ManagementMode) obj;

        return (this.managedByRecoverPoint == otherObj.managedByRecoverPoint) && (this.externalManagement != null ? this.externalManagement.equals(otherObj.externalManagement) : this.externalManagement == otherObj.externalManagement);
    }


    public int hashCode() {
        return (this.managedByRecoverPoint ? 1 : 0) ^ (this.externalManagement != null ? this.externalManagement.hashCode() : 0);
    }


    public String toString() {
        return "ManagementMode [managedByRecoverPoint=" + this.managedByRecoverPoint + ", " + "externalManagement=" + this.externalManagement + "]";
    }
}


