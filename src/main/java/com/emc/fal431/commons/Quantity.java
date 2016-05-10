package com.emc.fal431.commons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

//import com.emc.fapi.utils.FAPIConstants;

@SuppressWarnings("serial")
@XmlRootElement
@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quantity")
public class Quantity implements Validateable {

    private long value;
    @XmlElement(required = true)
    private QuantityType type;

}
