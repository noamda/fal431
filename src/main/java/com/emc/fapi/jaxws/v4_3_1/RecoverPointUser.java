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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="RecoverPointUser", propOrder={"userType", "name", "password", "roleName", "groups", "logsFilter"})
/*     */ public class RecoverPointUser
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected RecoverPointUserType userType;
/*     */   @XmlElement(required=true)
/*     */   protected String name;
/*     */   protected byte[] password;
/*     */   @XmlElement(required=true)
/*     */   protected String roleName;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupUID> groups;
/*     */   protected UserEventLogsFilter logsFilter;
/*     */   
/*     */   public RecoverPointUser() {}
/*     */   
/*     */   public RecoverPointUser(RecoverPointUserType userType, String name, byte[] password, String roleName, List<ConsistencyGroupUID> groups, UserEventLogsFilter logsFilter)
/*     */   {
/*  66 */     this.userType = userType;
/*  67 */     this.name = name;
/*  68 */     this.password = password;
/*  69 */     this.roleName = roleName;
/*  70 */     this.groups = groups;
/*  71 */     this.logsFilter = logsFilter;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RecoverPointUserType getUserType()
/*     */   {
/*  83 */     return this.userType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUserType(RecoverPointUserType value)
/*     */   {
/*  95 */     this.userType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getName()
/*     */   {
/* 107 */     return this.name;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setName(String value)
/*     */   {
/* 119 */     this.name = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public byte[] getPassword()
/*     */   {
/* 130 */     return this.password;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPassword(byte[] value)
/*     */   {
/* 141 */     this.password = value;
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
/* 153 */     return this.roleName;
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
/* 165 */     this.roleName = value;
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
/* 191 */     if (this.groups == null) {
/* 192 */       this.groups = new ArrayList();
/*     */     }
/* 194 */     return this.groups;
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
/* 206 */     return this.logsFilter;
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
/* 218 */     this.logsFilter = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 228 */     if (!(obj instanceof RecoverPointUser)) {
/* 229 */       return false;
/*     */     }
/* 231 */     RecoverPointUser otherObj = (RecoverPointUser)obj;
/*     */     
/* 233 */     return (this.userType != null ? this.userType.equals(otherObj.userType) : this.userType == otherObj.userType) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.password != null ? this.password.equals(otherObj.password) : this.password == otherObj.password) && (this.roleName != null ? this.roleName.equals(otherObj.roleName) : this.roleName == otherObj.roleName) && (this.groups != null ? this.groups.equals(otherObj.groups) : this.groups == otherObj.groups) && (this.logsFilter != null ? this.logsFilter.equals(otherObj.logsFilter) : this.logsFilter == otherObj.logsFilter);
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
/*     */   public int hashCode()
/*     */   {
/* 247 */     return (this.userType != null ? this.userType.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.password != null ? this.password.hashCode() : 0) ^ (this.roleName != null ? this.roleName.hashCode() : 0) ^ (this.groups != null ? this.groups.hashCode() : 0) ^ (this.logsFilter != null ? this.logsFilter.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 261 */     return "RecoverPointUser [userType=" + this.userType + ", " + "name=" + this.name + ", " + "password=" + this.password + ", " + "roleName=" + this.roleName + ", " + "groups=" + this.groups + ", " + "logsFilter=" + this.logsFilter + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RecoverPointUser.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */