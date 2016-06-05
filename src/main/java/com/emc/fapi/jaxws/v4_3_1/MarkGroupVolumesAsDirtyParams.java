/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="markGroupVolumesAsDirtyParams", propOrder={"replicationSets"})
/*     */ public class MarkGroupVolumesAsDirtyParams
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ReplicationSetUID> replicationSets;
/*     */   
/*     */   public MarkGroupVolumesAsDirtyParams() {}
/*     */   
/*     */   public MarkGroupVolumesAsDirtyParams(List<ReplicationSetUID> replicationSets)
/*     */   {
/*  55 */     this.replicationSets = replicationSets;
/*     */   }
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
/*     */   public List<ReplicationSetUID> getReplicationSets()
/*     */   {
/*  81 */     if (this.replicationSets == null) {
/*  82 */       this.replicationSets = new ArrayList();
/*     */     }
/*  84 */     return this.replicationSets;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  94 */     if (!(obj instanceof MarkGroupVolumesAsDirtyParams)) {
/*  95 */       return false;
/*     */     }
/*  97 */     MarkGroupVolumesAsDirtyParams otherObj = (MarkGroupVolumesAsDirtyParams)obj;
/*     */     
/*  99 */     return this.replicationSets == otherObj.replicationSets ? true : this.replicationSets != null ? this.replicationSets.equals(otherObj.replicationSets) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 108 */     return this.replicationSets != null ? this.replicationSets.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 117 */     return "MarkGroupVolumesAsDirtyParams [replicationSets=" + this.replicationSets + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\MarkGroupVolumesAsDirtyParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */