package com.emc.fal431.wrappers;

import com.emc.fal431.commons.ArrayType;
import com.emc.fal431.commons.ConfigurationParams;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@NoArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CheckArrayConnectivityParams {

    @XmlElement(nillable = true)
    private ArrayType arrayType;
    private ConfigurationParams arrayConfiguration;
}
