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
@XmlType(name = "DefaultArrayResourcePool")
public class DefaultArrayResourcePool {

    private ArrayManagementProviderUID ampUID;
    @XmlElement(nillable = true)
    private ArrayUID arrayUID;
    private ResourcePoolUID poolUID;
}
