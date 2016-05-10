package com.emc.fal431.wrappers;

import com.emc.fal431.commons.ConsistencyGroupLinkPolicyTemplate;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;


@XmlRootElement
@NoArgsConstructor
@Data
public class ConsistencyGroupLinkPolicyTemplateSet {
    private Set<ConsistencyGroupLinkPolicyTemplate> innerSet;

    public ConsistencyGroupLinkPolicyTemplateSet(
        Set<ConsistencyGroupLinkPolicyTemplate> consistencyGroupLinkPolicyTemplateSet) {
        this.innerSet = consistencyGroupLinkPolicyTemplateSet;
    }
}
