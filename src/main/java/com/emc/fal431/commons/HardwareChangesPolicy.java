package com.emc.fal431.commons;

import lombok.AllArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

@AllArgsConstructor
@XmlRootElement
public enum HardwareChangesPolicy {

    DONT_REPLICATE_HW_CHANGES("DoNotReplicateHwChanges"),
    REPLICATE_HW_CHANGES("ReplicateHwChanges"),
    UNKNOWN("Unknown");

    private String value;

}
