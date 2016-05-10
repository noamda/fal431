package com.emc.fal431.wrappers;

import com.emc.fal431.commons.ImageAccessGeneralParameters;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@NoArgsConstructor
@Data
public class RestImageAccessGeneralParameters {
    private ImageAccessGeneralParameters restClass;

    public RestImageAccessGeneralParameters(ImageAccessGeneralParameters restClass) {
        this.restClass = restClass;
    }
}
