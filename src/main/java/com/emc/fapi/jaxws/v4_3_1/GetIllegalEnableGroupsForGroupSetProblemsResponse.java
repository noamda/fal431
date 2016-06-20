package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getIllegalEnableGroupsForGroupSetProblemsResponse", propOrder = {"_return"})
public class GetIllegalEnableGroupsForGroupSetProblemsResponse {
    @XmlElement(name = "return")
    protected ConsistencyGroupSetProblems _return;

    public GetIllegalEnableGroupsForGroupSetProblemsResponse() {
    }

    public GetIllegalEnableGroupsForGroupSetProblemsResponse(ConsistencyGroupSetProblems _return) {
        this._return = _return;
    }


    public ConsistencyGroupSetProblems getReturn() {
        return this._return;
    }


    public void setReturn(ConsistencyGroupSetProblems value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetIllegalEnableGroupsForGroupSetProblemsResponse)) {
            return false;
        }
        GetIllegalEnableGroupsForGroupSetProblemsResponse otherObj = (GetIllegalEnableGroupsForGroupSetProblemsResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetIllegalEnableGroupsForGroupSetProblemsResponse [_return=" + this._return + "]";
    }
}


