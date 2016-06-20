package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TroubleshootResult", propOrder = {"title", "message", "issueType", "entity", "severity", "fixable", "fixAcknowledgeMessage"})
public class TroubleshootResult {
    protected String title;
    protected String message;
    @XmlElement(nillable = true)
    protected IssueType issueType;
    protected EntityInfo entity;
    protected TroubleshootResultSeverity severity;
    protected boolean fixable;
    protected String fixAcknowledgeMessage;

    public TroubleshootResult() {
    }

    public TroubleshootResult(String title, String message, IssueType issueType, EntityInfo entity, TroubleshootResultSeverity severity, boolean fixable, String fixAcknowledgeMessage) {
        this.title = title;
        this.message = message;
        this.issueType = issueType;
        this.entity = entity;
        this.severity = severity;
        this.fixable = fixable;
        this.fixAcknowledgeMessage = fixAcknowledgeMessage;
    }


    public String getTitle() {
        return this.title;
    }


    public void setTitle(String value) {
        this.title = value;
    }


    public String getMessage() {
        return this.message;
    }


    public void setMessage(String value) {
        this.message = value;
    }


    public IssueType getIssueType() {
        return this.issueType;
    }


    public void setIssueType(IssueType value) {
        this.issueType = value;
    }


    public EntityInfo getEntity() {
        return this.entity;
    }


    public void setEntity(EntityInfo value) {
        this.entity = value;
    }


    public TroubleshootResultSeverity getSeverity() {
        return this.severity;
    }


    public void setSeverity(TroubleshootResultSeverity value) {
        this.severity = value;
    }


    public boolean isFixable() {
        return this.fixable;
    }


    public void setFixable(boolean value) {
        this.fixable = value;
    }


    public String getFixAcknowledgeMessage() {
        return this.fixAcknowledgeMessage;
    }


    public void setFixAcknowledgeMessage(String value) {
        this.fixAcknowledgeMessage = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof TroubleshootResult)) {
            return false;
        }
        TroubleshootResult otherObj = (TroubleshootResult) obj;

        return (this.title != null ? this.title.equals(otherObj.title) : this.title == otherObj.title) && (this.message != null ? this.message.equals(otherObj.message) : this.message == otherObj.message) && (this.issueType != null ? this.issueType.equals(otherObj.issueType) : this.issueType == otherObj.issueType) && (this.entity != null ? this.entity.equals(otherObj.entity) : this.entity == otherObj.entity) && (this.severity != null ? this.severity.equals(otherObj.severity) : this.severity == otherObj.severity) && (this.fixable == otherObj.fixable) && (this.fixAcknowledgeMessage != null ? this.fixAcknowledgeMessage.equals(otherObj.fixAcknowledgeMessage) : this.fixAcknowledgeMessage == otherObj.fixAcknowledgeMessage);
    }


    public int hashCode() {
        return (this.title != null ? this.title.hashCode() : 0) ^ (this.message != null ? this.message.hashCode() : 0) ^ (this.issueType != null ? this.issueType.hashCode() : 0) ^ (this.entity != null ? this.entity.hashCode() : 0) ^ (this.severity != null ? this.severity.hashCode() : 0) ^ (this.fixable ? 1 : 0) ^ (this.fixAcknowledgeMessage != null ? this.fixAcknowledgeMessage.hashCode() : 0);
    }


    public String toString() {
        return "TroubleshootResult [title=" + this.title + ", " + "message=" + this.message + ", " + "issueType=" + this.issueType + ", " + "entity=" + this.entity + ", " + "severity=" + this.severity + ", " + "fixable=" + this.fixable + ", " + "fixAcknowledgeMessage=" + this.fixAcknowledgeMessage + "]";
    }
}


