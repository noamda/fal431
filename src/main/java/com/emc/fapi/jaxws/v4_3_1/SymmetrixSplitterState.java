package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@JsonTypeName("SymmetrixSplitterState")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SymmetrixSplitterState", propOrder = {"srdfVolumes"})
public class SymmetrixSplitterState
        extends SplitterState {
    @XmlElement(nillable = true)
    protected List<DeviceUID> srdfVolumes;

    public SymmetrixSplitterState() {
    }

    public SymmetrixSplitterState(List<DeviceUID> srdfVolumes) {
        this.srdfVolumes = srdfVolumes;
    }


    public List<DeviceUID> getSrdfVolumes() {
        if (this.srdfVolumes == null) {
            this.srdfVolumes = new ArrayList();
        }
        return this.srdfVolumes;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SymmetrixSplitterState)) {
            return false;
        }
        SymmetrixSplitterState otherObj = (SymmetrixSplitterState) obj;

        return (super.equals(obj)) && (this.srdfVolumes != null ? this.srdfVolumes.equals(otherObj.srdfVolumes) : this.srdfVolumes == otherObj.srdfVolumes);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.srdfVolumes != null ? this.srdfVolumes.hashCode() : 0);
    }


    public String toString() {
        return "SymmetrixSplitterState [super=" + super.toString() + ", " + "srdfVolumes=" + this.srdfVolumes + "]";
    }
}


