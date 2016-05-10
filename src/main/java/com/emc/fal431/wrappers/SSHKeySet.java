package com.emc.fal431.wrappers;

import com.emc.fal431.commons.SSHKey;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;


@XmlRootElement
@NoArgsConstructor
@Data
public class SSHKeySet {
    private Set<SSHKey> innerSet;

    public SSHKeySet(Set<SSHKey> sshKeySet) {
        this.innerSet = sshKeySet;
    }
}
