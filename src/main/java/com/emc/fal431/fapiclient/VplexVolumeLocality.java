
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vplexVolumeLocality.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="vplexVolumeLocality">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Local"/>
 *     &lt;enumeration value="MetroDR1"/>
 *     &lt;enumeration value="Geo"/>
 *     &lt;enumeration value="RemoteExported"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "vplexVolumeLocality")
@XmlEnum
public enum VplexVolumeLocality {

    @XmlEnumValue("Local")
    LOCAL("Local"),
    @XmlEnumValue("MetroDR1")
    METRO_DR_1("MetroDR1"),
    @XmlEnumValue("Geo")
    GEO("Geo"),
    @XmlEnumValue("RemoteExported")
    REMOTE_EXPORTED("RemoteExported"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VplexVolumeLocality(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VplexVolumeLocality fromValue(String v) {
        for (VplexVolumeLocality c: VplexVolumeLocality.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
