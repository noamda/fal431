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
/*     */ @XmlType(name="ReplicationSetSettingsChangesParam", propOrder={"name", "replicationSetUID", "shouldAttachAsClean", "volumesChanges", "resizeReplicationSetParam"})
/*     */ public class ReplicationSetSettingsChangesParam
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected String name;
/*     */   @XmlElement(nillable=true)
/*     */   protected ReplicationSetUID replicationSetUID;
/*     */   protected boolean shouldAttachAsClean;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<UserVolumeSettingsChangesParam> volumesChanges;
/*     */   @XmlElement(nillable=true)
/*     */   protected ResizeReplicationSetParam resizeReplicationSetParam;
/*     */   
/*     */   public ReplicationSetSettingsChangesParam() {}
/*     */   
/*     */   public ReplicationSetSettingsChangesParam(String name, ReplicationSetUID replicationSetUID, boolean shouldAttachAsClean, List<UserVolumeSettingsChangesParam> volumesChanges, ResizeReplicationSetParam resizeReplicationSetParam)
/*     */   {
/*  63 */     this.name = name;
/*  64 */     this.replicationSetUID = replicationSetUID;
/*  65 */     this.shouldAttachAsClean = shouldAttachAsClean;
/*  66 */     this.volumesChanges = volumesChanges;
/*  67 */     this.resizeReplicationSetParam = resizeReplicationSetParam;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getName()
/*     */   {
/*  79 */     return this.name;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setName(String value)
/*     */   {
/*  91 */     this.name = value;
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
/*     */   public boolean isShouldAttachAsClean()
/*     */   {
/* 123 */     return this.shouldAttachAsClean;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setShouldAttachAsClean(boolean value)
/*     */   {
/* 131 */     this.shouldAttachAsClean = value;
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
/*     */   public List<UserVolumeSettingsChangesParam> getVolumesChanges()
/*     */   {
/* 157 */     if (this.volumesChanges == null) {
/* 158 */       this.volumesChanges = new ArrayList();
/*     */     }
/* 160 */     return this.volumesChanges;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ResizeReplicationSetParam getResizeReplicationSetParam()
/*     */   {
/* 172 */     return this.resizeReplicationSetParam;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setResizeReplicationSetParam(ResizeReplicationSetParam value)
/*     */   {
/* 184 */     this.resizeReplicationSetParam = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 194 */     if (!(obj instanceof ReplicationSetSettingsChangesParam)) {
/* 195 */       return false;
/*     */     }
/* 197 */     ReplicationSetSettingsChangesParam otherObj = (ReplicationSetSettingsChangesParam)obj;
/*     */     
/* 199 */     return (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.replicationSetUID != null ? this.replicationSetUID.equals(otherObj.replicationSetUID) : this.replicationSetUID == otherObj.replicationSetUID) && (this.shouldAttachAsClean == otherObj.shouldAttachAsClean) && (this.volumesChanges != null ? this.volumesChanges.equals(otherObj.volumesChanges) : this.volumesChanges == otherObj.volumesChanges) && (this.resizeReplicationSetParam != null ? this.resizeReplicationSetParam.equals(otherObj.resizeReplicationSetParam) : this.resizeReplicationSetParam == otherObj.resizeReplicationSetParam);
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
/* 212 */     return (this.name != null ? this.name.hashCode() : 0) ^ (this.replicationSetUID != null ? this.replicationSetUID.hashCode() : 0) ^ (this.shouldAttachAsClean ? 1 : 0) ^ (this.volumesChanges != null ? this.volumesChanges.hashCode() : 0) ^ (this.resizeReplicationSetParam != null ? this.resizeReplicationSetParam.hashCode() : 0);
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
/* 225 */     return "ReplicationSetSettingsChangesParam [name=" + this.name + ", " + "replicationSetUID=" + this.replicationSetUID + ", " + "shouldAttachAsClean=" + this.shouldAttachAsClean + ", " + "volumesChanges=" + this.volumesChanges + ", " + "resizeReplicationSetParam=" + this.resizeReplicationSetParam + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ReplicationSetSettingsChangesParam.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */