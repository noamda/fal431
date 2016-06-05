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
/*     */ @XmlType(name="FullConsistencyGroupCopyPolicy", propOrder={"copyUID", "copyName", "copyPolicy"})
/*     */ public class FullConsistencyGroupCopyPolicy
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected ConsistencyGroupCopyUID copyUID;
/*     */   @XmlElement(required=true)
/*     */   protected String copyName;
/*     */   @XmlElement(required=true)
/*     */   protected ConsistencyGroupCopyPolicy copyPolicy;
/*     */   
/*     */   public FullConsistencyGroupCopyPolicy() {}
/*     */   
/*     */   public FullConsistencyGroupCopyPolicy(ConsistencyGroupCopyUID copyUID, String copyName, ConsistencyGroupCopyPolicy copyPolicy)
/*     */   {
/*  54 */     this.copyUID = copyUID;
/*  55 */     this.copyName = copyName;
/*  56 */     this.copyPolicy = copyPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyUID getCopyUID()
/*     */   {
/*  68 */     return this.copyUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCopyUID(ConsistencyGroupCopyUID value)
/*     */   {
/*  80 */     this.copyUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getCopyName()
/*     */   {
/*  92 */     return this.copyName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCopyName(String value)
/*     */   {
/* 104 */     this.copyName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyPolicy getCopyPolicy()
/*     */   {
/* 116 */     return this.copyPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCopyPolicy(ConsistencyGroupCopyPolicy value)
/*     */   {
/* 128 */     this.copyPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 138 */     if (!(obj instanceof FullConsistencyGroupCopyPolicy)) {
/* 139 */       return false;
/*     */     }
/* 141 */     FullConsistencyGroupCopyPolicy otherObj = (FullConsistencyGroupCopyPolicy)obj;
/*     */     
/* 143 */     return (this.copyUID != null ? this.copyUID.equals(otherObj.copyUID) : this.copyUID == otherObj.copyUID) && (this.copyName != null ? this.copyName.equals(otherObj.copyName) : this.copyName == otherObj.copyName) && (this.copyPolicy != null ? this.copyPolicy.equals(otherObj.copyPolicy) : this.copyPolicy == otherObj.copyPolicy);
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
/* 154 */     return (this.copyUID != null ? this.copyUID.hashCode() : 0) ^ (this.copyName != null ? this.copyName.hashCode() : 0) ^ (this.copyPolicy != null ? this.copyPolicy.hashCode() : 0);
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
/* 165 */     return "FullConsistencyGroupCopyPolicy [copyUID=" + this.copyUID + ", " + "copyName=" + this.copyName + ", " + "copyPolicy=" + this.copyPolicy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\FullConsistencyGroupCopyPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */