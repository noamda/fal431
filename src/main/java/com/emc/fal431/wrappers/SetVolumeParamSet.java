package com.emc.fal431.wrappers;

import com.emc.fal431.commons.SetVolumeParam;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;


@XmlRootElement
@NoArgsConstructor
@Data
public class SetVolumeParamSet {
    private HashSet<SetVolumeParam> innerSet;

    public SetVolumeParamSet(HashSet<SetVolumeParam> setVolumeParamSet) {
        this.innerSet = setVolumeParamSet;
    }
}
