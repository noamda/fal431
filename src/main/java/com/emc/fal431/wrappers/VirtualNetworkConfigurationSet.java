package com.emc.fal431.wrappers;

import com.emc.fal431.commons.VirtualNetworkConfiguration;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;


@XmlRootElement
@NoArgsConstructor
@Data
public class VirtualNetworkConfigurationSet {
    private Set<VirtualNetworkConfiguration> innerSet;

    public VirtualNetworkConfigurationSet(Set<VirtualNetworkConfiguration> virtualNetworkConfigurationSet) {
        this.innerSet = virtualNetworkConfigurationSet;
    }
}