package com.emc.fal431.wrappers;

import com.emc.fal431.commons.SplitterUID;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;


@XmlRootElement
@NoArgsConstructor
@Data
public class SplitterUIDSet {
    private HashSet<SplitterUID> innerSet;

    public SplitterUIDSet(HashSet<SplitterUID> splitterUIDSet) {
        this.innerSet = splitterUIDSet;
    }
}
