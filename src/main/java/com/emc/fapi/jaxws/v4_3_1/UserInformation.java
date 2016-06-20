package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserInformation", propOrder = {"groups", "logsFilter", "permissions", "roleName"})
public class UserInformation {
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupUID> groups;
    protected UserEventLogsFilter logsFilter;
    @XmlElement(nillable = true)
    protected List<Permission> permissions;
    protected String roleName;

    public UserInformation() {
    }

    public UserInformation(List<ConsistencyGroupUID> groups, UserEventLogsFilter logsFilter, List<Permission> permissions, String roleName) {
        this.groups = groups;
        this.logsFilter = logsFilter;
        this.permissions = permissions;
        this.roleName = roleName;
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


    public List<Permission> getPermissions() {
        if (this.permissions == null) {
            this.permissions = new ArrayList();
        }
        return this.permissions;
    }


    public String getRoleName() {
        return this.roleName;
    }


    public void setRoleName(String value) {
        this.roleName = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof UserInformation)) {
            return false;
        }
        UserInformation otherObj = (UserInformation) obj;

        return (this.groups != null ? this.groups.equals(otherObj.groups) : this.groups == otherObj.groups) && (this.logsFilter != null ? this.logsFilter.equals(otherObj.logsFilter) : this.logsFilter == otherObj.logsFilter) && (this.permissions != null ? this.permissions.equals(otherObj.permissions) : this.permissions == otherObj.permissions) && (this.roleName != null ? this.roleName.equals(otherObj.roleName) : this.roleName == otherObj.roleName);
    }


    public int hashCode() {
        return (this.groups != null ? this.groups.hashCode() : 0) ^ (this.logsFilter != null ? this.logsFilter.hashCode() : 0) ^ (this.permissions != null ? this.permissions.hashCode() : 0) ^ (this.roleName != null ? this.roleName.hashCode() : 0);
    }


    public String toString() {
        return "UserInformation [groups=" + this.groups + ", " + "logsFilter=" + this.logsFilter + ", " + "permissions=" + this.permissions + ", " + "roleName=" + this.roleName + "]";
    }
}


