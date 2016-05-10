package com.emc.fal431.wrappers;

import com.emc.fal431.commons.ConsistencyGroupPolicy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class AddConsistencyGroupParams {

    private String groupName;
    private ConsistencyGroupPolicy policy;

}
