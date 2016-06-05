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
/*     */ @XmlType(name="markGroupVolumesAsDirty", propOrder={"group", "replicationSets"})
/*     */ public class MarkGroupVolumesAsDirty
/*     */ {
/*     */   protected ConsistencyGroupUID group;
/*     */   protected List<ReplicationSetUID> replicationSets;
/*     */   
/*     */   public MarkGroupVolumesAsDirty() {}
/*     */   
/*     */   public MarkGroupVolumesAsDirty(ConsistencyGroupUID group, List<ReplicationSetUID> replicationSets)
/*     */   {
/*  49 */     this.group = group;
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
/*     */   public ConsistencyGroupUID getGroup()
/*     */   {
/*  62 */     return this.group;
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
/*  74 */     this.group = value;
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
/* 113 */     if (!(obj instanceof MarkGroupVolumesAsDirty)) {
/* 114 */       return false;
/*     */     }
/* 116 */     MarkGroupVolumesAsDirty otherObj = (MarkGroupVolumesAsDirty)obj;
/*     */     
/* 118 */     return (this.group != null ? this.group.equals(otherObj.group) : this.group == otherObj.group) && (this.replicationSets != null ? this.replicationSets.equals(otherObj.replicationSets) : this.replicationSets == otherObj.replicationSets);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 128 */     return (this.group != null ? this.group.hashCode() : 0) ^ (this.replicationSets != null ? this.replicationSets.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 138 */     return "MarkGroupVolumesAsDirty [group=" + this.group + ", " + "replicationSets=" + this.replicationSets + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\MarkGroupVolumesAsDirty.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */