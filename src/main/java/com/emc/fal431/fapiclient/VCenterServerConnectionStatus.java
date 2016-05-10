
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vCenterServerConnectionStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="vCenterServerConnectionStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Connected"/>
 *     &lt;enumeration value="AuthenticationFailure"/>
 *     &lt;enumeration value="IPUnreachable"/>
 *     &lt;enumeration value="UnsupportedVersion"/>
 *     &lt;enumeration value="InvalidPort"/>
 *     &lt;enumeration value="InvalidPortOrCertificate"/>
 *     &lt;enumeration value="UnknownError"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "vCenterServerConnectionStatus")
@XmlEnum
public enum VCenterServerConnectionStatus {

    @XmlEnumValue("Connected")
    CONNECTED("Connected"),
    @XmlEnumValue("AuthenticationFailure")
    AUTHENTICATION_FAILURE("AuthenticationFailure"),
    @XmlEnumValue("IPUnreachable")
    IP_UNREACHABLE("IPUnreachable"),
    @XmlEnumValue("UnsupportedVersion")
    UNSUPPORTED_VERSION("UnsupportedVersion"),
    @XmlEnumValue("InvalidPort")
    INVALID_PORT("InvalidPort"),
    @XmlEnumValue("InvalidPortOrCertificate")
    INVALID_PORT_OR_CERTIFICATE("InvalidPortOrCertificate"),
    @XmlEnumValue("UnknownError")
    UNKNOWN_ERROR("UnknownError"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VCenterServerConnectionStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VCenterServerConnectionStatus fromValue(String v) {
        for (VCenterServerConnectionStatus c: VCenterServerConnectionStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
