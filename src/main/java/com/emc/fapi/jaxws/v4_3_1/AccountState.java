package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountState", propOrder = {"licensesState"})
public class AccountState {
    @XmlElement(nillable = true)
    protected List<LicenseState> licensesState;

    public AccountState() {
    }

    public AccountState(List<LicenseState> licensesState) {
        this.licensesState = licensesState;
    }


    public List<LicenseState> getLicensesState() {
        if (this.licensesState == null) {
            this.licensesState = new ArrayList();
        }
        return this.licensesState;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AccountState)) {
            return false;
        }
        AccountState otherObj = (AccountState) obj;

        return this.licensesState == otherObj.licensesState ? true : this.licensesState != null ? this.licensesState.equals(otherObj.licensesState) : false;
    }


    public int hashCode() {
        return this.licensesState != null ? this.licensesState.hashCode() : 0;
    }


    public String toString() {
        return "AccountState [licensesState=" + this.licensesState + "]";
    }
}


