package com.emc.fal431.wrappers;

import com.emc.fal431.commons.RecoverPointUser;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;


@XmlRootElement
@NoArgsConstructor
@Data
public class RecoverPointUserSet {
    private HashSet<RecoverPointUser> innerSet;

    public RecoverPointUserSet(HashSet<RecoverPointUser> recoverPointUserSet) {
        this.innerSet = recoverPointUserSet;
    }
}
