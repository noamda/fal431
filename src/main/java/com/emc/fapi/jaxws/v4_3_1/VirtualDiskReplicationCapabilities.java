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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VirtualDiskReplicationCapabilities", propOrder={"includable", "includedByDefault", "cantBeIncludedReason"})
/*     */ public class VirtualDiskReplicationCapabilities
/*     */ {
/*     */   protected boolean includable;
/*     */   protected boolean includedByDefault;
/*     */   protected String cantBeIncludedReason;
/*     */   
/*     */   public VirtualDiskReplicationCapabilities() {}
/*     */   
/*     */   public VirtualDiskReplicationCapabilities(boolean includable, boolean includedByDefault, String cantBeIncludedReason)
/*     */   {
/*  50 */     this.includable = includable;
/*  51 */     this.includedByDefault = includedByDefault;
/*  52 */     this.cantBeIncludedReason = cantBeIncludedReason;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isIncludable()
/*     */   {
/*  60 */     return this.includable;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setIncludable(boolean value)
/*     */   {
/*  68 */     this.includable = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isIncludedByDefault()
/*     */   {
/*  76 */     return this.includedByDefault;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setIncludedByDefault(boolean value)
/*     */   {
/*  84 */     this.includedByDefault = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getCantBeIncludedReason()
/*     */   {
/*  96 */     return this.cantBeIncludedReason;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCantBeIncludedReason(String value)
/*     */   {
/* 108 */     this.cantBeIncludedReason = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 118 */     if (!(obj instanceof VirtualDiskReplicationCapabilities)) {
/* 119 */       return false;
/*     */     }
/* 121 */     VirtualDiskReplicationCapabilities otherObj = (VirtualDiskReplicationCapabilities)obj;
/*     */     
/* 123 */     return (this.includable == otherObj.includable) && (this.includedByDefault == otherObj.includedByDefault) && (this.cantBeIncludedReason != null ? this.cantBeIncludedReason.equals(otherObj.cantBeIncludedReason) : this.cantBeIncludedReason == otherObj.cantBeIncludedReason);
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
/* 134 */     return (this.includable ? 1 : 0) ^ (this.includedByDefault ? 1 : 0) ^ (this.cantBeIncludedReason != null ? this.cantBeIncludedReason.hashCode() : 0);
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
/* 145 */     return "VirtualDiskReplicationCapabilities [includable=" + this.includable + ", " + "includedByDefault=" + this.includedByDefault + ", " + "cantBeIncludedReason=" + this.cantBeIncludedReason + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VirtualDiskReplicationCapabilities.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */