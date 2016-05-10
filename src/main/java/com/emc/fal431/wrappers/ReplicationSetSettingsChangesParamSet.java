package com.emc.fal431.wrappers;

import com.emc.fal431.commons.ReplicationSetSettingsChangesParam;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;


@XmlRootElement
@NoArgsConstructor
@Data
public class ReplicationSetSettingsChangesParamSet {
    private HashSet<ReplicationSetSettingsChangesParam> innerSet;

    public ReplicationSetSettingsChangesParamSet(
        HashSet<ReplicationSetSettingsChangesParam> replicationSetSettingsChangesParamSet) {
        this.innerSet = replicationSetSettingsChangesParamSet;
    }
}
