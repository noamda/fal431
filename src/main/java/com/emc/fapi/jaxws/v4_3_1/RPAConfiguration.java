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
/*     */ @XmlType(name="RPAConfiguration", propOrder={"rpaUID", "nicsInformation", "spoofedPorts", "localISCSIPortsConfiguration", "ntpServersIPs"})
/*     */ public class RPAConfiguration
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected RpaUID rpaUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<NICInformation> nicsInformation;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<RPAPortInformation> spoofedPorts;
/*     */   @XmlElement(nillable=true)
/*     */   protected LocalISCSIPortsConfiguration localISCSIPortsConfiguration;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<String> ntpServersIPs;
/*     */   
/*     */   public RPAConfiguration() {}
/*     */   
/*     */   public RPAConfiguration(RpaUID rpaUID, List<NICInformation> nicsInformation, List<RPAPortInformation> spoofedPorts, LocalISCSIPortsConfiguration localISCSIPortsConfiguration, List<String> ntpServersIPs)
/*     */   {
/*  64 */     this.rpaUID = rpaUID;
/*  65 */     this.nicsInformation = nicsInformation;
/*  66 */     this.spoofedPorts = spoofedPorts;
/*  67 */     this.localISCSIPortsConfiguration = localISCSIPortsConfiguration;
/*  68 */     this.ntpServersIPs = ntpServersIPs;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RpaUID getRpaUID()
/*     */   {
/*  80 */     return this.rpaUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRpaUID(RpaUID value)
/*     */   {
/*  92 */     this.rpaUID = value;
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
/*     */   public List<NICInformation> getNicsInformation()
/*     */   {
/* 118 */     if (this.nicsInformation == null) {
/* 119 */       this.nicsInformation = new ArrayList();
/*     */     }
/* 121 */     return this.nicsInformation;
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
/*     */   public List<RPAPortInformation> getSpoofedPorts()
/*     */   {
/* 147 */     if (this.spoofedPorts == null) {
/* 148 */       this.spoofedPorts = new ArrayList();
/*     */     }
/* 150 */     return this.spoofedPorts;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public LocalISCSIPortsConfiguration getLocalISCSIPortsConfiguration()
/*     */   {
/* 162 */     return this.localISCSIPortsConfiguration;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLocalISCSIPortsConfiguration(LocalISCSIPortsConfiguration value)
/*     */   {
/* 174 */     this.localISCSIPortsConfiguration = value;
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
/*     */   public List<String> getNtpServersIPs()
/*     */   {
/* 200 */     if (this.ntpServersIPs == null) {
/* 201 */       this.ntpServersIPs = new ArrayList();
/*     */     }
/* 203 */     return this.ntpServersIPs;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 213 */     if (!(obj instanceof RPAConfiguration)) {
/* 214 */       return false;
/*     */     }
/* 216 */     RPAConfiguration otherObj = (RPAConfiguration)obj;
/*     */     
/* 218 */     return (this.rpaUID != null ? this.rpaUID.equals(otherObj.rpaUID) : this.rpaUID == otherObj.rpaUID) && (this.nicsInformation != null ? this.nicsInformation.equals(otherObj.nicsInformation) : this.nicsInformation == otherObj.nicsInformation) && (this.spoofedPorts != null ? this.spoofedPorts.equals(otherObj.spoofedPorts) : this.spoofedPorts == otherObj.spoofedPorts) && (this.localISCSIPortsConfiguration != null ? this.localISCSIPortsConfiguration.equals(otherObj.localISCSIPortsConfiguration) : this.localISCSIPortsConfiguration == otherObj.localISCSIPortsConfiguration) && (this.ntpServersIPs != null ? this.ntpServersIPs.equals(otherObj.ntpServersIPs) : this.ntpServersIPs == otherObj.ntpServersIPs);
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
/* 231 */     return (this.rpaUID != null ? this.rpaUID.hashCode() : 0) ^ (this.nicsInformation != null ? this.nicsInformation.hashCode() : 0) ^ (this.spoofedPorts != null ? this.spoofedPorts.hashCode() : 0) ^ (this.localISCSIPortsConfiguration != null ? this.localISCSIPortsConfiguration.hashCode() : 0) ^ (this.ntpServersIPs != null ? this.ntpServersIPs.hashCode() : 0);
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
/* 244 */     return "RPAConfiguration [rpaUID=" + this.rpaUID + ", " + "nicsInformation=" + this.nicsInformation + ", " + "spoofedPorts=" + this.spoofedPorts + ", " + "localISCSIPortsConfiguration=" + this.localISCSIPortsConfiguration + ", " + "ntpServersIPs=" + this.ntpServersIPs + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RPAConfiguration.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */