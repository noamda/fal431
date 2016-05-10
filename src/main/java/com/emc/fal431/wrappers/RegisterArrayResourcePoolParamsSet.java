package com.emc.fal431.wrappers;

import com.emc.fal431.commons.RegisterArrayResourcePoolParams;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;


@XmlRootElement
@NoArgsConstructor
@Data
public class RegisterArrayResourcePoolParamsSet {
    private Set<RegisterArrayResourcePoolParams> innerSet;

    public RegisterArrayResourcePoolParamsSet(Set<RegisterArrayResourcePoolParams> registerArrayResourcePoolParamsSet) {
        this.innerSet = registerArrayResourcePoolParamsSet;
    }
}
