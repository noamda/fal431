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
/*     */ @XmlType(name="ConsistencyGroupCopyVolumeCreationParams", propOrder={"volumeParams"})
/*     */ public class ConsistencyGroupCopyVolumeCreationParams
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<BaseVolumeParams> volumeParams;
/*     */   
/*     */   public ConsistencyGroupCopyVolumeCreationParams() {}
/*     */   
/*     */   public ConsistencyGroupCopyVolumeCreationParams(List<BaseVolumeParams> volumeParams)
/*     */   {
/*  48 */     this.volumeParams = volumeParams;
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
/*     */   public List<BaseVolumeParams> getVolumeParams()
/*     */   {
/*  74 */     if (this.volumeParams == null) {
/*  75 */       this.volumeParams = new ArrayList();
/*     */     }
/*  77 */     return this.volumeParams;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  87 */     if (!(obj instanceof ConsistencyGroupCopyVolumeCreationParams)) {
/*  88 */       return false;
/*     */     }
/*  90 */     ConsistencyGroupCopyVolumeCreationParams otherObj = (ConsistencyGroupCopyVolumeCreationParams)obj;
/*     */     
/*  92 */     return this.volumeParams == otherObj.volumeParams ? true : this.volumeParams != null ? this.volumeParams.equals(otherObj.volumeParams) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 101 */     return this.volumeParams != null ? this.volumeParams.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 110 */     return "ConsistencyGroupCopyVolumeCreationParams [volumeParams=" + this.volumeParams + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupCopyVolumeCreationParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */