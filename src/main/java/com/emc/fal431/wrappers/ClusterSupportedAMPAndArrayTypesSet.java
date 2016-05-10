package com.emc.fal431.wrappers;

import com.emc.fal431.commons.ClusterSupportedArrayManagementProviderAndArrayTypes;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;


@XmlRootElement
@NoArgsConstructor
@Data
public class ClusterSupportedAMPAndArrayTypesSet {
    private Set<ClusterSupportedArrayManagementProviderAndArrayTypes> innerSet;

    public ClusterSupportedAMPAndArrayTypesSet(
        Set<ClusterSupportedArrayManagementProviderAndArrayTypes> clusterSupportedAMPAndArrayTypesSet) {
        this.innerSet = clusterSupportedAMPAndArrayTypesSet;
    }
}
