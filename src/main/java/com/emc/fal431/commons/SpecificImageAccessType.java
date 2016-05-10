package com.emc.fal431.commons;

import lombok.AllArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@AllArgsConstructor
public enum SpecificImageAccessType {
    NEXT("Next"),
    PREVIOUS("Previous"),
    UNKNOWN("Unknown");

    private String name;

    public String toString() {
        return name;
    }

}
