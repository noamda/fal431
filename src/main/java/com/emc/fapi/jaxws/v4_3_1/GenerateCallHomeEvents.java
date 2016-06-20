package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generateCallHomeEvents", propOrder = {"script"})
public class GenerateCallHomeEvents {
    protected String script;

    public GenerateCallHomeEvents() {
    }

    public GenerateCallHomeEvents(String script) {
        this.script = script;
    }


    public String getScript() {
        return this.script;
    }


    public void setScript(String value) {
        this.script = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GenerateCallHomeEvents)) {
            return false;
        }
        GenerateCallHomeEvents otherObj = (GenerateCallHomeEvents) obj;

        return this.script == otherObj.script ? true : this.script != null ? this.script.equals(otherObj.script) : false;
    }


    public int hashCode() {
        return this.script != null ? this.script.hashCode() : 0;
    }


    public String toString() {
        return "GenerateCallHomeEvents [script=" + this.script + "]";
    }
}


