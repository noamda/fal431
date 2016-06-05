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
/*     */ @JsonTypeName("ClariionSplitterSettings")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ClariionSplitterSettings", propOrder={"credentialsStatus", "credentials"})
/*     */ public class ClariionSplitterSettings
/*     */   extends ArrayBasedSplitterSettings
/*     */ {
/*     */   protected SplitterCredentialsStatus credentialsStatus;
/*     */   protected ClariionSplitterCredentials credentials;
/*     */   
/*     */   public ClariionSplitterSettings() {}
/*     */   
/*     */   public ClariionSplitterSettings(SplitterCredentialsStatus credentialsStatus, ClariionSplitterCredentials credentials)
/*     */   {
/*  57 */     this.credentialsStatus = credentialsStatus;
/*  58 */     this.credentials = credentials;
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
/*  70 */     return this.credentialsStatus;
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
/*  82 */     this.credentialsStatus = value;
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
/*  94 */     return this.credentials;
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
/* 106 */     this.credentials = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 116 */     if (!(obj instanceof ClariionSplitterSettings)) {
/* 117 */       return false;
/*     */     }
/* 119 */     ClariionSplitterSettings otherObj = (ClariionSplitterSettings)obj;
/*     */     
/* 121 */     return (super.equals(obj)) && (this.credentialsStatus != null ? this.credentialsStatus.equals(otherObj.credentialsStatus) : this.credentialsStatus == otherObj.credentialsStatus) && (this.credentials != null ? this.credentials.equals(otherObj.credentials) : this.credentials == otherObj.credentials);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 132 */     return super.hashCode() ^ (this.credentialsStatus != null ? this.credentialsStatus.hashCode() : 0) ^ (this.credentials != null ? this.credentials.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 143 */     return "ClariionSplitterSettings [super=" + super.toString() + ", " + "credentialsStatus=" + this.credentialsStatus + ", " + "credentials=" + this.credentials + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ClariionSplitterSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */