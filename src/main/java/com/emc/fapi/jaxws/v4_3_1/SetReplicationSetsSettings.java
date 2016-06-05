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
/*     */ @XmlType(name="setReplicationSetsSettings", propOrder={"group", "replicationSetsChanges"})
/*     */ public class SetReplicationSetsSettings
/*     */ {
/*     */   protected ConsistencyGroupUID group;
/*     */   protected List<ReplicationSetSettingsChangesParam> replicationSetsChanges;
/*     */   
/*     */   public SetReplicationSetsSettings() {}
/*     */   
/*     */   public SetReplicationSetsSettings(ConsistencyGroupUID group, List<ReplicationSetSettingsChangesParam> replicationSetsChanges)
/*     */   {
/*  49 */     this.group = group;
/*  50 */     this.replicationSetsChanges = replicationSetsChanges;
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
/*     */   public List<ReplicationSetSettingsChangesParam> getReplicationSetsChanges()
/*     */   {
/* 100 */     if (this.replicationSetsChanges == null) {
/* 101 */       this.replicationSetsChanges = new ArrayList();
/*     */     }
/* 103 */     return this.replicationSetsChanges;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 113 */     if (!(obj instanceof SetReplicationSetsSettings)) {
/* 114 */       return false;
/*     */     }
/* 116 */     SetReplicationSetsSettings otherObj = (SetReplicationSetsSettings)obj;
/*     */     
/* 118 */     return (this.group != null ? this.group.equals(otherObj.group) : this.group == otherObj.group) && (this.replicationSetsChanges != null ? this.replicationSetsChanges.equals(otherObj.replicationSetsChanges) : this.replicationSetsChanges == otherObj.replicationSetsChanges);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 128 */     return (this.group != null ? this.group.hashCode() : 0) ^ (this.replicationSetsChanges != null ? this.replicationSetsChanges.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 138 */     return "SetReplicationSetsSettings [group=" + this.group + ", " + "replicationSetsChanges=" + this.replicationSetsChanges + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetReplicationSetsSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */