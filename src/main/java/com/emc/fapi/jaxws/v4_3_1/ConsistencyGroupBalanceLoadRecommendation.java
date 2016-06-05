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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupBalanceLoadRecommendation", propOrder={"groupUID", "primaryRPANumber", "secondaryRPAsNumbers"})
/*     */ public class ConsistencyGroupBalanceLoadRecommendation
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected ConsistencyGroupUID groupUID;
/*     */   protected int primaryRPANumber;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<Integer> secondaryRPAsNumbers;
/*     */   
/*     */   public ConsistencyGroupBalanceLoadRecommendation() {}
/*     */   
/*     */   public ConsistencyGroupBalanceLoadRecommendation(ConsistencyGroupUID groupUID, int primaryRPANumber, List<Integer> secondaryRPAsNumbers)
/*     */   {
/*  55 */     this.groupUID = groupUID;
/*  56 */     this.primaryRPANumber = primaryRPANumber;
/*  57 */     this.secondaryRPAsNumbers = secondaryRPAsNumbers;
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
/*  69 */     return this.groupUID;
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
/*  81 */     this.groupUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getPrimaryRPANumber()
/*     */   {
/*  89 */     return this.primaryRPANumber;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPrimaryRPANumber(int value)
/*     */   {
/*  97 */     this.primaryRPANumber = value;
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
/*     */   public List<Integer> getSecondaryRPAsNumbers()
/*     */   {
/* 123 */     if (this.secondaryRPAsNumbers == null) {
/* 124 */       this.secondaryRPAsNumbers = new ArrayList();
/*     */     }
/* 126 */     return this.secondaryRPAsNumbers;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 136 */     if (!(obj instanceof ConsistencyGroupBalanceLoadRecommendation)) {
/* 137 */       return false;
/*     */     }
/* 139 */     ConsistencyGroupBalanceLoadRecommendation otherObj = (ConsistencyGroupBalanceLoadRecommendation)obj;
/*     */     
/* 141 */     return (this.groupUID != null ? this.groupUID.equals(otherObj.groupUID) : this.groupUID == otherObj.groupUID) && (this.primaryRPANumber == otherObj.primaryRPANumber) && (this.secondaryRPAsNumbers != null ? this.secondaryRPAsNumbers.equals(otherObj.secondaryRPAsNumbers) : this.secondaryRPAsNumbers == otherObj.secondaryRPAsNumbers);
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
/* 152 */     return (this.groupUID != null ? this.groupUID.hashCode() : 0) ^ this.primaryRPANumber ^ (this.secondaryRPAsNumbers != null ? this.secondaryRPAsNumbers.hashCode() : 0);
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
/* 163 */     return "ConsistencyGroupBalanceLoadRecommendation [groupUID=" + this.groupUID + ", " + "primaryRPANumber=" + this.primaryRPANumber + ", " + "secondaryRPAsNumbers=" + this.secondaryRPAsNumbers + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupBalanceLoadRecommendation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */