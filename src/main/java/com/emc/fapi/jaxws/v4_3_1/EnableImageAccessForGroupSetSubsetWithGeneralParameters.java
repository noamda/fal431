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
/*     */ @XmlType(name="enableImageAccessForGroupSetSubsetWithGeneralParameters", propOrder={"groupSetSubset", "clusterUID", "params"})
/*     */ public class EnableImageAccessForGroupSetSubsetWithGeneralParameters
/*     */ {
/*     */   protected ConsistencyGroupSetSubset groupSetSubset;
/*     */   @XmlElement(nillable=true)
/*     */   protected ClusterUID clusterUID;
/*     */   protected ImageAccessGeneralParameters params;
/*     */   
/*     */   public EnableImageAccessForGroupSetSubsetWithGeneralParameters() {}
/*     */   
/*     */   public EnableImageAccessForGroupSetSubsetWithGeneralParameters(ConsistencyGroupSetSubset groupSetSubset, ClusterUID clusterUID, ImageAccessGeneralParameters params)
/*     */   {
/*  52 */     this.groupSetSubset = groupSetSubset;
/*  53 */     this.clusterUID = clusterUID;
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
/*     */   public ClusterUID getClusterUID()
/*     */   {
/*  90 */     return this.clusterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setClusterUID(ClusterUID value)
/*     */   {
/* 102 */     this.clusterUID = value;
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
/* 136 */     if (!(obj instanceof EnableImageAccessForGroupSetSubsetWithGeneralParameters)) {
/* 137 */       return false;
/*     */     }
/* 139 */     EnableImageAccessForGroupSetSubsetWithGeneralParameters otherObj = (EnableImageAccessForGroupSetSubsetWithGeneralParameters)obj;
/*     */     
/* 141 */     return (this.groupSetSubset != null ? this.groupSetSubset.equals(otherObj.groupSetSubset) : this.groupSetSubset == otherObj.groupSetSubset) && (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.params != null ? this.params.equals(otherObj.params) : this.params == otherObj.params);
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
/* 152 */     return (this.groupSetSubset != null ? this.groupSetSubset.hashCode() : 0) ^ (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.params != null ? this.params.hashCode() : 0);
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
/* 163 */     return "EnableImageAccessForGroupSetSubsetWithGeneralParameters [groupSetSubset=" + this.groupSetSubset + ", " + "clusterUID=" + this.clusterUID + ", " + "params=" + this.params + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\EnableImageAccessForGroupSetSubsetWithGeneralParameters.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */