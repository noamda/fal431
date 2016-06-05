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
/*     */ @XmlType(name="validateResizeReplicationSet", propOrder={"replicationSet", "resizeReplicationSetParam"})
/*     */ public class ValidateResizeReplicationSet
/*     */ {
/*     */   protected ReplicationSetUID replicationSet;
/*     */   @XmlElement(nillable=true)
/*     */   protected ResizeReplicationSetParam resizeReplicationSetParam;
/*     */   
/*     */   public ValidateResizeReplicationSet() {}
/*     */   
/*     */   public ValidateResizeReplicationSet(ReplicationSetUID replicationSet, ResizeReplicationSetParam resizeReplicationSetParam)
/*     */   {
/*  49 */     this.replicationSet = replicationSet;
/*  50 */     this.resizeReplicationSetParam = resizeReplicationSetParam;
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
/*  62 */     return this.replicationSet;
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
/*  74 */     this.replicationSet = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ResizeReplicationSetParam getResizeReplicationSetParam()
/*     */   {
/*  86 */     return this.resizeReplicationSetParam;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setResizeReplicationSetParam(ResizeReplicationSetParam value)
/*     */   {
/*  98 */     this.resizeReplicationSetParam = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 108 */     if (!(obj instanceof ValidateResizeReplicationSet)) {
/* 109 */       return false;
/*     */     }
/* 111 */     ValidateResizeReplicationSet otherObj = (ValidateResizeReplicationSet)obj;
/*     */     
/* 113 */     return (this.replicationSet != null ? this.replicationSet.equals(otherObj.replicationSet) : this.replicationSet == otherObj.replicationSet) && (this.resizeReplicationSetParam != null ? this.resizeReplicationSetParam.equals(otherObj.resizeReplicationSetParam) : this.resizeReplicationSetParam == otherObj.resizeReplicationSetParam);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 123 */     return (this.replicationSet != null ? this.replicationSet.hashCode() : 0) ^ (this.resizeReplicationSetParam != null ? this.resizeReplicationSetParam.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 133 */     return "ValidateResizeReplicationSet [replicationSet=" + this.replicationSet + ", " + "resizeReplicationSetParam=" + this.resizeReplicationSetParam + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ValidateResizeReplicationSet.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */