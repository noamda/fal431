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
/*     */ @XmlType(name="validateSetProductionForGroupSetSubset", propOrder={"groupSetSubset", "clusterUID", "startTransfer"})
/*     */ public class ValidateSetProductionForGroupSetSubset
/*     */ {
/*     */   protected ConsistencyGroupSetSubset groupSetSubset;
/*     */   @XmlElement(nillable=true)
/*     */   protected ClusterUID clusterUID;
/*     */   protected boolean startTransfer;
/*     */   
/*     */   public ValidateSetProductionForGroupSetSubset() {}
/*     */   
/*     */   public ValidateSetProductionForGroupSetSubset(ConsistencyGroupSetSubset groupSetSubset, ClusterUID clusterUID, boolean startTransfer)
/*     */   {
/*  52 */     this.groupSetSubset = groupSetSubset;
/*  53 */     this.clusterUID = clusterUID;
/*  54 */     this.startTransfer = startTransfer;
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
/*     */   public boolean isStartTransfer()
/*     */   {
/* 110 */     return this.startTransfer;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setStartTransfer(boolean value)
/*     */   {
/* 118 */     this.startTransfer = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 128 */     if (!(obj instanceof ValidateSetProductionForGroupSetSubset)) {
/* 129 */       return false;
/*     */     }
/* 131 */     ValidateSetProductionForGroupSetSubset otherObj = (ValidateSetProductionForGroupSetSubset)obj;
/*     */     
/* 133 */     return (this.groupSetSubset != null ? this.groupSetSubset.equals(otherObj.groupSetSubset) : this.groupSetSubset == otherObj.groupSetSubset) && (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.startTransfer == otherObj.startTransfer);
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
/* 144 */     return (this.groupSetSubset != null ? this.groupSetSubset.hashCode() : 0) ^ (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.startTransfer ? 1 : 0);
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
/* 155 */     return "ValidateSetProductionForGroupSetSubset [groupSetSubset=" + this.groupSetSubset + ", " + "clusterUID=" + this.clusterUID + ", " + "startTransfer=" + this.startTransfer + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ValidateSetProductionForGroupSetSubset.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */