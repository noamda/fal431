package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EsxClusterAbilities", propOrder = {"automaticResourcePlacementEnabled"})
public class EsxClusterAbilities {
    protected boolean automaticResourcePlacementEnabled;

    public EsxClusterAbilities() {
    }

    public EsxClusterAbilities(boolean automaticResourcePlacementEnabled) {
        this.automaticResourcePlacementEnabled = automaticResourcePlacementEnabled;
    }


    public boolean isAutomaticResourcePlacementEnabled() {
        return this.automaticResourcePlacementEnabled;
    }


    public void setAutomaticResourcePlacementEnabled(boolean value) {
        this.automaticResourcePlacementEnabled = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof EsxClusterAbilities)) {
            return false;
        }
        EsxClusterAbilities otherObj = (EsxClusterAbilities) obj;

        return this.automaticResourcePlacementEnabled == otherObj.automaticResourcePlacementEnabled;
    }


    public int hashCode() {
        return this.automaticResourcePlacementEnabled ? 1 : 0;
    }


    public String toString() {
        return "EsxClusterAbilities [automaticResourcePlacementEnabled=" + this.automaticResourcePlacementEnabled + "]";
    }
}


