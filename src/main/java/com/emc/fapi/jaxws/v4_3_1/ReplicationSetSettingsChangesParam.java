package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplicationSetSettingsChangesParam", propOrder = {"name", "replicationSetUID", "shouldAttachAsClean", "volumesChanges", "resizeReplicationSetParam"})
public class ReplicationSetSettingsChangesParam {
    @XmlElement(required = true)
    protected String name;
    @XmlElement(nillable = true)
    protected ReplicationSetUID replicationSetUID;
    protected boolean shouldAttachAsClean;
    @XmlElement(nillable = true)
    protected List<UserVolumeSettingsChangesParam> volumesChanges;
    @XmlElement(nillable = true)
    protected ResizeReplicationSetParam resizeReplicationSetParam;

    public ReplicationSetSettingsChangesParam() {
    }

    public ReplicationSetSettingsChangesParam(String name, ReplicationSetUID replicationSetUID, boolean shouldAttachAsClean, List<UserVolumeSettingsChangesParam> volumesChanges, ResizeReplicationSetParam resizeReplicationSetParam) {
        this.name = name;
        this.replicationSetUID = replicationSetUID;
        this.shouldAttachAsClean = shouldAttachAsClean;
        this.volumesChanges = volumesChanges;
        this.resizeReplicationSetParam = resizeReplicationSetParam;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public ReplicationSetUID getReplicationSetUID() {
        return this.replicationSetUID;
    }


    public void setReplicationSetUID(ReplicationSetUID value) {
        this.replicationSetUID = value;
    }


    public boolean isShouldAttachAsClean() {
        return this.shouldAttachAsClean;
    }


    public void setShouldAttachAsClean(boolean value) {
        this.shouldAttachAsClean = value;
    }


    public List<UserVolumeSettingsChangesParam> getVolumesChanges() {
        if (this.volumesChanges == null) {
            this.volumesChanges = new ArrayList();
        }
        return this.volumesChanges;
    }


    public ResizeReplicationSetParam getResizeReplicationSetParam() {
        return this.resizeReplicationSetParam;
    }


    public void setResizeReplicationSetParam(ResizeReplicationSetParam value) {
        this.resizeReplicationSetParam = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ReplicationSetSettingsChangesParam)) {
            return false;
        }
        ReplicationSetSettingsChangesParam otherObj = (ReplicationSetSettingsChangesParam) obj;

        return (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.replicationSetUID != null ? this.replicationSetUID.equals(otherObj.replicationSetUID) : this.replicationSetUID == otherObj.replicationSetUID) && (this.shouldAttachAsClean == otherObj.shouldAttachAsClean) && (this.volumesChanges != null ? this.volumesChanges.equals(otherObj.volumesChanges) : this.volumesChanges == otherObj.volumesChanges) && (this.resizeReplicationSetParam != null ? this.resizeReplicationSetParam.equals(otherObj.resizeReplicationSetParam) : this.resizeReplicationSetParam == otherObj.resizeReplicationSetParam);
    }


    public int hashCode() {
        return (this.name != null ? this.name.hashCode() : 0) ^ (this.replicationSetUID != null ? this.replicationSetUID.hashCode() : 0) ^ (this.shouldAttachAsClean ? 1 : 0) ^ (this.volumesChanges != null ? this.volumesChanges.hashCode() : 0) ^ (this.resizeReplicationSetParam != null ? this.resizeReplicationSetParam.hashCode() : 0);
    }


    public String toString() {
        return "ReplicationSetSettingsChangesParam [name=" + this.name + ", " + "replicationSetUID=" + this.replicationSetUID + ", " + "shouldAttachAsClean=" + this.shouldAttachAsClean + ", " + "volumesChanges=" + this.volumesChanges + ", " + "resizeReplicationSetParam=" + this.resizeReplicationSetParam + "]";
    }
}


