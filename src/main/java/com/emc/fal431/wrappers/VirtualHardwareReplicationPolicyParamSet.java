package com.emc.fal431.wrappers;

import com.emc.fal431.commons.VirtualHardwareReplicationPolicyParam;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;


@XmlRootElement
@NoArgsConstructor
@Data
public class VirtualHardwareReplicationPolicyParamSet {
    private HashSet<VirtualHardwareReplicationPolicyParam> innerSet;

    public VirtualHardwareReplicationPolicyParamSet(HashSet<VirtualHardwareReplicationPolicyParam> virtualHardwareReplicationPolicyParamSet) {
        this.innerSet = virtualHardwareReplicationPolicyParamSet;
    }

}
