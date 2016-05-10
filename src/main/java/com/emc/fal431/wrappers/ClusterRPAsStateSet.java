package com.emc.fal431.wrappers;

import com.emc.fal431.commons.ClusterRPAsState;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;


@XmlRootElement
@NoArgsConstructor
@Data
public class ClusterRPAsStateSet {
    private Set<ClusterRPAsState> innerSet;

    public ClusterRPAsStateSet(Set<ClusterRPAsState> clusterRPAsStateSet) {
        this.innerSet = clusterRPAsStateSet;
    }
}
