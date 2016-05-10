package com.emc.fal431.wrappers;

import com.emc.fal431.commons.CalculateVolumeSizeParams;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;


@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class CalculateVolumeSizeRestParams {
    private boolean isDistributedConsistencyGroup;
    private CalculateVolumeSizeParams volumeSizeParams;
}
