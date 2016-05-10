package com.emc.fal431.wrappers;

import com.emc.fal431.commons.ReplicationSetSettings;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;


@XmlRootElement
@NoArgsConstructor
@Data
public class ReplicationSetSettingsSet {
    private Set<ReplicationSetSettings> innerSet;

    public ReplicationSetSettingsSet(Set<ReplicationSetSettings> replicationSetSettingsSet) {
        this.innerSet = replicationSetSettingsSet;
    }
}
