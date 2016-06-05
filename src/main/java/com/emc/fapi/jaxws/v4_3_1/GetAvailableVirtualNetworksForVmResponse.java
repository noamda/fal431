/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ @XmlType(name="getAvailableVirtualNetworksForVmResponse", propOrder={"_return"})
/*     */ public class GetAvailableVirtualNetworksForVmResponse
/*     */ {
/*     */   @XmlElement(name="return")
/*     */   protected List<VirtualNetworkConfiguration> _return;
/*     */   
/*     */   public GetAvailableVirtualNetworksForVmResponse() {}
/*     */   
/*     */   public GetAvailableVirtualNetworksForVmResponse(List<VirtualNetworkConfiguration> _return)
/*     */   {
/*  48 */     this._return = _return;
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
/*     */   public List<VirtualNetworkConfiguration> getReturn()
/*     */   {
/*  74 */     if (this._return == null) {
/*  75 */       this._return = new ArrayList();
/*     */     }
/*  77 */     return this._return;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  87 */     if (!(obj instanceof GetAvailableVirtualNetworksForVmResponse)) {
/*  88 */       return false;
/*     */     }
/*  90 */     GetAvailableVirtualNetworksForVmResponse otherObj = (GetAvailableVirtualNetworksForVmResponse)obj;
/*     */     
/*  92 */     return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 101 */     return this._return != null ? this._return.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 110 */     return "GetAvailableVirtualNetworksForVmResponse [_return=" + this._return + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetAvailableVirtualNetworksForVmResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */