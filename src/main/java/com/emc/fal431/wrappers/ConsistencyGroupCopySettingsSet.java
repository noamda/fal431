package com.emc.fal431.wrappers;

import com.emc.fal431.commons.ConsistencyGroupCopySettings;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;


@XmlRootElement
@NoArgsConstructor
@Data
public class ConsistencyGroupCopySettingsSet {
    private Set<ConsistencyGroupCopySettings> innerSet;

    public ConsistencyGroupCopySettingsSet(Set<ConsistencyGroupCopySettings> consistencyGroupCopySettingsSet) {
        this.innerSet = consistencyGroupCopySettingsSet;
    }
}
