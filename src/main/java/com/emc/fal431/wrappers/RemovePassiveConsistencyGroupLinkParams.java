package com.emc.fal431.wrappers;

import com.emc.fal431.commons.GlobalCopyUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;


@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class RemovePassiveConsistencyGroupLinkParams {

    private GlobalCopyUID firstCopy;
    private GlobalCopyUID secondCopy;

}
