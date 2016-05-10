package com.emc.fal431.wrappers;

import com.emc.fal431.commons.VirtualDisksReplicationPolicyParam;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;


@XmlRootElement
@NoArgsConstructor
@Data
public class VirtualDisksReplicationPolicyParamSet {
    private HashSet<VirtualDisksReplicationPolicyParam> innerSet;

    public VirtualDisksReplicationPolicyParamSet(HashSet<VirtualDisksReplicationPolicyParam> virtualDisksReplicationPolicyParamSet) {
        this.innerSet = virtualDisksReplicationPolicyParamSet;
    }

}
