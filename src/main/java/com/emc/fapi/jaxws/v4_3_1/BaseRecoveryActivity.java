/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlSeeAlso;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.codehaus.jackson.annotate.JsonSubTypes;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo.As;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo.Id;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="JsonSubType")
/*     */ @JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value=ConsistencyGroupCopyRecoveryActivity.class, name="ConsistencyGroupCopyRecoveryActivity"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=ConsistencyGroupSetRecoveryActivity.class, name="ConsistencyGroupSetRecoveryActivity")})
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="baseRecoveryActivity", propOrder={"activity", "clusterName"})
/*     */ @XmlSeeAlso({ConsistencyGroupSetRecoveryActivity.class, ConsistencyGroupCopyRecoveryActivity.class})
/*     */ public abstract class BaseRecoveryActivity
/*     */ {
/*     */   protected ImageAccessScenario activity;
/*     */   protected String clusterName;
/*     */   
/*     */   public BaseRecoveryActivity() {}
/*     */   
/*     */   public BaseRecoveryActivity(ImageAccessScenario activity, String clusterName)
/*     */   {
/*  64 */     this.activity = activity;
/*  65 */     this.clusterName = clusterName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ImageAccessScenario getActivity()
/*     */   {
/*  77 */     return this.activity;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setActivity(ImageAccessScenario value)
/*     */   {
/*  89 */     this.activity = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getClusterName()
/*     */   {
/* 101 */     return this.clusterName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setClusterName(String value)
/*     */   {
/* 113 */     this.clusterName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 123 */     if (!(obj instanceof BaseRecoveryActivity)) {
/* 124 */       return false;
/*     */     }
/* 126 */     BaseRecoveryActivity otherObj = (BaseRecoveryActivity)obj;
/*     */     
/* 128 */     return (this.activity != null ? this.activity.equals(otherObj.activity) : this.activity == otherObj.activity) && (this.clusterName != null ? this.clusterName.equals(otherObj.clusterName) : this.clusterName == otherObj.clusterName);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 138 */     return (this.activity != null ? this.activity.hashCode() : 0) ^ (this.clusterName != null ? this.clusterName.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 148 */     return "BaseRecoveryActivity [activity=" + this.activity + ", " + "clusterName=" + this.clusterName + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\BaseRecoveryActivity.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */