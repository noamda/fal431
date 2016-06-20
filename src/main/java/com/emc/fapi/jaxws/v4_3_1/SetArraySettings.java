package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setArraySettings", propOrder = {"params"})
public class SetArraySettings {
    protected SetArraySettingsParams params;

    public SetArraySettings() {
    }

    public SetArraySettings(SetArraySettingsParams params) {
        this.params = params;
    }


    public SetArraySettingsParams getParams() {
        return this.params;
    }


    public void setParams(SetArraySettingsParams value) {
        this.params = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetArraySettings)) {
            return false;
        }
        SetArraySettings otherObj = (SetArraySettings) obj;

        return this.params == otherObj.params ? true : this.params != null ? this.params.equals(otherObj.params) : false;
    }


    public int hashCode() {
        return this.params != null ? this.params.hashCode() : 0;
    }


    public String toString() {
        return "SetArraySettings [params=" + this.params + "]";
    }
}


