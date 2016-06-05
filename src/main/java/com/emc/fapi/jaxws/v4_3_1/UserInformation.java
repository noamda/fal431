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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="UserInformation", propOrder={"groups", "logsFilter", "permissions", "roleName"})
/*     */ public class UserInformation
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupUID> groups;
/*     */   protected UserEventLogsFilter logsFilter;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<Permission> permissions;
/*     */   protected String roleName;
/*     */   
/*     */   public UserInformation() {}
/*     */   
/*     */   public UserInformation(List<ConsistencyGroupUID> groups, UserEventLogsFilter logsFilter, List<Permission> permissions, String roleName)
/*     */   {
/*  58 */     this.groups = groups;
/*  59 */     this.logsFilter = logsFilter;
/*  60 */     this.permissions = permissions;
/*  61 */     this.roleName = roleName;
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
/*     */   public List<ConsistencyGroupUID> getGroups()
/*     */   {
/*  87 */     if (this.groups == null) {
/*  88 */       this.groups = new ArrayList();
/*     */     }
/*  90 */     return this.groups;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public UserEventLogsFilter getLogsFilter()
/*     */   {
/* 102 */     return this.logsFilter;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLogsFilter(UserEventLogsFilter value)
/*     */   {
/* 114 */     this.logsFilter = value;
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
/*     */   public List<Permission> getPermissions()
/*     */   {
/* 140 */     if (this.permissions == null) {
/* 141 */       this.permissions = new ArrayList();
/*     */     }
/* 143 */     return this.permissions;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getRoleName()
/*     */   {
/* 155 */     return this.roleName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRoleName(String value)
/*     */   {
/* 167 */     this.roleName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 177 */     if (!(obj instanceof UserInformation)) {
/* 178 */       return false;
/*     */     }
/* 180 */     UserInformation otherObj = (UserInformation)obj;
/*     */     
/* 182 */     return (this.groups != null ? this.groups.equals(otherObj.groups) : this.groups == otherObj.groups) && (this.logsFilter != null ? this.logsFilter.equals(otherObj.logsFilter) : this.logsFilter == otherObj.logsFilter) && (this.permissions != null ? this.permissions.equals(otherObj.permissions) : this.permissions == otherObj.permissions) && (this.roleName != null ? this.roleName.equals(otherObj.roleName) : this.roleName == otherObj.roleName);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 194 */     return (this.groups != null ? this.groups.hashCode() : 0) ^ (this.logsFilter != null ? this.logsFilter.hashCode() : 0) ^ (this.permissions != null ? this.permissions.hashCode() : 0) ^ (this.roleName != null ? this.roleName.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 206 */     return "UserInformation [groups=" + this.groups + ", " + "logsFilter=" + this.logsFilter + ", " + "permissions=" + this.permissions + ", " + "roleName=" + this.roleName + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\UserInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */