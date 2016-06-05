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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VmInformation", propOrder={"vmUID", "vmName"})
/*     */ public class VmInformation
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected VmUID vmUID;
/*     */   protected String vmName;
/*     */   
/*     */   public VmInformation() {}
/*     */   
/*     */   public VmInformation(VmUID vmUID, String vmName)
/*     */   {
/*  49 */     this.vmUID = vmUID;
/*  50 */     this.vmName = vmName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VmUID getVmUID()
/*     */   {
/*  62 */     return this.vmUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVmUID(VmUID value)
/*     */   {
/*  74 */     this.vmUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getVmName()
/*     */   {
/*  86 */     return this.vmName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVmName(String value)
/*     */   {
/*  98 */     this.vmName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 108 */     if (!(obj instanceof VmInformation)) {
/* 109 */       return false;
/*     */     }
/* 111 */     VmInformation otherObj = (VmInformation)obj;
/*     */     
/* 113 */     return (this.vmUID != null ? this.vmUID.equals(otherObj.vmUID) : this.vmUID == otherObj.vmUID) && (this.vmName != null ? this.vmName.equals(otherObj.vmName) : this.vmName == otherObj.vmName);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 123 */     return (this.vmUID != null ? this.vmUID.hashCode() : 0) ^ (this.vmName != null ? this.vmName.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 133 */     return "VmInformation [vmUID=" + this.vmUID + ", " + "vmName=" + this.vmName + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VmInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */