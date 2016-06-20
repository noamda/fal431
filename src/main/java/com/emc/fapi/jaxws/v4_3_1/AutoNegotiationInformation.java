package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoNegotiationInformation", propOrder = {"enabled", "fullDuplex", "speed"})
public class AutoNegotiationInformation {
    protected boolean enabled;
    protected boolean fullDuplex;
    protected int speed;

    public AutoNegotiationInformation() {
    }

    public AutoNegotiationInformation(boolean enabled, boolean fullDuplex, int speed) {
        this.enabled = enabled;
        this.fullDuplex = fullDuplex;
        this.speed = speed;
    }


    public boolean isEnabled() {
        return this.enabled;
    }


    public void setEnabled(boolean value) {
        this.enabled = value;
    }


    public boolean isFullDuplex() {
        return this.fullDuplex;
    }


    public void setFullDuplex(boolean value) {
        this.fullDuplex = value;
    }


    public int getSpeed() {
        return this.speed;
    }


    public void setSpeed(int value) {
        this.speed = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AutoNegotiationInformation)) {
            return false;
        }
        AutoNegotiationInformation otherObj = (AutoNegotiationInformation) obj;

        return (this.enabled == otherObj.enabled) && (this.fullDuplex == otherObj.fullDuplex) && (this.speed == otherObj.speed);
    }


    public int hashCode() {
        return (this.enabled ? 1 : 0) ^ (this.fullDuplex ? 1 : 0) ^ this.speed;
    }


    public String toString() {
        return "AutoNegotiationInformation [enabled=" + this.enabled + ", " + "fullDuplex=" + this.fullDuplex + ", " + "speed=" + this.speed + "]";
    }
}


