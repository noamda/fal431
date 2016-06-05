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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupCopyParam", propOrder={"copyUID", "copyName", "volumeCreationParams"})
/*     */ public class ConsistencyGroupCopyParam
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected GlobalCopyUID copyUID;
/*     */   @XmlElement(required=true)
/*     */   protected String copyName;
/*     */   @XmlElement(required=true)
/*     */   protected ConsistencyGroupCopyVolumeCreationParams volumeCreationParams;
/*     */   
/*     */   public ConsistencyGroupCopyParam() {}
/*     */   
/*     */   public ConsistencyGroupCopyParam(GlobalCopyUID copyUID, String copyName, ConsistencyGroupCopyVolumeCreationParams volumeCreationParams)
/*     */   {
/*  54 */     this.copyUID = copyUID;
/*  55 */     this.copyName = copyName;
/*  56 */     this.volumeCreationParams = volumeCreationParams;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public GlobalCopyUID getCopyUID()
/*     */   {
/*  68 */     return this.copyUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCopyUID(GlobalCopyUID value)
/*     */   {
/*  80 */     this.copyUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getCopyName()
/*     */   {
/*  92 */     return this.copyName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCopyName(String value)
/*     */   {
/* 104 */     this.copyName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyVolumeCreationParams getVolumeCreationParams()
/*     */   {
/* 116 */     return this.volumeCreationParams;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVolumeCreationParams(ConsistencyGroupCopyVolumeCreationParams value)
/*     */   {
/* 128 */     this.volumeCreationParams = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 138 */     if (!(obj instanceof ConsistencyGroupCopyParam)) {
/* 139 */       return false;
/*     */     }
/* 141 */     ConsistencyGroupCopyParam otherObj = (ConsistencyGroupCopyParam)obj;
/*     */     
/* 143 */     return (this.copyUID != null ? this.copyUID.equals(otherObj.copyUID) : this.copyUID == otherObj.copyUID) && (this.copyName != null ? this.copyName.equals(otherObj.copyName) : this.copyName == otherObj.copyName) && (this.volumeCreationParams != null ? this.volumeCreationParams.equals(otherObj.volumeCreationParams) : this.volumeCreationParams == otherObj.volumeCreationParams);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 154 */     return (this.copyUID != null ? this.copyUID.hashCode() : 0) ^ (this.copyName != null ? this.copyName.hashCode() : 0) ^ (this.volumeCreationParams != null ? this.volumeCreationParams.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 165 */     return "ConsistencyGroupCopyParam [copyUID=" + this.copyUID + ", " + "copyName=" + this.copyName + ", " + "volumeCreationParams=" + this.volumeCreationParams + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupCopyParam.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */