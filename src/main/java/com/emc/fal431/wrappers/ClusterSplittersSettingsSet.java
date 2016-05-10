package com.emc.fal431.wrappers;

import com.emc.fal431.commons.ClusterSplittersSettings;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;


@XmlRootElement
@NoArgsConstructor
@Data
public class ClusterSplittersSettingsSet {
    private Set<ClusterSplittersSettings> innerSet;

    public ClusterSplittersSettingsSet(Set<ClusterSplittersSettings> clusterSplittersSettingsSet) {
        this.innerSet = clusterSplittersSettingsSet;
    }
}
