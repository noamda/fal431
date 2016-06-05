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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupSnapshots", propOrder={"copiesSnapshots", "groupUID"})
/*     */ public class ConsistencyGroupSnapshots
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupCopySnapshots> copiesSnapshots;
/*     */   protected ConsistencyGroupUID groupUID;
/*     */   
/*     */   public ConsistencyGroupSnapshots() {}
/*     */   
/*     */   public ConsistencyGroupSnapshots(List<ConsistencyGroupCopySnapshots> copiesSnapshots, ConsistencyGroupUID groupUID)
/*     */   {
/*  51 */     this.copiesSnapshots = copiesSnapshots;
/*  52 */     this.groupUID = groupUID;
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
/*     */   public List<ConsistencyGroupCopySnapshots> getCopiesSnapshots()
/*     */   {
/*  78 */     if (this.copiesSnapshots == null) {
/*  79 */       this.copiesSnapshots = new ArrayList();
/*     */     }
/*  81 */     return this.copiesSnapshots;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupUID getGroupUID()
/*     */   {
/*  93 */     return this.groupUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupUID(ConsistencyGroupUID value)
/*     */   {
/* 105 */     this.groupUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 115 */     if (!(obj instanceof ConsistencyGroupSnapshots)) {
/* 116 */       return false;
/*     */     }
/* 118 */     ConsistencyGroupSnapshots otherObj = (ConsistencyGroupSnapshots)obj;
/*     */     
/* 120 */     return (this.copiesSnapshots != null ? this.copiesSnapshots.equals(otherObj.copiesSnapshots) : this.copiesSnapshots == otherObj.copiesSnapshots) && (this.groupUID != null ? this.groupUID.equals(otherObj.groupUID) : this.groupUID == otherObj.groupUID);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 130 */     return (this.copiesSnapshots != null ? this.copiesSnapshots.hashCode() : 0) ^ (this.groupUID != null ? this.groupUID.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 140 */     return "ConsistencyGroupSnapshots [copiesSnapshots=" + this.copiesSnapshots + ", " + "groupUID=" + this.groupUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupSnapshots.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */