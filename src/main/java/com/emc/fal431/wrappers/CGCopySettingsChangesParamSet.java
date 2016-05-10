package com.emc.fal431.wrappers;

import com.emc.fal431.commons.ConsistencyGroupCopySettingsChangesParam;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;


@XmlRootElement
@NoArgsConstructor
@Data
public class CGCopySettingsChangesParamSet {
    private HashSet<ConsistencyGroupCopySettingsChangesParam> innerSet;

    public CGCopySettingsChangesParamSet(HashSet<ConsistencyGroupCopySettingsChangesParam> cgCopySettingsChangesSet) {
        this.innerSet = cgCopySettingsChangesSet;
    }
}
