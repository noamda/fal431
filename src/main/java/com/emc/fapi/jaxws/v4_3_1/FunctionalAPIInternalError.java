package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("FunctionalAPIInternalError")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunctionalAPIInternalError", propOrder = {"message"})
public class FunctionalAPIInternalError {
    protected String message;

    public FunctionalAPIInternalError() {
    }

    public FunctionalAPIInternalError(String message) {
        this.message = message;
    }


    public String getMessage() {
        return this.message;
    }


    public void setMessage(String value) {
        this.message = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof FunctionalAPIInternalError)) {
            return false;
        }
        FunctionalAPIInternalError otherObj = (FunctionalAPIInternalError) obj;

        return this.message == otherObj.message ? true : this.message != null ? this.message.equals(otherObj.message) : false;
    }


    public int hashCode() {
        return this.message != null ? this.message.hashCode() : 0;
    }


    public String toString() {
        return "FunctionalAPIInternalError [message=" + this.message + "]";
    }
}


