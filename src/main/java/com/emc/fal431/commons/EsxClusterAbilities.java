package com.emc.fal431.commons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlType(name = "EsxClusterAbilities")
public class EsxClusterAbilities {

    private boolean automaticResourcePlacementEnabled;
}
