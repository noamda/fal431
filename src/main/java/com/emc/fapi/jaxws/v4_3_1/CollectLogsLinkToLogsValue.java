package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectLogsLinkToLogsValue", propOrder = {"cluster", "url"})
public class CollectLogsLinkToLogsValue {
    protected ClusterUID cluster;
    protected String url;

    public CollectLogsLinkToLogsValue() {
    }

    public CollectLogsLinkToLogsValue(ClusterUID cluster, String url) {
        this.cluster = cluster;
        this.url = url;
    }


    public ClusterUID getCluster() {
        return this.cluster;
    }


    public void setCluster(ClusterUID value) {
        this.cluster = value;
    }


    public String getUrl() {
        return this.url;
    }


    public void setUrl(String value) {
        this.url = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof CollectLogsLinkToLogsValue)) {
            return false;
        }
        CollectLogsLinkToLogsValue otherObj = (CollectLogsLinkToLogsValue) obj;

        return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.url != null ? this.url.equals(otherObj.url) : this.url == otherObj.url);
    }


    public int hashCode() {
        return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.url != null ? this.url.hashCode() : 0);
    }


    public String toString() {
        return "CollectLogsLinkToLogsValue [cluster=" + this.cluster + ", " + "url=" + this.url + "]";
    }
}


