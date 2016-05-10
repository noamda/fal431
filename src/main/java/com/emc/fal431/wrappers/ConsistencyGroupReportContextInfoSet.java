package com.emc.fal431.wrappers;

import com.emc.fal431.commons.ConsistencyGroupReportContextInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;


@XmlRootElement
@NoArgsConstructor
@Data
public class ConsistencyGroupReportContextInfoSet {
    private HashSet<ConsistencyGroupReportContextInfo> innerSet;

    public ConsistencyGroupReportContextInfoSet(HashSet<ConsistencyGroupReportContextInfo> consistencyGroupReportContextInfoSet) {
        this.innerSet = consistencyGroupReportContextInfoSet;
    }
}
