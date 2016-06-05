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
/*     */ @XmlType(name="setAttachedVolumesForSplitterParams", propOrder={"volumes"})
/*     */ public class SetAttachedVolumesForSplitterParams
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<SetVolumeParam> volumes;
/*     */   
/*     */   public SetAttachedVolumesForSplitterParams() {}
/*     */   
/*     */   public SetAttachedVolumesForSplitterParams(List<SetVolumeParam> volumes)
/*     */   {
/*  55 */     this.volumes = volumes;
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
/*     */   public List<SetVolumeParam> getVolumes()
/*     */   {
/*  81 */     if (this.volumes == null) {
/*  82 */       this.volumes = new ArrayList();
/*     */     }
/*  84 */     return this.volumes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  94 */     if (!(obj instanceof SetAttachedVolumesForSplitterParams)) {
/*  95 */       return false;
/*     */     }
/*  97 */     SetAttachedVolumesForSplitterParams otherObj = (SetAttachedVolumesForSplitterParams)obj;
/*     */     
/*  99 */     return this.volumes == otherObj.volumes ? true : this.volumes != null ? this.volumes.equals(otherObj.volumes) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 108 */     return this.volumes != null ? this.volumes.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 117 */     return "SetAttachedVolumesForSplitterParams [volumes=" + this.volumes + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetAttachedVolumesForSplitterParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */