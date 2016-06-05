/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.codehaus.jackson.annotate.JsonTypeName;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @JsonTypeName("Vnx2eSplitterSettings")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="Vnx2eSplitterSettings", propOrder={"autoRegisterRPAsInitiators", "credentials", "credentialsStatus"})
/*     */ public class Vnx2ESplitterSettings
/*     */   extends AggregatedSplitterSettings
/*     */ {
/*     */   protected boolean autoRegisterRPAsInitiators;
/*     */   protected ClariionSplitterCredentials credentials;
/*     */   protected SplitterCredentialsStatus credentialsStatus;
/*     */   
/*     */   public Vnx2ESplitterSettings() {}
/*     */   
/*     */   public Vnx2ESplitterSettings(boolean autoRegisterRPAsInitiators, ClariionSplitterCredentials credentials, SplitterCredentialsStatus credentialsStatus)
/*     */   {
/*  60 */     this.autoRegisterRPAsInitiators = autoRegisterRPAsInitiators;
/*  61 */     this.credentials = credentials;
/*  62 */     this.credentialsStatus = credentialsStatus;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isAutoRegisterRPAsInitiators()
/*     */   {
/*  70 */     return this.autoRegisterRPAsInitiators;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAutoRegisterRPAsInitiators(boolean value)
/*     */   {
/*  78 */     this.autoRegisterRPAsInitiators = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ClariionSplitterCredentials getCredentials()
/*     */   {
/*  90 */     return this.credentials;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCredentials(ClariionSplitterCredentials value)
/*     */   {
/* 102 */     this.credentials = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SplitterCredentialsStatus getCredentialsStatus()
/*     */   {
/* 114 */     return this.credentialsStatus;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCredentialsStatus(SplitterCredentialsStatus value)
/*     */   {
/* 126 */     this.credentialsStatus = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 136 */     if (!(obj instanceof Vnx2ESplitterSettings)) {
/* 137 */       return false;
/*     */     }
/* 139 */     Vnx2ESplitterSettings otherObj = (Vnx2ESplitterSettings)obj;
/*     */     
/* 141 */     return (super.equals(obj)) && (this.autoRegisterRPAsInitiators == otherObj.autoRegisterRPAsInitiators) && (this.credentials != null ? this.credentials.equals(otherObj.credentials) : this.credentials == otherObj.credentials) && (this.credentialsStatus != null ? this.credentialsStatus.equals(otherObj.credentialsStatus) : this.credentialsStatus == otherObj.credentialsStatus);
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
/* 153 */     return super.hashCode() ^ (this.autoRegisterRPAsInitiators ? 1 : 0) ^ (this.credentials != null ? this.credentials.hashCode() : 0) ^ (this.credentialsStatus != null ? this.credentialsStatus.hashCode() : 0);
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
/* 165 */     return "Vnx2ESplitterSettings [super=" + super.toString() + ", " + "autoRegisterRPAsInitiators=" + this.autoRegisterRPAsInitiators + ", " + "credentials=" + this.credentials + ", " + "credentialsStatus=" + this.credentialsStatus + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\Vnx2ESplitterSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */