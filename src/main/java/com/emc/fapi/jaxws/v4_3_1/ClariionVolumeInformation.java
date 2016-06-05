/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.codehaus.jackson.annotate.JsonTypeName;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @JsonTypeName("ClariionVolumeInformation")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ClariionVolumeInformation", propOrder={"groupSets"})
/*     */ public class ClariionVolumeInformation
/*     */   extends VolumeInformation
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<String> groupSets;
/*     */   
/*     */   public ClariionVolumeInformation() {}
/*     */   
/*     */   public ClariionVolumeInformation(List<String> groupSets)
/*     */   {
/*  58 */     this.groupSets = groupSets;
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
/*     */   public List<String> getGroupSets()
/*     */   {
/*  84 */     if (this.groupSets == null) {
/*  85 */       this.groupSets = new ArrayList();
/*     */     }
/*  87 */     return this.groupSets;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  97 */     if (!(obj instanceof ClariionVolumeInformation)) {
/*  98 */       return false;
/*     */     }
/* 100 */     ClariionVolumeInformation otherObj = (ClariionVolumeInformation)obj;
/*     */     
/* 102 */     return (super.equals(obj)) && (this.groupSets != null ? this.groupSets.equals(otherObj.groupSets) : this.groupSets == otherObj.groupSets);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 112 */     return super.hashCode() ^ (this.groupSets != null ? this.groupSets.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 122 */     return "ClariionVolumeInformation [super=" + super.toString() + ", " + "groupSets=" + this.groupSets + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ClariionVolumeInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */