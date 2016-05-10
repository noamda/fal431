
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for syslogFacility.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="syslogFacility">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Auth"/>
 *     &lt;enumeration value="Authpriv"/>
 *     &lt;enumeration value="Cron"/>
 *     &lt;enumeration value="Daemon"/>
 *     &lt;enumeration value="Ftp"/>
 *     &lt;enumeration value="Kern"/>
 *     &lt;enumeration value="Local0"/>
 *     &lt;enumeration value="Local1"/>
 *     &lt;enumeration value="Local2"/>
 *     &lt;enumeration value="Local3"/>
 *     &lt;enumeration value="Local4"/>
 *     &lt;enumeration value="Local5"/>
 *     &lt;enumeration value="Local6"/>
 *     &lt;enumeration value="Local7"/>
 *     &lt;enumeration value="Lpr"/>
 *     &lt;enumeration value="Mail"/>
 *     &lt;enumeration value="News"/>
 *     &lt;enumeration value="Syslog"/>
 *     &lt;enumeration value="User"/>
 *     &lt;enumeration value="UUCP"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "syslogFacility")
@XmlEnum
public enum SyslogFacility {

    @XmlEnumValue("Auth")
    AUTH("Auth"),
    @XmlEnumValue("Authpriv")
    AUTHPRIV("Authpriv"),
    @XmlEnumValue("Cron")
    CRON("Cron"),
    @XmlEnumValue("Daemon")
    DAEMON("Daemon"),
    @XmlEnumValue("Ftp")
    FTP("Ftp"),
    @XmlEnumValue("Kern")
    KERN("Kern"),
    @XmlEnumValue("Local0")
    LOCAL_0("Local0"),
    @XmlEnumValue("Local1")
    LOCAL_1("Local1"),
    @XmlEnumValue("Local2")
    LOCAL_2("Local2"),
    @XmlEnumValue("Local3")
    LOCAL_3("Local3"),
    @XmlEnumValue("Local4")
    LOCAL_4("Local4"),
    @XmlEnumValue("Local5")
    LOCAL_5("Local5"),
    @XmlEnumValue("Local6")
    LOCAL_6("Local6"),
    @XmlEnumValue("Local7")
    LOCAL_7("Local7"),
    @XmlEnumValue("Lpr")
    LPR("Lpr"),
    @XmlEnumValue("Mail")
    MAIL("Mail"),
    @XmlEnumValue("News")
    NEWS("News"),
    @XmlEnumValue("Syslog")
    SYSLOG("Syslog"),
    @XmlEnumValue("User")
    USER("User"),
    UUCP("UUCP"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    SyslogFacility(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SyslogFacility fromValue(String v) {
        for (SyslogFacility c: SyslogFacility.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
