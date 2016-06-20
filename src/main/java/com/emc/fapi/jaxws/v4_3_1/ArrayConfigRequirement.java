package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayConfigRequirement", propOrder = {"param", "type"})
public class ArrayConfigRequirement {
    protected String param;
    protected ConfigParamType type;

    public ArrayConfigRequirement() {
    }

    public ArrayConfigRequirement(String param, ConfigParamType type) {
        this.param = param;
        this.type = type;
    }


    public String getParam() {
        return this.param;
    }


    public void setParam(String value) {
        this.param = value;
    }


    public ConfigParamType getType() {
        return this.type;
    }


    public void setType(ConfigParamType value) {
        this.type = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ArrayConfigRequirement)) {
            return false;
        }
        ArrayConfigRequirement otherObj = (ArrayConfigRequirement) obj;

        return (this.param != null ? this.param.equals(otherObj.param) : this.param == otherObj.param) && (this.type != null ? this.type.equals(otherObj.type) : this.type == otherObj.type);
    }


    public int hashCode() {
        return (this.param != null ? this.param.hashCode() : 0) ^ (this.type != null ? this.type.hashCode() : 0);
    }


    public String toString() {
        return "ArrayConfigRequirement [param=" + this.param + ", " + "type=" + this.type + "]";
    }
}


