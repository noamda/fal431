
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for connectionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="connectionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FiberChannel"/>
 *     &lt;enumeration value="IP"/>
 *     &lt;enumeration value="NoConnection"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "connectionType")
@XmlEnum
public enum ConnectionType {

    @XmlEnumValue("FiberChannel")
    FIBER_CHANNEL("FiberChannel"),
    IP("IP"),
    @XmlEnumValue("NoConnection")
    NO_CONNECTION("NoConnection"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ConnectionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConnectionType fromValue(String v) {
        for (ConnectionType c: ConnectionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
