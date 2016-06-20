package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeSSHKey", propOrder = {"key"})
public class RemoveSSHKey {
    protected SSHKey key;

    public RemoveSSHKey() {
    }

    public RemoveSSHKey(SSHKey key) {
        this.key = key;
    }


    public SSHKey getKey() {
        return this.key;
    }


    public void setKey(SSHKey value) {
        this.key = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RemoveSSHKey)) {
            return false;
        }
        RemoveSSHKey otherObj = (RemoveSSHKey) obj;

        return this.key == otherObj.key ? true : this.key != null ? this.key.equals(otherObj.key) : false;
    }


    public int hashCode() {
        return this.key != null ? this.key.hashCode() : 0;
    }


    public String toString() {
        return "RemoveSSHKey [key=" + this.key + "]";
    }
}


