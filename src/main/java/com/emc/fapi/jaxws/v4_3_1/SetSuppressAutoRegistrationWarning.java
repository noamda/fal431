package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setSuppressAutoRegistrationWarning", propOrder = {"shouldSuppress"})
public class SetSuppressAutoRegistrationWarning {
    protected boolean shouldSuppress;

    public SetSuppressAutoRegistrationWarning() {
    }

    public SetSuppressAutoRegistrationWarning(boolean shouldSuppress) {
        this.shouldSuppress = shouldSuppress;
    }


    public boolean isShouldSuppress() {
        return this.shouldSuppress;
    }


    public void setShouldSuppress(boolean value) {
        this.shouldSuppress = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetSuppressAutoRegistrationWarning)) {
            return false;
        }
        SetSuppressAutoRegistrationWarning otherObj = (SetSuppressAutoRegistrationWarning) obj;

        return this.shouldSuppress == otherObj.shouldSuppress;
    }


    public int hashCode() {
        return this.shouldSuppress ? 1 : 0;
    }


    public String toString() {
        return "SetSuppressAutoRegistrationWarning [shouldSuppress=" + this.shouldSuppress + "]";
    }
}


