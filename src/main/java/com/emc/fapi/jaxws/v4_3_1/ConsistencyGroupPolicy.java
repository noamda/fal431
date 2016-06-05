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
/*     */ 
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
/*     */ @XmlType(name="ConsistencyGroupPolicy", propOrder={"primaryRPANumber", "secondaryRPAsNumbers", "reservationSupported", "canTransferOnNonPreferredRPA", "hostsDelayExpiryTimeoutInSeconds", "distributedGroup", "priority", "managementSettings", "readOnlyInReplicaVolumes", "preferedClusterUID", "powerUp"})
/*     */ public class ConsistencyGroupPolicy
/*     */ {
/*     */   protected int primaryRPANumber;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<Integer> secondaryRPAsNumbers;
/*     */   protected boolean reservationSupported;
/*     */   protected boolean canTransferOnNonPreferredRPA;
/*     */   protected Integer hostsDelayExpiryTimeoutInSeconds;
/*     */   protected boolean distributedGroup;
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected Priority priority;
/*     */   @XmlElement(required=true)
/*     */   protected ConsistencyGroupManagementSettings managementSettings;
/*     */   protected boolean readOnlyInReplicaVolumes;
/*     */   protected ClusterUID preferedClusterUID;
/*     */   protected Integer powerUp;
/*     */   
/*     */   public ConsistencyGroupPolicy() {}
/*     */   
/*     */   public ConsistencyGroupPolicy(int primaryRPANumber, List<Integer> secondaryRPAsNumbers, boolean reservationSupported, boolean canTransferOnNonPreferredRPA, Integer hostsDelayExpiryTimeoutInSeconds, boolean distributedGroup, Priority priority, ConsistencyGroupManagementSettings managementSettings, boolean readOnlyInReplicaVolumes, ClusterUID preferedClusterUID, Integer powerUp)
/*     */   {
/*  80 */     this.primaryRPANumber = primaryRPANumber;
/*  81 */     this.secondaryRPAsNumbers = secondaryRPAsNumbers;
/*  82 */     this.reservationSupported = reservationSupported;
/*  83 */     this.canTransferOnNonPreferredRPA = canTransferOnNonPreferredRPA;
/*  84 */     this.hostsDelayExpiryTimeoutInSeconds = hostsDelayExpiryTimeoutInSeconds;
/*  85 */     this.distributedGroup = distributedGroup;
/*  86 */     this.priority = priority;
/*  87 */     this.managementSettings = managementSettings;
/*  88 */     this.readOnlyInReplicaVolumes = readOnlyInReplicaVolumes;
/*  89 */     this.preferedClusterUID = preferedClusterUID;
/*  90 */     this.powerUp = powerUp;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getPrimaryRPANumber()
/*     */   {
/*  98 */     return this.primaryRPANumber;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPrimaryRPANumber(int value)
/*     */   {
/* 106 */     this.primaryRPANumber = value;
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
/*     */   public List<Integer> getSecondaryRPAsNumbers()
/*     */   {
/* 132 */     if (this.secondaryRPAsNumbers == null) {
/* 133 */       this.secondaryRPAsNumbers = new ArrayList();
/*     */     }
/* 135 */     return this.secondaryRPAsNumbers;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isReservationSupported()
/*     */   {
/* 143 */     return this.reservationSupported;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setReservationSupported(boolean value)
/*     */   {
/* 151 */     this.reservationSupported = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isCanTransferOnNonPreferredRPA()
/*     */   {
/* 159 */     return this.canTransferOnNonPreferredRPA;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCanTransferOnNonPreferredRPA(boolean value)
/*     */   {
/* 167 */     this.canTransferOnNonPreferredRPA = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Integer getHostsDelayExpiryTimeoutInSeconds()
/*     */   {
/* 179 */     return this.hostsDelayExpiryTimeoutInSeconds;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setHostsDelayExpiryTimeoutInSeconds(Integer value)
/*     */   {
/* 191 */     this.hostsDelayExpiryTimeoutInSeconds = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isDistributedGroup()
/*     */   {
/* 199 */     return this.distributedGroup;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDistributedGroup(boolean value)
/*     */   {
/* 207 */     this.distributedGroup = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Priority getPriority()
/*     */   {
/* 219 */     return this.priority;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPriority(Priority value)
/*     */   {
/* 231 */     this.priority = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupManagementSettings getManagementSettings()
/*     */   {
/* 243 */     return this.managementSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setManagementSettings(ConsistencyGroupManagementSettings value)
/*     */   {
/* 255 */     this.managementSettings = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isReadOnlyInReplicaVolumes()
/*     */   {
/* 263 */     return this.readOnlyInReplicaVolumes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setReadOnlyInReplicaVolumes(boolean value)
/*     */   {
/* 271 */     this.readOnlyInReplicaVolumes = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ClusterUID getPreferedClusterUID()
/*     */   {
/* 283 */     return this.preferedClusterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPreferedClusterUID(ClusterUID value)
/*     */   {
/* 295 */     this.preferedClusterUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Integer getPowerUp()
/*     */   {
/* 307 */     return this.powerUp;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPowerUp(Integer value)
/*     */   {
/* 319 */     this.powerUp = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 329 */     if (!(obj instanceof ConsistencyGroupPolicy)) {
/* 330 */       return false;
/*     */     }
/* 332 */     ConsistencyGroupPolicy otherObj = (ConsistencyGroupPolicy)obj;
/*     */     
/* 334 */     return (this.primaryRPANumber == otherObj.primaryRPANumber) && (this.secondaryRPAsNumbers != null ? this.secondaryRPAsNumbers.equals(otherObj.secondaryRPAsNumbers) : this.secondaryRPAsNumbers == otherObj.secondaryRPAsNumbers) && (this.reservationSupported == otherObj.reservationSupported) && (this.canTransferOnNonPreferredRPA == otherObj.canTransferOnNonPreferredRPA) && (this.hostsDelayExpiryTimeoutInSeconds != null ? this.hostsDelayExpiryTimeoutInSeconds.equals(otherObj.hostsDelayExpiryTimeoutInSeconds) : this.hostsDelayExpiryTimeoutInSeconds == otherObj.hostsDelayExpiryTimeoutInSeconds) && (this.distributedGroup == otherObj.distributedGroup) && (this.priority != null ? this.priority.equals(otherObj.priority) : this.priority == otherObj.priority) && (this.managementSettings != null ? this.managementSettings.equals(otherObj.managementSettings) : this.managementSettings == otherObj.managementSettings) && (this.readOnlyInReplicaVolumes == otherObj.readOnlyInReplicaVolumes) && (this.preferedClusterUID != null ? this.preferedClusterUID.equals(otherObj.preferedClusterUID) : this.preferedClusterUID == otherObj.preferedClusterUID) && (this.powerUp != null ? this.powerUp.equals(otherObj.powerUp) : this.powerUp == otherObj.powerUp);
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
/*     */   public int hashCode()
/*     */   {
/* 353 */     return this.primaryRPANumber ^ (this.secondaryRPAsNumbers != null ? this.secondaryRPAsNumbers.hashCode() : 0) ^ (this.reservationSupported ? 1 : 0) ^ (this.canTransferOnNonPreferredRPA ? 1 : 0) ^ (this.hostsDelayExpiryTimeoutInSeconds != null ? this.hostsDelayExpiryTimeoutInSeconds.hashCode() : 0) ^ (this.distributedGroup ? 1 : 0) ^ (this.priority != null ? this.priority.hashCode() : 0) ^ (this.managementSettings != null ? this.managementSettings.hashCode() : 0) ^ (this.readOnlyInReplicaVolumes ? 1 : 0) ^ (this.preferedClusterUID != null ? this.preferedClusterUID.hashCode() : 0) ^ (this.powerUp != null ? this.powerUp.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 372 */     return "ConsistencyGroupPolicy [primaryRPANumber=" + this.primaryRPANumber + ", " + "secondaryRPAsNumbers=" + this.secondaryRPAsNumbers + ", " + "reservationSupported=" + this.reservationSupported + ", " + "canTransferOnNonPreferredRPA=" + this.canTransferOnNonPreferredRPA + ", " + "hostsDelayExpiryTimeoutInSeconds=" + this.hostsDelayExpiryTimeoutInSeconds + ", " + "distributedGroup=" + this.distributedGroup + ", " + "priority=" + this.priority + ", " + "managementSettings=" + this.managementSettings + ", " + "readOnlyInReplicaVolumes=" + this.readOnlyInReplicaVolumes + ", " + "preferedClusterUID=" + this.preferedClusterUID + ", " + "powerUp=" + this.powerUp + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */