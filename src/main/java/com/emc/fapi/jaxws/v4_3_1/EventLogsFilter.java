package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "JsonSubType")
@JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value = SystemEventLogsFilter.class, name = "SystemEventLogsFilter"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = UserEventLogsFilter.class, name = "UserEventLogsFilter")})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventLogsFilter", propOrder = {"level", "scope", "eventsIDs"})
@XmlSeeAlso({UserEventLogsFilter.class, SystemEventLogsFilter.class})
public abstract class EventLogsFilter {
    @XmlElement(required = true)
    protected EventLogLevel level;
    @XmlElement(required = true)
    protected EventLogScope scope;
    @XmlElement(nillable = true)
    protected List<Integer> eventsIDs;

    public EventLogsFilter() {
    }

    public EventLogsFilter(EventLogLevel level, EventLogScope scope, List<Integer> eventsIDs) {
        this.level = level;
        this.scope = scope;
        this.eventsIDs = eventsIDs;
    }


    public EventLogLevel getLevel() {
        return this.level;
    }


    public void setLevel(EventLogLevel value) {
        this.level = value;
    }


    public EventLogScope getScope() {
        return this.scope;
    }


    public void setScope(EventLogScope value) {
        this.scope = value;
    }


    public List<Integer> getEventsIDs() {
        if (this.eventsIDs == null) {
            this.eventsIDs = new ArrayList();
        }
        return this.eventsIDs;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof EventLogsFilter)) {
            return false;
        }
        EventLogsFilter otherObj = (EventLogsFilter) obj;

        return (this.level != null ? this.level.equals(otherObj.level) : this.level == otherObj.level) && (this.scope != null ? this.scope.equals(otherObj.scope) : this.scope == otherObj.scope) && (this.eventsIDs != null ? this.eventsIDs.equals(otherObj.eventsIDs) : this.eventsIDs == otherObj.eventsIDs);
    }


    public int hashCode() {
        return (this.level != null ? this.level.hashCode() : 0) ^ (this.scope != null ? this.scope.hashCode() : 0) ^ (this.eventsIDs != null ? this.eventsIDs.hashCode() : 0);
    }


    public String toString() {
        return "EventLogsFilter [level=" + this.level + ", " + "scope=" + this.scope + ", " + "eventsIDs=" + this.eventsIDs + "]";
    }
}


