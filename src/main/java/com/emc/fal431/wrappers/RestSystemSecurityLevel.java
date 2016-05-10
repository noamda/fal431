package com.emc.fal431.wrappers;

import com.emc.fal431.commons.SystemSecurityLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@NoArgsConstructor
@Data
public class RestSystemSecurityLevel {
    private SystemSecurityLevel restEnum;

    public RestSystemSecurityLevel(SystemSecurityLevel restEnum) {
        this.restEnum = restEnum;
    }
}
