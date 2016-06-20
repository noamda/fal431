package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editRecoverPointUser", propOrder = {"oldUserName", "user"})
public class EditRecoverPointUser {
    protected String oldUserName;
    protected RecoverPointUser user;

    public EditRecoverPointUser() {
    }

    public EditRecoverPointUser(String oldUserName, RecoverPointUser user) {
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
        if (!(obj instanceof EditRecoverPointUser)) {
            return false;
        }
        EditRecoverPointUser otherObj = (EditRecoverPointUser) obj;

        return (this.oldUserName != null ? this.oldUserName.equals(otherObj.oldUserName) : this.oldUserName == otherObj.oldUserName) && (this.user != null ? this.user.equals(otherObj.user) : this.user == otherObj.user);
    }


    public int hashCode() {
        return (this.oldUserName != null ? this.oldUserName.hashCode() : 0) ^ (this.user != null ? this.user.hashCode() : 0);
    }


    public String toString() {
        return "EditRecoverPointUser [oldUserName=" + this.oldUserName + ", " + "user=" + this.user + "]";
    }
}


