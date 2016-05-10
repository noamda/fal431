package com.emc.fal431.commons;

import lombok.AllArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@AllArgsConstructor
public enum RPAStatus {
    OK("OK"),
    DOWN("Down"),
    REMOVED_FOR_MAINTENANCE("RemovedForMaintenance"),
    UNKNOWN("Unknown");

    private String name;

    public String toString() {
        return name;
    }

}
