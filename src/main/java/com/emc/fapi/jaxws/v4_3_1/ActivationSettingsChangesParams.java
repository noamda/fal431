package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivationSettingsChangesParams", propOrder = {"allowAutomaticEnable", "enable", "startTransfer"})
public class ActivationSettingsChangesParams {
    protected Boolean allowAutomaticEnable;
    protected Boolean enable;
    protected Boolean startTransfer;

    public ActivationSettingsChangesParams() {
    }

    public ActivationSettingsChangesParams(Boolean allowAutomaticEnable, Boolean enable, Boolean startTransfer) {
        this.allowAutomaticEnable = allowAutomaticEnable;
        this.enable = enable;
        this.startTransfer = startTransfer;
    }


    public Boolean isAllowAutomaticEnable() {
        return this.allowAutomaticEnable;
    }


    public void setAllowAutomaticEnable(Boolean value) {
        this.allowAutomaticEnable = value;
    }


    public Boolean isEnable() {
        return this.enable;
    }


    public void setEnable(Boolean value) {
        this.enable = value;
    }


    public Boolean isStartTransfer() {
        return this.startTransfer;
    }


    public void setStartTransfer(Boolean value) {
        this.startTransfer = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ActivationSettingsChangesParams)) {
            return false;
        }
        ActivationSettingsChangesParams otherObj = (ActivationSettingsChangesParams) obj;

        return (this.allowAutomaticEnable != null ? this.allowAutomaticEnable.equals(otherObj.allowAutomaticEnable) : this.allowAutomaticEnable == otherObj.allowAutomaticEnable) && (this.enable != null ? this.enable.equals(otherObj.enable) : this.enable == otherObj.enable) && (this.startTransfer != null ? this.startTransfer.equals(otherObj.startTransfer) : this.startTransfer == otherObj.startTransfer);
    }


    public int hashCode() {
        return (this.allowAutomaticEnable != null ? this.allowAutomaticEnable.hashCode() : 0) ^ (this.enable != null ? this.enable.hashCode() : 0) ^ (this.startTransfer != null ? this.startTransfer.hashCode() : 0);
    }


    public String toString() {
        return "ActivationSettingsChangesParams [allowAutomaticEnable=" + this.allowAutomaticEnable + ", " + "enable=" + this.enable + ", " + "startTransfer=" + this.startTransfer + "]";
    }
}


