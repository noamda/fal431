package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@JsonTypeName("SystemEventLogsFilter")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemEventLogsFilter", propOrder = {"filterUID", "name", "topic", "groupsToInclude"})
public class SystemEventLogsFilter
        extends EventLogsFilter {
    protected SystemEventLogsFilterUID filterUID;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected EventLogTopic topic;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupUID> groupsToInclude;

    public SystemEventLogsFilter() {
    }

    public SystemEventLogsFilter(SystemEventLogsFilterUID filterUID, String name, EventLogTopic topic, List<ConsistencyGroupUID> groupsToInclude) {
        this.filterUID = filterUID;
        this.name = name;
        this.topic = topic;
        this.groupsToInclude = groupsToInclude;
    }


    public SystemEventLogsFilterUID getFilterUID() {
        return this.filterUID;
    }


    public void setFilterUID(SystemEventLogsFilterUID value) {
        this.filterUID = value;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public EventLogTopic getTopic() {
        return this.topic;
    }


    public void setTopic(EventLogTopic value) {
        this.topic = value;
    }


    public List<ConsistencyGroupUID> getGroupsToInclude() {
        if (this.groupsToInclude == null) {
            this.groupsToInclude = new ArrayList();
        }
        return this.groupsToInclude;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SystemEventLogsFilter)) {
            return false;
        }
        SystemEventLogsFilter otherObj = (SystemEventLogsFilter) obj;

        return (super.equals(obj)) && (this.filterUID != null ? this.filterUID.equals(otherObj.filterUID) : this.filterUID == otherObj.filterUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.topic != null ? this.topic.equals(otherObj.topic) : this.topic == otherObj.topic) && (this.groupsToInclude != null ? this.groupsToInclude.equals(otherObj.groupsToInclude) : this.groupsToInclude == otherObj.groupsToInclude);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.filterUID != null ? this.filterUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.topic != null ? this.topic.hashCode() : 0) ^ (this.groupsToInclude != null ? this.groupsToInclude.hashCode() : 0);
    }


    public String toString() {
        return "SystemEventLogsFilter [super=" + super.toString() + ", " + "filterUID=" + this.filterUID + ", " + "name=" + this.name + ", " + "topic=" + this.topic + ", " + "groupsToInclude=" + this.groupsToInclude + "]";
    }
}


