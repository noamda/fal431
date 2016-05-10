package com.emc.fal431.commons;

import lombok.AllArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@AllArgsConstructor
public enum RPOMinimizationType {
    MINIMIZE_LAG("MinimizeLag"),
    MINIMIZE_BANDWIDTH("MinimizeBandwidth"),
    IRRELEVANT("Irrelevant"),
    UNKNOWN("Unknown");

    private String name;

    public String toString() {
        return name;
    }

}
