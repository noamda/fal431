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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @JsonTypeName("ConsistencyGroupSetRecoveryActivity")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupSetRecoveryActivity", propOrder={"consistencyGroupSetUID", "groupSetName", "clusterUID", "numOfGroupsInImageAccess", "numOfGroups", "consistencyGroupSetTransferState", "copiesRecoveryActivities", "copyToResumeProduction"})
/*     */ public class ConsistencyGroupSetRecoveryActivity
/*     */   extends BaseRecoveryActivity
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected ConsistencyGroupSetUID consistencyGroupSetUID;
/*     */   protected String groupSetName;
/*     */   @XmlElement(nillable=true)
/*     */   protected ClusterUID clusterUID;
/*     */   protected int numOfGroupsInImageAccess;
/*     */   protected int numOfGroups;
/*     */   protected GroupSetTransferState consistencyGroupSetTransferState;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupCopyRecoveryActivity> copiesRecoveryActivities;
/*     */   protected ConsistencyGroupCopyUID copyToResumeProduction;
/*     */   
/*     */   public ConsistencyGroupSetRecoveryActivity() {}
/*     */   
/*     */   public ConsistencyGroupSetRecoveryActivity(ConsistencyGroupSetUID consistencyGroupSetUID, String groupSetName, ClusterUID clusterUID, int numOfGroupsInImageAccess, int numOfGroups, GroupSetTransferState consistencyGroupSetTransferState, List<ConsistencyGroupCopyRecoveryActivity> copiesRecoveryActivities, ConsistencyGroupCopyUID copyToResumeProduction)
/*     */   {
/*  81 */     this.consistencyGroupSetUID = consistencyGroupSetUID;
/*  82 */     this.groupSetName = groupSetName;
/*  83 */     this.clusterUID = clusterUID;
/*  84 */     this.numOfGroupsInImageAccess = numOfGroupsInImageAccess;
/*  85 */     this.numOfGroups = numOfGroups;
/*  86 */     this.consistencyGroupSetTransferState = consistencyGroupSetTransferState;
/*  87 */     this.copiesRecoveryActivities = copiesRecoveryActivities;
/*  88 */     this.copyToResumeProduction = copyToResumeProduction;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupSetUID getConsistencyGroupSetUID()
/*     */   {
/* 100 */     return this.consistencyGroupSetUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setConsistencyGroupSetUID(ConsistencyGroupSetUID value)
/*     */   {
/* 112 */     this.consistencyGroupSetUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getGroupSetName()
/*     */   {
/* 124 */     return this.groupSetName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupSetName(String value)
/*     */   {
/* 136 */     this.groupSetName = value;
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
/* 148 */     return this.clusterUID;
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
/* 160 */     this.clusterUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getNumOfGroupsInImageAccess()
/*     */   {
/* 168 */     return this.numOfGroupsInImageAccess;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNumOfGroupsInImageAccess(int value)
/*     */   {
/* 176 */     this.numOfGroupsInImageAccess = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getNumOfGroups()
/*     */   {
/* 184 */     return this.numOfGroups;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNumOfGroups(int value)
/*     */   {
/* 192 */     this.numOfGroups = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public GroupSetTransferState getConsistencyGroupSetTransferState()
/*     */   {
/* 204 */     return this.consistencyGroupSetTransferState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setConsistencyGroupSetTransferState(GroupSetTransferState value)
/*     */   {
/* 216 */     this.consistencyGroupSetTransferState = value;
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
/*     */   public List<ConsistencyGroupCopyRecoveryActivity> getCopiesRecoveryActivities()
/*     */   {
/* 242 */     if (this.copiesRecoveryActivities == null) {
/* 243 */       this.copiesRecoveryActivities = new ArrayList();
/*     */     }
/* 245 */     return this.copiesRecoveryActivities;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyUID getCopyToResumeProduction()
/*     */   {
/* 257 */     return this.copyToResumeProduction;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCopyToResumeProduction(ConsistencyGroupCopyUID value)
/*     */   {
/* 269 */     this.copyToResumeProduction = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 279 */     if (!(obj instanceof ConsistencyGroupSetRecoveryActivity)) {
/* 280 */       return false;
/*     */     }
/* 282 */     ConsistencyGroupSetRecoveryActivity otherObj = (ConsistencyGroupSetRecoveryActivity)obj;
/*     */     
/* 284 */     return (super.equals(obj)) && (this.consistencyGroupSetUID != null ? this.consistencyGroupSetUID.equals(otherObj.consistencyGroupSetUID) : this.consistencyGroupSetUID == otherObj.consistencyGroupSetUID) && (this.groupSetName != null ? this.groupSetName.equals(otherObj.groupSetName) : this.groupSetName == otherObj.groupSetName) && (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.numOfGroupsInImageAccess == otherObj.numOfGroupsInImageAccess) && (this.numOfGroups == otherObj.numOfGroups) && (this.consistencyGroupSetTransferState != null ? this.consistencyGroupSetTransferState.equals(otherObj.consistencyGroupSetTransferState) : this.consistencyGroupSetTransferState == otherObj.consistencyGroupSetTransferState) && (this.copiesRecoveryActivities != null ? this.copiesRecoveryActivities.equals(otherObj.copiesRecoveryActivities) : this.copiesRecoveryActivities == otherObj.copiesRecoveryActivities) && (this.copyToResumeProduction != null ? this.copyToResumeProduction.equals(otherObj.copyToResumeProduction) : this.copyToResumeProduction == otherObj.copyToResumeProduction);
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
/*     */   public int hashCode()
/*     */   {
/* 301 */     return super.hashCode() ^ (this.consistencyGroupSetUID != null ? this.consistencyGroupSetUID.hashCode() : 0) ^ (this.groupSetName != null ? this.groupSetName.hashCode() : 0) ^ (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ this.numOfGroupsInImageAccess ^ this.numOfGroups ^ (this.consistencyGroupSetTransferState != null ? this.consistencyGroupSetTransferState.hashCode() : 0) ^ (this.copiesRecoveryActivities != null ? this.copiesRecoveryActivities.hashCode() : 0) ^ (this.copyToResumeProduction != null ? this.copyToResumeProduction.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 318 */     return "ConsistencyGroupSetRecoveryActivity [super=" + super.toString() + ", " + "consistencyGroupSetUID=" + this.consistencyGroupSetUID + ", " + "groupSetName=" + this.groupSetName + ", " + "clusterUID=" + this.clusterUID + ", " + "numOfGroupsInImageAccess=" + this.numOfGroupsInImageAccess + ", " + "numOfGroups=" + this.numOfGroups + ", " + "consistencyGroupSetTransferState=" + this.consistencyGroupSetTransferState + ", " + "copiesRecoveryActivities=" + this.copiesRecoveryActivities + ", " + "copyToResumeProduction=" + this.copyToResumeProduction + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupSetRecoveryActivity.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */