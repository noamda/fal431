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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupState", propOrder={"groupUID", "enabled", "sourceCopiesUIDs", "groupCopiesState", "linksState", "runningAsDistributedGroup", "stateUnknown", "vplexMetroLinkState"})
/*     */ public class ConsistencyGroupState
/*     */ {
/*     */   protected ConsistencyGroupUID groupUID;
/*     */   protected boolean enabled;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupCopyUID> sourceCopiesUIDs;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupCopyState> groupCopiesState;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupLinkState> linksState;
/*     */   protected boolean runningAsDistributedGroup;
/*     */   protected boolean stateUnknown;
/*     */   @XmlElement(nillable=true)
/*     */   protected VplexMetroLinkState vplexMetroLinkState;
/*     */   
/*     */   public ConsistencyGroupState() {}
/*     */   
/*     */   public ConsistencyGroupState(ConsistencyGroupUID groupUID, boolean enabled, List<ConsistencyGroupCopyUID> sourceCopiesUIDs, List<ConsistencyGroupCopyState> groupCopiesState, List<ConsistencyGroupLinkState> linksState, boolean runningAsDistributedGroup, boolean stateUnknown, VplexMetroLinkState vplexMetroLinkState)
/*     */   {
/*  72 */     this.groupUID = groupUID;
/*  73 */     this.enabled = enabled;
/*  74 */     this.sourceCopiesUIDs = sourceCopiesUIDs;
/*  75 */     this.groupCopiesState = groupCopiesState;
/*  76 */     this.linksState = linksState;
/*  77 */     this.runningAsDistributedGroup = runningAsDistributedGroup;
/*  78 */     this.stateUnknown = stateUnknown;
/*  79 */     this.vplexMetroLinkState = vplexMetroLinkState;
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
/*  91 */     return this.groupUID;
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
/* 103 */     this.groupUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isEnabled()
/*     */   {
/* 111 */     return this.enabled;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEnabled(boolean value)
/*     */   {
/* 119 */     this.enabled = value;
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
/*     */   public List<ConsistencyGroupCopyUID> getSourceCopiesUIDs()
/*     */   {
/* 145 */     if (this.sourceCopiesUIDs == null) {
/* 146 */       this.sourceCopiesUIDs = new ArrayList();
/*     */     }
/* 148 */     return this.sourceCopiesUIDs;
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
/*     */   public List<ConsistencyGroupCopyState> getGroupCopiesState()
/*     */   {
/* 174 */     if (this.groupCopiesState == null) {
/* 175 */       this.groupCopiesState = new ArrayList();
/*     */     }
/* 177 */     return this.groupCopiesState;
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
/*     */   public List<ConsistencyGroupLinkState> getLinksState()
/*     */   {
/* 203 */     if (this.linksState == null) {
/* 204 */       this.linksState = new ArrayList();
/*     */     }
/* 206 */     return this.linksState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isRunningAsDistributedGroup()
/*     */   {
/* 214 */     return this.runningAsDistributedGroup;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRunningAsDistributedGroup(boolean value)
/*     */   {
/* 222 */     this.runningAsDistributedGroup = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isStateUnknown()
/*     */   {
/* 230 */     return this.stateUnknown;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setStateUnknown(boolean value)
/*     */   {
/* 238 */     this.stateUnknown = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VplexMetroLinkState getVplexMetroLinkState()
/*     */   {
/* 250 */     return this.vplexMetroLinkState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVplexMetroLinkState(VplexMetroLinkState value)
/*     */   {
/* 262 */     this.vplexMetroLinkState = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 272 */     if (!(obj instanceof ConsistencyGroupState)) {
/* 273 */       return false;
/*     */     }
/* 275 */     ConsistencyGroupState otherObj = (ConsistencyGroupState)obj;
/*     */     
/* 277 */     return (this.groupUID != null ? this.groupUID.equals(otherObj.groupUID) : this.groupUID == otherObj.groupUID) && (this.enabled == otherObj.enabled) && (this.sourceCopiesUIDs != null ? this.sourceCopiesUIDs.equals(otherObj.sourceCopiesUIDs) : this.sourceCopiesUIDs == otherObj.sourceCopiesUIDs) && (this.groupCopiesState != null ? this.groupCopiesState.equals(otherObj.groupCopiesState) : this.groupCopiesState == otherObj.groupCopiesState) && (this.linksState != null ? this.linksState.equals(otherObj.linksState) : this.linksState == otherObj.linksState) && (this.runningAsDistributedGroup == otherObj.runningAsDistributedGroup) && (this.stateUnknown == otherObj.stateUnknown) && (this.vplexMetroLinkState != null ? this.vplexMetroLinkState.equals(otherObj.vplexMetroLinkState) : this.vplexMetroLinkState == otherObj.vplexMetroLinkState);
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
/*     */   public int hashCode()
/*     */   {
/* 293 */     return (this.groupUID != null ? this.groupUID.hashCode() : 0) ^ (this.enabled ? 1 : 0) ^ (this.sourceCopiesUIDs != null ? this.sourceCopiesUIDs.hashCode() : 0) ^ (this.groupCopiesState != null ? this.groupCopiesState.hashCode() : 0) ^ (this.linksState != null ? this.linksState.hashCode() : 0) ^ (this.runningAsDistributedGroup ? 1 : 0) ^ (this.stateUnknown ? 1 : 0) ^ (this.vplexMetroLinkState != null ? this.vplexMetroLinkState.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 309 */     return "ConsistencyGroupState [groupUID=" + this.groupUID + ", " + "enabled=" + this.enabled + ", " + "sourceCopiesUIDs=" + this.sourceCopiesUIDs + ", " + "groupCopiesState=" + this.groupCopiesState + ", " + "linksState=" + this.linksState + ", " + "runningAsDistributedGroup=" + this.runningAsDistributedGroup + ", " + "stateUnknown=" + this.stateUnknown + ", " + "vplexMetroLinkState=" + this.vplexMetroLinkState + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */