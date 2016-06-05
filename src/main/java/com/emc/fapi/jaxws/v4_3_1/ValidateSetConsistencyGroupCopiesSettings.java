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
/*     */ @XmlType(name="validateSetConsistencyGroupCopiesSettings", propOrder={"group", "copiesChanges"})
/*     */ public class ValidateSetConsistencyGroupCopiesSettings
/*     */ {
/*     */   protected ConsistencyGroupUID group;
/*     */   protected List<ConsistencyGroupCopySettingsChangesParam> copiesChanges;
/*     */   
/*     */   public ValidateSetConsistencyGroupCopiesSettings() {}
/*     */   
/*     */   public ValidateSetConsistencyGroupCopiesSettings(ConsistencyGroupUID group, List<ConsistencyGroupCopySettingsChangesParam> copiesChanges)
/*     */   {
/*  49 */     this.group = group;
/*  50 */     this.copiesChanges = copiesChanges;
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
/*     */   public List<ConsistencyGroupCopySettingsChangesParam> getCopiesChanges()
/*     */   {
/* 100 */     if (this.copiesChanges == null) {
/* 101 */       this.copiesChanges = new ArrayList();
/*     */     }
/* 103 */     return this.copiesChanges;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 113 */     if (!(obj instanceof ValidateSetConsistencyGroupCopiesSettings)) {
/* 114 */       return false;
/*     */     }
/* 116 */     ValidateSetConsistencyGroupCopiesSettings otherObj = (ValidateSetConsistencyGroupCopiesSettings)obj;
/*     */     
/* 118 */     return (this.group != null ? this.group.equals(otherObj.group) : this.group == otherObj.group) && (this.copiesChanges != null ? this.copiesChanges.equals(otherObj.copiesChanges) : this.copiesChanges == otherObj.copiesChanges);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 128 */     return (this.group != null ? this.group.hashCode() : 0) ^ (this.copiesChanges != null ? this.copiesChanges.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 138 */     return "ValidateSetConsistencyGroupCopiesSettings [group=" + this.group + ", " + "copiesChanges=" + this.copiesChanges + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ValidateSetConsistencyGroupCopiesSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */