package com.emc.fal431.wrappers;

import com.emc.fal431.commons.BookmarkConsolidationPolicy;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@NoArgsConstructor
@Data
public class RestBookmarkConsolidationPolicy {
    private BookmarkConsolidationPolicy restEnum;

    public RestBookmarkConsolidationPolicy(BookmarkConsolidationPolicy restEnum) {
        this.restEnum = restEnum;
    }
}
