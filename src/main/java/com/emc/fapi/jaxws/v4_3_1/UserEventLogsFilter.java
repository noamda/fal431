package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@JsonTypeName("UserEventLogsFilter")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserEventLogsFilter", propOrder = {"timeFrame", "topics", "textFilter"})
public class UserEventLogsFilter
        extends EventLogsFilter {
    @XmlElement(nillable = true)
    protected TimeFrame timeFrame;
    @XmlElement(required = true)
    protected List<EventLogTopic> topics;
    @XmlElement(nillable = true)
    protected TextFilter textFilter;

    public UserEventLogsFilter() {
    }

    public UserEventLogsFilter(TimeFrame timeFrame, List<EventLogTopic> topics, TextFilter textFilter) {
        this.timeFrame = timeFrame;
        this.topics = topics;
        this.textFilter = textFilter;
    }


    public TimeFrame getTimeFrame() {
        return this.timeFrame;
    }


    public void setTimeFrame(TimeFrame value) {
        this.timeFrame = value;
    }


    public List<EventLogTopic> getTopics() {
        if (this.topics == null) {
            this.topics = new ArrayList();
        }
        return this.topics;
    }


    public TextFilter getTextFilter() {
        return this.textFilter;
    }


    public void setTextFilter(TextFilter value) {
        this.textFilter = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof UserEventLogsFilter)) {
            return false;
        }
        UserEventLogsFilter otherObj = (UserEventLogsFilter) obj;

        return (super.equals(obj)) && (this.timeFrame != null ? this.timeFrame.equals(otherObj.timeFrame) : this.timeFrame == otherObj.timeFrame) && (this.topics != null ? this.topics.equals(otherObj.topics) : this.topics == otherObj.topics) && (this.textFilter != null ? this.textFilter.equals(otherObj.textFilter) : this.textFilter == otherObj.textFilter);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.timeFrame != null ? this.timeFrame.hashCode() : 0) ^ (this.topics != null ? this.topics.hashCode() : 0) ^ (this.textFilter != null ? this.textFilter.hashCode() : 0);
    }


    public String toString() {
        return "UserEventLogsFilter [super=" + super.toString() + ", " + "timeFrame=" + this.timeFrame + ", " + "topics=" + this.topics + ", " + "textFilter=" + this.textFilter + "]";
    }
}


