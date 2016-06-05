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
/*     */ @XmlType(name="setVMsNetworkPolicies", propOrder={"networkSettingsForVMs"})
/*     */ public class SetVMsNetworkPolicies
/*     */ {
/*     */   protected List<VmNetworkPolicy> networkSettingsForVMs;
/*     */   
/*     */   public SetVMsNetworkPolicies() {}
/*     */   
/*     */   public SetVMsNetworkPolicies(List<VmNetworkPolicy> networkSettingsForVMs)
/*     */   {
/*  46 */     this.networkSettingsForVMs = networkSettingsForVMs;
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
/*     */   public List<VmNetworkPolicy> getNetworkSettingsForVMs()
/*     */   {
/*  72 */     if (this.networkSettingsForVMs == null) {
/*  73 */       this.networkSettingsForVMs = new ArrayList();
/*     */     }
/*  75 */     return this.networkSettingsForVMs;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  85 */     if (!(obj instanceof SetVMsNetworkPolicies)) {
/*  86 */       return false;
/*     */     }
/*  88 */     SetVMsNetworkPolicies otherObj = (SetVMsNetworkPolicies)obj;
/*     */     
/*  90 */     return this.networkSettingsForVMs == otherObj.networkSettingsForVMs ? true : this.networkSettingsForVMs != null ? this.networkSettingsForVMs.equals(otherObj.networkSettingsForVMs) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  99 */     return this.networkSettingsForVMs != null ? this.networkSettingsForVMs.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 108 */     return "SetVMsNetworkPolicies [networkSettingsForVMs=" + this.networkSettingsForVMs + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetVMsNetworkPolicies.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */