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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="addDistributedConsistencyGroupWithDefaultPolicy", propOrder={"groupName", "primaryRPA", "secondaryRPAsList"})
/*     */ public class AddDistributedConsistencyGroupWithDefaultPolicy
/*     */ {
/*     */   protected String groupName;
/*     */   protected RpaUID primaryRPA;
/*     */   protected List<RpaUID> secondaryRPAsList;
/*     */   
/*     */   public AddDistributedConsistencyGroupWithDefaultPolicy() {}
/*     */   
/*     */   public AddDistributedConsistencyGroupWithDefaultPolicy(String groupName, RpaUID primaryRPA, List<RpaUID> secondaryRPAsList)
/*     */   {
/*  52 */     this.groupName = groupName;
/*  53 */     this.primaryRPA = primaryRPA;
/*  54 */     this.secondaryRPAsList = secondaryRPAsList;
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
/*  66 */     return this.groupName;
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
/*  78 */     this.groupName = value;
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
/*  90 */     return this.primaryRPA;
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
/* 102 */     this.primaryRPA = value;
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
/* 128 */     if (this.secondaryRPAsList == null) {
/* 129 */       this.secondaryRPAsList = new ArrayList();
/*     */     }
/* 131 */     return this.secondaryRPAsList;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 141 */     if (!(obj instanceof AddDistributedConsistencyGroupWithDefaultPolicy)) {
/* 142 */       return false;
/*     */     }
/* 144 */     AddDistributedConsistencyGroupWithDefaultPolicy otherObj = (AddDistributedConsistencyGroupWithDefaultPolicy)obj;
/*     */     
/* 146 */     return (this.groupName != null ? this.groupName.equals(otherObj.groupName) : this.groupName == otherObj.groupName) && (this.primaryRPA != null ? this.primaryRPA.equals(otherObj.primaryRPA) : this.primaryRPA == otherObj.primaryRPA) && (this.secondaryRPAsList != null ? this.secondaryRPAsList.equals(otherObj.secondaryRPAsList) : this.secondaryRPAsList == otherObj.secondaryRPAsList);
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
/* 157 */     return (this.groupName != null ? this.groupName.hashCode() : 0) ^ (this.primaryRPA != null ? this.primaryRPA.hashCode() : 0) ^ (this.secondaryRPAsList != null ? this.secondaryRPAsList.hashCode() : 0);
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
/* 168 */     return "AddDistributedConsistencyGroupWithDefaultPolicy [groupName=" + this.groupName + ", " + "primaryRPA=" + this.primaryRPA + ", " + "secondaryRPAsList=" + this.secondaryRPAsList + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\AddDistributedConsistencyGroupWithDefaultPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */