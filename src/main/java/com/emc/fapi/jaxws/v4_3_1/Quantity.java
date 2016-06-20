package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quantity", propOrder = {"value", "type"})
public class Quantity {
    protected long value;
    @XmlElement(required = true)
    protected QuantityType type;

    public Quantity() {
    }

    public Quantity(long value, QuantityType type) {
        this.value = value;
        this.type = type;
    }


    public long getValue() {
        return this.value;
    }


    public void setValue(long value) {
        this.value = value;
    }


    public QuantityType getType() {
        return this.type;
    }


    public void setType(QuantityType value) {
        this.type = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof Quantity)) {
            return false;
        }
        Quantity otherObj = (Quantity) obj;

        return (this.value == otherObj.value) && (this.type != null ? this.type.equals(otherObj.type) : this.type == otherObj.type);
    }


    public int hashCode() {
        return (int) this.value ^ (this.type != null ? this.type.hashCode() : 0);
    }


    public String toString() {
        return "Quantity [value=" + this.value + ", " + "type=" + this.type + "]";
    }
}


