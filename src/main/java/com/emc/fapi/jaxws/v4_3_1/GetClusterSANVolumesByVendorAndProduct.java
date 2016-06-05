/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="getClusterSANVolumesByVendorAndProduct", propOrder={"cluster", "refreshView", "vendor", "product"})
/*     */ public class GetClusterSANVolumesByVendorAndProduct
/*     */ {
/*     */   protected ClusterUID cluster;
/*     */   protected boolean refreshView;
/*     */   protected String vendor;
/*     */   protected String product;
/*     */   
/*     */   public GetClusterSANVolumesByVendorAndProduct() {}
/*     */   
/*     */   public GetClusterSANVolumesByVendorAndProduct(ClusterUID cluster, boolean refreshView, String vendor, String product)
/*     */   {
/*  53 */     this.cluster = cluster;
/*  54 */     this.refreshView = refreshView;
/*  55 */     this.vendor = vendor;
/*  56 */     this.product = product;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ClusterUID getCluster()
/*     */   {
/*  68 */     return this.cluster;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCluster(ClusterUID value)
/*     */   {
/*  80 */     this.cluster = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isRefreshView()
/*     */   {
/*  88 */     return this.refreshView;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRefreshView(boolean value)
/*     */   {
/*  96 */     this.refreshView = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getVendor()
/*     */   {
/* 108 */     return this.vendor;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVendor(String value)
/*     */   {
/* 120 */     this.vendor = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getProduct()
/*     */   {
/* 132 */     return this.product;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setProduct(String value)
/*     */   {
/* 144 */     this.product = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 154 */     if (!(obj instanceof GetClusterSANVolumesByVendorAndProduct)) {
/* 155 */       return false;
/*     */     }
/* 157 */     GetClusterSANVolumesByVendorAndProduct otherObj = (GetClusterSANVolumesByVendorAndProduct)obj;
/*     */     
/* 159 */     return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.refreshView == otherObj.refreshView) && (this.vendor != null ? this.vendor.equals(otherObj.vendor) : this.vendor == otherObj.vendor) && (this.product != null ? this.product.equals(otherObj.product) : this.product == otherObj.product);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 171 */     return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.refreshView ? 1 : 0) ^ (this.vendor != null ? this.vendor.hashCode() : 0) ^ (this.product != null ? this.product.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 183 */     return "GetClusterSANVolumesByVendorAndProduct [cluster=" + this.cluster + ", " + "refreshView=" + this.refreshView + ", " + "vendor=" + this.vendor + ", " + "product=" + this.product + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetClusterSANVolumesByVendorAndProduct.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */