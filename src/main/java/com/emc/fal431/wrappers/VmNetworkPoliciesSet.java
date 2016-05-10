package com.emc.fal431.wrappers;

import com.emc.fal431.commons.VmNetworkPolicy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;

@XmlRootElement
@NoArgsConstructor
@AllArgsConstructor
@Data
public class VmNetworkPoliciesSet {
    private HashSet<VmNetworkPolicy> innerSet;
}
