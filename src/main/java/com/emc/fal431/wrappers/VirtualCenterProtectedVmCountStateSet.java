package com.emc.fal431.wrappers;

import com.emc.fal431.commons.VirtualCenterProtectedVmCountState;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;


@XmlRootElement
@NoArgsConstructor
@Data
public class VirtualCenterProtectedVmCountStateSet {
    private HashSet<VirtualCenterProtectedVmCountState> innerSet;

    public VirtualCenterProtectedVmCountStateSet(HashSet<VirtualCenterProtectedVmCountState> virtualCenterProtectedVmCountStateSet) {
        this.innerSet = virtualCenterProtectedVmCountStateSet;
    }
}
