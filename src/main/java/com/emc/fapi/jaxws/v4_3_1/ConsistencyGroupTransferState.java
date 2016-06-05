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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupTransferState", propOrder={"consistencyGroupUID", "transferState", "groupName", "sourceClusterName"})
/*     */ public class ConsistencyGroupTransferState
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected ConsistencyGroupUID consistencyGroupUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected TransferState transferState;
/*     */   protected String groupName;
/*     */   protected String sourceClusterName;
/*     */   
/*     */   public ConsistencyGroupTransferState() {}
/*     */   
/*     */   public ConsistencyGroupTransferState(ConsistencyGroupUID consistencyGroupUID, TransferState transferState, String groupName, String sourceClusterName)
/*     */   {
/*  56 */     this.consistencyGroupUID = consistencyGroupUID;
/*  57 */     this.transferState = transferState;
/*  58 */     this.groupName = groupName;
/*  59 */     this.sourceClusterName = sourceClusterName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupUID getConsistencyGroupUID()
/*     */   {
/*  71 */     return this.consistencyGroupUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setConsistencyGroupUID(ConsistencyGroupUID value)
/*     */   {
/*  83 */     this.consistencyGroupUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public TransferState getTransferState()
/*     */   {
/*  95 */     return this.transferState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTransferState(TransferState value)
/*     */   {
/* 107 */     this.transferState = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getGroupName()
/*     */   {
/* 119 */     return this.groupName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupName(String value)
/*     */   {
/* 131 */     this.groupName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getSourceClusterName()
/*     */   {
/* 143 */     return this.sourceClusterName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSourceClusterName(String value)
/*     */   {
/* 155 */     this.sourceClusterName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 165 */     if (!(obj instanceof ConsistencyGroupTransferState)) {
/* 166 */       return false;
/*     */     }
/* 168 */     ConsistencyGroupTransferState otherObj = (ConsistencyGroupTransferState)obj;
/*     */     
/* 170 */     return (this.consistencyGroupUID != null ? this.consistencyGroupUID.equals(otherObj.consistencyGroupUID) : this.consistencyGroupUID == otherObj.consistencyGroupUID) && (this.transferState != null ? this.transferState.equals(otherObj.transferState) : this.transferState == otherObj.transferState) && (this.groupName != null ? this.groupName.equals(otherObj.groupName) : this.groupName == otherObj.groupName) && (this.sourceClusterName != null ? this.sourceClusterName.equals(otherObj.sourceClusterName) : this.sourceClusterName == otherObj.sourceClusterName);
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
/* 182 */     return (this.consistencyGroupUID != null ? this.consistencyGroupUID.hashCode() : 0) ^ (this.transferState != null ? this.transferState.hashCode() : 0) ^ (this.groupName != null ? this.groupName.hashCode() : 0) ^ (this.sourceClusterName != null ? this.sourceClusterName.hashCode() : 0);
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
/* 194 */     return "ConsistencyGroupTransferState [consistencyGroupUID=" + this.consistencyGroupUID + ", " + "transferState=" + this.transferState + ", " + "groupName=" + this.groupName + ", " + "sourceClusterName=" + this.sourceClusterName + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupTransferState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */