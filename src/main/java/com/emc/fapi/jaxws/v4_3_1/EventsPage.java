package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventsPage", propOrder = {"content", "pageNumber", "pageSize"})
public class EventsPage {
    @XmlElement(nillable = true)
    protected List<EventLog> content;
    protected int pageNumber;
    protected int pageSize;

    public EventsPage() {
    }

    public EventsPage(List<EventLog> content, int pageNumber, int pageSize) {
        this.content = content;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
    }


    public List<EventLog> getContent() {
        if (this.content == null) {
            this.content = new ArrayList();
        }
        return this.content;
    }


    public int getPageNumber() {
        return this.pageNumber;
    }


    public void setPageNumber(int value) {
        this.pageNumber = value;
    }


    public int getPageSize() {
        return this.pageSize;
    }


    public void setPageSize(int value) {
        this.pageSize = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof EventsPage)) {
            return false;
        }
        EventsPage otherObj = (EventsPage) obj;

        return (this.content != null ? this.content.equals(otherObj.content) : this.content == otherObj.content) && (this.pageNumber == otherObj.pageNumber) && (this.pageSize == otherObj.pageSize);
    }


    public int hashCode() {
        return (this.content != null ? this.content.hashCode() : 0) ^ this.pageNumber ^ this.pageSize;
    }


    public String toString() {
        return "EventsPage [content=" + this.content + ", " + "pageNumber=" + this.pageNumber + ", " + "pageSize=" + this.pageSize + "]";
    }
}


