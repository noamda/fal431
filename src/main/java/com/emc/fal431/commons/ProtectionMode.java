package com.emc.fal431.commons;

import lombok.AllArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@AllArgsConstructor
public enum ProtectionMode {
    ASYNCHRONOUS("Asynchronous"),
    SYNCHRONOUS("Synchronous"),
    UNKNOWN("Unknown");

    private String name;

    public String toString() {
        return name;
    }

}
