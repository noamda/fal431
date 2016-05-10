
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for imageAccessScenario.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="imageAccessScenario">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Failover"/>
 *     &lt;enumeration value="TemporaryFailover"/>
 *     &lt;enumeration value="RecoverProduction"/>
 *     &lt;enumeration value="TestReplica"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "imageAccessScenario")
@XmlEnum
public enum ImageAccessScenario {

    @XmlEnumValue("None")
    None("None"),
    @XmlEnumValue("Failover")
    Failover("Failover"),
    @XmlEnumValue("TemporaryFailover")
    TemporaryFailover("TemporaryFailover"),
    @XmlEnumValue("RecoverProduction")
    RecoverProduction("RecoverProduction"),
    @XmlEnumValue("TestReplica")
    TestReplica("TestReplica"),
    @XmlEnumValue("Unknown")
    Unknown("Unknown");
    private final String value;

    ImageAccessScenario(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImageAccessScenario fromValue(String v) {
        for (ImageAccessScenario c: ImageAccessScenario.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
