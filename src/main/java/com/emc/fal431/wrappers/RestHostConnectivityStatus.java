package com.emc.fal431.wrappers;

import com.emc.fal431.commons.HostConnectivityStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@NoArgsConstructor
@Data
public class RestHostConnectivityStatus {
    private HostConnectivityStatus restEnum;

    public RestHostConnectivityStatus(HostConnectivityStatus restEnum) {
        this.restEnum = restEnum;
    }
}
