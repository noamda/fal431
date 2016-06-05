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
/*     */ @XmlType(name="removeReplicationSet", propOrder={"group", "replicationSet"})
/*     */ public class RemoveReplicationSet
/*     */ {
/*     */   protected ConsistencyGroupUID group;
/*     */   protected ReplicationSetUID replicationSet;
/*     */   
/*     */   public RemoveReplicationSet() {}
/*     */   
/*     */   public RemoveReplicationSet(ConsistencyGroupUID group, ReplicationSetUID replicationSet)
/*     */   {
/*  47 */     this.group = group;
/*  48 */     this.replicationSet = replicationSet;
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
/*     */   public ReplicationSetUID getReplicationSet()
/*     */   {
/*  84 */     return this.replicationSet;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setReplicationSet(ReplicationSetUID value)
/*     */   {
/*  96 */     this.replicationSet = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof RemoveReplicationSet)) {
/* 107 */       return false;
/*     */     }
/* 109 */     RemoveReplicationSet otherObj = (RemoveReplicationSet)obj;
/*     */     
/* 111 */     return (this.group != null ? this.group.equals(otherObj.group) : this.group == otherObj.group) && (this.replicationSet != null ? this.replicationSet.equals(otherObj.replicationSet) : this.replicationSet == otherObj.replicationSet);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.group != null ? this.group.hashCode() : 0) ^ (this.replicationSet != null ? this.replicationSet.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "RemoveReplicationSet [group=" + this.group + ", " + "replicationSet=" + this.replicationSet + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RemoveReplicationSet.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */