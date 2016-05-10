package com.emc.fal431.wrappers;

import com.emc.fal431.commons.ClusterMaintenanceMode;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@NoArgsConstructor
@Data
public class RestClusterMaintenanceMode {
    private ClusterMaintenanceMode restEnum;

    public RestClusterMaintenanceMode(ClusterMaintenanceMode restEnum) {
        this.restEnum = restEnum;
    }
}
