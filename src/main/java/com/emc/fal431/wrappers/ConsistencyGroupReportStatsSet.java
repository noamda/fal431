package com.emc.fal431.wrappers;

import com.emc.fal431.commons.ConsistencyGroupReportStats;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;


@XmlRootElement
@NoArgsConstructor
@Data
public class ConsistencyGroupReportStatsSet {
    private HashSet<ConsistencyGroupReportStats> innerSet;

    public ConsistencyGroupReportStatsSet(HashSet<ConsistencyGroupReportStats> consistencyGroupReportStatsSet) {
        this.innerSet = consistencyGroupReportStatsSet;
    }
}
