package com.emc.fal431.wrappers;

import com.emc.fal431.commons.ConsistencyGroupStatistics;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;


@XmlRootElement
@NoArgsConstructor
@Data
public class ConsistencyGroupStatisticsSet {
    private Set<ConsistencyGroupStatistics> innerSet;

    public ConsistencyGroupStatisticsSet(Set<ConsistencyGroupStatistics> consistencyGroupStatisticsSet) {
        this.innerSet = consistencyGroupStatisticsSet;
    }
}
