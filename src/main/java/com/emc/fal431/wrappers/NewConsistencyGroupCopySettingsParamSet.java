package com.emc.fal431.wrappers;

import com.emc.fal431.commons.NewConsistencyGroupCopySettingsParam;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;


@XmlRootElement
@NoArgsConstructor
@Data
public class NewConsistencyGroupCopySettingsParamSet {
    private HashSet<NewConsistencyGroupCopySettingsParam> innerSet;

    public NewConsistencyGroupCopySettingsParamSet(HashSet<NewConsistencyGroupCopySettingsParam> newCGCopySettingsParamSet) {
        this.innerSet = newCGCopySettingsParamSet;
    }
}
