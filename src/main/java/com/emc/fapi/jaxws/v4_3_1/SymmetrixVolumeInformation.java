package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("SymmetrixVolumeInformation")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SymmetrixVolumeInformation", propOrder = {"tagged"})
public class SymmetrixVolumeInformation
        extends VolumeInformation {
    protected boolean tagged;

    public SymmetrixVolumeInformation() {
    }

    public SymmetrixVolumeInformation(boolean tagged) {
        this.tagged = tagged;
    }


    public boolean isTagged() {
        return this.tagged;
    }


    public void setTagged(boolean value) {
        this.tagged = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SymmetrixVolumeInformation)) {
            return false;
        }
        SymmetrixVolumeInformation otherObj = (SymmetrixVolumeInformation) obj;

        return (super.equals(obj)) && (this.tagged == otherObj.tagged);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.tagged ? 1 : 0);
    }


    public String toString() {
        return "SymmetrixVolumeInformation [super=" + super.toString() + ", " + "tagged=" + this.tagged + "]";
    }
}


