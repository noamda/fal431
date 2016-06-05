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
/*     */ @XmlType(name="SyslogSettings", propOrder={"enabled", "facility", "sendEventFilters", "clustersHosts"})
/*     */ public class SyslogSettings
/*     */ {
/*     */   protected boolean enabled;
/*     */   @XmlElement(required=true)
/*     */   protected SyslogFacility facility;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<SystemEventLogsFilterUID> sendEventFilters;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ClusterSyslogHost> clustersHosts;
/*     */   
/*     */   public SyslogSettings() {}
/*     */   
/*     */   public SyslogSettings(boolean enabled, SyslogFacility facility, List<SystemEventLogsFilterUID> sendEventFilters, List<ClusterSyslogHost> clustersHosts)
/*     */   {
/*  59 */     this.enabled = enabled;
/*  60 */     this.facility = facility;
/*  61 */     this.sendEventFilters = sendEventFilters;
/*  62 */     this.clustersHosts = clustersHosts;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isEnabled()
/*     */   {
/*  70 */     return this.enabled;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEnabled(boolean value)
/*     */   {
/*  78 */     this.enabled = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SyslogFacility getFacility()
/*     */   {
/*  90 */     return this.facility;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFacility(SyslogFacility value)
/*     */   {
/* 102 */     this.facility = value;
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
/* 128 */     if (this.sendEventFilters == null) {
/* 129 */       this.sendEventFilters = new ArrayList();
/*     */     }
/* 131 */     return this.sendEventFilters;
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
/*     */   public List<ClusterSyslogHost> getClustersHosts()
/*     */   {
/* 157 */     if (this.clustersHosts == null) {
/* 158 */       this.clustersHosts = new ArrayList();
/*     */     }
/* 160 */     return this.clustersHosts;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 170 */     if (!(obj instanceof SyslogSettings)) {
/* 171 */       return false;
/*     */     }
/* 173 */     SyslogSettings otherObj = (SyslogSettings)obj;
/*     */     
/* 175 */     return (this.enabled == otherObj.enabled) && (this.facility != null ? this.facility.equals(otherObj.facility) : this.facility == otherObj.facility) && (this.sendEventFilters != null ? this.sendEventFilters.equals(otherObj.sendEventFilters) : this.sendEventFilters == otherObj.sendEventFilters) && (this.clustersHosts != null ? this.clustersHosts.equals(otherObj.clustersHosts) : this.clustersHosts == otherObj.clustersHosts);
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
/* 187 */     return (this.enabled ? 1 : 0) ^ (this.facility != null ? this.facility.hashCode() : 0) ^ (this.sendEventFilters != null ? this.sendEventFilters.hashCode() : 0) ^ (this.clustersHosts != null ? this.clustersHosts.hashCode() : 0);
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
/* 199 */     return "SyslogSettings [enabled=" + this.enabled + ", " + "facility=" + this.facility + ", " + "sendEventFilters=" + this.sendEventFilters + ", " + "clustersHosts=" + this.clustersHosts + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SyslogSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */