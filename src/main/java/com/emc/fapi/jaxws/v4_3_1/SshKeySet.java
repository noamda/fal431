package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sshKeySet", propOrder = {"innerSet"})
public class SshKeySet {
    @XmlElement(nillable = true)
    protected List<SSHKey> innerSet;

    public SshKeySet() {
    }

    public SshKeySet(List<SSHKey> innerSet) {
        this.innerSet = innerSet;
    }


    public List<SSHKey> getInnerSet() {
        if (this.innerSet == null) {
            this.innerSet = new ArrayList();
        }
        return this.innerSet;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SshKeySet)) {
            return false;
        }
        SshKeySet otherObj = (SshKeySet) obj;

        return this.innerSet == otherObj.innerSet ? true : this.innerSet != null ? this.innerSet.equals(otherObj.innerSet) : false;
    }


    public int hashCode() {
        return this.innerSet != null ? this.innerSet.hashCode() : 0;
    }


    public String toString() {
        return "SshKeySet [innerSet=" + this.innerSet + "]";
    }
}


