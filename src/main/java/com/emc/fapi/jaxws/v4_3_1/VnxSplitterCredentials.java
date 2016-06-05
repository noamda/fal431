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
/*     */ @JsonTypeName("VnxSplitterCredentials")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VnxSplitterCredentials", propOrder={"certificate", "spAport", "spBport"})
/*     */ public class VnxSplitterCredentials
/*     */   extends BaseSplitterCredentials
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected String certificate;
/*     */   @XmlElement(name="SPAport")
/*     */   protected int spAport;
/*     */   @XmlElement(name="SPBport")
/*     */   protected int spBport;
/*     */   
/*     */   public VnxSplitterCredentials() {}
/*     */   
/*     */   public VnxSplitterCredentials(String certificate, int spAport, int spBport)
/*     */   {
/*  64 */     this.certificate = certificate;
/*  65 */     this.spAport = spAport;
/*  66 */     this.spBport = spBport;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getCertificate()
/*     */   {
/*  78 */     return this.certificate;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCertificate(String value)
/*     */   {
/*  90 */     this.certificate = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getSPAport()
/*     */   {
/*  98 */     return this.spAport;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSPAport(int value)
/*     */   {
/* 106 */     this.spAport = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getSPBport()
/*     */   {
/* 114 */     return this.spBport;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSPBport(int value)
/*     */   {
/* 122 */     this.spBport = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 132 */     if (!(obj instanceof VnxSplitterCredentials)) {
/* 133 */       return false;
/*     */     }
/* 135 */     VnxSplitterCredentials otherObj = (VnxSplitterCredentials)obj;
/*     */     
/* 137 */     return (super.equals(obj)) && (this.certificate != null ? this.certificate.equals(otherObj.certificate) : this.certificate == otherObj.certificate) && (this.spAport == otherObj.spAport) && (this.spBport == otherObj.spBport);
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
/* 149 */     return super.hashCode() ^ (this.certificate != null ? this.certificate.hashCode() : 0) ^ this.spAport ^ this.spBport;
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
/* 161 */     return "VnxSplitterCredentials [super=" + super.toString() + ", " + "certificate=" + this.certificate + ", " + "spAport=" + this.spAport + ", " + "spBport=" + this.spBport + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VnxSplitterCredentials.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */