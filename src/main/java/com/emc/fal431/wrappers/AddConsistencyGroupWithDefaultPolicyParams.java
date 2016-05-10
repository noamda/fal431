package com.emc.fal431.wrappers;

import com.emc.fal431.commons.RpaUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;


@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class AddConsistencyGroupWithDefaultPolicyParams {

    private String groupName;
    private RpaUID primaryRPA;

}
