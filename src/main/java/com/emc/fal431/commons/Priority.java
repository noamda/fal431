package com.emc.fal431.commons;

import lombok.AllArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@AllArgsConstructor
public enum Priority {
    IDLE("Idle"),
    LOW("Low"),
    NORMAL("Normal"),
    HIGH("High"),
    CRITICAL("Critical"),
    UNKNOWN("Unknown");

    private String name;

    public String toString() {
        return name;
    }

}
