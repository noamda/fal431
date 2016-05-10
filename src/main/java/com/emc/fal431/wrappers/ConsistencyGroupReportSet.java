package com.emc.fal431.wrappers;

import com.emc.fal431.commons.ConsistencyGroupReport;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;


@XmlRootElement
@NoArgsConstructor
@Data
public class ConsistencyGroupReportSet {
    private HashSet<ConsistencyGroupReport> innerSet;

    public ConsistencyGroupReportSet(HashSet<ConsistencyGroupReport> consistencyGroupReportSet) {
        this.innerSet = consistencyGroupReportSet;
    }
}
