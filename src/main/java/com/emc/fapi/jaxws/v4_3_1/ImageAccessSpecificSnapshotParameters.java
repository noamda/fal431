package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("ImageAccessSpecificSnapshotParameters")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageAccessSpecificSnapshotParameters", propOrder = {"snapshot", "mode"})
public class ImageAccessSpecificSnapshotParameters
        extends ImageAccessGeneralParameters {
    @XmlElement(required = true, nillable = true)
    protected Snapshot snapshot;
    @XmlElement(required = true)
    protected ImageAccessMode mode;

    public ImageAccessSpecificSnapshotParameters() {
    }

    public ImageAccessSpecificSnapshotParameters(Snapshot snapshot, ImageAccessMode mode) {
        this.snapshot = snapshot;
        this.mode = mode;
    }


    public Snapshot getSnapshot() {
        return this.snapshot;
    }


    public void setSnapshot(Snapshot value) {
        this.snapshot = value;
    }


    public ImageAccessMode getMode() {
        return this.mode;
    }


    public void setMode(ImageAccessMode value) {
        this.mode = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ImageAccessSpecificSnapshotParameters)) {
            return false;
        }
        ImageAccessSpecificSnapshotParameters otherObj = (ImageAccessSpecificSnapshotParameters) obj;

        return (super.equals(obj)) && (this.snapshot != null ? this.snapshot.equals(otherObj.snapshot) : this.snapshot == otherObj.snapshot) && (this.mode != null ? this.mode.equals(otherObj.mode) : this.mode == otherObj.mode);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.snapshot != null ? this.snapshot.hashCode() : 0) ^ (this.mode != null ? this.mode.hashCode() : 0);
    }


    public String toString() {
        return "ImageAccessSpecificSnapshotParameters [super=" + super.toString() + ", " + "snapshot=" + this.snapshot + ", " + "mode=" + this.mode + "]";
    }
}


