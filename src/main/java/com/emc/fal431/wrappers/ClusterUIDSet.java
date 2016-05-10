package com.emc.fal431.wrappers;

import com.emc.fal431.commons.ClusterUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;


@XmlRootElement
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClusterUIDSet {
    private HashSet<ClusterUID> innerSet;
}
