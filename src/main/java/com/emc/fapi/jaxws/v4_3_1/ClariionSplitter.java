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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ClariionSplitter", propOrder={"splitter", "creds", "password"})
/*     */ public class ClariionSplitter
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected SplitterUID splitter;
/*     */   protected ClariionSplitterCredentials creds;
/*     */   @XmlElement(required=true)
/*     */   protected byte[] password;
/*     */   
/*     */   public ClariionSplitter() {}
/*     */   
/*     */   public ClariionSplitter(SplitterUID splitter, ClariionSplitterCredentials creds, byte[] password)
/*     */   {
/*  53 */     this.splitter = splitter;
/*  54 */     this.creds = creds;
/*  55 */     this.password = password;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SplitterUID getSplitter()
/*     */   {
/*  67 */     return this.splitter;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSplitter(SplitterUID value)
/*     */   {
/*  79 */     this.splitter = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ClariionSplitterCredentials getCreds()
/*     */   {
/*  91 */     return this.creds;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCreds(ClariionSplitterCredentials value)
/*     */   {
/* 103 */     this.creds = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public byte[] getPassword()
/*     */   {
/* 114 */     return this.password;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPassword(byte[] value)
/*     */   {
/* 125 */     this.password = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 135 */     if (!(obj instanceof ClariionSplitter)) {
/* 136 */       return false;
/*     */     }
/* 138 */     ClariionSplitter otherObj = (ClariionSplitter)obj;
/*     */     
/* 140 */     return (this.splitter != null ? this.splitter.equals(otherObj.splitter) : this.splitter == otherObj.splitter) && (this.creds != null ? this.creds.equals(otherObj.creds) : this.creds == otherObj.creds) && (this.password != null ? this.password.equals(otherObj.password) : this.password == otherObj.password);
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
/* 151 */     return (this.splitter != null ? this.splitter.hashCode() : 0) ^ (this.creds != null ? this.creds.hashCode() : 0) ^ (this.password != null ? this.password.hashCode() : 0);
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
/* 162 */     return "ClariionSplitter [splitter=" + this.splitter + ", " + "creds=" + this.creds + ", " + "password=" + this.password + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ClariionSplitter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */