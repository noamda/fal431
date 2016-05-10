package com.emc.fal431.commons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
@XmlType(name = "TimeZoneInfo")
public class TimeZoneInfo {
    String timeZone;
    int offsetInMilliseconds;
}
