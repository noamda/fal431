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
/*     */ @JsonTypeName("RemoteISCSIPortInformation")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="RemoteISCSIPortInformation", propOrder={"ipInformation"})
/*     */ public class RemoteISCSIPortInformation
/*     */   extends ISCSIPortInformation
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected IPInformation ipInformation;
/*     */   
/*     */   public RemoteISCSIPortInformation() {}
/*     */   
/*     */   public RemoteISCSIPortInformation(IPInformation ipInformation)
/*     */   {
/*  56 */     this.ipInformation = ipInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public IPInformation getIpInformation()
/*     */   {
/*  68 */     return this.ipInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setIpInformation(IPInformation value)
/*     */   {
/*  80 */     this.ipInformation = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  90 */     if (!(obj instanceof RemoteISCSIPortInformation)) {
/*  91 */       return false;
/*     */     }
/*  93 */     RemoteISCSIPortInformation otherObj = (RemoteISCSIPortInformation)obj;
/*     */     
/*  95 */     return (super.equals(obj)) && (this.ipInformation != null ? this.ipInformation.equals(otherObj.ipInformation) : this.ipInformation == otherObj.ipInformation);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 105 */     return super.hashCode() ^ (this.ipInformation != null ? this.ipInformation.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 115 */     return "RemoteISCSIPortInformation [super=" + super.toString() + ", " + "ipInformation=" + this.ipInformation + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RemoteISCSIPortInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */