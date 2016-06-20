package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateEnableImageAccessWithGeneralParameters", propOrder = {"groupCopy", "params"})
public class ValidateEnableImageAccessWithGeneralParameters {
    protected ConsistencyGroupCopyUID groupCopy;
    protected ImageAccessGeneralParameters params;

    public ValidateEnableImageAccessWithGeneralParameters() {
    }

    public ValidateEnableImageAccessWithGeneralParameters(ConsistencyGroupCopyUID groupCopy, ImageAccessGeneralParameters params) {
        this.groupCopy = groupCopy;
        this.params = params;
    }


    public ConsistencyGroupCopyUID getGroupCopy() {
        return this.groupCopy;
    }


    public void setGroupCopy(ConsistencyGroupCopyUID value) {
        this.groupCopy = value;
    }


    public ImageAccessGeneralParameters getParams() {
        return this.params;
    }


    public void setParams(ImageAccessGeneralParameters value) {
        this.params = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateEnableImageAccessWithGeneralParameters)) {
            return false;
        }
        ValidateEnableImageAccessWithGeneralParameters otherObj = (ValidateEnableImageAccessWithGeneralParameters) obj;

        return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.params != null ? this.params.equals(otherObj.params) : this.params == otherObj.params);
    }


    public int hashCode() {
        return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.params != null ? this.params.hashCode() : 0);
    }


    public String toString() {
        return "ValidateEnableImageAccessWithGeneralParameters [groupCopy=" + this.groupCopy + ", " + "params=" + this.params + "]";
    }
}


