package com.emc.fal431.wrappers;

import com.emc.fal431.commons.VMEntitiesInformation;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;


@XmlRootElement
@NoArgsConstructor
@Data
public class VmEntitiesInformationSet {
    private HashSet<VMEntitiesInformation> innerSet;

    public VmEntitiesInformationSet(HashSet<VMEntitiesInformation> vmEntitiesInformationSet) {
        this.innerSet = vmEntitiesInformationSet;
    }
}
