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
/*     */ @XmlType(name="VplexSplitter", propOrder={"splitter", "creds", "password"})
/*     */ public class VplexSplitter
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected SplitterUID splitter;
/*     */   protected VplexSplitterCredentials creds;
/*     */   protected byte[] password;
/*     */   
/*     */   public VplexSplitter() {}
/*     */   
/*     */   public VplexSplitter(SplitterUID splitter, VplexSplitterCredentials creds, byte[] password)
/*     */   {
/*  52 */     this.splitter = splitter;
/*  53 */     this.creds = creds;
/*  54 */     this.password = password;
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
/*  66 */     return this.splitter;
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
/*  78 */     this.splitter = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VplexSplitterCredentials getCreds()
/*     */   {
/*  90 */     return this.creds;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCreds(VplexSplitterCredentials value)
/*     */   {
/* 102 */     this.creds = value;
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
/* 113 */     return this.password;
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
/* 124 */     this.password = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 134 */     if (!(obj instanceof VplexSplitter)) {
/* 135 */       return false;
/*     */     }
/* 137 */     VplexSplitter otherObj = (VplexSplitter)obj;
/*     */     
/* 139 */     return (this.splitter != null ? this.splitter.equals(otherObj.splitter) : this.splitter == otherObj.splitter) && (this.creds != null ? this.creds.equals(otherObj.creds) : this.creds == otherObj.creds) && (this.password != null ? this.password.equals(otherObj.password) : this.password == otherObj.password);
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
/* 150 */     return (this.splitter != null ? this.splitter.hashCode() : 0) ^ (this.creds != null ? this.creds.hashCode() : 0) ^ (this.password != null ? this.password.hashCode() : 0);
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
/* 161 */     return "VplexSplitter [splitter=" + this.splitter + ", " + "creds=" + this.creds + ", " + "password=" + this.password + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VplexSplitter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */