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
/*     */ @JsonTypeName("VplexSplitterSettings")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VplexSplitterSettings", propOrder={"credentialsStatus", "credentials", "autoRegisterRPAsInitiators"})
/*     */ public class VplexSplitterSettings
/*     */   extends AggregatedSplitterSettings
/*     */ {
/*     */   protected SplitterCredentialsStatus credentialsStatus;
/*     */   protected VplexSplitterCredentials credentials;
/*     */   protected boolean autoRegisterRPAsInitiators;
/*     */   
/*     */   public VplexSplitterSettings() {}
/*     */   
/*     */   public VplexSplitterSettings(SplitterCredentialsStatus credentialsStatus, VplexSplitterCredentials credentials, boolean autoRegisterRPAsInitiators)
/*     */   {
/*  60 */     this.credentialsStatus = credentialsStatus;
/*  61 */     this.credentials = credentials;
/*  62 */     this.autoRegisterRPAsInitiators = autoRegisterRPAsInitiators;
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
/*  74 */     return this.credentialsStatus;
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
/*  86 */     this.credentialsStatus = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VplexSplitterCredentials getCredentials()
/*     */   {
/*  98 */     return this.credentials;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCredentials(VplexSplitterCredentials value)
/*     */   {
/* 110 */     this.credentials = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isAutoRegisterRPAsInitiators()
/*     */   {
/* 118 */     return this.autoRegisterRPAsInitiators;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAutoRegisterRPAsInitiators(boolean value)
/*     */   {
/* 126 */     this.autoRegisterRPAsInitiators = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 136 */     if (!(obj instanceof VplexSplitterSettings)) {
/* 137 */       return false;
/*     */     }
/* 139 */     VplexSplitterSettings otherObj = (VplexSplitterSettings)obj;
/*     */     
/* 141 */     return (super.equals(obj)) && (this.credentialsStatus != null ? this.credentialsStatus.equals(otherObj.credentialsStatus) : this.credentialsStatus == otherObj.credentialsStatus) && (this.credentials != null ? this.credentials.equals(otherObj.credentials) : this.credentials == otherObj.credentials) && (this.autoRegisterRPAsInitiators == otherObj.autoRegisterRPAsInitiators);
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
/* 153 */     return super.hashCode() ^ (this.credentialsStatus != null ? this.credentialsStatus.hashCode() : 0) ^ (this.credentials != null ? this.credentials.hashCode() : 0) ^ (this.autoRegisterRPAsInitiators ? 1 : 0);
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
/* 165 */     return "VplexSplitterSettings [super=" + super.toString() + ", " + "credentialsStatus=" + this.credentialsStatus + ", " + "credentials=" + this.credentials + ", " + "autoRegisterRPAsInitiators=" + this.autoRegisterRPAsInitiators + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VplexSplitterSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */