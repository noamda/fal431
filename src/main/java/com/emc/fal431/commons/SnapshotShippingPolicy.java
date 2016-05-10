package com.emc.fal431.commons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Data
@XmlRootElement
@XmlType(name = "SnapshotShippingPolicy")
public class SnapshotShippingPolicy implements Validateable {
    SnapshotShippingMode mode;
    Long intervaInMinutes;

}
