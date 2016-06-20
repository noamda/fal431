package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "JsonSubType")
@JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value = VCArrayState.class, name = "VCArrayState")})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayState", propOrder = {"arrayUID", "connectivityInfo", "capabilities", "rpSupportedCapabilities", "arrayLimitations", "resourcePoolState", "version"})
@XmlSeeAlso({VCArrayState.class})
public class ArrayState {
    @XmlElement(nillable = true)
    protected ArrayUID arrayUID;
    protected ArrayConnectivityInfo connectivityInfo;
    protected ArrayCapabilities capabilities;
    protected RpSupportedArrayCapabilities rpSupportedCapabilities;
    @XmlElement(nillable = true)
    protected MonitoredParametersStatus arrayLimitations;
    @XmlElement(nillable = true)
    protected List<ArrayResourcePoolState> resourcePoolState;
    protected String version;

    public ArrayState() {
    }

    public ArrayState(ArrayUID arrayUID, ArrayConnectivityInfo connectivityInfo, ArrayCapabilities capabilities, RpSupportedArrayCapabilities rpSupportedCapabilities, MonitoredParametersStatus arrayLimitations, List<ArrayResourcePoolState> resourcePoolState, String version) {
        this.arrayUID = arrayUID;
        this.connectivityInfo = connectivityInfo;
        this.capabilities = capabilities;
        this.rpSupportedCapabilities = rpSupportedCapabilities;
        this.arrayLimitations = arrayLimitations;
        this.resourcePoolState = resourcePoolState;
        this.version = version;
    }


    public ArrayUID getArrayUID() {
        return this.arrayUID;
    }


    public void setArrayUID(ArrayUID value) {
        this.arrayUID = value;
    }


    public ArrayConnectivityInfo getConnectivityInfo() {
        return this.connectivityInfo;
    }


    public void setConnectivityInfo(ArrayConnectivityInfo value) {
        this.connectivityInfo = value;
    }


    public ArrayCapabilities getCapabilities() {
        return this.capabilities;
    }


    public void setCapabilities(ArrayCapabilities value) {
        this.capabilities = value;
    }


    public RpSupportedArrayCapabilities getRpSupportedCapabilities() {
        return this.rpSupportedCapabilities;
    }


    public void setRpSupportedCapabilities(RpSupportedArrayCapabilities value) {
        this.rpSupportedCapabilities = value;
    }


    public MonitoredParametersStatus getArrayLimitations() {
        return this.arrayLimitations;
    }


    public void setArrayLimitations(MonitoredParametersStatus value) {
        this.arrayLimitations = value;
    }


    public List<ArrayResourcePoolState> getResourcePoolState() {
        if (this.resourcePoolState == null) {
            this.resourcePoolState = new ArrayList();
        }
        return this.resourcePoolState;
    }


    public String getVersion() {
        return this.version;
    }


    public void setVersion(String value) {
        this.version = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ArrayState)) {
            return false;
        }
        ArrayState otherObj = (ArrayState) obj;

        return (this.arrayUID != null ? this.arrayUID.equals(otherObj.arrayUID) : this.arrayUID == otherObj.arrayUID) && (this.connectivityInfo != null ? this.connectivityInfo.equals(otherObj.connectivityInfo) : this.connectivityInfo == otherObj.connectivityInfo) && (this.capabilities != null ? this.capabilities.equals(otherObj.capabilities) : this.capabilities == otherObj.capabilities) && (this.rpSupportedCapabilities != null ? this.rpSupportedCapabilities.equals(otherObj.rpSupportedCapabilities) : this.rpSupportedCapabilities == otherObj.rpSupportedCapabilities) && (this.arrayLimitations != null ? this.arrayLimitations.equals(otherObj.arrayLimitations) : this.arrayLimitations == otherObj.arrayLimitations) && (this.resourcePoolState != null ? this.resourcePoolState.equals(otherObj.resourcePoolState) : this.resourcePoolState == otherObj.resourcePoolState) && (this.version != null ? this.version.equals(otherObj.version) : this.version == otherObj.version);
    }


    public int hashCode() {
        return (this.arrayUID != null ? this.arrayUID.hashCode() : 0) ^ (this.connectivityInfo != null ? this.connectivityInfo.hashCode() : 0) ^ (this.capabilities != null ? this.capabilities.hashCode() : 0) ^ (this.rpSupportedCapabilities != null ? this.rpSupportedCapabilities.hashCode() : 0) ^ (this.arrayLimitations != null ? this.arrayLimitations.hashCode() : 0) ^ (this.resourcePoolState != null ? this.resourcePoolState.hashCode() : 0) ^ (this.version != null ? this.version.hashCode() : 0);
    }


    public String toString() {
        return "ArrayState [arrayUID=" + this.arrayUID + ", " + "connectivityInfo=" + this.connectivityInfo + ", " + "capabilities=" + this.capabilities + ", " + "rpSupportedCapabilities=" + this.rpSupportedCapabilities + ", " + "arrayLimitations=" + this.arrayLimitations + ", " + "resourcePoolState=" + this.resourcePoolState + ", " + "version=" + this.version + "]";
    }
}


