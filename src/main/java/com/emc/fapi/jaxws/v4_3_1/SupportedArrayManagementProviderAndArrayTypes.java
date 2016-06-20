package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupportedArrayManagementProviderAndArrayTypes", propOrder = {"supportedAMPtoArrayTypes"})
public class SupportedArrayManagementProviderAndArrayTypes {
    @XmlElement(nillable = true)
    protected List<ArrayManagementProviderTypesSet> supportedAMPtoArrayTypes;

    public SupportedArrayManagementProviderAndArrayTypes() {
    }

    public SupportedArrayManagementProviderAndArrayTypes(List<ArrayManagementProviderTypesSet> supportedAMPtoArrayTypes) {
        this.supportedAMPtoArrayTypes = supportedAMPtoArrayTypes;
    }


    public List<ArrayManagementProviderTypesSet> getSupportedAMPtoArrayTypes() {
        if (this.supportedAMPtoArrayTypes == null) {
            this.supportedAMPtoArrayTypes = new ArrayList();
        }
        return this.supportedAMPtoArrayTypes;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SupportedArrayManagementProviderAndArrayTypes)) {
            return false;
        }
        SupportedArrayManagementProviderAndArrayTypes otherObj = (SupportedArrayManagementProviderAndArrayTypes) obj;

        return this.supportedAMPtoArrayTypes == otherObj.supportedAMPtoArrayTypes ? true : this.supportedAMPtoArrayTypes != null ? this.supportedAMPtoArrayTypes.equals(otherObj.supportedAMPtoArrayTypes) : false;
    }


    public int hashCode() {
        return this.supportedAMPtoArrayTypes != null ? this.supportedAMPtoArrayTypes.hashCode() : 0;
    }


    public String toString() {
        return "SupportedArrayManagementProviderAndArrayTypes [supportedAMPtoArrayTypes=" + this.supportedAMPtoArrayTypes + "]";
    }
}


