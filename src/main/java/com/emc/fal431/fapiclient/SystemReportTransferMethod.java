
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for systemReportTransferMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="systemReportTransferMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ESRS"/>
 *     &lt;enumeration value="SMTP"/>
 *     &lt;enumeration value="FTPS"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "systemReportTransferMethod")
@XmlEnum
public enum SystemReportTransferMethod {

    ESRS("ESRS"),
    SMTP("SMTP"),
    FTPS("FTPS"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    SystemReportTransferMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SystemReportTransferMethod fromValue(String v) {
        for (SystemReportTransferMethod c: SystemReportTransferMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
