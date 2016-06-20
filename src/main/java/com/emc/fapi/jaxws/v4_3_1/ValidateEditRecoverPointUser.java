package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateEditRecoverPointUser", propOrder = {"oldUserName", "user"})
public class ValidateEditRecoverPointUser {
    protected String oldUserName;
    protected RecoverPointUser user;

    public ValidateEditRecoverPointUser() {
    }

    public ValidateEditRecoverPointUser(String oldUserName, RecoverPointUser user) {
        this.oldUserName = oldUserName;
        this.user = user;
    }


    public String getOldUserName() {
        return this.oldUserName;
    }


    public void setOldUserName(String value) {
        this.oldUserName = value;
    }


    public RecoverPointUser getUser() {
        return this.user;
    }


    public void setUser(RecoverPointUser value) {
        this.user = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateEditRecoverPointUser)) {
            return false;
        }
        ValidateEditRecoverPointUser otherObj = (ValidateEditRecoverPointUser) obj;

        return (this.oldUserName != null ? this.oldUserName.equals(otherObj.oldUserName) : this.oldUserName == otherObj.oldUserName) && (this.user != null ? this.user.equals(otherObj.user) : this.user == otherObj.user);
    }


    public int hashCode() {
        return (this.oldUserName != null ? this.oldUserName.hashCode() : 0) ^ (this.user != null ? this.user.hashCode() : 0);
    }


    public String toString() {
        return "ValidateEditRecoverPointUser [oldUserName=" + this.oldUserName + ", " + "user=" + this.user + "]";
    }
}


