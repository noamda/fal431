package com.emc.fal431.commons;

import lombok.AllArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@AllArgsConstructor
public enum JournalCompressionLevel {
    NONE("None"),
    MEDIUM("Medium"),
    HIGH("High"),
    UNKNOWN("Unknown");

    private String name;

    public String toString() {
        return name;
    }

}
