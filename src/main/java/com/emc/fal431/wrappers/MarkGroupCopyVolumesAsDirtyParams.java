package com.emc.fal431.wrappers;

import com.emc.fal431.commons.ReplicationSetUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;


@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class MarkGroupCopyVolumesAsDirtyParams {

    private HashSet<ReplicationSetUID> replicationSets;

}
