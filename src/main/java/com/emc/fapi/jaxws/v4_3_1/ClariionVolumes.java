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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ClariionVolumes", propOrder={"splitterUID", "volumesInformation"})
/*     */ public class ClariionVolumes
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected SplitterUID splitterUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ClariionVolumeInformation> volumesInformation;
/*     */   
/*     */   public ClariionVolumes() {}
/*     */   
/*     */   public ClariionVolumes(SplitterUID splitterUID, List<ClariionVolumeInformation> volumesInformation)
/*     */   {
/*  52 */     this.splitterUID = splitterUID;
/*  53 */     this.volumesInformation = volumesInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SplitterUID getSplitterUID()
/*     */   {
/*  65 */     return this.splitterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSplitterUID(SplitterUID value)
/*     */   {
/*  77 */     this.splitterUID = value;
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
/*     */   public List<ClariionVolumeInformation> getVolumesInformation()
/*     */   {
/* 103 */     if (this.volumesInformation == null) {
/* 104 */       this.volumesInformation = new ArrayList();
/*     */     }
/* 106 */     return this.volumesInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 116 */     if (!(obj instanceof ClariionVolumes)) {
/* 117 */       return false;
/*     */     }
/* 119 */     ClariionVolumes otherObj = (ClariionVolumes)obj;
/*     */     
/* 121 */     return (this.splitterUID != null ? this.splitterUID.equals(otherObj.splitterUID) : this.splitterUID == otherObj.splitterUID) && (this.volumesInformation != null ? this.volumesInformation.equals(otherObj.volumesInformation) : this.volumesInformation == otherObj.volumesInformation);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 131 */     return (this.splitterUID != null ? this.splitterUID.hashCode() : 0) ^ (this.volumesInformation != null ? this.volumesInformation.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 141 */     return "ClariionVolumes [splitterUID=" + this.splitterUID + ", " + "volumesInformation=" + this.volumesInformation + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ClariionVolumes.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */