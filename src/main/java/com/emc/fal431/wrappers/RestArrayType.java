package com.emc.fal431.wrappers;

import com.emc.fal431.commons.ArrayType;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@NoArgsConstructor
@Data
public class RestArrayType {
    private ArrayType restEnum;

    public RestArrayType(ArrayType restEnum) {
        this.restEnum = restEnum;
    }
}
