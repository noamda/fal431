package com.emc.fal431.wrappers;

import com.emc.fal431.commons.ConsistencyGroupCopyProtectionWindowsInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;


@XmlRootElement
@NoArgsConstructor
@Data
public class ConsistencyGroupCopyProtectionWindowsInfoSet {
    private Set<ConsistencyGroupCopyProtectionWindowsInfo> innerSet;

    public ConsistencyGroupCopyProtectionWindowsInfoSet(
        Set<ConsistencyGroupCopyProtectionWindowsInfo> cgCopyProtectionWindowsInfoSet) {
        this.innerSet = cgCopyProtectionWindowsInfoSet;
    }
}
