package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "controllerType")
@XmlEnum
public enum ControllerType {
    CONTROLLER_TYPE_SCSI,
    CONTROLLER_TYPE_SATA,
    CONTROLLER_TYPE_IDE,
    CONTROLLER_TYPE_UNKNOWN;

    private ControllerType() {
    }

    public static ControllerType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


