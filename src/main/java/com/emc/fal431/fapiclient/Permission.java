
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for permission.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="permission">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Splitter"/>
 *     &lt;enumeration value="Group"/>
 *     &lt;enumeration value="Transfer"/>
 *     &lt;enumeration value="TargetImage"/>
 *     &lt;enumeration value="Failover"/>
 *     &lt;enumeration value="System"/>
 *     &lt;enumeration value="Security"/>
 *     &lt;enumeration value="Upgrade"/>
 *     &lt;enumeration value="Monitor"/>
 *     &lt;enumeration value="BoxManagement"/>
 *     &lt;enumeration value="WebDownload"/>
 *     &lt;enumeration value="SE"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "permission")
@XmlEnum
public enum Permission {

    @XmlEnumValue("Splitter")
    SPLITTER("Splitter"),
    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("Transfer")
    TRANSFER("Transfer"),
    @XmlEnumValue("TargetImage")
    TARGET_IMAGE("TargetImage"),
    @XmlEnumValue("Failover")
    FAILOVER("Failover"),
    @XmlEnumValue("System")
    SYSTEM("System"),
    @XmlEnumValue("Security")
    SECURITY("Security"),
    @XmlEnumValue("Upgrade")
    UPGRADE("Upgrade"),
    @XmlEnumValue("Monitor")
    MONITOR("Monitor"),
    @XmlEnumValue("BoxManagement")
    BOX_MANAGEMENT("BoxManagement"),
    @XmlEnumValue("WebDownload")
    WEB_DOWNLOAD("WebDownload"),
    SE("SE"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    Permission(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Permission fromValue(String v) {
        for (Permission c: Permission.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
