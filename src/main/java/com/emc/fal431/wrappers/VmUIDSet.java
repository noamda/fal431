package com.emc.fal431.wrappers;

import com.emc.fal431.commons.VmUID;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Collection;
import java.util.HashSet;


@XmlRootElement
@NoArgsConstructor
@Data
public class VmUIDSet {
    private HashSet<VmUID> innerSet;

    public VmUIDSet(HashSet<VmUID> vmUIDSet) {
        this.innerSet = vmUIDSet;
    }

    public VmUIDSet(Collection<VmUID> innerSet) {
        this.innerSet=new HashSet<>(innerSet);
    }
}
