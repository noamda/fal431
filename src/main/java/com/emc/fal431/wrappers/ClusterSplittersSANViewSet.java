package com.emc.fal431.wrappers;

import com.emc.fal431.commons.ClusterSplittersSANView;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;


@XmlRootElement
@NoArgsConstructor
@Data
public class ClusterSplittersSANViewSet {
    private Set<ClusterSplittersSANView> innerSet;

    public ClusterSplittersSANViewSet(Set<ClusterSplittersSANView> clusterSplittersSANViewSet) {
        this.innerSet = clusterSplittersSANViewSet;
    }
}
