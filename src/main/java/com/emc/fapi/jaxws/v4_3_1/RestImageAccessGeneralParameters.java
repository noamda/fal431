package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "restImageAccessGeneralParameters", propOrder = {"restClass"})
public class RestImageAccessGeneralParameters {
    protected ImageAccessGeneralParameters restClass;

    public RestImageAccessGeneralParameters() {
    }

    public RestImageAccessGeneralParameters(ImageAccessGeneralParameters restClass) {
        this.restClass = restClass;
    }


    public ImageAccessGeneralParameters getRestClass() {
        return this.restClass;
    }


    public void setRestClass(ImageAccessGeneralParameters value) {
        this.restClass = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RestImageAccessGeneralParameters)) {
            return false;
        }
        RestImageAccessGeneralParameters otherObj = (RestImageAccessGeneralParameters) obj;

        return this.restClass == otherObj.restClass ? true : this.restClass != null ? this.restClass.equals(otherObj.restClass) : false;
    }


    public int hashCode() {
        return this.restClass != null ? this.restClass.hashCode() : 0;
    }


    public String toString() {
        return "RestImageAccessGeneralParameters [restClass=" + this.restClass + "]";
    }
}


