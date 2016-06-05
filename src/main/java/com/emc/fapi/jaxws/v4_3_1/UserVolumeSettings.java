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
/*     */ @JsonTypeName("UserVolumeSettings")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="UserVolumeSettings", propOrder={"groupCopyUID", "replicationSetUID", "attachedSplitters"})
/*     */ public class UserVolumeSettings
/*     */   extends VolumeSettings
/*     */ {
/*     */   protected ConsistencyGroupCopyUID groupCopyUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected ReplicationSetUID replicationSetUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<SplitterUID> attachedSplitters;
/*     */   
/*     */   public UserVolumeSettings() {}
/*     */   
/*     */   public UserVolumeSettings(ConsistencyGroupCopyUID groupCopyUID, ReplicationSetUID replicationSetUID, List<SplitterUID> attachedSplitters)
/*     */   {
/*  65 */     this.groupCopyUID = groupCopyUID;
/*  66 */     this.replicationSetUID = replicationSetUID;
/*  67 */     this.attachedSplitters = attachedSplitters;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyUID getGroupCopyUID()
/*     */   {
/*  79 */     return this.groupCopyUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupCopyUID(ConsistencyGroupCopyUID value)
/*     */   {
/*  91 */     this.groupCopyUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ReplicationSetUID getReplicationSetUID()
/*     */   {
/* 103 */     return this.replicationSetUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setReplicationSetUID(ReplicationSetUID value)
/*     */   {
/* 115 */     this.replicationSetUID = value;
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
/*     */   public List<SplitterUID> getAttachedSplitters()
/*     */   {
/* 141 */     if (this.attachedSplitters == null) {
/* 142 */       this.attachedSplitters = new ArrayList();
/*     */     }
/* 144 */     return this.attachedSplitters;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 154 */     if (!(obj instanceof UserVolumeSettings)) {
/* 155 */       return false;
/*     */     }
/* 157 */     UserVolumeSettings otherObj = (UserVolumeSettings)obj;
/*     */     
/* 159 */     return (super.equals(obj)) && (this.groupCopyUID != null ? this.groupCopyUID.equals(otherObj.groupCopyUID) : this.groupCopyUID == otherObj.groupCopyUID) && (this.replicationSetUID != null ? this.replicationSetUID.equals(otherObj.replicationSetUID) : this.replicationSetUID == otherObj.replicationSetUID) && (this.attachedSplitters != null ? this.attachedSplitters.equals(otherObj.attachedSplitters) : this.attachedSplitters == otherObj.attachedSplitters);
/*     */   }
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
/* 171 */     return super.hashCode() ^ (this.groupCopyUID != null ? this.groupCopyUID.hashCode() : 0) ^ (this.replicationSetUID != null ? this.replicationSetUID.hashCode() : 0) ^ (this.attachedSplitters != null ? this.attachedSplitters.hashCode() : 0);
/*     */   }
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
/* 183 */     return "UserVolumeSettings [super=" + super.toString() + ", " + "groupCopyUID=" + this.groupCopyUID + ", " + "replicationSetUID=" + this.replicationSetUID + ", " + "attachedSplitters=" + this.attachedSplitters + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\UserVolumeSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */