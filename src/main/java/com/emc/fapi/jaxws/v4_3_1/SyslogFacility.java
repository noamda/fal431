package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "syslogFacility")
@XmlEnum
public enum SyslogFacility {
    AUTH,
    AUTHPRIV,
    CRON,
    DAEMON,
    FTP,
    KERN,
    LOCAL0,
    LOCAL1,
    LOCAL2,
    LOCAL3,
    LOCAL4,
    LOCAL5,
    LOCAL6,
    LOCAL7,
    LPR,
    MAIL,
    NEWS,
    SYSLOG,
    USER,
    UUCP,
    UNKNOWN;

    private SyslogFacility() {
    }

    public static SyslogFacility fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


