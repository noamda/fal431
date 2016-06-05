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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupSetSettings", propOrder={"setUID", "name", "groupsUIDs", "recoverySettings", "consistencyPolicy"})
/*     */ public class ConsistencyGroupSetSettings
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected ConsistencyGroupSetUID setUID;
/*     */   @XmlElement(required=true)
/*     */   protected String name;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupUID> groupsUIDs;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupSetRecoverySettings> recoverySettings;
/*     */   protected ConsistentGroupSetConsistencyPolicy consistencyPolicy;
/*     */   
/*     */   public ConsistencyGroupSetSettings() {}
/*     */   
/*     */   public ConsistencyGroupSetSettings(ConsistencyGroupSetUID setUID, String name, List<ConsistencyGroupUID> groupsUIDs, List<ConsistencyGroupSetRecoverySettings> recoverySettings, ConsistentGroupSetConsistencyPolicy consistencyPolicy)
/*     */   {
/*  63 */     this.setUID = setUID;
/*  64 */     this.name = name;
/*  65 */     this.groupsUIDs = groupsUIDs;
/*  66 */     this.recoverySettings = recoverySettings;
/*  67 */     this.consistencyPolicy = consistencyPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupSetUID getSetUID()
/*     */   {
/*  79 */     return this.setUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSetUID(ConsistencyGroupSetUID value)
/*     */   {
/*  91 */     this.setUID = value;
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
/* 103 */     return this.name;
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
/* 115 */     this.name = value;
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
/*     */   public List<ConsistencyGroupUID> getGroupsUIDs()
/*     */   {
/* 141 */     if (this.groupsUIDs == null) {
/* 142 */       this.groupsUIDs = new ArrayList();
/*     */     }
/* 144 */     return this.groupsUIDs;
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
/*     */   public List<ConsistencyGroupSetRecoverySettings> getRecoverySettings()
/*     */   {
/* 170 */     if (this.recoverySettings == null) {
/* 171 */       this.recoverySettings = new ArrayList();
/*     */     }
/* 173 */     return this.recoverySettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistentGroupSetConsistencyPolicy getConsistencyPolicy()
/*     */   {
/* 185 */     return this.consistencyPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setConsistencyPolicy(ConsistentGroupSetConsistencyPolicy value)
/*     */   {
/* 197 */     this.consistencyPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 207 */     if (!(obj instanceof ConsistencyGroupSetSettings)) {
/* 208 */       return false;
/*     */     }
/* 210 */     ConsistencyGroupSetSettings otherObj = (ConsistencyGroupSetSettings)obj;
/*     */     
/* 212 */     return (this.setUID != null ? this.setUID.equals(otherObj.setUID) : this.setUID == otherObj.setUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.groupsUIDs != null ? this.groupsUIDs.equals(otherObj.groupsUIDs) : this.groupsUIDs == otherObj.groupsUIDs) && (this.recoverySettings != null ? this.recoverySettings.equals(otherObj.recoverySettings) : this.recoverySettings == otherObj.recoverySettings) && (this.consistencyPolicy != null ? this.consistencyPolicy.equals(otherObj.consistencyPolicy) : this.consistencyPolicy == otherObj.consistencyPolicy);
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
/*     */   public int hashCode()
/*     */   {
/* 225 */     return (this.setUID != null ? this.setUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.groupsUIDs != null ? this.groupsUIDs.hashCode() : 0) ^ (this.recoverySettings != null ? this.recoverySettings.hashCode() : 0) ^ (this.consistencyPolicy != null ? this.consistencyPolicy.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 238 */     return "ConsistencyGroupSetSettings [setUID=" + this.setUID + ", " + "name=" + this.name + ", " + "groupsUIDs=" + this.groupsUIDs + ", " + "recoverySettings=" + this.recoverySettings + ", " + "consistencyPolicy=" + this.consistencyPolicy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupSetSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */