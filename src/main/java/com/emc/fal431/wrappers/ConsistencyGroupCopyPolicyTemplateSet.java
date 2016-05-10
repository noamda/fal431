package com.emc.fal431.wrappers;

import com.emc.fal431.commons.ConsistencyGroupCopyPolicyTemplate;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;


@XmlRootElement
@NoArgsConstructor
@Data
public class ConsistencyGroupCopyPolicyTemplateSet {
    private Set<ConsistencyGroupCopyPolicyTemplate> innerSet;

    public ConsistencyGroupCopyPolicyTemplateSet(Set<ConsistencyGroupCopyPolicyTemplate> policySet) {
        this.innerSet = policySet;
    }
}
