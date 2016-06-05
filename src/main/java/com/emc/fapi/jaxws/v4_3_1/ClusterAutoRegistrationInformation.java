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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @XmlType(name="ClusterAutoRegistrationInformation", propOrder={"companyName", "connectHome", "connectInMethodHardware", "connectInMethodSoftware", "installationResource", "installatoinType", "location", "salesOrderNumber", "sitePartyId", "vce"})
/*     */ public class ClusterAutoRegistrationInformation
/*     */ {
/*     */   protected String companyName;
/*     */   protected ConnectHomeMethod connectHome;
/*     */   protected ConnectInMethod connectInMethodHardware;
/*     */   protected ConnectInMethod connectInMethodSoftware;
/*     */   protected InstallationPerformingResource installationResource;
/*     */   protected InstallationActivityType installatoinType;
/*     */   protected String location;
/*     */   protected String salesOrderNumber;
/*     */   protected String sitePartyId;
/*     */   protected Boolean vce;
/*     */   
/*     */   public ClusterAutoRegistrationInformation() {}
/*     */   
/*     */   public ClusterAutoRegistrationInformation(String companyName, ConnectHomeMethod connectHome, ConnectInMethod connectInMethodHardware, ConnectInMethod connectInMethodSoftware, InstallationPerformingResource installationResource, InstallationActivityType installatoinType, String location, String salesOrderNumber, String sitePartyId, Boolean vce)
/*     */   {
/*  71 */     this.companyName = companyName;
/*  72 */     this.connectHome = connectHome;
/*  73 */     this.connectInMethodHardware = connectInMethodHardware;
/*  74 */     this.connectInMethodSoftware = connectInMethodSoftware;
/*  75 */     this.installationResource = installationResource;
/*  76 */     this.installatoinType = installatoinType;
/*  77 */     this.location = location;
/*  78 */     this.salesOrderNumber = salesOrderNumber;
/*  79 */     this.sitePartyId = sitePartyId;
/*  80 */     this.vce = vce;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getCompanyName()
/*     */   {
/*  92 */     return this.companyName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCompanyName(String value)
/*     */   {
/* 104 */     this.companyName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConnectHomeMethod getConnectHome()
/*     */   {
/* 116 */     return this.connectHome;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setConnectHome(ConnectHomeMethod value)
/*     */   {
/* 128 */     this.connectHome = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConnectInMethod getConnectInMethodHardware()
/*     */   {
/* 140 */     return this.connectInMethodHardware;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setConnectInMethodHardware(ConnectInMethod value)
/*     */   {
/* 152 */     this.connectInMethodHardware = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConnectInMethod getConnectInMethodSoftware()
/*     */   {
/* 164 */     return this.connectInMethodSoftware;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setConnectInMethodSoftware(ConnectInMethod value)
/*     */   {
/* 176 */     this.connectInMethodSoftware = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public InstallationPerformingResource getInstallationResource()
/*     */   {
/* 188 */     return this.installationResource;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setInstallationResource(InstallationPerformingResource value)
/*     */   {
/* 200 */     this.installationResource = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public InstallationActivityType getInstallatoinType()
/*     */   {
/* 212 */     return this.installatoinType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setInstallatoinType(InstallationActivityType value)
/*     */   {
/* 224 */     this.installatoinType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getLocation()
/*     */   {
/* 236 */     return this.location;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLocation(String value)
/*     */   {
/* 248 */     this.location = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getSalesOrderNumber()
/*     */   {
/* 260 */     return this.salesOrderNumber;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSalesOrderNumber(String value)
/*     */   {
/* 272 */     this.salesOrderNumber = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getSitePartyId()
/*     */   {
/* 284 */     return this.sitePartyId;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSitePartyId(String value)
/*     */   {
/* 296 */     this.sitePartyId = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Boolean isVce()
/*     */   {
/* 308 */     return this.vce;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVce(Boolean value)
/*     */   {
/* 320 */     this.vce = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 330 */     if (!(obj instanceof ClusterAutoRegistrationInformation)) {
/* 331 */       return false;
/*     */     }
/* 333 */     ClusterAutoRegistrationInformation otherObj = (ClusterAutoRegistrationInformation)obj;
/*     */     
/* 335 */     return (this.companyName != null ? this.companyName.equals(otherObj.companyName) : this.companyName == otherObj.companyName) && (this.connectHome != null ? this.connectHome.equals(otherObj.connectHome) : this.connectHome == otherObj.connectHome) && (this.connectInMethodHardware != null ? this.connectInMethodHardware.equals(otherObj.connectInMethodHardware) : this.connectInMethodHardware == otherObj.connectInMethodHardware) && (this.connectInMethodSoftware != null ? this.connectInMethodSoftware.equals(otherObj.connectInMethodSoftware) : this.connectInMethodSoftware == otherObj.connectInMethodSoftware) && (this.installationResource != null ? this.installationResource.equals(otherObj.installationResource) : this.installationResource == otherObj.installationResource) && (this.installatoinType != null ? this.installatoinType.equals(otherObj.installatoinType) : this.installatoinType == otherObj.installatoinType) && (this.location != null ? this.location.equals(otherObj.location) : this.location == otherObj.location) && (this.salesOrderNumber != null ? this.salesOrderNumber.equals(otherObj.salesOrderNumber) : this.salesOrderNumber == otherObj.salesOrderNumber) && (this.sitePartyId != null ? this.sitePartyId.equals(otherObj.sitePartyId) : this.sitePartyId == otherObj.sitePartyId) && (this.vce != null ? this.vce.equals(otherObj.vce) : this.vce == otherObj.vce);
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
/*     */   public int hashCode()
/*     */   {
/* 353 */     return (this.companyName != null ? this.companyName.hashCode() : 0) ^ (this.connectHome != null ? this.connectHome.hashCode() : 0) ^ (this.connectInMethodHardware != null ? this.connectInMethodHardware.hashCode() : 0) ^ (this.connectInMethodSoftware != null ? this.connectInMethodSoftware.hashCode() : 0) ^ (this.installationResource != null ? this.installationResource.hashCode() : 0) ^ (this.installatoinType != null ? this.installatoinType.hashCode() : 0) ^ (this.location != null ? this.location.hashCode() : 0) ^ (this.salesOrderNumber != null ? this.salesOrderNumber.hashCode() : 0) ^ (this.sitePartyId != null ? this.sitePartyId.hashCode() : 0) ^ (this.vce != null ? this.vce.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 371 */     return "ClusterAutoRegistrationInformation [companyName=" + this.companyName + ", " + "connectHome=" + this.connectHome + ", " + "connectInMethodHardware=" + this.connectInMethodHardware + ", " + "connectInMethodSoftware=" + this.connectInMethodSoftware + ", " + "installationResource=" + this.installationResource + ", " + "installatoinType=" + this.installatoinType + ", " + "location=" + this.location + ", " + "salesOrderNumber=" + this.salesOrderNumber + ", " + "sitePartyId=" + this.sitePartyId + ", " + "vce=" + this.vce + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ClusterAutoRegistrationInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */