package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseCapacityUnitAndUsed", propOrder = {"licenseCapacityUnit", "used"})
public class LicenseCapacityUnitAndUsed {
    @XmlElement(nillable = true)
    protected LicenseCapacityUnit licenseCapacityUnit;
    protected long used;

    public LicenseCapacityUnitAndUsed() {
    }

    public LicenseCapacityUnitAndUsed(LicenseCapacityUnit licenseCapacityUnit, long used) {
        this.licenseCapacityUnit = licenseCapacityUnit;
        this.used = used;
    }


    public LicenseCapacityUnit getLicenseCapacityUnit() {
        return this.licenseCapacityUnit;
    }


    public void setLicenseCapacityUnit(LicenseCapacityUnit value) {
        this.licenseCapacityUnit = value;
    }


    public long getUsed() {
        return this.used;
    }


    public void setUsed(long value) {
        this.used = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof LicenseCapacityUnitAndUsed)) {
            return false;
        }
        LicenseCapacityUnitAndUsed otherObj = (LicenseCapacityUnitAndUsed) obj;

        return (this.licenseCapacityUnit != null ? this.licenseCapacityUnit.equals(otherObj.licenseCapacityUnit) : this.licenseCapacityUnit == otherObj.licenseCapacityUnit) && (this.used == otherObj.used);
    }


    public int hashCode() {
        return (this.licenseCapacityUnit != null ? this.licenseCapacityUnit.hashCode() : 0) ^ (int) this.used;
    }


    public String toString() {
        return "LicenseCapacityUnitAndUsed [licenseCapacityUnit=" + this.licenseCapacityUnit + ", " + "used=" + this.used + "]";
    }
}


