package com.emc.fal431.commons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@SuppressWarnings("serial")
@XmlRootElement
@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmReplicationPolicy")
public class VmReplicationPolicy implements Validateable {

    @XmlElement(required = true)
    private VmNetworkCustomizationPolicy networkCustomizationPolicy;

}
