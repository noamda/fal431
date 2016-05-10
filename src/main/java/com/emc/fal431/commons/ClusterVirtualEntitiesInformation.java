package com.emc.fal431.commons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import java.util.HashSet;

@XmlRootElement
@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterVirtualEntitiesInformation")
public class ClusterVirtualEntitiesInformation {

    @XmlElement(nillable = true)
    private ClusterUID clusterUID;
    private HashSet<VirtualCenterEntitiesInformation> virtualCentersEntitiesInformation;
}
