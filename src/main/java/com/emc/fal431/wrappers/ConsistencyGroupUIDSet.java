package com.emc.fal431.wrappers;

import com.emc.fal431.commons.ConsistencyGroupUID;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;


@XmlRootElement
@NoArgsConstructor
@Data
public class ConsistencyGroupUIDSet {
    private HashSet<ConsistencyGroupUID> innerSet;

    public ConsistencyGroupUIDSet(HashSet<ConsistencyGroupUID> consistencyGroupUIDSet) {
        this.innerSet = consistencyGroupUIDSet;
    }
}
