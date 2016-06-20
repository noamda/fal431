package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LDAPServerInfo", propOrder = {"groupsNames", "usersNames"})
public class LDAPServerInfo {
    @XmlElement(nillable = true)
    protected List<String> groupsNames;
    @XmlElement(nillable = true)
    protected List<String> usersNames;

    public LDAPServerInfo() {
    }

    public LDAPServerInfo(List<String> groupsNames, List<String> usersNames) {
        this.groupsNames = groupsNames;
        this.usersNames = usersNames;
    }


    public List<String> getGroupsNames() {
        if (this.groupsNames == null) {
            this.groupsNames = new ArrayList();
        }
        return this.groupsNames;
    }


    public List<String> getUsersNames() {
        if (this.usersNames == null) {
            this.usersNames = new ArrayList();
        }
        return this.usersNames;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof LDAPServerInfo)) {
            return false;
        }
        LDAPServerInfo otherObj = (LDAPServerInfo) obj;

        return (this.groupsNames != null ? this.groupsNames.equals(otherObj.groupsNames) : this.groupsNames == otherObj.groupsNames) && (this.usersNames != null ? this.usersNames.equals(otherObj.usersNames) : this.usersNames == otherObj.usersNames);
    }


    public int hashCode() {
        return (this.groupsNames != null ? this.groupsNames.hashCode() : 0) ^ (this.usersNames != null ? this.usersNames.hashCode() : 0);
    }


    public String toString() {
        return "LDAPServerInfo [groupsNames=" + this.groupsNames + ", " + "usersNames=" + this.usersNames + "]";
    }
}


