package com.emc.fal431.wrappers;

import com.emc.fal431.commons.ArrayConfigRequirement;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;


@XmlRootElement
@NoArgsConstructor
@Data
public class ArrayConfigRequirementSet {
    private Set<ArrayConfigRequirement> innerSet;

    public ArrayConfigRequirementSet(Set<ArrayConfigRequirement> arrayConfigRequirement) {
        this.innerSet = arrayConfigRequirement;
    }
}