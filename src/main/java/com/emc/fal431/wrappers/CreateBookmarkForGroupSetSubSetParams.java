package com.emc.fal431.wrappers;

import com.emc.fal431.commons.BookmarkConsolidationPolicy;
import com.emc.fal431.commons.ConsistencyGroupSetSubset;
import com.emc.fal431.commons.SnapshotConsistencyType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;


@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class CreateBookmarkForGroupSetSubSetParams {
    private ConsistencyGroupSetSubset groupSetSubset;
    private String bookmarkName;
    private BookmarkConsolidationPolicy consolidationPolicy;
    private SnapshotConsistencyType consistencyType;
}
