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
/*     */ @XmlType(name="renameReplicationSet", propOrder={"replicationSet", "newName"})
/*     */ public class RenameReplicationSet
/*     */ {
/*     */   protected ReplicationSetUID replicationSet;
/*     */   protected String newName;
/*     */   
/*     */   public RenameReplicationSet() {}
/*     */   
/*     */   public RenameReplicationSet(ReplicationSetUID replicationSet, String newName)
/*     */   {
/*  47 */     this.replicationSet = replicationSet;
/*  48 */     this.newName = newName;
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
/*  60 */     return this.replicationSet;
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
/*  72 */     this.replicationSet = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getNewName()
/*     */   {
/*  84 */     return this.newName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNewName(String value)
/*     */   {
/*  96 */     this.newName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof RenameReplicationSet)) {
/* 107 */       return false;
/*     */     }
/* 109 */     RenameReplicationSet otherObj = (RenameReplicationSet)obj;
/*     */     
/* 111 */     return (this.replicationSet != null ? this.replicationSet.equals(otherObj.replicationSet) : this.replicationSet == otherObj.replicationSet) && (this.newName != null ? this.newName.equals(otherObj.newName) : this.newName == otherObj.newName);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.replicationSet != null ? this.replicationSet.hashCode() : 0) ^ (this.newName != null ? this.newName.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "RenameReplicationSet [replicationSet=" + this.replicationSet + ", " + "newName=" + this.newName + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RenameReplicationSet.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */