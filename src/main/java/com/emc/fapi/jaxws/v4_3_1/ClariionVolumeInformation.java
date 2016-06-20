package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@JsonTypeName("ClariionVolumeInformation")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClariionVolumeInformation", propOrder = {"groupSets"})
public class ClariionVolumeInformation
        extends VolumeInformation {
    @XmlElement(nillable = true)
    protected List<String> groupSets;

    public ClariionVolumeInformation() {
    }

    public ClariionVolumeInformation(List<String> groupSets) {
        this.groupSets = groupSets;
    }


    public List<String> getGroupSets() {
        if (this.groupSets == null) {
            this.groupSets = new ArrayList();
        }
        return this.groupSets;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClariionVolumeInformation)) {
            return false;
        }
        ClariionVolumeInformation otherObj = (ClariionVolumeInformation) obj;

        return (super.equals(obj)) && (this.groupSets != null ? this.groupSets.equals(otherObj.groupSets) : this.groupSets == otherObj.groupSets);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.groupSets != null ? this.groupSets.hashCode() : 0);
    }


    public String toString() {
        return "ClariionVolumeInformation [super=" + super.toString() + ", " + "groupSets=" + this.groupSets + "]";
    }
}


