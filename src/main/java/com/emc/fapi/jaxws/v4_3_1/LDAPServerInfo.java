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
/*     */ @XmlType(name="LDAPServerInfo", propOrder={"groupsNames", "usersNames"})
/*     */ public class LDAPServerInfo
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<String> groupsNames;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<String> usersNames;
/*     */   
/*     */   public LDAPServerInfo() {}
/*     */   
/*     */   public LDAPServerInfo(List<String> groupsNames, List<String> usersNames)
/*     */   {
/*  52 */     this.groupsNames = groupsNames;
/*  53 */     this.usersNames = usersNames;
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
/*     */   public List<String> getGroupsNames()
/*     */   {
/*  79 */     if (this.groupsNames == null) {
/*  80 */       this.groupsNames = new ArrayList();
/*     */     }
/*  82 */     return this.groupsNames;
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
/*     */   public List<String> getUsersNames()
/*     */   {
/* 108 */     if (this.usersNames == null) {
/* 109 */       this.usersNames = new ArrayList();
/*     */     }
/* 111 */     return this.usersNames;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 121 */     if (!(obj instanceof LDAPServerInfo)) {
/* 122 */       return false;
/*     */     }
/* 124 */     LDAPServerInfo otherObj = (LDAPServerInfo)obj;
/*     */     
/* 126 */     return (this.groupsNames != null ? this.groupsNames.equals(otherObj.groupsNames) : this.groupsNames == otherObj.groupsNames) && (this.usersNames != null ? this.usersNames.equals(otherObj.usersNames) : this.usersNames == otherObj.usersNames);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 136 */     return (this.groupsNames != null ? this.groupsNames.hashCode() : 0) ^ (this.usersNames != null ? this.usersNames.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 146 */     return "LDAPServerInfo [groupsNames=" + this.groupsNames + ", " + "usersNames=" + this.usersNames + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\LDAPServerInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */