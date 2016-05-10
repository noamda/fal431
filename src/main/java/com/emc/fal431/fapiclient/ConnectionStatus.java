
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for connectionStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="connectionStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="PasswordExpired"/>
 *     &lt;enumeration value="TooManyConnections"/>
 *     &lt;enumeration value="NoPermission"/>
 *     &lt;enumeration value="Error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "connectionStatus")
@XmlEnum
public enum ConnectionStatus {

    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("PasswordExpired")
    PASSWORD_EXPIRED("PasswordExpired"),
    @XmlEnumValue("TooManyConnections")
    TOO_MANY_CONNECTIONS("TooManyConnections"),
    @XmlEnumValue("NoPermission")
    NO_PERMISSION("NoPermission"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    ConnectionStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConnectionStatus fromValue(String v) {
        for (ConnectionStatus c: ConnectionStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
