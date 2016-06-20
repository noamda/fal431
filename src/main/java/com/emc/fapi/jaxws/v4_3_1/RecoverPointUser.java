package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecoverPointUser", propOrder = {"userType", "name", "password", "roleName", "groups", "logsFilter"})
public class RecoverPointUser {
    @XmlElement(required = true)
    protected RecoverPointUserType userType;
    @XmlElement(required = true)
    protected String name;
    protected byte[] password;
    @XmlElement(required = true)
    protected String roleName;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupUID> groups;
    protected UserEventLogsFilter logsFilter;

    public RecoverPointUser() {
    }

    public RecoverPointUser(RecoverPointUserType userType, String name, byte[] password, String roleName, List<ConsistencyGroupUID> groups, UserEventLogsFilter logsFilter) {
        this.userType = userType;
        this.name = name;
        this.password = password;
        this.roleName = roleName;
        this.groups = groups;
        this.logsFilter = logsFilter;
    }


    public RecoverPointUserType getUserType() {
        return this.userType;
    }


    public void setUserType(RecoverPointUserType value) {
        this.userType = value;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public byte[] getPassword() {
        return this.password;
    }


    public void setPassword(byte[] value) {
        this.password = value;
    }


    public String getRoleName() {
        return this.roleName;
    }


    public void setRoleName(String value) {
        this.roleName = value;
    }


    public List<ConsistencyGroupUID> getGroups() {
        if (this.groups == null) {
            this.groups = new ArrayList();
        }
        return this.groups;
    }


    public UserEventLogsFilter getLogsFilter() {
        return this.logsFilter;
    }


    public void setLogsFilter(UserEventLogsFilter value) {
        this.logsFilter = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RecoverPointUser)) {
            return false;
        }
        RecoverPointUser otherObj = (RecoverPointUser) obj;

        return (this.userType != null ? this.userType.equals(otherObj.userType) : this.userType == otherObj.userType) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.password != null ? this.password.equals(otherObj.password) : this.password == otherObj.password) && (this.roleName != null ? this.roleName.equals(otherObj.roleName) : this.roleName == otherObj.roleName) && (this.groups != null ? this.groups.equals(otherObj.groups) : this.groups == otherObj.groups) && (this.logsFilter != null ? this.logsFilter.equals(otherObj.logsFilter) : this.logsFilter == otherObj.logsFilter);
    }


    public int hashCode() {
        return (this.userType != null ? this.userType.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.password != null ? this.password.hashCode() : 0) ^ (this.roleName != null ? this.roleName.hashCode() : 0) ^ (this.groups != null ? this.groups.hashCode() : 0) ^ (this.logsFilter != null ? this.logsFilter.hashCode() : 0);
    }


    public String toString() {
        return "RecoverPointUser [userType=" + this.userType + ", " + "name=" + this.name + ", " + "password=" + this.password + ", " + "roleName=" + this.roleName + ", " + "groups=" + this.groups + ", " + "logsFilter=" + this.logsFilter + "]";
    }
}


