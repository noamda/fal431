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
/*     */ @XmlType(name="ConsistencyGroupLinkUID", propOrder={"groupUID", "firstCopy", "secondCopy"})
/*     */ public class ConsistencyGroupLinkUID
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected ConsistencyGroupUID groupUID;
/*     */   @XmlElement(required=true)
/*     */   protected GlobalCopyUID firstCopy;
/*     */   @XmlElement(required=true)
/*     */   protected GlobalCopyUID secondCopy;
/*     */   
/*     */   public ConsistencyGroupLinkUID() {}
/*     */   
/*     */   public ConsistencyGroupLinkUID(ConsistencyGroupUID groupUID, GlobalCopyUID firstCopy, GlobalCopyUID secondCopy)
/*     */   {
/*  54 */     this.groupUID = groupUID;
/*  55 */     this.firstCopy = firstCopy;
/*  56 */     this.secondCopy = secondCopy;
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
/*  68 */     return this.groupUID;
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
/*  80 */     this.groupUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public GlobalCopyUID getFirstCopy()
/*     */   {
/*  92 */     return this.firstCopy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFirstCopy(GlobalCopyUID value)
/*     */   {
/* 104 */     this.firstCopy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public GlobalCopyUID getSecondCopy()
/*     */   {
/* 116 */     return this.secondCopy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSecondCopy(GlobalCopyUID value)
/*     */   {
/* 128 */     this.secondCopy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 138 */     if (!(obj instanceof ConsistencyGroupLinkUID)) {
/* 139 */       return false;
/*     */     }
/* 141 */     ConsistencyGroupLinkUID otherObj = (ConsistencyGroupLinkUID)obj;
/*     */     
/* 143 */     return (this.groupUID != null ? this.groupUID.equals(otherObj.groupUID) : this.groupUID == otherObj.groupUID) && (this.firstCopy != null ? this.firstCopy.equals(otherObj.firstCopy) : this.firstCopy == otherObj.firstCopy) && (this.secondCopy != null ? this.secondCopy.equals(otherObj.secondCopy) : this.secondCopy == otherObj.secondCopy);
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
/* 154 */     return (this.groupUID != null ? this.groupUID.hashCode() : 0) ^ (this.firstCopy != null ? this.firstCopy.hashCode() : 0) ^ (this.secondCopy != null ? this.secondCopy.hashCode() : 0);
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
/* 165 */     return "ConsistencyGroupLinkUID [groupUID=" + this.groupUID + ", " + "firstCopy=" + this.firstCopy + ", " + "secondCopy=" + this.secondCopy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupLinkUID.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */