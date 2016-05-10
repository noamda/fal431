package com.emc.fal431.wrappers;

import com.emc.fal431.commons.VolumePath;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;


@XmlRootElement
@NoArgsConstructor
@Data
public class VolumePathSet {
    private Set<VolumePath> innerSet;

    public VolumePathSet(Set<VolumePath> volumePathSet) {
        this.innerSet = volumePathSet;
    }
}
