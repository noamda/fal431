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
/*     */ @JsonTypeName("LocalISCSIPortInformation")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="LocalISCSIPortInformation", propOrder={"nicInformation"})
/*     */ public class LocalISCSIPortInformation
/*     */   extends ISCSIPortInformation
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected NICInformation nicInformation;
/*     */   
/*     */   public LocalISCSIPortInformation() {}
/*     */   
/*     */   public LocalISCSIPortInformation(NICInformation nicInformation)
/*     */   {
/*  56 */     this.nicInformation = nicInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public NICInformation getNicInformation()
/*     */   {
/*  68 */     return this.nicInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNicInformation(NICInformation value)
/*     */   {
/*  80 */     this.nicInformation = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  90 */     if (!(obj instanceof LocalISCSIPortInformation)) {
/*  91 */       return false;
/*     */     }
/*  93 */     LocalISCSIPortInformation otherObj = (LocalISCSIPortInformation)obj;
/*     */     
/*  95 */     return (super.equals(obj)) && (this.nicInformation != null ? this.nicInformation.equals(otherObj.nicInformation) : this.nicInformation == otherObj.nicInformation);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 105 */     return super.hashCode() ^ (this.nicInformation != null ? this.nicInformation.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 115 */     return "LocalISCSIPortInformation [super=" + super.toString() + ", " + "nicInformation=" + this.nicInformation + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\LocalISCSIPortInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */