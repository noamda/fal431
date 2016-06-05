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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ReplicationSetInfo", propOrder={"replicationSetUID", "replicationSetName"})
/*     */ public class ReplicationSetInfo
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected ReplicationSetUID replicationSetUID;
/*     */   protected String replicationSetName;
/*     */   
/*     */   public ReplicationSetInfo() {}
/*     */   
/*     */   public ReplicationSetInfo(ReplicationSetUID replicationSetUID, String replicationSetName)
/*     */   {
/*  49 */     this.replicationSetUID = replicationSetUID;
/*  50 */     this.replicationSetName = replicationSetName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ReplicationSetUID getReplicationSetUID()
/*     */   {
/*  62 */     return this.replicationSetUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setReplicationSetUID(ReplicationSetUID value)
/*     */   {
/*  74 */     this.replicationSetUID = value;
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
/*  86 */     return this.replicationSetName;
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
/*  98 */     this.replicationSetName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 108 */     if (!(obj instanceof ReplicationSetInfo)) {
/* 109 */       return false;
/*     */     }
/* 111 */     ReplicationSetInfo otherObj = (ReplicationSetInfo)obj;
/*     */     
/* 113 */     return (this.replicationSetUID != null ? this.replicationSetUID.equals(otherObj.replicationSetUID) : this.replicationSetUID == otherObj.replicationSetUID) && (this.replicationSetName != null ? this.replicationSetName.equals(otherObj.replicationSetName) : this.replicationSetName == otherObj.replicationSetName);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 123 */     return (this.replicationSetUID != null ? this.replicationSetUID.hashCode() : 0) ^ (this.replicationSetName != null ? this.replicationSetName.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 133 */     return "ReplicationSetInfo [replicationSetUID=" + this.replicationSetUID + ", " + "replicationSetName=" + this.replicationSetName + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ReplicationSetInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */