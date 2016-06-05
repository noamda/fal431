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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="setBookmarkConsistencyType", propOrder={"groupCopy", "snapshot", "consistencyType"})
/*     */ public class SetBookmarkConsistencyType
/*     */ {
/*     */   protected ConsistencyGroupCopyUID groupCopy;
/*     */   @XmlElement(nillable=true)
/*     */   protected Snapshot snapshot;
/*     */   protected SnapshotConsistencyType consistencyType;
/*     */   
/*     */   public SetBookmarkConsistencyType() {}
/*     */   
/*     */   public SetBookmarkConsistencyType(ConsistencyGroupCopyUID groupCopy, Snapshot snapshot, SnapshotConsistencyType consistencyType)
/*     */   {
/*  52 */     this.groupCopy = groupCopy;
/*  53 */     this.snapshot = snapshot;
/*  54 */     this.consistencyType = consistencyType;
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
/*  66 */     return this.groupCopy;
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
/*  78 */     this.groupCopy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Snapshot getSnapshot()
/*     */   {
/*  90 */     return this.snapshot;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSnapshot(Snapshot value)
/*     */   {
/* 102 */     this.snapshot = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SnapshotConsistencyType getConsistencyType()
/*     */   {
/* 114 */     return this.consistencyType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setConsistencyType(SnapshotConsistencyType value)
/*     */   {
/* 126 */     this.consistencyType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 136 */     if (!(obj instanceof SetBookmarkConsistencyType)) {
/* 137 */       return false;
/*     */     }
/* 139 */     SetBookmarkConsistencyType otherObj = (SetBookmarkConsistencyType)obj;
/*     */     
/* 141 */     return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.snapshot != null ? this.snapshot.equals(otherObj.snapshot) : this.snapshot == otherObj.snapshot) && (this.consistencyType != null ? this.consistencyType.equals(otherObj.consistencyType) : this.consistencyType == otherObj.consistencyType);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 152 */     return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.snapshot != null ? this.snapshot.hashCode() : 0) ^ (this.consistencyType != null ? this.consistencyType.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 163 */     return "SetBookmarkConsistencyType [groupCopy=" + this.groupCopy + ", " + "snapshot=" + this.snapshot + ", " + "consistencyType=" + this.consistencyType + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetBookmarkConsistencyType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */