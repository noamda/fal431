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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupCopySettings", propOrder={"copyUID", "name", "enabled", "policy", "roleInfo", "imageAccessInformation", "journal", "hasPhoenixDevices", "groupCopySplitters"})
/*     */ public class ConsistencyGroupCopySettings
/*     */ {
/*     */   protected ConsistencyGroupCopyUID copyUID;
/*     */   protected String name;
/*     */   protected boolean enabled;
/*     */   protected ConsistencyGroupCopyPolicy policy;
/*     */   protected ConsistencyGroupCopyRoleInfo roleInfo;
/*     */   @XmlElement(nillable=true)
/*     */   protected ImageAccessInformation imageAccessInformation;
/*     */   protected ConsistencyGroupCopyJournal journal;
/*     */   protected boolean hasPhoenixDevices;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<SplitterUID> groupCopySplitters;
/*     */   
/*     */   public ConsistencyGroupCopySettings() {}
/*     */   
/*     */   public ConsistencyGroupCopySettings(ConsistencyGroupCopyUID copyUID, String name, boolean enabled, ConsistencyGroupCopyPolicy policy, ConsistencyGroupCopyRoleInfo roleInfo, ImageAccessInformation imageAccessInformation, ConsistencyGroupCopyJournal journal, boolean hasPhoenixDevices, List<SplitterUID> groupCopySplitters)
/*     */   {
/*  73 */     this.copyUID = copyUID;
/*  74 */     this.name = name;
/*  75 */     this.enabled = enabled;
/*  76 */     this.policy = policy;
/*  77 */     this.roleInfo = roleInfo;
/*  78 */     this.imageAccessInformation = imageAccessInformation;
/*  79 */     this.journal = journal;
/*  80 */     this.hasPhoenixDevices = hasPhoenixDevices;
/*  81 */     this.groupCopySplitters = groupCopySplitters;
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
/*  93 */     return this.copyUID;
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
/* 105 */     this.copyUID = value;
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
/* 117 */     return this.name;
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
/* 129 */     this.name = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isEnabled()
/*     */   {
/* 137 */     return this.enabled;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEnabled(boolean value)
/*     */   {
/* 145 */     this.enabled = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyPolicy getPolicy()
/*     */   {
/* 157 */     return this.policy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPolicy(ConsistencyGroupCopyPolicy value)
/*     */   {
/* 169 */     this.policy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyRoleInfo getRoleInfo()
/*     */   {
/* 181 */     return this.roleInfo;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRoleInfo(ConsistencyGroupCopyRoleInfo value)
/*     */   {
/* 193 */     this.roleInfo = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ImageAccessInformation getImageAccessInformation()
/*     */   {
/* 205 */     return this.imageAccessInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setImageAccessInformation(ImageAccessInformation value)
/*     */   {
/* 217 */     this.imageAccessInformation = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyJournal getJournal()
/*     */   {
/* 229 */     return this.journal;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setJournal(ConsistencyGroupCopyJournal value)
/*     */   {
/* 241 */     this.journal = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isHasPhoenixDevices()
/*     */   {
/* 249 */     return this.hasPhoenixDevices;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setHasPhoenixDevices(boolean value)
/*     */   {
/* 257 */     this.hasPhoenixDevices = value;
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
/*     */   public List<SplitterUID> getGroupCopySplitters()
/*     */   {
/* 283 */     if (this.groupCopySplitters == null) {
/* 284 */       this.groupCopySplitters = new ArrayList();
/*     */     }
/* 286 */     return this.groupCopySplitters;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 296 */     if (!(obj instanceof ConsistencyGroupCopySettings)) {
/* 297 */       return false;
/*     */     }
/* 299 */     ConsistencyGroupCopySettings otherObj = (ConsistencyGroupCopySettings)obj;
/*     */     
/* 301 */     return (this.copyUID != null ? this.copyUID.equals(otherObj.copyUID) : this.copyUID == otherObj.copyUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.enabled == otherObj.enabled) && (this.policy != null ? this.policy.equals(otherObj.policy) : this.policy == otherObj.policy) && (this.roleInfo != null ? this.roleInfo.equals(otherObj.roleInfo) : this.roleInfo == otherObj.roleInfo) && (this.imageAccessInformation != null ? this.imageAccessInformation.equals(otherObj.imageAccessInformation) : this.imageAccessInformation == otherObj.imageAccessInformation) && (this.journal != null ? this.journal.equals(otherObj.journal) : this.journal == otherObj.journal) && (this.hasPhoenixDevices == otherObj.hasPhoenixDevices) && (this.groupCopySplitters != null ? this.groupCopySplitters.equals(otherObj.groupCopySplitters) : this.groupCopySplitters == otherObj.groupCopySplitters);
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
/*     */   public int hashCode()
/*     */   {
/* 318 */     return (this.copyUID != null ? this.copyUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.enabled ? 1 : 0) ^ (this.policy != null ? this.policy.hashCode() : 0) ^ (this.roleInfo != null ? this.roleInfo.hashCode() : 0) ^ (this.imageAccessInformation != null ? this.imageAccessInformation.hashCode() : 0) ^ (this.journal != null ? this.journal.hashCode() : 0) ^ (this.hasPhoenixDevices ? 1 : 0) ^ (this.groupCopySplitters != null ? this.groupCopySplitters.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 335 */     return "ConsistencyGroupCopySettings [copyUID=" + this.copyUID + ", " + "name=" + this.name + ", " + "enabled=" + this.enabled + ", " + "policy=" + this.policy + ", " + "roleInfo=" + this.roleInfo + ", " + "imageAccessInformation=" + this.imageAccessInformation + ", " + "journal=" + this.journal + ", " + "hasPhoenixDevices=" + this.hasPhoenixDevices + ", " + "groupCopySplitters=" + this.groupCopySplitters + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupCopySettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */