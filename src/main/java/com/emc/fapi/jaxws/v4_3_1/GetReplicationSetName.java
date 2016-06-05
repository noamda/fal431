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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="getReplicationSetName", propOrder={"replicationSet"})
/*     */ public class GetReplicationSetName
/*     */ {
/*     */   protected ReplicationSetUID replicationSet;
/*     */   
/*     */   public GetReplicationSetName() {}
/*     */   
/*     */   public GetReplicationSetName(ReplicationSetUID replicationSet)
/*     */   {
/*  44 */     this.replicationSet = replicationSet;
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
/*  56 */     return this.replicationSet;
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
/*  68 */     this.replicationSet = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof GetReplicationSetName)) {
/*  79 */       return false;
/*     */     }
/*  81 */     GetReplicationSetName otherObj = (GetReplicationSetName)obj;
/*     */     
/*  83 */     return this.replicationSet == otherObj.replicationSet ? true : this.replicationSet != null ? this.replicationSet.equals(otherObj.replicationSet) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.replicationSet != null ? this.replicationSet.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "GetReplicationSetName [replicationSet=" + this.replicationSet + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetReplicationSetName.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */