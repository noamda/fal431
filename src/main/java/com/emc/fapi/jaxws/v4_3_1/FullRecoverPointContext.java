package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@JsonTypeName("FullRecoverPointContext")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FullRecoverPointContext", propOrder = {"fullSettingsContext", "fullStateContext", "systemStatusContext", "clustersSANVolumesContexts", "clustersClariionVolumesContexts", "clustersVCentersServersContexts"})
public class FullRecoverPointContext
        extends FunctionalAPIContext {
    protected FullRecoverPointSettingsContext fullSettingsContext;
    protected FullRecoverPointStateContext fullStateContext;
    @XmlElement(nillable = true)
    protected SystemStatusContext systemStatusContext;
    @XmlElement(nillable = true)
    protected List<ClusterSANVolumesContext> clustersSANVolumesContexts;
    @XmlElement(nillable = true)
    protected List<ClariionVolumesContext> clustersClariionVolumesContexts;
    @XmlElement(nillable = true)
    protected List<VCenterServerViewContext> clustersVCentersServersContexts;

    public FullRecoverPointContext() {
    }

    public FullRecoverPointContext(FullRecoverPointSettingsContext fullSettingsContext, FullRecoverPointStateContext fullStateContext, SystemStatusContext systemStatusContext, List<ClusterSANVolumesContext> clustersSANVolumesContexts, List<ClariionVolumesContext> clustersClariionVolumesContexts, List<VCenterServerViewContext> clustersVCentersServersContexts) {
        this.fullSettingsContext = fullSettingsContext;
        this.fullStateContext = fullStateContext;
        this.systemStatusContext = systemStatusContext;
        this.clustersSANVolumesContexts = clustersSANVolumesContexts;
        this.clustersClariionVolumesContexts = clustersClariionVolumesContexts;
        this.clustersVCentersServersContexts = clustersVCentersServersContexts;
    }


    public FullRecoverPointSettingsContext getFullSettingsContext() {
        return this.fullSettingsContext;
    }


    public void setFullSettingsContext(FullRecoverPointSettingsContext value) {
        this.fullSettingsContext = value;
    }


    public FullRecoverPointStateContext getFullStateContext() {
        return this.fullStateContext;
    }


    public void setFullStateContext(FullRecoverPointStateContext value) {
        this.fullStateContext = value;
    }


    public SystemStatusContext getSystemStatusContext() {
        return this.systemStatusContext;
    }


    public void setSystemStatusContext(SystemStatusContext value) {
        this.systemStatusContext = value;
    }


    public List<ClusterSANVolumesContext> getClustersSANVolumesContexts() {
        if (this.clustersSANVolumesContexts == null) {
            this.clustersSANVolumesContexts = new ArrayList();
        }
        return this.clustersSANVolumesContexts;
    }


    public List<ClariionVolumesContext> getClustersClariionVolumesContexts() {
        if (this.clustersClariionVolumesContexts == null) {
            this.clustersClariionVolumesContexts = new ArrayList();
        }
        return this.clustersClariionVolumesContexts;
    }


    public List<VCenterServerViewContext> getClustersVCentersServersContexts() {
        if (this.clustersVCentersServersContexts == null) {
            this.clustersVCentersServersContexts = new ArrayList();
        }
        return this.clustersVCentersServersContexts;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof FullRecoverPointContext)) {
            return false;
        }
        FullRecoverPointContext otherObj = (FullRecoverPointContext) obj;

        return (super.equals(obj)) && (this.fullSettingsContext != null ? this.fullSettingsContext.equals(otherObj.fullSettingsContext) : this.fullSettingsContext == otherObj.fullSettingsContext) && (this.fullStateContext != null ? this.fullStateContext.equals(otherObj.fullStateContext) : this.fullStateContext == otherObj.fullStateContext) && (this.systemStatusContext != null ? this.systemStatusContext.equals(otherObj.systemStatusContext) : this.systemStatusContext == otherObj.systemStatusContext) && (this.clustersSANVolumesContexts != null ? this.clustersSANVolumesContexts.equals(otherObj.clustersSANVolumesContexts) : this.clustersSANVolumesContexts == otherObj.clustersSANVolumesContexts) && (this.clustersClariionVolumesContexts != null ? this.clustersClariionVolumesContexts.equals(otherObj.clustersClariionVolumesContexts) : this.clustersClariionVolumesContexts == otherObj.clustersClariionVolumesContexts) && (this.clustersVCentersServersContexts != null ? this.clustersVCentersServersContexts.equals(otherObj.clustersVCentersServersContexts) : this.clustersVCentersServersContexts == otherObj.clustersVCentersServersContexts);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.fullSettingsContext != null ? this.fullSettingsContext.hashCode() : 0) ^ (this.fullStateContext != null ? this.fullStateContext.hashCode() : 0) ^ (this.systemStatusContext != null ? this.systemStatusContext.hashCode() : 0) ^ (this.clustersSANVolumesContexts != null ? this.clustersSANVolumesContexts.hashCode() : 0) ^ (this.clustersClariionVolumesContexts != null ? this.clustersClariionVolumesContexts.hashCode() : 0) ^ (this.clustersVCentersServersContexts != null ? this.clustersVCentersServersContexts.hashCode() : 0);
    }


    public String toString() {
        return "FullRecoverPointContext [super=" + super.toString() + ", " + "fullSettingsContext=" + this.fullSettingsContext + ", " + "fullStateContext=" + this.fullStateContext + ", " + "systemStatusContext=" + this.systemStatusContext + ", " + "clustersSANVolumesContexts=" + this.clustersSANVolumesContexts + ", " + "clustersClariionVolumesContexts=" + this.clustersClariionVolumesContexts + ", " + "clustersVCentersServersContexts=" + this.clustersVCentersServersContexts + "]";
    }
}


