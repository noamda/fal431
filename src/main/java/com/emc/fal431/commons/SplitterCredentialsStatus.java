package com.emc.fal431.commons;

import lombok.AllArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@AllArgsConstructor
public enum SplitterCredentialsStatus {
    OK("OK"),
    NONE("None"),
    UNDECIDED("Undecided"),
    UNKNOWN("Unknown");

    private String name;

    public String toString() {
        return name;
    }

}
