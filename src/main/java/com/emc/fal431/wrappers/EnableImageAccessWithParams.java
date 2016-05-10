package com.emc.fal431.wrappers;

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
public class EnableImageAccessWithParams {

    private ImageAccessParameters params;
    private ImageAccessScenario scenario;

}
