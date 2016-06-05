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
/*     */ 
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
/*     */ @XmlType(name="LDAPSettings", propOrder={"enabled", "protocol", "primaryServer", "secondaryServer", "baseDistinguishedName", "distinguishedNameSearch", "binding", "advancedSettings"})
/*     */ public class LDAPSettings
/*     */ {
/*     */   protected boolean enabled;
/*     */   @XmlElement(required=true)
/*     */   protected LDAPProtocol protocol;
/*     */   protected LDAPServer primaryServer;
/*     */   protected LDAPServer secondaryServer;
/*     */   @XmlElement(required=true)
/*     */   protected String baseDistinguishedName;
/*     */   @XmlElement(required=true)
/*     */   protected String distinguishedNameSearch;
/*     */   @XmlElement(required=true)
/*     */   protected LDAPBinding binding;
/*     */   @XmlElement(required=true)
/*     */   protected LDAPAdvancedSettings advancedSettings;
/*     */   
/*     */   public LDAPSettings() {}
/*     */   
/*     */   public LDAPSettings(boolean enabled, LDAPProtocol protocol, LDAPServer primaryServer, LDAPServer secondaryServer, String baseDistinguishedName, String distinguishedNameSearch, LDAPBinding binding, LDAPAdvancedSettings advancedSettings)
/*     */   {
/*  71 */     this.enabled = enabled;
/*  72 */     this.protocol = protocol;
/*  73 */     this.primaryServer = primaryServer;
/*  74 */     this.secondaryServer = secondaryServer;
/*  75 */     this.baseDistinguishedName = baseDistinguishedName;
/*  76 */     this.distinguishedNameSearch = distinguishedNameSearch;
/*  77 */     this.binding = binding;
/*  78 */     this.advancedSettings = advancedSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isEnabled()
/*     */   {
/*  86 */     return this.enabled;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEnabled(boolean value)
/*     */   {
/*  94 */     this.enabled = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public LDAPProtocol getProtocol()
/*     */   {
/* 106 */     return this.protocol;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setProtocol(LDAPProtocol value)
/*     */   {
/* 118 */     this.protocol = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public LDAPServer getPrimaryServer()
/*     */   {
/* 130 */     return this.primaryServer;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPrimaryServer(LDAPServer value)
/*     */   {
/* 142 */     this.primaryServer = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public LDAPServer getSecondaryServer()
/*     */   {
/* 154 */     return this.secondaryServer;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSecondaryServer(LDAPServer value)
/*     */   {
/* 166 */     this.secondaryServer = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getBaseDistinguishedName()
/*     */   {
/* 178 */     return this.baseDistinguishedName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setBaseDistinguishedName(String value)
/*     */   {
/* 190 */     this.baseDistinguishedName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getDistinguishedNameSearch()
/*     */   {
/* 202 */     return this.distinguishedNameSearch;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDistinguishedNameSearch(String value)
/*     */   {
/* 214 */     this.distinguishedNameSearch = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public LDAPBinding getBinding()
/*     */   {
/* 226 */     return this.binding;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setBinding(LDAPBinding value)
/*     */   {
/* 238 */     this.binding = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public LDAPAdvancedSettings getAdvancedSettings()
/*     */   {
/* 250 */     return this.advancedSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAdvancedSettings(LDAPAdvancedSettings value)
/*     */   {
/* 262 */     this.advancedSettings = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 272 */     if (!(obj instanceof LDAPSettings)) {
/* 273 */       return false;
/*     */     }
/* 275 */     LDAPSettings otherObj = (LDAPSettings)obj;
/*     */     
/* 277 */     return (this.enabled == otherObj.enabled) && (this.protocol != null ? this.protocol.equals(otherObj.protocol) : this.protocol == otherObj.protocol) && (this.primaryServer != null ? this.primaryServer.equals(otherObj.primaryServer) : this.primaryServer == otherObj.primaryServer) && (this.secondaryServer != null ? this.secondaryServer.equals(otherObj.secondaryServer) : this.secondaryServer == otherObj.secondaryServer) && (this.baseDistinguishedName != null ? this.baseDistinguishedName.equals(otherObj.baseDistinguishedName) : this.baseDistinguishedName == otherObj.baseDistinguishedName) && (this.distinguishedNameSearch != null ? this.distinguishedNameSearch.equals(otherObj.distinguishedNameSearch) : this.distinguishedNameSearch == otherObj.distinguishedNameSearch) && (this.binding != null ? this.binding.equals(otherObj.binding) : this.binding == otherObj.binding) && (this.advancedSettings != null ? this.advancedSettings.equals(otherObj.advancedSettings) : this.advancedSettings == otherObj.advancedSettings);
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
/*     */   public int hashCode()
/*     */   {
/* 293 */     return (this.enabled ? 1 : 0) ^ (this.protocol != null ? this.protocol.hashCode() : 0) ^ (this.primaryServer != null ? this.primaryServer.hashCode() : 0) ^ (this.secondaryServer != null ? this.secondaryServer.hashCode() : 0) ^ (this.baseDistinguishedName != null ? this.baseDistinguishedName.hashCode() : 0) ^ (this.distinguishedNameSearch != null ? this.distinguishedNameSearch.hashCode() : 0) ^ (this.binding != null ? this.binding.hashCode() : 0) ^ (this.advancedSettings != null ? this.advancedSettings.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 309 */     return "LDAPSettings [enabled=" + this.enabled + ", " + "protocol=" + this.protocol + ", " + "primaryServer=" + this.primaryServer + ", " + "secondaryServer=" + this.secondaryServer + ", " + "baseDistinguishedName=" + this.baseDistinguishedName + ", " + "distinguishedNameSearch=" + this.distinguishedNameSearch + ", " + "binding=" + this.binding + ", " + "advancedSettings=" + this.advancedSettings + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\LDAPSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */