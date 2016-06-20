package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getClusterSANVolumesByVendorAndProduct", propOrder = {"cluster", "refreshView", "vendor", "product"})
public class GetClusterSANVolumesByVendorAndProduct {
    protected ClusterUID cluster;
    protected boolean refreshView;
    protected String vendor;
    protected String product;

    public GetClusterSANVolumesByVendorAndProduct() {
    }

    public GetClusterSANVolumesByVendorAndProduct(ClusterUID cluster, boolean refreshView, String vendor, String product) {
        this.cluster = cluster;
        this.refreshView = refreshView;
        this.vendor = vendor;
        this.product = product;
    }


    public ClusterUID getCluster() {
        return this.cluster;
    }


    public void setCluster(ClusterUID value) {
        this.cluster = value;
    }


    public boolean isRefreshView() {
        return this.refreshView;
    }


    public void setRefreshView(boolean value) {
        this.refreshView = value;
    }


    public String getVendor() {
        return this.vendor;
    }


    public void setVendor(String value) {
        this.vendor = value;
    }


    public String getProduct() {
        return this.product;
    }


    public void setProduct(String value) {
        this.product = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetClusterSANVolumesByVendorAndProduct)) {
            return false;
        }
        GetClusterSANVolumesByVendorAndProduct otherObj = (GetClusterSANVolumesByVendorAndProduct) obj;

        return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.refreshView == otherObj.refreshView) && (this.vendor != null ? this.vendor.equals(otherObj.vendor) : this.vendor == otherObj.vendor) && (this.product != null ? this.product.equals(otherObj.product) : this.product == otherObj.product);
    }


    public int hashCode() {
        return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.refreshView ? 1 : 0) ^ (this.vendor != null ? this.vendor.hashCode() : 0) ^ (this.product != null ? this.product.hashCode() : 0);
    }


    public String toString() {
        return "GetClusterSANVolumesByVendorAndProduct [cluster=" + this.cluster + ", " + "refreshView=" + this.refreshView + ", " + "vendor=" + this.vendor + ", " + "product=" + this.product + "]";
    }
}


