package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupCopyVolumeCreationParams", propOrder = {"volumeParams"})
public class ConsistencyGroupCopyVolumeCreationParams {
    @XmlElement(nillable = true)
    protected List<BaseVolumeParams> volumeParams;

    public ConsistencyGroupCopyVolumeCreationParams() {
    }

    public ConsistencyGroupCopyVolumeCreationParams(List<BaseVolumeParams> volumeParams) {
        this.volumeParams = volumeParams;
    }


    public List<BaseVolumeParams> getVolumeParams() {
        if (this.volumeParams == null) {
            this.volumeParams = new ArrayList();
        }
        return this.volumeParams;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupCopyVolumeCreationParams)) {
            return false;
        }
        ConsistencyGroupCopyVolumeCreationParams otherObj = (ConsistencyGroupCopyVolumeCreationParams) obj;

        return this.volumeParams == otherObj.volumeParams ? true : this.volumeParams != null ? this.volumeParams.equals(otherObj.volumeParams) : false;
    }


    public int hashCode() {
        return this.volumeParams != null ? this.volumeParams.hashCode() : 0;
    }


    public String toString() {
        return "ConsistencyGroupCopyVolumeCreationParams [volumeParams=" + this.volumeParams + "]";
    }
}


