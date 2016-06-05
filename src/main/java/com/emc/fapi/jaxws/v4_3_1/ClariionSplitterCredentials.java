/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
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
/*     */ @JsonTypeName("ClariionSplitterCredentials")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ClariionSplitterCredentials", propOrder={"credentialsType", "spBip", "authenticationType"})
/*     */ public class ClariionSplitterCredentials
/*     */   extends BaseSplitterCredentials
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected ClariionSplitterCredentialsType credentialsType;
/*     */   @XmlElement(name="SPBip")
/*     */   protected String spBip;
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected AuthenticationType authenticationType;
/*     */   
/*     */   public ClariionSplitterCredentials() {}
/*     */   
/*     */   public ClariionSplitterCredentials(ClariionSplitterCredentialsType credentialsType, String spBip, AuthenticationType authenticationType)
/*     */   {
/*  64 */     this.credentialsType = credentialsType;
/*  65 */     this.spBip = spBip;
/*  66 */     this.authenticationType = authenticationType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ClariionSplitterCredentialsType getCredentialsType()
/*     */   {
/*  78 */     return this.credentialsType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCredentialsType(ClariionSplitterCredentialsType value)
/*     */   {
/*  90 */     this.credentialsType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getSPBip()
/*     */   {
/* 102 */     return this.spBip;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSPBip(String value)
/*     */   {
/* 114 */     this.spBip = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public AuthenticationType getAuthenticationType()
/*     */   {
/* 126 */     return this.authenticationType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAuthenticationType(AuthenticationType value)
/*     */   {
/* 138 */     this.authenticationType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 148 */     if (!(obj instanceof ClariionSplitterCredentials)) {
/* 149 */       return false;
/*     */     }
/* 151 */     ClariionSplitterCredentials otherObj = (ClariionSplitterCredentials)obj;
/*     */     
/* 153 */     return (super.equals(obj)) && (this.credentialsType != null ? this.credentialsType.equals(otherObj.credentialsType) : this.credentialsType == otherObj.credentialsType) && (this.spBip != null ? this.spBip.equals(otherObj.spBip) : this.spBip == otherObj.spBip) && (this.authenticationType != null ? this.authenticationType.equals(otherObj.authenticationType) : this.authenticationType == otherObj.authenticationType);
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
/* 165 */     return super.hashCode() ^ (this.credentialsType != null ? this.credentialsType.hashCode() : 0) ^ (this.spBip != null ? this.spBip.hashCode() : 0) ^ (this.authenticationType != null ? this.authenticationType.hashCode() : 0);
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
/* 177 */     return "ClariionSplitterCredentials [super=" + super.toString() + ", " + "credentialsType=" + this.credentialsType + ", " + "spBip=" + this.spBip + ", " + "authenticationType=" + this.authenticationType + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ClariionSplitterCredentials.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */