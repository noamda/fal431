package com.emc.fal431.wrappers;

import com.emc.fal431.commons.ClusterVirtualInfrastructuresState;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;


@XmlRootElement
@NoArgsConstructor
@Data
public class ClusterVirtualInfrastructuresStateSet {
    private Set<ClusterVirtualInfrastructuresState> innerSet;

    public ClusterVirtualInfrastructuresStateSet(
        Set<ClusterVirtualInfrastructuresState> clusterVirtualInfrastructuresStateSet) {
        this.innerSet = clusterVirtualInfrastructuresStateSet;
    }
}
