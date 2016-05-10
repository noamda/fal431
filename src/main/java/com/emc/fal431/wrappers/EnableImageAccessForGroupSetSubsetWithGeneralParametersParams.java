package com.emc.fal431.wrappers;

import com.emc.fal431.commons.ConsistencyGroupSetSubset;
import com.emc.fal431.commons.ImageAccessGeneralParameters;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;


@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class EnableImageAccessForGroupSetSubsetWithGeneralParametersParams {
    private ConsistencyGroupSetSubset groupSetSubset;
    private ImageAccessGeneralParameters generalParams;
}
