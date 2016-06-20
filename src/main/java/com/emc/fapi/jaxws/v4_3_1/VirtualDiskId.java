package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskId", propOrder = {"unitNumber", "controller", "controllerType"})
public class VirtualDiskId {
    protected int unitNumber;
    protected int controller;
    @XmlElement(nillable = true)
    protected ControllerType controllerType;

    public VirtualDiskId() {
    }

    public VirtualDiskId(int unitNumber, int controller, ControllerType controllerType) {
        this.unitNumber = unitNumber;
        this.controller = controller;
        this.controllerType = controllerType;
    }


    public int getUnitNumber() {
        return this.unitNumber;
    }


    public void setUnitNumber(int value) {
        this.unitNumber = value;
    }


    public int getController() {
        return this.controller;
    }


    public void setController(int value) {
        this.controller = value;
    }


    public ControllerType getControllerType() {
        return this.controllerType;
    }


    public void setControllerType(ControllerType value) {
        this.controllerType = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VirtualDiskId)) {
            return false;
        }
        VirtualDiskId otherObj = (VirtualDiskId) obj;

        return (this.unitNumber == otherObj.unitNumber) && (this.controller == otherObj.controller) && (this.controllerType != null ? this.controllerType.equals(otherObj.controllerType) : this.controllerType == otherObj.controllerType);
    }


    public int hashCode() {
        return this.unitNumber ^ this.controller ^ (this.controllerType != null ? this.controllerType.hashCode() : 0);
    }


    public String toString() {
        return "VirtualDiskId [unitNumber=" + this.unitNumber + ", " + "controller=" + this.controller + ", " + "controllerType=" + this.controllerType + "]";
    }
}


