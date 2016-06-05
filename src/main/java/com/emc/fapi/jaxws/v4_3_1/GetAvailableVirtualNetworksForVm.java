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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="getAvailableVirtualNetworksForVm", propOrder={"vmUid"})
/*     */ public class GetAvailableVirtualNetworksForVm
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected VmUID vmUid;
/*     */   
/*     */   public GetAvailableVirtualNetworksForVm() {}
/*     */   
/*     */   public GetAvailableVirtualNetworksForVm(VmUID vmUid)
/*     */   {
/*  46 */     this.vmUid = vmUid;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VmUID getVmUid()
/*     */   {
/*  58 */     return this.vmUid;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVmUid(VmUID value)
/*     */   {
/*  70 */     this.vmUid = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  80 */     if (!(obj instanceof GetAvailableVirtualNetworksForVm)) {
/*  81 */       return false;
/*     */     }
/*  83 */     GetAvailableVirtualNetworksForVm otherObj = (GetAvailableVirtualNetworksForVm)obj;
/*     */     
/*  85 */     return this.vmUid == otherObj.vmUid ? true : this.vmUid != null ? this.vmUid.equals(otherObj.vmUid) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  94 */     return this.vmUid != null ? this.vmUid.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 103 */     return "GetAvailableVirtualNetworksForVm [vmUid=" + this.vmUid + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetAvailableVirtualNetworksForVm.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */