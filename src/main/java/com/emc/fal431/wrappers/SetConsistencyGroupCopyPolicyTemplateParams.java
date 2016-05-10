package com.emc.fal431.wrappers;

import com.emc.fal431.commons.ConsistencyGroupCopyPolicyTemplate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;


@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class SetConsistencyGroupCopyPolicyTemplateParams {
    private ConsistencyGroupCopyPolicyTemplate template;
    private String newName;
}
