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
/*     */ @XmlType(name="getClusterSpecificVMsEntitiesInformationResponse", propOrder={"_return"})
/*     */ public class GetClusterSpecificVMsEntitiesInformationResponse
/*     */ {
/*     */   @XmlElement(name="return")
/*     */   protected List<VMEntitiesInformation> _return;
/*     */   
/*     */   public GetClusterSpecificVMsEntitiesInformationResponse() {}
/*     */   
/*     */   public GetClusterSpecificVMsEntitiesInformationResponse(List<VMEntitiesInformation> _return)
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
/*     */   public List<VMEntitiesInformation> getReturn()
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
/*  87 */     if (!(obj instanceof GetClusterSpecificVMsEntitiesInformationResponse)) {
/*  88 */       return false;
/*     */     }
/*  90 */     GetClusterSpecificVMsEntitiesInformationResponse otherObj = (GetClusterSpecificVMsEntitiesInformationResponse)obj;
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
/* 110 */     return "GetClusterSpecificVMsEntitiesInformationResponse [_return=" + this._return + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetClusterSpecificVMsEntitiesInformationResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */