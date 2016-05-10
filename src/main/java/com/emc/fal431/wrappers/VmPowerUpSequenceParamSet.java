package com.emc.fal431.wrappers;

import com.emc.fal431.commons.VmPowerUpSequenceParam;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;
import java.util.Set;


@XmlRootElement
@NoArgsConstructor
@Data
public class VmPowerUpSequenceParamSet {
    private Set<VmPowerUpSequenceParam> innerSet = new HashSet<>();

    public VmPowerUpSequenceParamSet(Set<VmPowerUpSequenceParam> vmPowerUpSequenceParamSet) {
        this.innerSet = vmPowerUpSequenceParamSet;
    }
}
