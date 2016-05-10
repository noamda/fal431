package com.emc.fal431.commons;

import lombok.AllArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@AllArgsConstructor
public enum ConsistencyGroupCopyRole {
    ACTIVE("Active"),
    TEMPORARY_ACTIVE("TemporaryActive"),
    REPLICA("Replica"),
    UNKNOWN("Unknown");

    private String name;

    public String toString() {
        return name;
    }

}
