package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "systemReportTransferMethod")
@XmlEnum
public enum SystemReportTransferMethod {
    ESRS,
    SMTP,
    FTPS,
    UNKNOWN;

    private SystemReportTransferMethod() {
    }

    public static SystemReportTransferMethod fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


