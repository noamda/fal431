package com.emc.fal431.commons;

import lombok.AllArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

@AllArgsConstructor
@XmlRootElement
public enum AuthenticationType {
    GLOBAL("Global"),
    LOCAL("Local"),
    LDAP("LDAP"),
    UNKNOWN("Unknown");

    private String name;

    public String toString() {
        return name;
    }

}
