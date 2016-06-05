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
/*     */ @XmlType(name="VmPowerUpSequenceParam", propOrder={"vmReplicationSetUID", "powerUpSequenceNumber", "isCritical"})
/*     */ public class VmPowerUpSequenceParam
/*     */ {
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected VmReplicationSetUID vmReplicationSetUID;
/*     */   protected int powerUpSequenceNumber;
/*     */   protected Boolean isCritical;
/*     */   
/*     */   public VmPowerUpSequenceParam() {}
/*     */   
/*     */   public VmPowerUpSequenceParam(VmReplicationSetUID vmReplicationSetUID, int powerUpSequenceNumber, Boolean isCritical)
/*     */   {
/*  52 */     this.vmReplicationSetUID = vmReplicationSetUID;
/*  53 */     this.powerUpSequenceNumber = powerUpSequenceNumber;
/*  54 */     this.isCritical = isCritical;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VmReplicationSetUID getVmReplicationSetUID()
/*     */   {
/*  66 */     return this.vmReplicationSetUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVmReplicationSetUID(VmReplicationSetUID value)
/*     */   {
/*  78 */     this.vmReplicationSetUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getPowerUpSequenceNumber()
/*     */   {
/*  86 */     return this.powerUpSequenceNumber;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPowerUpSequenceNumber(int value)
/*     */   {
/*  94 */     this.powerUpSequenceNumber = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Boolean isIsCritical()
/*     */   {
/* 106 */     return this.isCritical;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setIsCritical(Boolean value)
/*     */   {
/* 118 */     this.isCritical = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 128 */     if (!(obj instanceof VmPowerUpSequenceParam)) {
/* 129 */       return false;
/*     */     }
/* 131 */     VmPowerUpSequenceParam otherObj = (VmPowerUpSequenceParam)obj;
/*     */     
/* 133 */     return (this.vmReplicationSetUID != null ? this.vmReplicationSetUID.equals(otherObj.vmReplicationSetUID) : this.vmReplicationSetUID == otherObj.vmReplicationSetUID) && (this.powerUpSequenceNumber == otherObj.powerUpSequenceNumber) && (this.isCritical != null ? this.isCritical.equals(otherObj.isCritical) : this.isCritical == otherObj.isCritical);
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
/* 144 */     return (this.vmReplicationSetUID != null ? this.vmReplicationSetUID.hashCode() : 0) ^ this.powerUpSequenceNumber ^ (this.isCritical != null ? this.isCritical.hashCode() : 0);
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
/* 155 */     return "VmPowerUpSequenceParam [vmReplicationSetUID=" + this.vmReplicationSetUID + ", " + "powerUpSequenceNumber=" + this.powerUpSequenceNumber + ", " + "isCritical=" + this.isCritical + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VmPowerUpSequenceParam.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */