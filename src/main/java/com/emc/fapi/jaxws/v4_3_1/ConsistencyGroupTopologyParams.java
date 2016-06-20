package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupTopologyParams", propOrder = {"copiesToDisable", "copiesToRemove", "linksToAdd"})
public class ConsistencyGroupTopologyParams {
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopyUID> copiesToDisable;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopyUID> copiesToRemove;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupLinkSettings> linksToAdd;

    public ConsistencyGroupTopologyParams() {
    }

    public ConsistencyGroupTopologyParams(List<ConsistencyGroupCopyUID> copiesToDisable, List<ConsistencyGroupCopyUID> copiesToRemove, List<ConsistencyGroupLinkSettings> linksToAdd) {
        this.copiesToDisable = copiesToDisable;
        this.copiesToRemove = copiesToRemove;
        this.linksToAdd = linksToAdd;
    }


    public List<ConsistencyGroupCopyUID> getCopiesToDisable() {
        if (this.copiesToDisable == null) {
            this.copiesToDisable = new ArrayList();
        }
        return this.copiesToDisable;
    }


    public List<ConsistencyGroupCopyUID> getCopiesToRemove() {
        if (this.copiesToRemove == null) {
            this.copiesToRemove = new ArrayList();
        }
        return this.copiesToRemove;
    }


    public List<ConsistencyGroupLinkSettings> getLinksToAdd() {
        if (this.linksToAdd == null) {
            this.linksToAdd = new ArrayList();
        }
        return this.linksToAdd;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupTopologyParams)) {
            return false;
        }
        ConsistencyGroupTopologyParams otherObj = (ConsistencyGroupTopologyParams) obj;

        return (this.copiesToDisable != null ? this.copiesToDisable.equals(otherObj.copiesToDisable) : this.copiesToDisable == otherObj.copiesToDisable) && (this.copiesToRemove != null ? this.copiesToRemove.equals(otherObj.copiesToRemove) : this.copiesToRemove == otherObj.copiesToRemove) && (this.linksToAdd != null ? this.linksToAdd.equals(otherObj.linksToAdd) : this.linksToAdd == otherObj.linksToAdd);
    }


    public int hashCode() {
        return (this.copiesToDisable != null ? this.copiesToDisable.hashCode() : 0) ^ (this.copiesToRemove != null ? this.copiesToRemove.hashCode() : 0) ^ (this.linksToAdd != null ? this.linksToAdd.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupTopologyParams [copiesToDisable=" + this.copiesToDisable + ", " + "copiesToRemove=" + this.copiesToRemove + ", " + "linksToAdd=" + this.linksToAdd + "]";
    }
}


