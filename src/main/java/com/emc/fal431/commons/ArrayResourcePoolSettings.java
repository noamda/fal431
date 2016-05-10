package com.emc.fal431.commons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayResourcePoolSettings")
public class ArrayResourcePoolSettings {

    @XmlElement(nillable = true)
    private ResourcePoolUID resourcePoolUID;
    private String name;
    private ArrayResourcePoolType resourcePoolType;
    private ArrayResourcePoolAllocationParams allocationParams;

}
