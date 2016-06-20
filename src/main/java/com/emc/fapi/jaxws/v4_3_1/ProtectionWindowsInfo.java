package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtectionWindowsInfo", propOrder = {"currentProtectionWindow", "predictedProtectionWindow"})
public class ProtectionWindowsInfo {
    protected ProtectionWindowInfo currentProtectionWindow;
    protected ProtectionWindowInfo predictedProtectionWindow;

    public ProtectionWindowsInfo() {
    }

    public ProtectionWindowsInfo(ProtectionWindowInfo currentProtectionWindow, ProtectionWindowInfo predictedProtectionWindow) {
        this.currentProtectionWindow = currentProtectionWindow;
        this.predictedProtectionWindow = predictedProtectionWindow;
    }


    public ProtectionWindowInfo getCurrentProtectionWindow() {
        return this.currentProtectionWindow;
    }


    public void setCurrentProtectionWindow(ProtectionWindowInfo value) {
        this.currentProtectionWindow = value;
    }


    public ProtectionWindowInfo getPredictedProtectionWindow() {
        return this.predictedProtectionWindow;
    }


    public void setPredictedProtectionWindow(ProtectionWindowInfo value) {
        this.predictedProtectionWindow = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ProtectionWindowsInfo)) {
            return false;
        }
        ProtectionWindowsInfo otherObj = (ProtectionWindowsInfo) obj;

        return (this.currentProtectionWindow != null ? this.currentProtectionWindow.equals(otherObj.currentProtectionWindow) : this.currentProtectionWindow == otherObj.currentProtectionWindow) && (this.predictedProtectionWindow != null ? this.predictedProtectionWindow.equals(otherObj.predictedProtectionWindow) : this.predictedProtectionWindow == otherObj.predictedProtectionWindow);
    }


    public int hashCode() {
        return (this.currentProtectionWindow != null ? this.currentProtectionWindow.hashCode() : 0) ^ (this.predictedProtectionWindow != null ? this.predictedProtectionWindow.hashCode() : 0);
    }


    public String toString() {
        return "ProtectionWindowsInfo [currentProtectionWindow=" + this.currentProtectionWindow + ", " + "predictedProtectionWindow=" + this.predictedProtectionWindow + "]";
    }
}


