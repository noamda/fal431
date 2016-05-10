package com.emc.fal431.wrappers;

import com.emc.fal431.commons.ConsistencyGroupVolumesState;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;


@XmlRootElement
@NoArgsConstructor
@Data
public class ConsistencyGroupVolumesStateSet {
    private Set<ConsistencyGroupVolumesState> innerSet;

    public ConsistencyGroupVolumesStateSet(Set<ConsistencyGroupVolumesState> consistencyGroupVolumesStateSet) {
        this.innerSet = consistencyGroupVolumesStateSet;
    }
}
