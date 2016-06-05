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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="virtualNetworkConfigurationSet", propOrder={"innerSet"})
/*     */ public class VirtualNetworkConfigurationSet
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VirtualNetworkConfiguration> innerSet;
/*     */   
/*     */   public VirtualNetworkConfigurationSet() {}
/*     */   
/*     */   public VirtualNetworkConfigurationSet(List<VirtualNetworkConfiguration> innerSet)
/*     */   {
/*  55 */     this.innerSet = innerSet;
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
/*     */   public List<VirtualNetworkConfiguration> getInnerSet()
/*     */   {
/*  81 */     if (this.innerSet == null) {
/*  82 */       this.innerSet = new ArrayList();
/*     */     }
/*  84 */     return this.innerSet;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  94 */     if (!(obj instanceof VirtualNetworkConfigurationSet)) {
/*  95 */       return false;
/*     */     }
/*  97 */     VirtualNetworkConfigurationSet otherObj = (VirtualNetworkConfigurationSet)obj;
/*     */     
/*  99 */     return this.innerSet == otherObj.innerSet ? true : this.innerSet != null ? this.innerSet.equals(otherObj.innerSet) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 108 */     return this.innerSet != null ? this.innerSet.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 117 */     return "VirtualNetworkConfigurationSet [innerSet=" + this.innerSet + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VirtualNetworkConfigurationSet.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */