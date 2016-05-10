package com.emc.fal431.wrappers;

import com.emc.fal431.commons.ConsistencyGroupSetSubset;
import com.emc.fal431.commons.ImageAccessParameters;
import com.emc.fal431.commons.ImageAccessScenario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;


@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class EnableImageAccessForGroupSetsSubsetParams {
    private ConsistencyGroupSetSubset groupSetSubset;
    private ImageAccessParameters params;
    private ImageAccessScenario scenario;
}
