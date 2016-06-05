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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="DistributedConsistencyGroupWithDefaultPolicyParams", propOrder={"groupName", "primaryRPA", "secondaryRPAsList"})
/*     */ public class DistributedConsistencyGroupWithDefaultPolicyParams
/*     */ {
/*     */   protected String groupName;
/*     */   protected RpaUID primaryRPA;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<RpaUID> secondaryRPAsList;
/*     */   
/*     */   public DistributedConsistencyGroupWithDefaultPolicyParams() {}
/*     */   
/*     */   public DistributedConsistencyGroupWithDefaultPolicyParams(String groupName, RpaUID primaryRPA, List<RpaUID> secondaryRPAsList)
/*     */   {
/*  61 */     this.groupName = groupName;
/*  62 */     this.primaryRPA = primaryRPA;
/*  63 */     this.secondaryRPAsList = secondaryRPAsList;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getGroupName()
/*     */   {
/*  75 */     return this.groupName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupName(String value)
/*     */   {
/*  87 */     this.groupName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RpaUID getPrimaryRPA()
/*     */   {
/*  99 */     return this.primaryRPA;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPrimaryRPA(RpaUID value)
/*     */   {
/* 111 */     this.primaryRPA = value;
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
/*     */   public List<RpaUID> getSecondaryRPAsList()
/*     */   {
/* 137 */     if (this.secondaryRPAsList == null) {
/* 138 */       this.secondaryRPAsList = new ArrayList();
/*     */     }
/* 140 */     return this.secondaryRPAsList;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 150 */     if (!(obj instanceof DistributedConsistencyGroupWithDefaultPolicyParams)) {
/* 151 */       return false;
/*     */     }
/* 153 */     DistributedConsistencyGroupWithDefaultPolicyParams otherObj = (DistributedConsistencyGroupWithDefaultPolicyParams)obj;
/*     */     
/* 155 */     return (this.groupName != null ? this.groupName.equals(otherObj.groupName) : this.groupName == otherObj.groupName) && (this.primaryRPA != null ? this.primaryRPA.equals(otherObj.primaryRPA) : this.primaryRPA == otherObj.primaryRPA) && (this.secondaryRPAsList != null ? this.secondaryRPAsList.equals(otherObj.secondaryRPAsList) : this.secondaryRPAsList == otherObj.secondaryRPAsList);
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
/* 166 */     return (this.groupName != null ? this.groupName.hashCode() : 0) ^ (this.primaryRPA != null ? this.primaryRPA.hashCode() : 0) ^ (this.secondaryRPAsList != null ? this.secondaryRPAsList.hashCode() : 0);
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
/* 177 */     return "DistributedConsistencyGroupWithDefaultPolicyParams [groupName=" + this.groupName + ", " + "primaryRPA=" + this.primaryRPA + ", " + "secondaryRPAsList=" + this.secondaryRPAsList + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\DistributedConsistencyGroupWithDefaultPolicyParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */