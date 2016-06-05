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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="SNMPSettings", propOrder={"agentEnabled", "shouldSendEventTraps", "sendEventFilters", "traps", "snmpCommunity", "users", "secureTransportsOnly"})
/*     */ public class SNMPSettings
/*     */ {
/*     */   protected boolean agentEnabled;
/*     */   protected boolean shouldSendEventTraps;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<SystemEventLogsFilterUID> sendEventFilters;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<SNMPTrapDestination> traps;
/*     */   @XmlElement(required=true)
/*     */   protected String snmpCommunity;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<SNMPUser> users;
/*     */   protected boolean secureTransportsOnly;
/*     */   
/*     */   public SNMPSettings() {}
/*     */   
/*     */   public SNMPSettings(boolean agentEnabled, boolean shouldSendEventTraps, List<SystemEventLogsFilterUID> sendEventFilters, List<SNMPTrapDestination> traps, String snmpCommunity, List<SNMPUser> users, boolean secureTransportsOnly)
/*     */   {
/*  69 */     this.agentEnabled = agentEnabled;
/*  70 */     this.shouldSendEventTraps = shouldSendEventTraps;
/*  71 */     this.sendEventFilters = sendEventFilters;
/*  72 */     this.traps = traps;
/*  73 */     this.snmpCommunity = snmpCommunity;
/*  74 */     this.users = users;
/*  75 */     this.secureTransportsOnly = secureTransportsOnly;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isAgentEnabled()
/*     */   {
/*  83 */     return this.agentEnabled;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAgentEnabled(boolean value)
/*     */   {
/*  91 */     this.agentEnabled = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isShouldSendEventTraps()
/*     */   {
/*  99 */     return this.shouldSendEventTraps;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setShouldSendEventTraps(boolean value)
/*     */   {
/* 107 */     this.shouldSendEventTraps = value;
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
/*     */   public List<SystemEventLogsFilterUID> getSendEventFilters()
/*     */   {
/* 133 */     if (this.sendEventFilters == null) {
/* 134 */       this.sendEventFilters = new ArrayList();
/*     */     }
/* 136 */     return this.sendEventFilters;
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
/*     */   public List<SNMPTrapDestination> getTraps()
/*     */   {
/* 162 */     if (this.traps == null) {
/* 163 */       this.traps = new ArrayList();
/*     */     }
/* 165 */     return this.traps;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getSnmpCommunity()
/*     */   {
/* 177 */     return this.snmpCommunity;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSnmpCommunity(String value)
/*     */   {
/* 189 */     this.snmpCommunity = value;
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
/*     */   public List<SNMPUser> getUsers()
/*     */   {
/* 215 */     if (this.users == null) {
/* 216 */       this.users = new ArrayList();
/*     */     }
/* 218 */     return this.users;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isSecureTransportsOnly()
/*     */   {
/* 226 */     return this.secureTransportsOnly;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSecureTransportsOnly(boolean value)
/*     */   {
/* 234 */     this.secureTransportsOnly = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 244 */     if (!(obj instanceof SNMPSettings)) {
/* 245 */       return false;
/*     */     }
/* 247 */     SNMPSettings otherObj = (SNMPSettings)obj;
/*     */     
/* 249 */     return (this.agentEnabled == otherObj.agentEnabled) && (this.shouldSendEventTraps == otherObj.shouldSendEventTraps) && (this.sendEventFilters != null ? this.sendEventFilters.equals(otherObj.sendEventFilters) : this.sendEventFilters == otherObj.sendEventFilters) && (this.traps != null ? this.traps.equals(otherObj.traps) : this.traps == otherObj.traps) && (this.snmpCommunity != null ? this.snmpCommunity.equals(otherObj.snmpCommunity) : this.snmpCommunity == otherObj.snmpCommunity) && (this.users != null ? this.users.equals(otherObj.users) : this.users == otherObj.users) && (this.secureTransportsOnly == otherObj.secureTransportsOnly);
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
/*     */   public int hashCode()
/*     */   {
/* 264 */     return (this.agentEnabled ? 1 : 0) ^ (this.shouldSendEventTraps ? 1 : 0) ^ (this.sendEventFilters != null ? this.sendEventFilters.hashCode() : 0) ^ (this.traps != null ? this.traps.hashCode() : 0) ^ (this.snmpCommunity != null ? this.snmpCommunity.hashCode() : 0) ^ (this.users != null ? this.users.hashCode() : 0) ^ (this.secureTransportsOnly ? 1 : 0);
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
/*     */   public String toString()
/*     */   {
/* 279 */     return "SNMPSettings [agentEnabled=" + this.agentEnabled + ", " + "shouldSendEventTraps=" + this.shouldSendEventTraps + ", " + "sendEventFilters=" + this.sendEventFilters + ", " + "traps=" + this.traps + ", " + "snmpCommunity=" + this.snmpCommunity + ", " + "users=" + this.users + ", " + "secureTransportsOnly=" + this.secureTransportsOnly + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SNMPSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */