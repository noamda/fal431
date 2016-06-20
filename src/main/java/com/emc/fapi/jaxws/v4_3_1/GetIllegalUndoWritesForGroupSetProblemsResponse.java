package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getIllegalUndoWritesForGroupSetProblemsResponse", propOrder = {"_return"})
public class GetIllegalUndoWritesForGroupSetProblemsResponse {
    @XmlElement(name = "return")
    protected ConsistencyGroupSetProblems _return;

    public GetIllegalUndoWritesForGroupSetProblemsResponse() {
    }

    public GetIllegalUndoWritesForGroupSetProblemsResponse(ConsistencyGroupSetProblems _return) {
        this._return = _return;
    }


    public ConsistencyGroupSetProblems getReturn() {
        return this._return;
    }


    public void setReturn(ConsistencyGroupSetProblems value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetIllegalUndoWritesForGroupSetProblemsResponse)) {
            return false;
        }
        GetIllegalUndoWritesForGroupSetProblemsResponse otherObj = (GetIllegalUndoWritesForGroupSetProblemsResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetIllegalUndoWritesForGroupSetProblemsResponse [_return=" + this._return + "]";
    }
}


