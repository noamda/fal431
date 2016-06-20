package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addSSHKey", propOrder = {"key"})
public class AddSSHKey {
    protected SSHKey key;

    public AddSSHKey() {
    }

    public AddSSHKey(SSHKey key) {
        this.key = key;
    }


    public SSHKey getKey() {
        return this.key;
    }


    public void setKey(SSHKey value) {
        this.key = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AddSSHKey)) {
            return false;
        }
        AddSSHKey otherObj = (AddSSHKey) obj;

        return this.key == otherObj.key ? true : this.key != null ? this.key.equals(otherObj.key) : false;
    }


    public int hashCode() {
        return this.key != null ? this.key.hashCode() : 0;
    }


    public String toString() {
        return "AddSSHKey [key=" + this.key + "]";
    }
}


