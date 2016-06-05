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
/*     */ @XmlType(name="ConsistencyGroupInfo", propOrder={"groupName", "groupUID"})
/*     */ public class ConsistencyGroupInfo
/*     */ {
/*     */   protected String groupName;
/*     */   protected ConsistencyGroupUID groupUID;
/*     */   
/*     */   public ConsistencyGroupInfo() {}
/*     */   
/*     */   public ConsistencyGroupInfo(String groupName, ConsistencyGroupUID groupUID)
/*     */   {
/*  47 */     this.groupName = groupName;
/*  48 */     this.groupUID = groupUID;
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
/*  60 */     return this.groupName;
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
/*  72 */     this.groupName = value;
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
/*  84 */     return this.groupUID;
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
/*  96 */     this.groupUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof ConsistencyGroupInfo)) {
/* 107 */       return false;
/*     */     }
/* 109 */     ConsistencyGroupInfo otherObj = (ConsistencyGroupInfo)obj;
/*     */     
/* 111 */     return (this.groupName != null ? this.groupName.equals(otherObj.groupName) : this.groupName == otherObj.groupName) && (this.groupUID != null ? this.groupUID.equals(otherObj.groupUID) : this.groupUID == otherObj.groupUID);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.groupName != null ? this.groupName.hashCode() : 0) ^ (this.groupUID != null ? this.groupUID.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "ConsistencyGroupInfo [groupName=" + this.groupName + ", " + "groupUID=" + this.groupUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */