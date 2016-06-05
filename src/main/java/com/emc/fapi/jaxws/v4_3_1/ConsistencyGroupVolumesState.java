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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupVolumesState", propOrder={"copiesVolumesState", "groupUID", "replicationSetsVolumesState"})
/*     */ public class ConsistencyGroupVolumesState
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupCopyVolumesState> copiesVolumesState;
/*     */   protected ConsistencyGroupUID groupUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ReplicationSetVolumesState> replicationSetsVolumesState;
/*     */   
/*     */   public ConsistencyGroupVolumesState() {}
/*     */   
/*     */   public ConsistencyGroupVolumesState(List<ConsistencyGroupCopyVolumesState> copiesVolumesState, ConsistencyGroupUID groupUID, List<ReplicationSetVolumesState> replicationSetsVolumesState)
/*     */   {
/*  55 */     this.copiesVolumesState = copiesVolumesState;
/*  56 */     this.groupUID = groupUID;
/*  57 */     this.replicationSetsVolumesState = replicationSetsVolumesState;
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
/*     */   public List<ConsistencyGroupCopyVolumesState> getCopiesVolumesState()
/*     */   {
/*  83 */     if (this.copiesVolumesState == null) {
/*  84 */       this.copiesVolumesState = new ArrayList();
/*     */     }
/*  86 */     return this.copiesVolumesState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupUID getGroupUID()
/*     */   {
/*  98 */     return this.groupUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupUID(ConsistencyGroupUID value)
/*     */   {
/* 110 */     this.groupUID = value;
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
/*     */   public List<ReplicationSetVolumesState> getReplicationSetsVolumesState()
/*     */   {
/* 136 */     if (this.replicationSetsVolumesState == null) {
/* 137 */       this.replicationSetsVolumesState = new ArrayList();
/*     */     }
/* 139 */     return this.replicationSetsVolumesState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 149 */     if (!(obj instanceof ConsistencyGroupVolumesState)) {
/* 150 */       return false;
/*     */     }
/* 152 */     ConsistencyGroupVolumesState otherObj = (ConsistencyGroupVolumesState)obj;
/*     */     
/* 154 */     return (this.copiesVolumesState != null ? this.copiesVolumesState.equals(otherObj.copiesVolumesState) : this.copiesVolumesState == otherObj.copiesVolumesState) && (this.groupUID != null ? this.groupUID.equals(otherObj.groupUID) : this.groupUID == otherObj.groupUID) && (this.replicationSetsVolumesState != null ? this.replicationSetsVolumesState.equals(otherObj.replicationSetsVolumesState) : this.replicationSetsVolumesState == otherObj.replicationSetsVolumesState);
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
/* 165 */     return (this.copiesVolumesState != null ? this.copiesVolumesState.hashCode() : 0) ^ (this.groupUID != null ? this.groupUID.hashCode() : 0) ^ (this.replicationSetsVolumesState != null ? this.replicationSetsVolumesState.hashCode() : 0);
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
/* 176 */     return "ConsistencyGroupVolumesState [copiesVolumesState=" + this.copiesVolumesState + ", " + "groupUID=" + this.groupUID + ", " + "replicationSetsVolumesState=" + this.replicationSetsVolumesState + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupVolumesState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */