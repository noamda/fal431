/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
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
/*     */ @JsonTypeName("ClusterLicenseSettings")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ClusterLicenseSettings", propOrder={"clusterUID"})
/*     */ public class ClusterLicenseSettings
/*     */   extends LicenseSettings
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected ClusterUID clusterUID;
/*     */   
/*     */   public ClusterLicenseSettings() {}
/*     */   
/*     */   public ClusterLicenseSettings(ClusterUID clusterUID)
/*     */   {
/*  56 */     this.clusterUID = clusterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ClusterUID getClusterUID()
/*     */   {
/*  68 */     return this.clusterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setClusterUID(ClusterUID value)
/*     */   {
/*  80 */     this.clusterUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  90 */     if (!(obj instanceof ClusterLicenseSettings)) {
/*  91 */       return false;
/*     */     }
/*  93 */     ClusterLicenseSettings otherObj = (ClusterLicenseSettings)obj;
/*     */     
/*  95 */     return (super.equals(obj)) && (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 105 */     return super.hashCode() ^ (this.clusterUID != null ? this.clusterUID.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 115 */     return "ClusterLicenseSettings [super=" + super.toString() + ", " + "clusterUID=" + this.clusterUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ClusterLicenseSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */