/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="validateEnableImageAccessForGroupSetSubsetWithGeneralParameters", propOrder={"groupSetSubset", "cluster", "params"})
/*     */ public class ValidateEnableImageAccessForGroupSetSubsetWithGeneralParameters
/*     */ {
/*     */   protected ConsistencyGroupSetSubset groupSetSubset;
/*     */   @XmlElement(nillable=true)
/*     */   protected ClusterUID cluster;
/*     */   protected ImageAccessGeneralParameters params;
/*     */   
/*     */   public ValidateEnableImageAccessForGroupSetSubsetWithGeneralParameters() {}
/*     */   
/*     */   public ValidateEnableImageAccessForGroupSetSubsetWithGeneralParameters(ConsistencyGroupSetSubset groupSetSubset, ClusterUID cluster, ImageAccessGeneralParameters params)
/*     */   {
/*  52 */     this.groupSetSubset = groupSetSubset;
/*  53 */     this.cluster = cluster;
/*  54 */     this.params = params;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupSetSubset getGroupSetSubset()
/*     */   {
/*  66 */     return this.groupSetSubset;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupSetSubset(ConsistencyGroupSetSubset value)
/*     */   {
/*  78 */     this.groupSetSubset = value;
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
/*  90 */     return this.cluster;
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
/* 102 */     this.cluster = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ImageAccessGeneralParameters getParams()
/*     */   {
/* 114 */     return this.params;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setParams(ImageAccessGeneralParameters value)
/*     */   {
/* 126 */     this.params = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 136 */     if (!(obj instanceof ValidateEnableImageAccessForGroupSetSubsetWithGeneralParameters)) {
/* 137 */       return false;
/*     */     }
/* 139 */     ValidateEnableImageAccessForGroupSetSubsetWithGeneralParameters otherObj = (ValidateEnableImageAccessForGroupSetSubsetWithGeneralParameters)obj;
/*     */     
/* 141 */     return (this.groupSetSubset != null ? this.groupSetSubset.equals(otherObj.groupSetSubset) : this.groupSetSubset == otherObj.groupSetSubset) && (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.params != null ? this.params.equals(otherObj.params) : this.params == otherObj.params);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 152 */     return (this.groupSetSubset != null ? this.groupSetSubset.hashCode() : 0) ^ (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.params != null ? this.params.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 163 */     return "ValidateEnableImageAccessForGroupSetSubsetWithGeneralParameters [groupSetSubset=" + this.groupSetSubset + ", " + "cluster=" + this.cluster + ", " + "params=" + this.params + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ValidateEnableImageAccessForGroupSetSubsetWithGeneralParameters.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */