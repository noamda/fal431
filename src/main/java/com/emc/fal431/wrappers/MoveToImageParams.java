package com.emc.fal431.wrappers;

import com.emc.fal431.commons.ImageAccessScenario;
import com.emc.fal431.commons.SearchImageType;
import com.emc.fal431.commons.SpecificImageAccessType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;


@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class MoveToImageParams {

    private SpecificImageAccessType accessType;
    private SearchImageType imageType;
    private ImageAccessScenario scenario;


}
