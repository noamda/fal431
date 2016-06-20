package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@JsonTypeName("ScaleIoConnectionParams")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScaleIoConnectionParams", propOrder = {"ipInfos"})
public class ScaleIoConnectionParams
        extends BaseConnectionParams {
    @XmlElement(nillable = true)
    protected List<IPInformation> ipInfos;

    public ScaleIoConnectionParams() {
    }

    public ScaleIoConnectionParams(List<IPInformation> ipInfos) {
        this.ipInfos = ipInfos;
    }


    public List<IPInformation> getIpInfos() {
        if (this.ipInfos == null) {
            this.ipInfos = new ArrayList();
        }
        return this.ipInfos;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ScaleIoConnectionParams)) {
            return false;
        }
        ScaleIoConnectionParams otherObj = (ScaleIoConnectionParams) obj;

        return (super.equals(obj)) && (this.ipInfos != null ? this.ipInfos.equals(otherObj.ipInfos) : this.ipInfos == otherObj.ipInfos);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.ipInfos != null ? this.ipInfos.hashCode() : 0);
    }


    public String toString() {
        return "ScaleIoConnectionParams [super=" + super.toString() + ", " + "ipInfos=" + this.ipInfos + "]";
    }
}


