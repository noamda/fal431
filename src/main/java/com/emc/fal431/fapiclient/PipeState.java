
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pipeState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="pipeState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Initializing"/>
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="FlushingBuffer"/>
 *     &lt;enumeration value="FlushingRemoteBufferToJournal"/>
 *     &lt;enumeration value="ReadyToReplicate"/>
 *     &lt;enumeration value="Flushed"/>
 *     &lt;enumeration value="Paused"/>
 *     &lt;enumeration value="PausedBySystem"/>
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="InHighLoad"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "pipeState")
@XmlEnum
public enum PipeState {

    @XmlEnumValue("Initializing")
    Initializing("Initializing"),
    @XmlEnumValue("Active")
    Active("Active"),
    @XmlEnumValue("FlushingBuffer")
    FlushingBuffer("FlushingBuffer"),
    @XmlEnumValue("FlushingRemoteBufferToJournal")
    FlushingRemoteBufferToJournal("FlushingRemoteBufferToJournal"),
    @XmlEnumValue("ReadyToReplicate")
    ReadyToReplicate("ReadyToReplicate"),
    @XmlEnumValue("Flushed")
    Flushed("Flushed"),
    @XmlEnumValue("Paused")
    Paused("Paused"),
    @XmlEnumValue("PausedBySystem")
    PausedBySystem("PausedBySystem"),
    @XmlEnumValue("Error")
    Error("Error"),
    @XmlEnumValue("InHighLoad")
    InHighLoad("InHighLoad"),
    @XmlEnumValue("Unknown")
    Unknown("Unknown");
    private final String value;

    PipeState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PipeState fromValue(String v) {
        for (PipeState c: PipeState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
