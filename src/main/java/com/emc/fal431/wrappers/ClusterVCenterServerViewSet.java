package com.emc.fal431.wrappers;

import com.emc.fal431.commons.ClusterVCenterServerView;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;


@XmlRootElement
@NoArgsConstructor
@Data
public class ClusterVCenterServerViewSet {
    private Set<ClusterVCenterServerView> innerSet;

    public ClusterVCenterServerViewSet(Set<ClusterVCenterServerView> clusterVCenterServerViewSet) {
        this.innerSet = clusterVCenterServerViewSet;
    }
}
