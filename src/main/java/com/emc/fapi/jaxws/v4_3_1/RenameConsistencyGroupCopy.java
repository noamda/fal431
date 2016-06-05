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
/*     */ @XmlType(name="renameConsistencyGroupCopy", propOrder={"groupCopy", "newName"})
/*     */ public class RenameConsistencyGroupCopy
/*     */ {
/*     */   protected ConsistencyGroupCopyUID groupCopy;
/*     */   protected String newName;
/*     */   
/*     */   public RenameConsistencyGroupCopy() {}
/*     */   
/*     */   public RenameConsistencyGroupCopy(ConsistencyGroupCopyUID groupCopy, String newName)
/*     */   {
/*  47 */     this.groupCopy = groupCopy;
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
/*     */   public ConsistencyGroupCopyUID getGroupCopy()
/*     */   {
/*  60 */     return this.groupCopy;
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
/*  72 */     this.groupCopy = value;
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
/* 106 */     if (!(obj instanceof RenameConsistencyGroupCopy)) {
/* 107 */       return false;
/*     */     }
/* 109 */     RenameConsistencyGroupCopy otherObj = (RenameConsistencyGroupCopy)obj;
/*     */     
/* 111 */     return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.newName != null ? this.newName.equals(otherObj.newName) : this.newName == otherObj.newName);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.newName != null ? this.newName.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "RenameConsistencyGroupCopy [groupCopy=" + this.groupCopy + ", " + "newName=" + this.newName + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RenameConsistencyGroupCopy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */