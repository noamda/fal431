package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoenixClusterProtectionPolicy", propOrder = {"domino", "regulate"})
public class PhoenixClusterProtectionPolicy {
    protected boolean domino;
    protected boolean regulate;

    public PhoenixClusterProtectionPolicy() {
    }

    public PhoenixClusterProtectionPolicy(boolean domino, boolean regulate) {
        this.domino = domino;
        this.regulate = regulate;
    }


    public boolean isDomino() {
        return this.domino;
    }


    public void setDomino(boolean value) {
        this.domino = value;
    }


    public boolean isRegulate() {
        return this.regulate;
    }


    public void setRegulate(boolean value) {
        this.regulate = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof PhoenixClusterProtectionPolicy)) {
            return false;
        }
        PhoenixClusterProtectionPolicy otherObj = (PhoenixClusterProtectionPolicy) obj;

        return (this.domino == otherObj.domino) && (this.regulate == otherObj.regulate);
    }


    public int hashCode() {
        return (this.domino ? 1 : 0) ^ (this.regulate ? 1 : 0);
    }


    public String toString() {
        return "PhoenixClusterProtectionPolicy [domino=" + this.domino + ", " + "regulate=" + this.regulate + "]";
    }
}


