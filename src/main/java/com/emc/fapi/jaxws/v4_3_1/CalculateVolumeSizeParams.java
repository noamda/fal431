package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculateVolumeSizeParams", propOrder = {"incomingDataRatePerSecond", "requiredProtectionWindow"})
public class CalculateVolumeSizeParams {
    protected long incomingDataRatePerSecond;
    protected long requiredProtectionWindow;

    public CalculateVolumeSizeParams() {
    }

    public CalculateVolumeSizeParams(long incomingDataRatePerSecond, long requiredProtectionWindow) {
        this.incomingDataRatePerSecond = incomingDataRatePerSecond;
        this.requiredProtectionWindow = requiredProtectionWindow;
    }


    public long getIncomingDataRatePerSecond() {
        return this.incomingDataRatePerSecond;
    }


    public void setIncomingDataRatePerSecond(long value) {
        this.incomingDataRatePerSecond = value;
    }


    public long getRequiredProtectionWindow() {
        return this.requiredProtectionWindow;
    }


    public void setRequiredProtectionWindow(long value) {
        this.requiredProtectionWindow = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof CalculateVolumeSizeParams)) {
            return false;
        }
        CalculateVolumeSizeParams otherObj = (CalculateVolumeSizeParams) obj;

        return (this.incomingDataRatePerSecond == otherObj.incomingDataRatePerSecond) && (this.requiredProtectionWindow == otherObj.requiredProtectionWindow);
    }


    public int hashCode() {
        return (int) this.incomingDataRatePerSecond ^ (int) this.requiredProtectionWindow;
    }


    public String toString() {
        return "CalculateVolumeSizeParams [incomingDataRatePerSecond=" + this.incomingDataRatePerSecond + ", " + "requiredProtectionWindow=" + this.requiredProtectionWindow + "]";
    }
}


