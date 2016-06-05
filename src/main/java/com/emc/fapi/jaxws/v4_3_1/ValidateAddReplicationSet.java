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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="validateAddReplicationSet", propOrder={"group", "replicationSetName"})
/*     */ public class ValidateAddReplicationSet
/*     */ {
/*     */   protected ConsistencyGroupUID group;
/*     */   protected String replicationSetName;
/*     */   
/*     */   public ValidateAddReplicationSet() {}
/*     */   
/*     */   public ValidateAddReplicationSet(ConsistencyGroupUID group, String replicationSetName)
/*     */   {
/*  47 */     this.group = group;
/*  48 */     this.replicationSetName = replicationSetName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupUID getGroup()
/*     */   {
/*  60 */     return this.group;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroup(ConsistencyGroupUID value)
/*     */   {
/*  72 */     this.group = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getReplicationSetName()
/*     */   {
/*  84 */     return this.replicationSetName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setReplicationSetName(String value)
/*     */   {
/*  96 */     this.replicationSetName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof ValidateAddReplicationSet)) {
/* 107 */       return false;
/*     */     }
/* 109 */     ValidateAddReplicationSet otherObj = (ValidateAddReplicationSet)obj;
/*     */     
/* 111 */     return (this.group != null ? this.group.equals(otherObj.group) : this.group == otherObj.group) && (this.replicationSetName != null ? this.replicationSetName.equals(otherObj.replicationSetName) : this.replicationSetName == otherObj.replicationSetName);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.group != null ? this.group.hashCode() : 0) ^ (this.replicationSetName != null ? this.replicationSetName.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "ValidateAddReplicationSet [group=" + this.group + ", " + "replicationSetName=" + this.replicationSetName + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ValidateAddReplicationSet.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */