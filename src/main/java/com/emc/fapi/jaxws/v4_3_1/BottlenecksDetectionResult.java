package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BottlenecksDetectionResult", propOrder = {"result"})
public class BottlenecksDetectionResult {
    protected String result;

    public BottlenecksDetectionResult() {
    }

    public BottlenecksDetectionResult(String result) {
        this.result = result;
    }


    public String getResult() {
        return this.result;
    }


    public void setResult(String value) {
        this.result = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof BottlenecksDetectionResult)) {
            return false;
        }
        BottlenecksDetectionResult otherObj = (BottlenecksDetectionResult) obj;

        return this.result == otherObj.result ? true : this.result != null ? this.result.equals(otherObj.result) : false;
    }


    public int hashCode() {
        return this.result != null ? this.result.hashCode() : 0;
    }


    public String toString() {
        return "BottlenecksDetectionResult [result=" + this.result + "]";
    }
}


