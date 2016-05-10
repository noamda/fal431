package com.emc.fal431.commons;

import lombok.AllArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@AllArgsConstructor
public enum SplitterStatus {
    OK("OK"),
    DOWN("Down"),
    UNSUPPORTED_VERSION("UnsupportedVersion"),
    UNCONTROLLABLE("Uncontrollable"),
    WARNING("Warning"),
    UNKNOWN("Unknown");

    private String name;

    public String toString() {
        return name;
    }

}
