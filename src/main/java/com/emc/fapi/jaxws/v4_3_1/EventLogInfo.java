package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventLogInfo", propOrder = {"level", "moreDetails", "scope", "seSummary", "summary", "topic", "userAction"})
public class EventLogInfo {
    protected EventLogLevel level;
    protected String moreDetails;
    protected EventLogScope scope;
    protected String seSummary;
    protected String summary;
    protected EventLogTopic topic;
    protected String userAction;

    public EventLogInfo() {
    }

    public EventLogInfo(EventLogLevel level, String moreDetails, EventLogScope scope, String seSummary, String summary, EventLogTopic topic, String userAction) {
        this.level = level;
        this.moreDetails = moreDetails;
        this.scope = scope;
        this.seSummary = seSummary;
        this.summary = summary;
        this.topic = topic;
        this.userAction = userAction;
    }


    public EventLogLevel getLevel() {
        return this.level;
    }


    public void setLevel(EventLogLevel value) {
        this.level = value;
    }


    public String getMoreDetails() {
        return this.moreDetails;
    }


    public void setMoreDetails(String value) {
        this.moreDetails = value;
    }


    public EventLogScope getScope() {
        return this.scope;
    }


    public void setScope(EventLogScope value) {
        this.scope = value;
    }


    public String getSeSummary() {
        return this.seSummary;
    }


    public void setSeSummary(String value) {
        this.seSummary = value;
    }


    public String getSummary() {
        return this.summary;
    }


    public void setSummary(String value) {
        this.summary = value;
    }


    public EventLogTopic getTopic() {
        return this.topic;
    }


    public void setTopic(EventLogTopic value) {
        this.topic = value;
    }


    public String getUserAction() {
        return this.userAction;
    }


    public void setUserAction(String value) {
        this.userAction = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof EventLogInfo)) {
            return false;
        }
        EventLogInfo otherObj = (EventLogInfo) obj;

        return (this.level != null ? this.level.equals(otherObj.level) : this.level == otherObj.level) && (this.moreDetails != null ? this.moreDetails.equals(otherObj.moreDetails) : this.moreDetails == otherObj.moreDetails) && (this.scope != null ? this.scope.equals(otherObj.scope) : this.scope == otherObj.scope) && (this.seSummary != null ? this.seSummary.equals(otherObj.seSummary) : this.seSummary == otherObj.seSummary) && (this.summary != null ? this.summary.equals(otherObj.summary) : this.summary == otherObj.summary) && (this.topic != null ? this.topic.equals(otherObj.topic) : this.topic == otherObj.topic) && (this.userAction != null ? this.userAction.equals(otherObj.userAction) : this.userAction == otherObj.userAction);
    }


    public int hashCode() {
        return (this.level != null ? this.level.hashCode() : 0) ^ (this.moreDetails != null ? this.moreDetails.hashCode() : 0) ^ (this.scope != null ? this.scope.hashCode() : 0) ^ (this.seSummary != null ? this.seSummary.hashCode() : 0) ^ (this.summary != null ? this.summary.hashCode() : 0) ^ (this.topic != null ? this.topic.hashCode() : 0) ^ (this.userAction != null ? this.userAction.hashCode() : 0);
    }


    public String toString() {
        return "EventLogInfo [level=" + this.level + ", " + "moreDetails=" + this.moreDetails + ", " + "scope=" + this.scope + ", " + "seSummary=" + this.seSummary + ", " + "summary=" + this.summary + ", " + "topic=" + this.topic + ", " + "userAction=" + this.userAction + "]";
    }
}


