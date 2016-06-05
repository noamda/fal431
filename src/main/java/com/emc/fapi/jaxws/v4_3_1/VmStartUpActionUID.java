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
/*     */ @XmlType(name="VmStartUpActionUID", propOrder={"id", "vmUID"})
/*     */ public class VmStartUpActionUID
/*     */ {
/*     */   protected long id;
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected VmUID vmUID;
/*     */   
/*     */   public VmStartUpActionUID() {}
/*     */   
/*     */   public VmStartUpActionUID(long id, VmUID vmUID)
/*     */   {
/*  49 */     this.id = id;
/*  50 */     this.vmUID = vmUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getId()
/*     */   {
/*  58 */     return this.id;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setId(long value)
/*     */   {
/*  66 */     this.id = value;
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
/*  78 */     return this.vmUID;
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
/*  90 */     this.vmUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 100 */     if (!(obj instanceof VmStartUpActionUID)) {
/* 101 */       return false;
/*     */     }
/* 103 */     VmStartUpActionUID otherObj = (VmStartUpActionUID)obj;
/*     */     
/* 105 */     return (this.id == otherObj.id) && (this.vmUID != null ? this.vmUID.equals(otherObj.vmUID) : this.vmUID == otherObj.vmUID);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 115 */     return (int)this.id ^ (this.vmUID != null ? this.vmUID.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 125 */     return "VmStartUpActionUID [id=" + this.id + ", " + "vmUID=" + this.vmUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VmStartUpActionUID.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */