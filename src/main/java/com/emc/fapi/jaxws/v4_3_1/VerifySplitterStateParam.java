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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VerifySplitterStateParam", propOrder={"splitterStatus", "rpasForConnectivityCheck", "rpasConnectivityStatus", "volumesAccess", "groupCopiesToCheck"})
/*     */ public class VerifySplitterStateParam
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected SplitterStatus splitterStatus;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<RpaUID> rpasForConnectivityCheck;
/*     */   protected GeneralStatus rpasConnectivityStatus;
/*     */   protected VolumeAccessState volumesAccess;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupCopyUID> groupCopiesToCheck;
/*     */   
/*     */   public VerifySplitterStateParam() {}
/*     */   
/*     */   public VerifySplitterStateParam(SplitterStatus splitterStatus, List<RpaUID> rpasForConnectivityCheck, GeneralStatus rpasConnectivityStatus, VolumeAccessState volumesAccess, List<ConsistencyGroupCopyUID> groupCopiesToCheck)
/*     */   {
/*  62 */     this.splitterStatus = splitterStatus;
/*  63 */     this.rpasForConnectivityCheck = rpasForConnectivityCheck;
/*  64 */     this.rpasConnectivityStatus = rpasConnectivityStatus;
/*  65 */     this.volumesAccess = volumesAccess;
/*  66 */     this.groupCopiesToCheck = groupCopiesToCheck;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SplitterStatus getSplitterStatus()
/*     */   {
/*  78 */     return this.splitterStatus;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSplitterStatus(SplitterStatus value)
/*     */   {
/*  90 */     this.splitterStatus = value;
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
/* 116 */     if (this.rpasForConnectivityCheck == null) {
/* 117 */       this.rpasForConnectivityCheck = new ArrayList();
/*     */     }
/* 119 */     return this.rpasForConnectivityCheck;
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
/* 131 */     return this.rpasConnectivityStatus;
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
/* 143 */     this.rpasConnectivityStatus = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VolumeAccessState getVolumesAccess()
/*     */   {
/* 155 */     return this.volumesAccess;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVolumesAccess(VolumeAccessState value)
/*     */   {
/* 167 */     this.volumesAccess = value;
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
/*     */   public List<ConsistencyGroupCopyUID> getGroupCopiesToCheck()
/*     */   {
/* 193 */     if (this.groupCopiesToCheck == null) {
/* 194 */       this.groupCopiesToCheck = new ArrayList();
/*     */     }
/* 196 */     return this.groupCopiesToCheck;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 206 */     if (!(obj instanceof VerifySplitterStateParam)) {
/* 207 */       return false;
/*     */     }
/* 209 */     VerifySplitterStateParam otherObj = (VerifySplitterStateParam)obj;
/*     */     
/* 211 */     return (this.splitterStatus != null ? this.splitterStatus.equals(otherObj.splitterStatus) : this.splitterStatus == otherObj.splitterStatus) && (this.rpasForConnectivityCheck != null ? this.rpasForConnectivityCheck.equals(otherObj.rpasForConnectivityCheck) : this.rpasForConnectivityCheck == otherObj.rpasForConnectivityCheck) && (this.rpasConnectivityStatus != null ? this.rpasConnectivityStatus.equals(otherObj.rpasConnectivityStatus) : this.rpasConnectivityStatus == otherObj.rpasConnectivityStatus) && (this.volumesAccess != null ? this.volumesAccess.equals(otherObj.volumesAccess) : this.volumesAccess == otherObj.volumesAccess) && (this.groupCopiesToCheck != null ? this.groupCopiesToCheck.equals(otherObj.groupCopiesToCheck) : this.groupCopiesToCheck == otherObj.groupCopiesToCheck);
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
/*     */   public int hashCode()
/*     */   {
/* 224 */     return (this.splitterStatus != null ? this.splitterStatus.hashCode() : 0) ^ (this.rpasForConnectivityCheck != null ? this.rpasForConnectivityCheck.hashCode() : 0) ^ (this.rpasConnectivityStatus != null ? this.rpasConnectivityStatus.hashCode() : 0) ^ (this.volumesAccess != null ? this.volumesAccess.hashCode() : 0) ^ (this.groupCopiesToCheck != null ? this.groupCopiesToCheck.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 237 */     return "VerifySplitterStateParam [splitterStatus=" + this.splitterStatus + ", " + "rpasForConnectivityCheck=" + this.rpasForConnectivityCheck + ", " + "rpasConnectivityStatus=" + this.rpasConnectivityStatus + ", " + "volumesAccess=" + this.volumesAccess + ", " + "groupCopiesToCheck=" + this.groupCopiesToCheck + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VerifySplitterStateParam.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */