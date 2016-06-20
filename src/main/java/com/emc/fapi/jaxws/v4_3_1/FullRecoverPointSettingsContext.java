package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("FullRecoverPointSettingsContext")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FullRecoverPointSettingsContext", propOrder = {"settingsConflictContext"})
public class FullRecoverPointSettingsContext
        extends FunctionalAPIContext {
    protected long settingsConflictContext;

    public FullRecoverPointSettingsContext() {
    }

    public FullRecoverPointSettingsContext(long settingsConflictContext) {
        this.settingsConflictContext = settingsConflictContext;
    }


    public long getSettingsConflictContext() {
        return this.settingsConflictContext;
    }


    public void setSettingsConflictContext(long value) {
        this.settingsConflictContext = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof FullRecoverPointSettingsContext)) {
            return false;
        }
        FullRecoverPointSettingsContext otherObj = (FullRecoverPointSettingsContext) obj;

        return (super.equals(obj)) && (this.settingsConflictContext == otherObj.settingsConflictContext);
    }


    public int hashCode() {
        return super.hashCode() ^ (int) this.settingsConflictContext;
    }


    public String toString() {
        return "FullRecoverPointSettingsContext [super=" + super.toString() + ", " + "settingsConflictContext=" + this.settingsConflictContext + "]";
    }
}


