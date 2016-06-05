/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ @XmlType(name="markGroupCopyVolumesAsDirty", propOrder={"groupCopy", "replicationSets"})
/*     */ public class MarkGroupCopyVolumesAsDirty
/*     */ {
/*     */   protected ConsistencyGroupCopyUID groupCopy;
/*     */   protected List<ReplicationSetUID> replicationSets;
/*     */   
/*     */   public MarkGroupCopyVolumesAsDirty() {}
/*     */   
/*     */   public MarkGroupCopyVolumesAsDirty(ConsistencyGroupCopyUID groupCopy, List<ReplicationSetUID> replicationSets)
/*     */   {
/*  49 */     this.groupCopy = groupCopy;
/*  50 */     this.replicationSets = replicationSets;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyUID getGroupCopy()
/*     */   {
/*  62 */     return this.groupCopy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupCopy(ConsistencyGroupCopyUID value)
/*     */   {
/*  74 */     this.groupCopy = value;
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
/* 100 */     if (this.replicationSets == null) {
/* 101 */       this.replicationSets = new ArrayList();
/*     */     }
/* 103 */     return this.replicationSets;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 113 */     if (!(obj instanceof MarkGroupCopyVolumesAsDirty)) {
/* 114 */       return false;
/*     */     }
/* 116 */     MarkGroupCopyVolumesAsDirty otherObj = (MarkGroupCopyVolumesAsDirty)obj;
/*     */     
/* 118 */     return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.replicationSets != null ? this.replicationSets.equals(otherObj.replicationSets) : this.replicationSets == otherObj.replicationSets);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 128 */     return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.replicationSets != null ? this.replicationSets.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 138 */     return "MarkGroupCopyVolumesAsDirty [groupCopy=" + this.groupCopy + ", " + "replicationSets=" + this.replicationSets + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\MarkGroupCopyVolumesAsDirty.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */