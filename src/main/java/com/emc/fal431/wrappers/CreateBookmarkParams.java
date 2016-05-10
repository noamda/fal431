package com.emc.fal431.wrappers;

import com.emc.fal431.commons.BookmarkConsolidationPolicy;
import com.emc.fal431.commons.ConsistencyGroupUID;
import com.emc.fal431.commons.SnapshotConsistencyType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;


@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class CreateBookmarkParams {
    private HashSet<ConsistencyGroupUID> groups = new HashSet<>();
    private String bookmarkName;
    private BookmarkConsolidationPolicy consolidationPolicy;
    private SnapshotConsistencyType consistencyType;

}
