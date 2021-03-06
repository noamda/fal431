package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getIllegalDisableGroupsForGroupSetProblemsResponse", propOrder = {"_return"})
public class GetIllegalDisableGroupsForGroupSetProblemsResponse {
    @XmlElement(name = "return")
    protected ConsistencyGroupSetProblems _return;

    public GetIllegalDisableGroupsForGroupSetProblemsResponse() {
    }

    public GetIllegalDisableGroupsForGroupSetProblemsResponse(ConsistencyGroupSetProblems _return) {
        this._return = _return;
    }


    public ConsistencyGroupSetProblems getReturn() {
        return this._return;
    }


    public void setReturn(ConsistencyGroupSetProblems value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetIllegalDisableGroupsForGroupSetProblemsResponse)) {
            return false;
        }
        GetIllegalDisableGroupsForGroupSetProblemsResponse otherObj = (GetIllegalDisableGroupsForGroupSetProblemsResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetIllegalDisableGroupsForGroupSetProblemsResponse [_return=" + this._return + "]";
    }
}


