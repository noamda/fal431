package com.emc.fal431.wrappers;

import com.emc.fal431.commons.ResourcePoolUID;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;


@XmlRootElement
@NoArgsConstructor
@Data
public class ResourcePoolUIDSet {
    private Set<ResourcePoolUID> innerSet;

    public ResourcePoolUIDSet(Set<ResourcePoolUID> resourcePoolUIDSet) {
        this.innerSet = resourcePoolUIDSet;
    }
}
