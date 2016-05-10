package com.emc.fal431.wrappers;

import com.emc.fal431.commons.SnapshotConsistencyType;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@NoArgsConstructor
@Data
public class RestSnapshotConsistencyType {
    private SnapshotConsistencyType restEnum;

    public RestSnapshotConsistencyType(SnapshotConsistencyType restEnum) {
        this.restEnum = restEnum;
    }
}
