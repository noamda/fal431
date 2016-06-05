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
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VerifyRPAStateParam", propOrder={"rpaStatus", "repositoryStatus", "hasClusterControl", "volumesConnectivityStatus", "rpasForConnectivityCheck", "rpasConnectivityStatus"})
/*     */ public class VerifyRPAStateParam
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected RpaStatus rpaStatus;
/*     */   protected VolumeStatus repositoryStatus;
/*     */   protected Boolean hasClusterControl;
/*     */   protected GeneralStatus volumesConnectivityStatus;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<RpaUID> rpasForConnectivityCheck;
/*     */   protected GeneralStatus rpasConnectivityStatus;
/*     */   
/*     */   public VerifyRPAStateParam() {}
/*     */   
/*     */   public VerifyRPAStateParam(RpaStatus rpaStatus, VolumeStatus repositoryStatus, Boolean hasClusterControl, GeneralStatus volumesConnectivityStatus, List<RpaUID> rpasForConnectivityCheck, GeneralStatus rpasConnectivityStatus)
/*     */   {
/*  64 */     this.rpaStatus = rpaStatus;
/*  65 */     this.repositoryStatus = repositoryStatus;
/*  66 */     this.hasClusterControl = hasClusterControl;
/*  67 */     this.volumesConnectivityStatus = volumesConnectivityStatus;
/*  68 */     this.rpasForConnectivityCheck = rpasForConnectivityCheck;
/*  69 */     this.rpasConnectivityStatus = rpasConnectivityStatus;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RpaStatus getRpaStatus()
/*     */   {
/*  81 */     return this.rpaStatus;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRpaStatus(RpaStatus value)
/*     */   {
/*  93 */     this.rpaStatus = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VolumeStatus getRepositoryStatus()
/*     */   {
/* 105 */     return this.repositoryStatus;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRepositoryStatus(VolumeStatus value)
/*     */   {
/* 117 */     this.repositoryStatus = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Boolean isHasClusterControl()
/*     */   {
/* 129 */     return this.hasClusterControl;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setHasClusterControl(Boolean value)
/*     */   {
/* 141 */     this.hasClusterControl = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public GeneralStatus getVolumesConnectivityStatus()
/*     */   {
/* 153 */     return this.volumesConnectivityStatus;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVolumesConnectivityStatus(GeneralStatus value)
/*     */   {
/* 165 */     this.volumesConnectivityStatus = value;
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
/*     */   public List<RpaUID> getRpasForConnectivityCheck()
/*     */   {
/* 191 */     if (this.rpasForConnectivityCheck == null) {
/* 192 */       this.rpasForConnectivityCheck = new ArrayList();
/*     */     }
/* 194 */     return this.rpasForConnectivityCheck;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public GeneralStatus getRpasConnectivityStatus()
/*     */   {
/* 206 */     return this.rpasConnectivityStatus;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRpasConnectivityStatus(GeneralStatus value)
/*     */   {
/* 218 */     this.rpasConnectivityStatus = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 228 */     if (!(obj instanceof VerifyRPAStateParam)) {
/* 229 */       return false;
/*     */     }
/* 231 */     VerifyRPAStateParam otherObj = (VerifyRPAStateParam)obj;
/*     */     
/* 233 */     return (this.rpaStatus != null ? this.rpaStatus.equals(otherObj.rpaStatus) : this.rpaStatus == otherObj.rpaStatus) && (this.repositoryStatus != null ? this.repositoryStatus.equals(otherObj.repositoryStatus) : this.repositoryStatus == otherObj.repositoryStatus) && (this.hasClusterControl != null ? this.hasClusterControl.equals(otherObj.hasClusterControl) : this.hasClusterControl == otherObj.hasClusterControl) && (this.volumesConnectivityStatus != null ? this.volumesConnectivityStatus.equals(otherObj.volumesConnectivityStatus) : this.volumesConnectivityStatus == otherObj.volumesConnectivityStatus) && (this.rpasForConnectivityCheck != null ? this.rpasForConnectivityCheck.equals(otherObj.rpasForConnectivityCheck) : this.rpasForConnectivityCheck == otherObj.rpasForConnectivityCheck) && (this.rpasConnectivityStatus != null ? this.rpasConnectivityStatus.equals(otherObj.rpasConnectivityStatus) : this.rpasConnectivityStatus == otherObj.rpasConnectivityStatus);
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
/*     */   public int hashCode()
/*     */   {
/* 247 */     return (this.rpaStatus != null ? this.rpaStatus.hashCode() : 0) ^ (this.repositoryStatus != null ? this.repositoryStatus.hashCode() : 0) ^ (this.hasClusterControl != null ? this.hasClusterControl.hashCode() : 0) ^ (this.volumesConnectivityStatus != null ? this.volumesConnectivityStatus.hashCode() : 0) ^ (this.rpasForConnectivityCheck != null ? this.rpasForConnectivityCheck.hashCode() : 0) ^ (this.rpasConnectivityStatus != null ? this.rpasConnectivityStatus.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 261 */     return "VerifyRPAStateParam [rpaStatus=" + this.rpaStatus + ", " + "repositoryStatus=" + this.repositoryStatus + ", " + "hasClusterControl=" + this.hasClusterControl + ", " + "volumesConnectivityStatus=" + this.volumesConnectivityStatus + ", " + "rpasForConnectivityCheck=" + this.rpasForConnectivityCheck + ", " + "rpasConnectivityStatus=" + this.rpasConnectivityStatus + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VerifyRPAStateParam.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */