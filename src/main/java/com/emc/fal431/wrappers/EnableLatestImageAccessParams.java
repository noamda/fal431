package com.emc.fal431.wrappers;

import com.emc.fal431.commons.ImageAccessMode;
import com.emc.fal431.commons.ImageAccessScenario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;


@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class EnableLatestImageAccessParams {
    private ImageAccessMode mode;
    private ImageAccessScenario scenario;
}
