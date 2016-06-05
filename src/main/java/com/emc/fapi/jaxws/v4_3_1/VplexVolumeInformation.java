/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @JsonTypeName("VplexVolumeInformation")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VplexVolumeInformation", propOrder={"locality", "winner", "vplexConsistencyGroupName", "recoverPointClusterName", "rpEnabled", "isMetroCandidate"})
/*     */ public class VplexVolumeInformation
/*     */   extends VolumeInformation
/*     */ {
/*     */   protected VplexVolumeLocality locality;
/*     */   protected boolean winner;
/*     */   protected String vplexConsistencyGroupName;
/*     */   protected String recoverPointClusterName;
/*     */   protected boolean rpEnabled;
/*     */   protected Boolean isMetroCandidate;
/*     */   
/*     */   public VplexVolumeInformation() {}
/*     */   
/*     */   public VplexVolumeInformation(VplexVolumeLocality locality, boolean winner, String vplexConsistencyGroupName, String recoverPointClusterName, boolean rpEnabled, Boolean isMetroCandidate)
/*     */   {
/*  69 */     this.locality = locality;
/*  70 */     this.winner = winner;
/*  71 */     this.vplexConsistencyGroupName = vplexConsistencyGroupName;
/*  72 */     this.recoverPointClusterName = recoverPointClusterName;
/*  73 */     this.rpEnabled = rpEnabled;
/*  74 */     this.isMetroCandidate = isMetroCandidate;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VplexVolumeLocality getLocality()
/*     */   {
/*  86 */     return this.locality;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLocality(VplexVolumeLocality value)
/*     */   {
/*  98 */     this.locality = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isWinner()
/*     */   {
/* 106 */     return this.winner;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setWinner(boolean value)
/*     */   {
/* 114 */     this.winner = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getVplexConsistencyGroupName()
/*     */   {
/* 126 */     return this.vplexConsistencyGroupName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVplexConsistencyGroupName(String value)
/*     */   {
/* 138 */     this.vplexConsistencyGroupName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getRecoverPointClusterName()
/*     */   {
/* 150 */     return this.recoverPointClusterName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRecoverPointClusterName(String value)
/*     */   {
/* 162 */     this.recoverPointClusterName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isRpEnabled()
/*     */   {
/* 170 */     return this.rpEnabled;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRpEnabled(boolean value)
/*     */   {
/* 178 */     this.rpEnabled = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Boolean isIsMetroCandidate()
/*     */   {
/* 190 */     return this.isMetroCandidate;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setIsMetroCandidate(Boolean value)
/*     */   {
/* 202 */     this.isMetroCandidate = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 212 */     if (!(obj instanceof VplexVolumeInformation)) {
/* 213 */       return false;
/*     */     }
/* 215 */     VplexVolumeInformation otherObj = (VplexVolumeInformation)obj;
/*     */     
/* 217 */     return (super.equals(obj)) && (this.locality != null ? this.locality.equals(otherObj.locality) : this.locality == otherObj.locality) && (this.winner == otherObj.winner) && (this.vplexConsistencyGroupName != null ? this.vplexConsistencyGroupName.equals(otherObj.vplexConsistencyGroupName) : this.vplexConsistencyGroupName == otherObj.vplexConsistencyGroupName) && (this.recoverPointClusterName != null ? this.recoverPointClusterName.equals(otherObj.recoverPointClusterName) : this.recoverPointClusterName == otherObj.recoverPointClusterName) && (this.rpEnabled == otherObj.rpEnabled) && (this.isMetroCandidate != null ? this.isMetroCandidate.equals(otherObj.isMetroCandidate) : this.isMetroCandidate == otherObj.isMetroCandidate);
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
/*     */   public int hashCode()
/*     */   {
/* 232 */     return super.hashCode() ^ (this.locality != null ? this.locality.hashCode() : 0) ^ (this.winner ? 1 : 0) ^ (this.vplexConsistencyGroupName != null ? this.vplexConsistencyGroupName.hashCode() : 0) ^ (this.recoverPointClusterName != null ? this.recoverPointClusterName.hashCode() : 0) ^ (this.rpEnabled ? 1 : 0) ^ (this.isMetroCandidate != null ? this.isMetroCandidate.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 247 */     return "VplexVolumeInformation [super=" + super.toString() + ", " + "locality=" + this.locality + ", " + "winner=" + this.winner + ", " + "vplexConsistencyGroupName=" + this.vplexConsistencyGroupName + ", " + "recoverPointClusterName=" + this.recoverPointClusterName + ", " + "rpEnabled=" + this.rpEnabled + ", " + "isMetroCandidate=" + this.isMetroCandidate + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VplexVolumeInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */