/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="getAvailableVirtualNetworksForVms", propOrder={"vmUids"})
/*     */ public class GetAvailableVirtualNetworksForVms
/*     */ {
/*     */   protected List<VmUID> vmUids;
/*     */   
/*     */   public GetAvailableVirtualNetworksForVms() {}
/*     */   
/*     */   public GetAvailableVirtualNetworksForVms(List<VmUID> vmUids)
/*     */   {
/*  46 */     this.vmUids = vmUids;
/*     */   }
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
/*     */   public List<VmUID> getVmUids()
/*     */   {
/*  72 */     if (this.vmUids == null) {
/*  73 */       this.vmUids = new ArrayList();
/*     */     }
/*  75 */     return this.vmUids;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  85 */     if (!(obj instanceof GetAvailableVirtualNetworksForVms)) {
/*  86 */       return false;
/*     */     }
/*  88 */     GetAvailableVirtualNetworksForVms otherObj = (GetAvailableVirtualNetworksForVms)obj;
/*     */     
/*  90 */     return this.vmUids == otherObj.vmUids ? true : this.vmUids != null ? this.vmUids.equals(otherObj.vmUids) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  99 */     return this.vmUids != null ? this.vmUids.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 108 */     return "GetAvailableVirtualNetworksForVms [vmUids=" + this.vmUids + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetAvailableVirtualNetworksForVms.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */