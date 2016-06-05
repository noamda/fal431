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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @XmlType(name="MonitoredParameterKey", propOrder={"rpaUID", "context", "consistencyGroupCopyUID", "arrayUID", "splitterUID", "clusterUID", "parameterType", "globalLink", "vcUID", "groupUID"})
/*     */ public class MonitoredParameterKey
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected RpaUID rpaUID;
/*     */   protected String context;
/*     */   @XmlElement(nillable=true)
/*     */   protected ConsistencyGroupCopyUID consistencyGroupCopyUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected ArrayUID arrayUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected SplitterUID splitterUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected ClusterUID clusterUID;
/*     */   protected MonitoredParameterType parameterType;
/*     */   protected GlobalLinkUID globalLink;
/*     */   protected VirtualCenterUID vcUID;
/*     */   protected ConsistencyGroupUID groupUID;
/*     */   
/*     */   public MonitoredParameterKey() {}
/*     */   
/*     */   public MonitoredParameterKey(RpaUID rpaUID, String context, ConsistencyGroupCopyUID consistencyGroupCopyUID, ArrayUID arrayUID, SplitterUID splitterUID, ClusterUID clusterUID, MonitoredParameterType parameterType, GlobalLinkUID globalLink, VirtualCenterUID vcUID, ConsistencyGroupUID groupUID)
/*     */   {
/*  77 */     this.rpaUID = rpaUID;
/*  78 */     this.context = context;
/*  79 */     this.consistencyGroupCopyUID = consistencyGroupCopyUID;
/*  80 */     this.arrayUID = arrayUID;
/*  81 */     this.splitterUID = splitterUID;
/*  82 */     this.clusterUID = clusterUID;
/*  83 */     this.parameterType = parameterType;
/*  84 */     this.globalLink = globalLink;
/*  85 */     this.vcUID = vcUID;
/*  86 */     this.groupUID = groupUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RpaUID getRpaUID()
/*     */   {
/*  98 */     return this.rpaUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRpaUID(RpaUID value)
/*     */   {
/* 110 */     this.rpaUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getContext()
/*     */   {
/* 122 */     return this.context;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setContext(String value)
/*     */   {
/* 134 */     this.context = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyUID getConsistencyGroupCopyUID()
/*     */   {
/* 146 */     return this.consistencyGroupCopyUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setConsistencyGroupCopyUID(ConsistencyGroupCopyUID value)
/*     */   {
/* 158 */     this.consistencyGroupCopyUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayUID getArrayUID()
/*     */   {
/* 170 */     return this.arrayUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setArrayUID(ArrayUID value)
/*     */   {
/* 182 */     this.arrayUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SplitterUID getSplitterUID()
/*     */   {
/* 194 */     return this.splitterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSplitterUID(SplitterUID value)
/*     */   {
/* 206 */     this.splitterUID = value;
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
/* 218 */     return this.clusterUID;
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
/* 230 */     this.clusterUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public MonitoredParameterType getParameterType()
/*     */   {
/* 242 */     return this.parameterType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setParameterType(MonitoredParameterType value)
/*     */   {
/* 254 */     this.parameterType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public GlobalLinkUID getGlobalLink()
/*     */   {
/* 266 */     return this.globalLink;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGlobalLink(GlobalLinkUID value)
/*     */   {
/* 278 */     this.globalLink = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VirtualCenterUID getVcUID()
/*     */   {
/* 290 */     return this.vcUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVcUID(VirtualCenterUID value)
/*     */   {
/* 302 */     this.vcUID = value;
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
/* 314 */     return this.groupUID;
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
/* 326 */     this.groupUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 336 */     if (!(obj instanceof MonitoredParameterKey)) {
/* 337 */       return false;
/*     */     }
/* 339 */     MonitoredParameterKey otherObj = (MonitoredParameterKey)obj;
/*     */     
/* 341 */     return (this.rpaUID != null ? this.rpaUID.equals(otherObj.rpaUID) : this.rpaUID == otherObj.rpaUID) && (this.context != null ? this.context.equals(otherObj.context) : this.context == otherObj.context) && (this.consistencyGroupCopyUID != null ? this.consistencyGroupCopyUID.equals(otherObj.consistencyGroupCopyUID) : this.consistencyGroupCopyUID == otherObj.consistencyGroupCopyUID) && (this.arrayUID != null ? this.arrayUID.equals(otherObj.arrayUID) : this.arrayUID == otherObj.arrayUID) && (this.splitterUID != null ? this.splitterUID.equals(otherObj.splitterUID) : this.splitterUID == otherObj.splitterUID) && (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.parameterType != null ? this.parameterType.equals(otherObj.parameterType) : this.parameterType == otherObj.parameterType) && (this.globalLink != null ? this.globalLink.equals(otherObj.globalLink) : this.globalLink == otherObj.globalLink) && (this.vcUID != null ? this.vcUID.equals(otherObj.vcUID) : this.vcUID == otherObj.vcUID) && (this.groupUID != null ? this.groupUID.equals(otherObj.groupUID) : this.groupUID == otherObj.groupUID);
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
/*     */   public int hashCode()
/*     */   {
/* 359 */     return (this.rpaUID != null ? this.rpaUID.hashCode() : 0) ^ (this.context != null ? this.context.hashCode() : 0) ^ (this.consistencyGroupCopyUID != null ? this.consistencyGroupCopyUID.hashCode() : 0) ^ (this.arrayUID != null ? this.arrayUID.hashCode() : 0) ^ (this.splitterUID != null ? this.splitterUID.hashCode() : 0) ^ (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.parameterType != null ? this.parameterType.hashCode() : 0) ^ (this.globalLink != null ? this.globalLink.hashCode() : 0) ^ (this.vcUID != null ? this.vcUID.hashCode() : 0) ^ (this.groupUID != null ? this.groupUID.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 377 */     return "MonitoredParameterKey [rpaUID=" + this.rpaUID + ", " + "context=" + this.context + ", " + "consistencyGroupCopyUID=" + this.consistencyGroupCopyUID + ", " + "arrayUID=" + this.arrayUID + ", " + "splitterUID=" + this.splitterUID + ", " + "clusterUID=" + this.clusterUID + ", " + "parameterType=" + this.parameterType + ", " + "globalLink=" + this.globalLink + ", " + "vcUID=" + this.vcUID + ", " + "groupUID=" + this.groupUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\MonitoredParameterKey.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */